package gregoire.jdr.service.mapper.admin;

import org.springframework.stereotype.Service;

import gregoire.jdr.repository.model.admin.response.AdminRegisterActionRepositoryResponse;
import gregoire.jdr.service.model.admin.request.AdminRegisterActionServiceRequest;
import gregoire.jdr.service.model.admin.response.AdminRegisterActionServiceResponse;

@Service
public class AdminServiceResponseMapper {

	public AdminServiceResponseMapper() {
		
	}

	public AdminRegisterActionServiceResponse mappAdminRegisterActionServiceResponseInvalidServiceRequest(AdminRegisterActionServiceRequest serviceRequest, AdminRegisterActionServiceResponse serviceResponse) {
		
		serviceResponse.setRole(serviceRequest.isRole());
		
		serviceResponse.setAuthenticated(serviceRequest.isAuthenticated());
		
		serviceResponse.setErrors(serviceRequest.getErrors());
		
		return serviceResponse;
	}

	public AdminRegisterActionServiceResponse mappAdminRegisterActionServiceResponseInvalidRepositoryResponse(AdminRegisterActionRepositoryResponse repositoryResponse, AdminRegisterActionServiceResponse serviceResponse) {

		serviceResponse.setAuthenticated(repositoryResponse.isAuthenticated());
		
		serviceResponse.setRole(repositoryResponse.isRole());
		
		serviceResponse.setErrors(repositoryResponse.getErrors());
		
		return serviceResponse;
	}

	public AdminRegisterActionServiceResponse mappAdminRegisterActionServiceResponseOk(AdminRegisterActionRepositoryResponse repositoryResponse, AdminRegisterActionServiceResponse serviceResponse) {
		
		serviceResponse.setAuthenticated(repositoryResponse.isAuthenticated());
		
		serviceResponse.setRole(repositoryResponse.isRole());
		
		return serviceResponse;
	}
	
	
}
