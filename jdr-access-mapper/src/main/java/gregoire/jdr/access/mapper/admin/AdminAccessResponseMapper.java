package gregoire.jdr.access.mapper.admin;

import org.springframework.stereotype.Service;

import gregoire.jdr.access.model.admin.request.AdminRegisterAccessRequest;
import gregoire.jdr.access.model.admin.request.AdminRegisterActionAccessRequest;
import gregoire.jdr.access.model.admin.response.AdminRegisterAccessResponse;
import gregoire.jdr.access.model.admin.response.AdminRegisterActionAccessResponse;
import gregoire.jdr.buisness.model.admin.response.AdminRegisterActionBuisnessResponse;

@Service
public class AdminAccessResponseMapper {

	public AdminAccessResponseMapper() {
		
	}
	
	public AdminRegisterAccessResponse mappAdminRegisterAccessResponseInvalidAccessRequest(AdminRegisterAccessRequest accessRequest, AdminRegisterAccessResponse accessResponse) {
		
		accessResponse.setRole(accessRequest.isRole());
		
		accessResponse.setAuthenticated(accessRequest.isAuthenticated());
		
		accessResponse.setErrors(accessRequest.getErrors());
		
		return accessResponse;
	}
	
	public AdminRegisterAccessResponse mappAdminRegisterAccessResponseOk(AdminRegisterAccessRequest accessRequest, AdminRegisterAccessResponse accessResponse) {
		
		accessResponse.setRole(accessRequest.isRole());
		
		accessResponse.setAuthenticated(accessRequest.isAuthenticated());
		
		return accessResponse;
	}

	public AdminRegisterActionAccessResponse mappAdminRegisterActionAccessResponseInvalidAccessRequest(AdminRegisterActionAccessRequest accessRequest, AdminRegisterActionAccessResponse accessResponse) {
		
		accessResponse.setRole(accessRequest.isRole());
		
		accessResponse.setAuthenticated(accessRequest.isAuthenticated());
		
		accessResponse.setErrors(accessRequest.getErrors());
		
		return accessResponse;
	}
	
	public AdminRegisterActionAccessResponse mappAdminRegisterActionAccessResponseInvalidBuisnessResponse(AdminRegisterActionBuisnessResponse buisnessResponse, AdminRegisterActionAccessResponse accessResponse) {
		
		accessResponse.setRole(buisnessResponse.isRole());
		
		accessResponse.setAuthenticated(buisnessResponse.isAuthenticated());
		
		accessResponse.setErrors(buisnessResponse.getErrors());
		
		return accessResponse;
	}
	
	public AdminRegisterActionAccessResponse mappAdminRegisterActionAccessResponseOk(AdminRegisterActionBuisnessResponse buisnessResponse, AdminRegisterActionAccessResponse accessResponse) {
		
		accessResponse.setRole(buisnessResponse.isRole());
		
		accessResponse.setAuthenticated(buisnessResponse.isAuthenticated());
		
		return accessResponse;
	}
}
