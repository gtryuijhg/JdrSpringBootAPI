package gregoire.jdr.web.mapper.admin;

import org.springframework.stereotype.Service;

import gregoire.jdr.web.model.admin.request.AdminRegisterActionFrontRequest;
import gregoire.jdr.web.model.admin.request.AdminRegisterActionWebRequest;
import gregoire.jdr.web.model.admin.request.AdminRegisterFrontRequest;
import gregoire.jdr.web.model.admin.request.AdminRegisterWebRequest;
import gregoire.jdr.web.validators.admin.AdminWebMapperValidator;

@Service
public class AdminWebRequestMapper {

	private AdminWebMapperValidator mapperValidator;
	
	public AdminWebRequestMapper(AdminWebMapperValidator mapperValidator) {
		this.mapperValidator = mapperValidator;
	}
	
	public AdminRegisterWebRequest mappAdminRegisterWebReqest(AdminRegisterFrontRequest frontRequest, AdminRegisterWebRequest webRequest) {
		
		Boolean role = mapperValidator.validateRegisterFieldRole(frontRequest.isRole(), webRequest);
		
		webRequest.setRole(role);
		
		Boolean authenticated = mapperValidator.validateRegisterFieldAuthenticated(frontRequest.isAuthenticated(), webRequest);
		
		webRequest.setAuthenticated(authenticated);
		
		return webRequest;
	}
	
	public AdminRegisterActionWebRequest mappAdminRegisterActionWebRequest(AdminRegisterActionFrontRequest frontRequest, AdminRegisterActionWebRequest webRequest) {
		
		Boolean role = mapperValidator.validateRegisterActionFieldRole(frontRequest.isRole(), webRequest);
		
		webRequest.setRole(role);
		
		Boolean authenticated = mapperValidator.validateRegisterActionFieldAuthenticated(frontRequest.isAuthenticated(), webRequest);
		
		webRequest.setAuthenticated(authenticated);
		
		String firstName = mapperValidator.validateRegisterActionFieldFirstName(frontRequest.getFirstName(), webRequest);
		
		webRequest.setFirstName(firstName);
		
		String lastName = mapperValidator.validateRegisterActionFieldLastName(frontRequest.getLastName(), webRequest);
		
		webRequest.setLastName(lastName);
		
		String login = mapperValidator.validateRegisterActionFieldLogin(frontRequest.getLogin(), webRequest);
		
		webRequest.setLogin(login);
		
		String password = mapperValidator.validateRegisterActionFieldPassword(frontRequest.getPassword(), webRequest);
		
		webRequest.setPassword(password);
		
		String confirmPassword = mapperValidator.validateRegisterActionFieldConfirmPassword(frontRequest.getConfirmPassword(), webRequest);
		
		webRequest.setConfirmPassword(confirmPassword);
		
		return webRequest;
	}
}
