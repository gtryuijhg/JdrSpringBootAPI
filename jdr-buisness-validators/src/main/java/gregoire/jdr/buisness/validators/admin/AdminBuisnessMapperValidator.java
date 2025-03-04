package gregoire.jdr.buisness.validators.admin;

import org.springframework.stereotype.Service;

import gregoire.jdr.buisness.model.admin.request.AdminRegisterActionBuisnessRequest;
import gregoire.jdr.buisness.validators.commons.BuisnessValidatorUtils;

@Service
public class AdminBuisnessMapperValidator {

	private BuisnessValidatorUtils validatorUtils;
	
	public AdminBuisnessMapperValidator(BuisnessValidatorUtils validatorUtils) {
		this.validatorUtils = validatorUtils;
	}

	public Boolean validateRegisterActionFieldRole(Boolean role, AdminRegisterActionBuisnessRequest buisnessRequest) {
		
		try {
			validatorUtils.isBooleanNull(role, "An admin role must be defined !");
		} catch (NullPointerException e) {
			buisnessRequest.setErrors("role", e.getMessage());
		}
		
		return role;
	}

	public Boolean validateRegisterActionFieldAuthenticated(Boolean authenticated, AdminRegisterActionBuisnessRequest buisnessRequest) {
		
		try {
			validatorUtils.isBooleanNull(authenticated, "An admin must be authenticable !");
		} catch (NullPointerException e) {
			buisnessRequest.setErrors("authenticated", e.getMessage());
		}
		
		return authenticated;
	}

	public String validateRegisterActionFieldFirstName(String firstName, AdminRegisterActionBuisnessRequest buisnessRequest) {
		
		try {
			validatorUtils.isStringNull(firstName, "Please enter your first name !");
		} catch (NullPointerException e) {
			buisnessRequest.setErrors("firstName", e.getMessage());
		}
		
		return firstName;
	}

	public String validateRegisterActionFieldLastName(String lastName, AdminRegisterActionBuisnessRequest buisnessRequest) {
		
		try {
			validatorUtils.isStringNull(lastName, "Please enter your last name !");
		} catch (NullPointerException e) {
			buisnessRequest.setErrors("lastName", e.getMessage());
		}
		
		return lastName;
	}

	public String validateRegisterActionFieldLogin(String login, AdminRegisterActionBuisnessRequest buisnessRequest) {

		try  {
			validatorUtils.isStringNull(login, "Please enter your login !");
		} catch (NullPointerException e) {
			buisnessRequest.setErrors("login", e.getMessage());
		}
		
		return login;
	}

	public String validateRegisterActionFieldPassword(String password, AdminRegisterActionBuisnessRequest buisnessRequest) {
		
		try {
			validatorUtils.isStringNull(password, "Please enter your password !");
		} catch (NullPointerException e) {
			buisnessRequest.setErrors("password", e.getMessage());
		}
		
		return password;
	}

	public String validateRegisterActionFieldConfirmPassword(String confirmPassword, AdminRegisterActionBuisnessRequest buisnessRequest) {
		
		try {
			validatorUtils.isStringNull(confirmPassword, "Please confirm your password !");
		} catch (NullPointerException e) {
			buisnessRequest.setErrors("confirmPassword", e.getMessage());
		}
		
		return confirmPassword;
	}
	
	
}
