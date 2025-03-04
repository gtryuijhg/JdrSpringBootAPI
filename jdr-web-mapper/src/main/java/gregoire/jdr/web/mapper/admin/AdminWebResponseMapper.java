package gregoire.jdr.web.mapper.admin;

import org.springframework.stereotype.Service;

import gregoire.jdr.access.model.admin.response.AdminRegisterAccessResponse;
import gregoire.jdr.access.model.admin.response.AdminRegisterActionAccessResponse;
import gregoire.jdr.web.model.admin.request.AdminRegisterActionWebRequest;
import gregoire.jdr.web.model.admin.request.AdminRegisterWebRequest;
import gregoire.jdr.web.model.admin.response.AdminRegisterActionWebResponse;
import gregoire.jdr.web.model.admin.response.AdminRegisterWebResponse;

@Service
public class AdminWebResponseMapper {

	public AdminWebResponseMapper() {
		
	}
	
	public AdminRegisterWebResponse mappAdminRegisterWebResponseInvalidWebRequest(AdminRegisterWebRequest webRequest, AdminRegisterWebResponse webResponse) {
		
		webResponse.setRole(webRequest.isRole());
		
		webResponse.setAuthenticated(webRequest.isAuthenticated());
		
		webResponse.setErrors(webRequest.getErrors());
		
		return webResponse;
	}
	
	public AdminRegisterWebResponse mappAdminRegisterWebResponseErrorsAccessResponse(AdminRegisterAccessResponse accessResponse, AdminRegisterWebResponse webResponse) {
		
		webResponse.setRole(accessResponse.isRole());
		
		webResponse.setAuthenticated(accessResponse.isAuthenticated());
		
		webResponse.setErrors(accessResponse.getErrors());
		
		return webResponse;
	}
	
	public AdminRegisterWebResponse mappAdminRegisterWebResponseOk(AdminRegisterAccessResponse accessResponse, AdminRegisterWebResponse webResponse) {
		
		webResponse.setRole(accessResponse.isRole());
		
		webResponse.setAuthenticated(accessResponse.isAuthenticated());
		
		return webResponse;
	}
	
	public AdminRegisterActionWebResponse mappAdminRegisterActionWebResponseInvalidWebRequest(AdminRegisterActionWebRequest webRequest, AdminRegisterActionWebResponse webResponse) {
		
		webResponse.setAuthenticated(webRequest.isAuthenticated());
		
		webResponse.setRole(webRequest.isRole());
		
		webResponse.setErrors(webRequest.getErrors());
		
		return webResponse;
	}
	
	public AdminRegisterActionWebResponse mappAdminRegisterActionWebResponseErrorsAccessResponse(AdminRegisterActionAccessResponse accessResponse, AdminRegisterActionWebResponse webResponse) {
		
		webResponse.setRole(accessResponse.isRole());
		
		webResponse.setAuthenticated(accessResponse.isAuthenticated());
		
		webResponse.setErrors(accessResponse.getErrors());
		
		return webResponse;
	}

	public AdminRegisterActionWebResponse mappAdminRegisterActionWebResponseOk(AdminRegisterActionAccessResponse accessResponse, AdminRegisterActionWebResponse webResponse) {
		
		webResponse.setRole(accessResponse.isRole());
		
		webResponse.setAuthenticated(accessResponse.isAuthenticated());
		
		return webResponse;
	}
}
