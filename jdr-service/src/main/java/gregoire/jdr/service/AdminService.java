package gregoire.jdr.service;

import org.apache.commons.lang3.mutable.MutableObject;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;

import gregoire.jdr.buisness.model.admin.request.AdminRegisterActionBuisnessRequest;
import gregoire.jdr.repository.AdminRepository;
import gregoire.jdr.repository.model.admin.response.AdminRegisterActionRepositoryResponse;
import gregoire.jdr.service.commons.TransactionHelper;
import gregoire.jdr.service.mapper.admin.AdminServiceRequestMapper;
import gregoire.jdr.service.mapper.admin.AdminServiceResponseMapper;
import gregoire.jdr.service.model.admin.request.AdminRegisterActionServiceRequest;
import gregoire.jdr.service.model.admin.response.AdminRegisterActionServiceResponse;
import gregoire.jdr.service.validators.admin.AdminServiceValidator;

@Service
public class AdminService {
	
	private AdminServiceRequestMapper requestMapper;
	private AdminServiceResponseMapper responseMapper;
	private AdminServiceValidator validator;
	private TransactionHelper transactionHelper;
	private AdminRepository adminRepository;

	public AdminService(AdminServiceRequestMapper requestMapper, AdminServiceResponseMapper responseMapper, AdminServiceValidator validator, TransactionHelper transactionHelper, AdminRepository adminRepository) {
		this.requestMapper = requestMapper;
		this.responseMapper = responseMapper;
		this.validator = validator;
		this.transactionHelper = transactionHelper;
		this.adminRepository = adminRepository;
	}
	
	public AdminRegisterActionServiceResponse registerAction(AdminRegisterActionBuisnessRequest buisnessRequest) {
		
		AdminRegisterActionServiceRequest serviceRequest = new AdminRegisterActionServiceRequest();
		AdminRegisterActionServiceResponse serviceResponse = new AdminRegisterActionServiceResponse();
		
		serviceRequest = requestMapper.mappAdminRegisterActionServiceRequest(serviceRequest, buisnessRequest);
		
		if (!serviceRequest.getErrors().isEmpty()) {
			
			serviceResponse = responseMapper.mappAdminRegisterActionServiceResponseInvalidServiceRequest(serviceRequest, serviceResponse);
			
			return serviceResponse;
		}
		
		serviceRequest = validator.validateAdminRegisterActionServiceRequest(serviceRequest);
		
		if (!serviceRequest.getErrors().isEmpty()) {
			
			serviceResponse = responseMapper.mappAdminRegisterActionServiceResponseInvalidServiceRequest(serviceRequest, serviceResponse);
			
			return serviceResponse;
		}
		
		//set transaction and begin
		MutableObject<TransactionStatus> vStatus = transactionHelper.beginTransaction();
		
		AdminRegisterActionRepositoryResponse repositoryResponse = adminRepository.registerAction(serviceRequest);
		
		if (!repositoryResponse.getErrors().isEmpty()) {
			//transaction rollback
			transactionHelper.rollback(vStatus);
			
			serviceResponse = responseMapper.mappAdminRegisterActionServiceResponseInvalidRepositoryResponse(repositoryResponse, serviceResponse);
			
			return serviceResponse;
		}
		
		transactionHelper.commit(vStatus);
		
		serviceResponse = responseMapper.mappAdminRegisterActionServiceResponseOk(repositoryResponse, serviceResponse);
		
		return serviceResponse;
	}
}
