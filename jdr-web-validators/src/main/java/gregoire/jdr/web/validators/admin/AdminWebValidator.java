package gregoire.jdr.web.validators.admin;

import org.springframework.stereotype.Service;

import gregoire.jdr.web.model.admin.request.AdminRegisterActionWebRequest;
import gregoire.jdr.web.model.admin.request.AdminRegisterWebRequest;
import gregoire.jdr.web.validators.commons.WebValidatorUtils;

@Service
public class AdminWebValidator {

	private WebValidatorUtils validatorUtils;
	
	public AdminWebValidator(WebValidatorUtils validatorUtils) {
		this.validatorUtils = validatorUtils;
	}
	
	public AdminRegisterWebRequest validateAdminRegisterWebRequest(AdminRegisterWebRequest webRequest) {
		
		//validate boolean role
		try {
			validatorUtils.isFieldBoolean(webRequest.isRole(), "An admin role must be a boolean !");
		} catch (IllegalArgumentException e) {
			webRequest.setErrors("role", e.getMessage());
		}
		
		//validate boolean authenticated
		try {
			validatorUtils.isFieldBoolean(webRequest.isAuthenticated(), "An admin authentication must be a boolean !");
		} catch (IllegalArgumentException e) {
			webRequest.setErrors("authenticated", e.getMessage());
		}
	
		return webRequest;
	}
	
	public AdminRegisterActionWebRequest validateAdminRegisterActionWebRequest(AdminRegisterActionWebRequest webRequest) {
		
		//validate boolean role
		try {
			validatorUtils.isFieldBoolean(webRequest.isRole(), "An admin role must be a boolean !");
		} catch (IllegalArgumentException e) {
			webRequest.setErrors("role", e.getMessage());
		}
		
		//validate boolean authenticated
		try {
			validatorUtils.isFieldBoolean(webRequest.isAuthenticated(), "An admin authentication must be a boolean !");
		} catch (IllegalArgumentException e) {
			webRequest.setErrors("authenticated", e.getMessage());
		}
		
		//validate string firstName
		try {
			validatorUtils.isFieldString(webRequest.getFirstName(), "An admin first name must be a string !");
		} catch (IllegalArgumentException e) {
			webRequest.setErrors("firstName", e.getMessage());
		}
		
		//validate string lastName
		try {
			validatorUtils.isFieldString(webRequest.getLastName(), "An admin last name must be a string !");
		} catch (IllegalArgumentException e) {
			webRequest.setErrors("lastName", e.getMessage());
		}
		
		//validate string login
		try {
			validatorUtils.isFieldString(webRequest.getLogin(), "An admin login must be a string !");
		} catch (IllegalArgumentException e) {
			webRequest.setErrors("login", e.getMessage());
		}
		
		//validate string password
		try {
			validatorUtils.isFieldString(webRequest.getPassword(), "An admin password must be a string !");
		} catch (IllegalArgumentException e) {
			webRequest.setErrors("password", e.getMessage());
		}
		
		//validate string confirmPassword
		try {
			validatorUtils.isFieldString(webRequest.getConfirmPassword(), "An admin password confirmation must be a string !");
		} catch (IllegalArgumentException e) {
			webRequest.setErrors("confirmPassword", e.getMessage());
		}
		
		return webRequest;
	}
}
