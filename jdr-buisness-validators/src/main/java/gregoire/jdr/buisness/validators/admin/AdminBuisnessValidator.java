package gregoire.jdr.buisness.validators.admin;

import org.springframework.stereotype.Service;

import gregoire.jdr.buisness.model.admin.request.AdminRegisterActionBuisnessRequest;
import gregoire.jdr.buisness.validators.commons.BuisnessValidatorUtils;

@Service
public class AdminBuisnessValidator {

	private BuisnessValidatorUtils validatorUtils;
	
	public AdminBuisnessValidator(BuisnessValidatorUtils validatorUtils) {
		this.validatorUtils = validatorUtils;
	}

	public AdminRegisterActionBuisnessRequest validateAdminRegisterActionBuisnessRequest(AdminRegisterActionBuisnessRequest buisnessRequest) {
		
		//validate boolean role
		try {
			validatorUtils.isBooleanTrue(buisnessRequest.isRole(), "An admin role must be at true !");
		} catch (IllegalArgumentException e) {
			buisnessRequest.setErrors("role", e.getMessage());
		}
		
		//validate boolean authenticated
		try {
			validatorUtils.isBooleanFalse(buisnessRequest.isAuthenticated(), "You cannot be logged in while at the register page !");
		} catch (IllegalArgumentException e) {
			buisnessRequest.setErrors("authenticated", e.getMessage());
		}
		
		//validate string firstName
		try {
			validatorUtils.isFieldString(buisnessRequest.getFirstName(), "Your first name must be a string !");
			validatorUtils.isFieldMatchingRegex(buisnessRequest.getFirstName(), "#[^A-Za-zéèëîïôö]#", "Your first name can contain only allowed letters !");
		} catch (IllegalArgumentException e) {
			buisnessRequest.setErrors("firstName", e.getMessage());
		}
		
		//validate string lastName
		try {
			validatorUtils.isFieldString(buisnessRequest.getLastName(), "Your last name must be a string !");
			validatorUtils.isFieldMatchingRegex(buisnessRequest.getLastName(), "#[^A-Za-zéèëîïôö]#", "Your last name can contain only allowed letters !");
		} catch (IllegalArgumentException e) {
			buisnessRequest.setErrors("lastName", e.getMessage());
		}
		
		//validate string login
		try {
			validatorUtils.isFieldString(buisnessRequest.getLogin(), "Your login must be a string !");
			validatorUtils.isFieldTooShort(buisnessRequest.getLogin(), 7, "Your login is too short !");
			validatorUtils.isFieldTooLong(buisnessRequest.getLogin(), 15, "Your login is too long !");
			validatorUtils.isFieldNotMatchingRegex(buisnessRequest.getLogin(), "#(?=.*[a-z])(?=.*[A-Z])#", "Your login must contain letters !");
		} catch (IllegalArgumentException e) {
			buisnessRequest.setErrors("login", e.getMessage());
		}
		
		//validate string password
		try {
			validatorUtils.isFieldString(buisnessRequest.getPassword(), "Your password must be a string !");
			validatorUtils.isFieldTooShort(buisnessRequest.getPassword(), 8, "Your password is too short !");
			validatorUtils.isFieldTooLong(buisnessRequest.getPassword(), 20, "Your password is too long !");
			validatorUtils.isFieldNotMatchingRegex(buisnessRequest.getPassword(), "#(?=.*[a-z])(?=.*[A-Z])#", "Your password must contain at least one letter !");
			validatorUtils.isFieldNotMatchingRegex(buisnessRequest.getPassword(), "#(?=.*[0-9])#", "Your password must contain at least one number !");
			validatorUtils.isFieldNotMatchingRegex(buisnessRequest.getPassword(), "#(?=.*\\W)#", "Your password must contain at least one special character !");
		} catch (IllegalArgumentException e) {
			buisnessRequest.setErrors("password", e.getMessage());
		}
		
		//validate string confirmPassword
		try {
			validatorUtils.areFieldsEquals(buisnessRequest.getPassword(), buisnessRequest.getConfirmPassword(), "Your password and confirmation must be equals !");
		} catch(IllegalArgumentException e) {
			buisnessRequest.setErrors("confirmPassword", e.getMessage());
		}
		
		return buisnessRequest;
	}
	
	
}
