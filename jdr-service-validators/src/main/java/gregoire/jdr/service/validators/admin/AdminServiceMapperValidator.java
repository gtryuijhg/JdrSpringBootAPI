package gregoire.jdr.service.validators.admin;

import org.springframework.stereotype.Service;

import gregoire.jdr.service.model.admin.request.AdminRegisterActionServiceRequest;
import gregoire.jdr.service.validators.commons.ServiceValidatorUtils;

@Service
public class AdminServiceMapperValidator {

	private ServiceValidatorUtils validatorUtils;
	
	public AdminServiceMapperValidator(ServiceValidatorUtils validatorUtils) {
		this.validatorUtils = validatorUtils;
	}

	public Boolean validateRegisterActionFieldRole(Boolean role, AdminRegisterActionServiceRequest serviceRequest) {
		
		try {
			validatorUtils.isBooleanNull(role, "An admin role must be defined !");
		} catch (NullPointerException e) {
			serviceRequest.setErrors("role", e.getMessage());
		}
		
		return role;
	}

	public Boolean valiateRegisterActionFieldAuthenticated(Boolean authenticated, AdminRegisterActionServiceRequest serviceRequest) {
		
		try {
			validatorUtils.isBooleanNull(authenticated, "An admin must be authenticable !");
		} catch (NullPointerException e) {
			serviceRequest.setErrors("authenticated", e.getMessage());
		}
		
		return authenticated;
	}

	public String validateRegisterActionFieldFirstName(String firstName, AdminRegisterActionServiceRequest serviceRequest) {

		try {
			validatorUtils.isStringNull(firstName, "Please enter your first name !");
		} catch (NullPointerException e) {
			serviceRequest.setErrors("firstName", e.getMessage());
		}
		
		return firstName;
	}

	public String validateRegisterActionFieldLastName(String lastName, AdminRegisterActionServiceRequest serviceRequest) {
		
		try {
			validatorUtils.isStringNull(lastName, "Please enter your last name !");
		} catch (NullPointerException e) {
			serviceRequest.setErrors("lastName", e.getMessage());
		}
		
		return lastName;
	}

	public String validateRegisterActionFieldLogin(String login, AdminRegisterActionServiceRequest serviceRequest) {

		try {
			validatorUtils.isStringNull(login, "Please enter your login !");
		} catch (NullPointerException e) {
			serviceRequest.setErrors("login", e.getMessage());
		}
		
		return login;
	}

	public String validateRegisterActionFieldPassword(String password, AdminRegisterActionServiceRequest serviceRequest) {
		
		try {
			validatorUtils.isStringNull(password, "Please enter your password !");
		} catch (NullPointerException e) {
			serviceRequest.setErrors("password", e.getMessage());
		}
		
		return password;
	}
	
	
}
