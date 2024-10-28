package gregoire.jdr.service.validators.admin;

import org.springframework.stereotype.Service;

import gregoire.jdr.service.model.admin.request.AdminRegisterActionServiceRequest;
import gregoire.jdr.service.validators.commons.ServiceValidatorUtils;

@Service
public class AdminServiceValidator {

	private ServiceValidatorUtils validatorUtils;
	
	public AdminServiceValidator(ServiceValidatorUtils validatorUtils) {
		this.validatorUtils = validatorUtils;
	}

	public AdminRegisterActionServiceRequest validateAdminRegisterActionServiceRequest(AdminRegisterActionServiceRequest serviceRequest) {

		//validate boolean role
		try {
			validatorUtils.isFieldBoolean(serviceRequest.isRole(), "An admin role must be a boolean !");
		} catch (IllegalArgumentException e) {
			serviceRequest.setErrors("role", e.getMessage());
		}
		
		//validate boolean authenticated
		try {
			validatorUtils.isFieldBoolean(serviceRequest.isAuthenticated(), "An admin authentication must be a boolean !");
		} catch (IllegalArgumentException e) {
			serviceRequest.setErrors("authenticated", e.getMessage());
		}
		
		//validate string firstName
		try {
			validatorUtils.isFieldString(serviceRequest.getFirstName(), "An admin first name must be a string !");
		} catch (IllegalArgumentException e) {
			serviceRequest.setErrors("firstName", e.getMessage());
		}
		
		//validate string lastName
		try {
			validatorUtils.isFieldString(serviceRequest.getLastName(), "An admin last name must be a string !");
		} catch (IllegalArgumentException e) {
			serviceRequest.setErrors("lastName", e.getMessage());
		}
		
		//validate string login
		try {
			validatorUtils.isFieldString(serviceRequest.getLogin(), "An admin login must be a string !");
		} catch (IllegalArgumentException e) {
			serviceRequest.setErrors("login", e.getMessage());
		}
		
		//validate string password
		try {
			validatorUtils.isFieldString(serviceRequest.getPassword(), "An admin password must be a string !");
		} catch (IllegalArgumentException e) {
			serviceRequest.setErrors("password", e.getMessage());
		}
		
		return serviceRequest;
	}
	
	
}
