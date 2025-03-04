package gregoire.jdr.repository.mapper;

import org.springframework.stereotype.Service;

import gregoire.jdr.repository.model.admin.request.AdminRegisterActionRepositoryRequest;
import gregoire.jdr.service.model.admin.request.AdminRegisterActionServiceRequest;

@Service
public class AdminRepositoryRequestMapper {

public AdminRepositoryRequestMapper() {
		
	}
	
	public AdminRegisterActionRepositoryRequest mappAdminRegisterActionRepositoryRequest(AdminRegisterActionRepositoryRequest repositoryRequest, AdminRegisterActionServiceRequest serviceRequest) {
		
		repositoryRequest.setRole(serviceRequest.isRole());
		
		repositoryRequest.setAuthenticated(serviceRequest.isAuthenticated());
		
		repositoryRequest.setFirstName(serviceRequest.getFirstName());
		
		repositoryRequest.setLastName(serviceRequest.getLastName());
		
		repositoryRequest.setLogin(serviceRequest.getLogin());
		
		repositoryRequest.setPassword(serviceRequest.getPassword());
		
		return repositoryRequest;
	}
}
