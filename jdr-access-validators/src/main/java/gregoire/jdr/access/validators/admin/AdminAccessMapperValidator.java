package gregoire.jdr.access.validators.admin;

import org.springframework.stereotype.Service;

import gregoire.jdr.access.model.admin.request.AdminRegisterAccessRequest;
import gregoire.jdr.access.model.admin.request.AdminRegisterActionAccessRequest;
import gregoire.jdr.access.validators.commons.AccessValidatorUtils;

@Service
public class AdminAccessMapperValidator {

	private AccessValidatorUtils validatorUtils;
	
	public AdminAccessMapperValidator(AccessValidatorUtils validatorUtils) {
		this.validatorUtils = validatorUtils;
	}
	
	public Boolean validateRegisterFieldRole(Boolean role, AdminRegisterAccessRequest accessRequest) {
		
		try {
			validatorUtils.isBooleanNull(role, "An admin role must be defined !");
		} catch (NullPointerException e) {
			accessRequest.setErrors("role", e.getMessage());
		}
		
		return role;
	}
	
	public Boolean validateRegisterFieldAuthenticated(Boolean authenticated, AdminRegisterAccessRequest accessRequest) {
		
		try {
			validatorUtils.isBooleanNull(authenticated, "An admin must be authenticable !");
		} catch (NullPointerException e) {
			accessRequest.setErrors("authenticated", e.getMessage());
		}
		
		return authenticated;
	}
	
	public Boolean validateRegisterActionFieldRole(Boolean role, AdminRegisterActionAccessRequest accessRequest) {
		
		try {
			validatorUtils.isBooleanNull(role, "An admin role must be defined !");
		} catch (NullPointerException e) {
			accessRequest.setErrors("role", e.getMessage());
		}
		
		return role;
	}
	
	public Boolean validateRegisterActionFieldAuthenticated(Boolean authenticated, AdminRegisterActionAccessRequest accessRequest) {
		
		try {
			validatorUtils.isBooleanNull(authenticated, "An admin must be authenticable !");
		} catch (NullPointerException e) {
			accessRequest.setErrors("authenticated", e.getMessage());
		}
		
		return authenticated;
	}
	
	public String validateRegisterActionFieldFirstName(String firstName, AdminRegisterActionAccessRequest accessRequest) {
		
		try {
			validatorUtils.isStringNull(firstName, "Please enter your first name !");
		} catch (NullPointerException e) {
			accessRequest.setErrors("firstName", e.getMessage());
		}
		
		return firstName;
	}

	public String valiateRegisterActionFieldLastName(String lastName, AdminRegisterActionAccessRequest accessRequest) {
		
		try {
			validatorUtils.isStringNull(lastName, "PLease enter your last name !");
		} catch (NullPointerException e) {
			accessRequest.setErrors("lastName", e.getMessage());
		}
		
		return lastName;
	}

	public String validateRegisterActionFieldLogin(String login, AdminRegisterActionAccessRequest accessRequest) {
		
		try {
			validatorUtils.isStringNull(login, "Please enter your login !");
		} catch (NullPointerException e) {
			accessRequest.setErrors("login", e.getMessage());
		}
		
		return login;
	}

	public String validateRegisterActionFieldPassword(String password, AdminRegisterActionAccessRequest accessRequest) {
		
		try {
			validatorUtils.isStringNull(password, "Please enter your password !");
		} catch (NullPointerException e) {
			accessRequest.setErrors("password", e.getMessage());
		}
		
		return password;
	}

	public String validateRegisterActionFieldConfirmPassword(String confirmPassword, AdminRegisterActionAccessRequest accessRequest) {
		
		try {
			validatorUtils.isStringNull(confirmPassword, "Please confirm your password !");
		} catch (NullPointerException e) {
			accessRequest.setErrors("confirmPassword", e.getMessage());
		}
		
		return confirmPassword;
	}
	
	
}
 