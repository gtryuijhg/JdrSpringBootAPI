package gregoire.jdr.access.validators.admin;

import org.springframework.stereotype.Service;

import gregoire.jdr.access.model.admin.request.AdminRegisterAccessRequest;
import gregoire.jdr.access.model.admin.request.AdminRegisterActionAccessRequest;
import gregoire.jdr.access.validators.commons.AccessValidatorUtils;

@Service
public class AdminAccessValidator {
	
	private AccessValidatorUtils validatorUtils;

	public AdminAccessValidator(AccessValidatorUtils validatorUtils) {
		this.validatorUtils = validatorUtils;
	}
	
	public AdminRegisterAccessRequest validateAdminRegisterAccessRequest(AdminRegisterAccessRequest accessRequest) {
		
		//validate boolean role
		try {
			validatorUtils.isBooleanTrue(accessRequest.isRole(), "An admin role must be at true !");
		} catch (IllegalArgumentException e) {
			accessRequest.setErrors("role", e.getMessage());
		}
		
		//validate boolean authenticated
		try {
			validatorUtils.isBooleanFalse(accessRequest.isAuthenticated(), "You cannot be logged in while at the register page !");
		} catch (IllegalArgumentException e) {
			accessRequest.setErrors("authenticated", e.getMessage());
		}
		
		return accessRequest;
	}
	
	public AdminRegisterActionAccessRequest validateAdminRegisterActionAccessRequest(AdminRegisterActionAccessRequest accessRequest) {
		
		//validate boolean role
		try {
			validatorUtils.isBooleanTrue(accessRequest.isRole(), "An admin role must be at true !");
		} catch (IllegalArgumentException e) {
			accessRequest.setErrors("role", e.getMessage());
		}
		
		//validate boolean authenticated
		try {
			validatorUtils.isBooleanFalse(accessRequest.isAuthenticated(), "You cannot be logged in while at the register page !");
		} catch (IllegalArgumentException e) {
			accessRequest.setErrors("authenticated", e.getMessage());
		}
		
		//validate string firstName
		try {
			validatorUtils.isFieldString(accessRequest.getFirstName(), "An admin first name must be a string !");
		} catch (IllegalArgumentException e) {
			accessRequest.setErrors("firstName", e.getMessage());
		}
		
		//validate string lastName
		try {
			validatorUtils.isFieldString(accessRequest.getLastName(), "An admin last name must be a string !");
		} catch (IllegalArgumentException e) {
			accessRequest.setErrors("lastName", e.getMessage());
		}
		
		//validate string login
		try {
			validatorUtils.isFieldString(accessRequest.getLogin(), "An admin login must be a string !");
		} catch (IllegalArgumentException e) {
			accessRequest.setErrors("login", e.getMessage());
		}
		
		//validate string password
		try {
			validatorUtils.isFieldString(accessRequest.getPassword(), "An admin password must be a string !");
		} catch (IllegalArgumentException e) {
			accessRequest.setErrors("password", e.getMessage());
		}
		
		//validate string confirmPassword
		try {
			validatorUtils.isFieldString(accessRequest.getConfirmPassword(), "An admin password confirmation must be a string !");
		} catch (IllegalArgumentException e) {
			accessRequest.setErrors("confirmPassword", e.getMessage());
		}
		
		return accessRequest;
	}
}
