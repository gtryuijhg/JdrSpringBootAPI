package gregoire.jdr.repository.validators.admin;

import org.springframework.stereotype.Service;

import gregoire.jdr.repository.model.admin.request.AdminRegisterActionRepositoryRequest;

@Service
public class AdminRepositoryValidator {

	public AdminRepositoryValidator() {
		
	}

	public AdminRegisterActionRepositoryRequest validateAdminRegisterActionRepositoryRequest(AdminRegisterActionRepositoryRequest repositoryRequest) {

		try {
			if (repositoryRequest.isRole() != true) {
				throw new IllegalArgumentException("An admin role must be at true !");
			}
		} catch (IllegalArgumentException e) {
			repositoryRequest.setErrors("role", e.getMessage());
		}
		
		try  {
			if (repositoryRequest.isAuthenticated() != false) {
				throw new IllegalArgumentException("You cannot be connected while at the registzer page !");
			}
		} catch (IllegalArgumentException e) {
			repositoryRequest.setErrors("authenticated", e.getMessage());
		}
		
		try {
			if (!String.class.isInstance(repositoryRequest.getFirstName())) {
				throw new IllegalArgumentException("Your first name must be a string !");
			}
		} catch (IllegalArgumentException e) {
			repositoryRequest.setErrors("firstName", e.getMessage());
		}
		
		try {
			if (!String.class.isInstance(repositoryRequest.getLastName())) {
				throw new IllegalArgumentException("Your last name must be a string !");
			}
		} catch (IllegalArgumentException e) {
			repositoryRequest.setErrors("lastName", e.getMessage());
		}
		
		try {
			if (!String.class.isInstance(repositoryRequest.getLogin())) {
				throw new IllegalArgumentException("Your login must be a string !");
			}
		} catch (IllegalArgumentException e) {
			repositoryRequest.setErrors("login", e.getMessage());
		}
		
		try {
			if (!String.class.isInstance(repositoryRequest.getPassword())) {
				throw new IllegalArgumentException("Your password must be a string !");
			}
		} catch (IllegalArgumentException e) {
			repositoryRequest.setErrors("password", e.getMessage());
		}
		
		return repositoryRequest;
	}
	
	
}
