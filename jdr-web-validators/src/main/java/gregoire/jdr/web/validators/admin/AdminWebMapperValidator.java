package gregoire.jdr.web.validators.admin;

import org.springframework.stereotype.Service;

import gregoire.jdr.web.model.admin.request.AdminRegisterActionWebRequest;
import gregoire.jdr.web.model.admin.request.AdminRegisterWebRequest;
import gregoire.jdr.web.validators.commons.WebValidatorUtils;

@Service
public class AdminWebMapperValidator {

	private WebValidatorUtils validatorUtils;
	
	public AdminWebMapperValidator(WebValidatorUtils validatorUtils) {
		this.validatorUtils = validatorUtils;
	}
	
	public Boolean validateRegisterFieldRole(Boolean role, AdminRegisterWebRequest webRequest) {
		
		try {
			validatorUtils.isBooleanNull(role, "An admin role must be defined !");
		} catch (NullPointerException e) {
			webRequest.setErrors("role", e.getMessage());
		}
		
		return role;
	}
	
	public Boolean validateRegisterFieldAuthenticated(Boolean authenticated, AdminRegisterWebRequest webRequest) {
		
		try {
			validatorUtils.isBooleanNull(authenticated, "An admin must be authenticable !");
		} catch (NullPointerException e) {
			webRequest.setErrors("authenticated", e.getMessage());
		}
		
		return authenticated;
	}
	
	public Boolean validateRegisterActionFieldRole(Boolean role, AdminRegisterActionWebRequest webRequest) {
		
		try {
			validatorUtils.isBooleanNull(role, "An admin role must be defined !");
		} catch (NullPointerException e) {
			webRequest.setErrors("role", e.getMessage());
		}
		
		return role;
	}
	
	public Boolean validateRegisterActionFieldAuthenticated(Boolean authenticated, AdminRegisterActionWebRequest webRequest) {
		
		try {
			validatorUtils.isBooleanNull(authenticated, "An admin must be authenticable !");
		} catch (NullPointerException e) {
			webRequest.setErrors("authenticated", e.getMessage());
		}
		
		return authenticated;
	}
	
	public String validateRegisterActionFieldFirstName(String firstName, AdminRegisterActionWebRequest webRequest) {
		
		try {
			validatorUtils.isStringNull(firstName, "Please enter your first name !");
		} catch (NullPointerException e) {
			webRequest.setErrors("firstName", e.getMessage());
		}
		
		return firstName;
	}
	
	public String validateRegisterActionFieldLastName(String lastName, AdminRegisterActionWebRequest webRequest) {
		
		try {
			validatorUtils.isStringNull(lastName, "Please enter your last name !");
		} catch (NullPointerException e) {
			webRequest.setErrors("lastName", e.getMessage());
		}
		
		return lastName;
	}
	
	public String validateRegisterActionFieldLogin(String login, AdminRegisterActionWebRequest webRequest) {
		
		try {
			validatorUtils.isStringNull(login, "Please enter your login !");
		} catch (NullPointerException e) {
			webRequest.setErrors("login", e.getMessage());
		}
		
		return login;
	}

	public String validateRegisterActionFieldPassword(String password, AdminRegisterActionWebRequest webRequest) {

		try {
			validatorUtils.isStringNull(password, "Please enter your password !");
		} catch (NullPointerException e) {
			webRequest.setErrors("password", e.getMessage());
		}
		
		return password;
	}

	public String validateRegisterActionFieldConfirmPassword(String confirmPassword, AdminRegisterActionWebRequest webRequest) {
		
		try {
			validatorUtils.isStringNull(confirmPassword, "Please confirm your password !");
		} catch (NullPointerException e) {
			webRequest.setErrors("confirmPassword", e.getMessage());
		}

		return confirmPassword;
	}
}
