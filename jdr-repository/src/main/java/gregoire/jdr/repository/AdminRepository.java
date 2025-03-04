package gregoire.jdr.repository;

import org.springframework.stereotype.Repository;

import gregoire.jdr.entities.User;
import gregoire.jdr.queries.AdminRepositoryQuery;
import gregoire.jdr.queries.model.admin.response.AdminRegisterActionQueryResponse;
import gregoire.jdr.repository.mapper.AdminRepositoryRequestMapper;
import gregoire.jdr.repository.mapper.AdminRepositoryResponseMapper;
import gregoire.jdr.repository.model.admin.request.AdminRegisterActionRepositoryRequest;
import gregoire.jdr.repository.model.admin.response.AdminRegisterActionRepositoryResponse;
import gregoire.jdr.repository.validators.admin.AdminRepositoryValidator;
import gregoire.jdr.service.model.admin.request.AdminRegisterActionServiceRequest;

@Repository
public class AdminRepository {

	private AdminRepositoryRequestMapper requestMapper;
	private AdminRepositoryResponseMapper responseMapper;
	private AdminRepositoryQuery repositoryQuery;
	private AdminRepositoryValidator validator;
	
	public AdminRepository(AdminRepositoryRequestMapper requestMapper, AdminRepositoryResponseMapper responseMapper, AdminRepositoryQuery repositoryQuery, AdminRepositoryValidator validator) {
		this.requestMapper = requestMapper;
		this.responseMapper = responseMapper;
		this.repositoryQuery = repositoryQuery;
		this.validator = validator;
	}
	
	public AdminRegisterActionRepositoryResponse registerAction(AdminRegisterActionServiceRequest serviceRequest) {
		
		AdminRegisterActionRepositoryRequest repositoryRequest = new AdminRegisterActionRepositoryRequest();
		AdminRegisterActionRepositoryResponse repositoryResponse = new AdminRegisterActionRepositoryResponse();
		AdminRegisterActionQueryResponse queryResponse = new AdminRegisterActionQueryResponse();
		
		repositoryRequest = requestMapper.mappAdminRegisterActionRepositoryRequest(repositoryRequest, serviceRequest);
		
		if (!repositoryRequest.getErrors().isEmpty()) {
			
			repositoryResponse = responseMapper.mappAdminRegisterActionRepositoryResponseInvalidRepositoryRequest(repositoryRequest, repositoryResponse);
			
			return repositoryResponse;
		}
		
		repositoryRequest = validator.validateAdminRegisterActionRepositoryRequest(repositoryRequest);
		
		if (!repositoryRequest.getErrors().isEmpty()) {
			
			repositoryResponse = responseMapper.mappAdminRegisterActionRepositoryResponseInvalidRepositoryRequest(repositoryRequest, repositoryResponse);
			
			return repositoryResponse;
		}
		
		//call query
		queryResponse = repositoryQuery.registerActionSearchAdminQuery(repositoryRequest, queryResponse);
		//if query get errors (admin found)
		
		if (!queryResponse.getErrors().isEmpty()) {
			
			repositoryResponse = responseMapper.mappAdminRegisterActionRepositoryResponseInvalidQuery(repositoryResponse, queryResponse);
			
			return repositoryResponse;
		}
		
		repositoryQuery.registerActionPersistAdminQuery(repositoryRequest);
		
		repositoryResponse = responseMapper.mappAdminRegisterActionRepositoryResponseOk(repositoryRequest, repositoryResponse);
		
		return repositoryResponse;
	}
}
