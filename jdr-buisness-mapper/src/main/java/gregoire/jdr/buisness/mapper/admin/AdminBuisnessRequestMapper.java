package gregoire.jdr.buisness.mapper.admin;

import org.springframework.stereotype.Service;

import gregoire.jdr.access.model.admin.request.AdminRegisterActionAccessRequest;
import gregoire.jdr.buisness.model.admin.request.AdminRegisterActionBuisnessRequest;
import gregoire.jdr.buisness.validators.admin.AdminBuisnessMapperValidator;

@Service
public class AdminBuisnessRequestMapper {

	private AdminBuisnessMapperValidator mapperValidator;
	
	public AdminBuisnessRequestMapper(AdminBuisnessMapperValidator mapperValidator) {
		this.mapperValidator = mapperValidator;
	}
	
	public AdminRegisterActionBuisnessRequest mappAdminRegisterActionBuisnessRequest(AdminRegisterActionAccessRequest accessRequest, AdminRegisterActionBuisnessRequest buisnessRequest) {
		
		Boolean role = mapperValidator.validateRegisterActionFieldRole(accessRequest.isRole(), buisnessRequest);
		
		buisnessRequest.setRole(role);
		
		Boolean authenticated = mapperValidator.validateRegisterActionFieldAuthenticated(accessRequest.isAuthenticated(), buisnessRequest);
		
		buisnessRequest.setAuthenticated(authenticated);
		
		String firstName = mapperValidator.validateRegisterActionFieldFirstName(accessRequest.getFirstName(), buisnessRequest);
		
		buisnessRequest.setFirstName(firstName);
		
		String lastName = mapperValidator.validateRegisterActionFieldLastName(accessRequest.getLastName(), buisnessRequest);
		
		buisnessRequest.setLastName(lastName);
		
		String login = mapperValidator.validateRegisterActionFieldLogin(accessRequest.getLogin(), buisnessRequest);
		
		buisnessRequest.setLogin(login);
		
		String password = mapperValidator.validateRegisterActionFieldPassword(accessRequest.getPassword(), buisnessRequest);
		
		buisnessRequest.setPassword(password);
		
		String confirmPassword = mapperValidator.validateRegisterActionFieldConfirmPassword(accessRequest.getConfirmPassword(), buisnessRequest);
		
		buisnessRequest.setConfirmPassword(confirmPassword);
		
		return buisnessRequest;
	}
}
