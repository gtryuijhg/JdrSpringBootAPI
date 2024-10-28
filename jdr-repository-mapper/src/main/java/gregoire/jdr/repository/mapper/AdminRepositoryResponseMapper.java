package gregoire.jdr.repository.mapper;

import org.springframework.stereotype.Service;

import gregoire.jdr.queries.model.admin.response.AdminRegisterActionQueryResponse;
import gregoire.jdr.repository.model.admin.request.AdminRegisterActionRepositoryRequest;
import gregoire.jdr.repository.model.admin.response.AdminRegisterActionRepositoryResponse;

@Service
public class AdminRepositoryResponseMapper {

	public AdminRepositoryResponseMapper() {
		
	}
	
	public AdminRegisterActionRepositoryResponse mappAdminRegisterActionRepositoryResponseOk(AdminRegisterActionRepositoryRequest repositoryRequest, AdminRegisterActionRepositoryResponse repositoryResponse) {
		
		repositoryResponse.setAuthenticated(repositoryRequest.isAuthenticated());
		
		repositoryResponse.setRole(repositoryRequest.isRole());
		
		return repositoryResponse;
	}
	
	public AdminRegisterActionRepositoryResponse mappAdminRegisterActionRepositoryResponseErrorAdminFound(AdminRegisterActionRepositoryRequest repositoryRequest, AdminRegisterActionRepositoryResponse repositoryResponse) {
		
		repositoryResponse.setAuthenticated(repositoryRequest.isAuthenticated());
		
		repositoryResponse.setRole(repositoryRequest.isRole());
		
		repositoryResponse.setErrors(repositoryRequest.getErrors());
		
		return repositoryResponse;
	}
	
	public AdminRegisterActionRepositoryResponse mappAdminRegisterActionRepositoryResponseInvalidRepositoryRequest(AdminRegisterActionRepositoryRequest repositoryRequest, AdminRegisterActionRepositoryResponse repositoryResponse) {
		
		repositoryResponse.setAuthenticated(repositoryRequest.isAuthenticated());
		
		repositoryResponse.setRole(repositoryRequest.isRole());
		
		repositoryResponse.setErrors(repositoryRequest.getErrors());
		
		return repositoryResponse;
	}

	public AdminRegisterActionRepositoryResponse mappAdminRegisterActionRepositoryResponseInvalidQuery(AdminRegisterActionRepositoryResponse repositoryResponse, AdminRegisterActionQueryResponse queryResponse) {
		
		repositoryResponse.setAuthenticated(queryResponse.isAuthenticated());
		repositoryResponse.setRole(queryResponse.isRole());
		repositoryResponse.setErrors(queryResponse.getErrors());
		
		return repositoryResponse;
	}
}
