package gregoire.jdr.access.mapper.admin;

import org.springframework.stereotype.Service;

import gregoire.jdr.access.model.admin.request.AdminRegisterAccessRequest;
import gregoire.jdr.access.model.admin.request.AdminRegisterActionAccessRequest;
import gregoire.jdr.access.validators.admin.AdminAccessMapperValidator;
import gregoire.jdr.web.model.admin.request.AdminRegisterActionWebRequest;
import gregoire.jdr.web.model.admin.request.AdminRegisterWebRequest;

@Service
public class AdminAccessRequestMapper {

	private AdminAccessMapperValidator mapperValidator;
	
	public AdminAccessRequestMapper(AdminAccessMapperValidator mapperValidator) {
		this.mapperValidator = mapperValidator;
	}
	
	public AdminRegisterAccessRequest mappAdminRegisterAccessRequest(AdminRegisterWebRequest webRequest, AdminRegisterAccessRequest accessRequest) {
		
		Boolean role = mapperValidator.validateRegisterFieldRole(webRequest.isRole(), accessRequest);
		
		accessRequest.setRole(role);
		
		Boolean authenticated = mapperValidator.validateRegisterFieldAuthenticated(webRequest.isAuthenticated(), accessRequest);
		
		accessRequest.setAuthenticated(authenticated);
		
		return accessRequest;
	}

	public AdminRegisterActionAccessRequest mappAdminRegisterActionAccessRequest(AdminRegisterActionWebRequest webRequest, AdminRegisterActionAccessRequest accessRequest) {
		
		Boolean role = mapperValidator.validateRegisterActionFieldRole(webRequest.isRole(), accessRequest);
		
		accessRequest.setRole(role);
		
		Boolean authenticated = mapperValidator.validateRegisterActionFieldAuthenticated(webRequest.isAuthenticated(), accessRequest);
		
		accessRequest.setAuthenticated(authenticated);
		
		String firstName = mapperValidator.validateRegisterActionFieldFirstName(webRequest.getFirstName(), accessRequest);
		
		accessRequest.setFirstName(firstName);
		
		String lastName = mapperValidator.valiateRegisterActionFieldLastName(webRequest.getLastName(), accessRequest);
		
		accessRequest.setLastName(lastName);
		
		String login = mapperValidator.validateRegisterActionFieldLogin(webRequest.getLogin(), accessRequest);
		
		accessRequest.setLogin(login);
		
		String password = mapperValidator.validateRegisterActionFieldPassword(webRequest.getPassword(), accessRequest);
		
		accessRequest.setPassword(password);
		
		String confirmPassword = mapperValidator.validateRegisterActionFieldConfirmPassword(webRequest.getConfirmPassword(), accessRequest);
		
		accessRequest.setConfirmPassword(confirmPassword);
		
		return accessRequest;
	}
	
	
}
