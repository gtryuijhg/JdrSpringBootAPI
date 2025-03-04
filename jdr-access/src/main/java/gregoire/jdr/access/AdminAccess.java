package gregoire.jdr.access;

import org.springframework.stereotype.Service;

import gregoire.jdr.access.mapper.admin.AdminAccessRequestMapper;
import gregoire.jdr.access.mapper.admin.AdminAccessResponseMapper;
import gregoire.jdr.access.model.admin.request.AdminRegisterAccessRequest;
import gregoire.jdr.access.model.admin.request.AdminRegisterActionAccessRequest;
import gregoire.jdr.access.model.admin.response.AdminRegisterAccessResponse;
import gregoire.jdr.access.model.admin.response.AdminRegisterActionAccessResponse;
import gregoire.jdr.access.validators.admin.AdminAccessValidator;
import gregoire.jdr.buisness.AdminBuisness;
import gregoire.jdr.buisness.model.admin.response.AdminRegisterActionBuisnessResponse;
import gregoire.jdr.web.model.admin.request.AdminRegisterActionWebRequest;
import gregoire.jdr.web.model.admin.request.AdminRegisterWebRequest;

@Service
public class AdminAccess {
	
	private AdminAccessRequestMapper requestMapper;
	private AdminAccessResponseMapper responseMapper;
	private AdminAccessValidator validator;
	private AdminBuisness adminBuisness;

	public AdminAccess(AdminAccessRequestMapper requestMapper, AdminAccessResponseMapper responseMapper, AdminAccessValidator validator, AdminBuisness adminBuisness) {
		this.requestMapper = requestMapper;
		this.responseMapper = responseMapper;
		this.validator = validator;
		this.adminBuisness = adminBuisness;
	}
	
	public AdminRegisterAccessResponse register(AdminRegisterWebRequest webRequest) {
		
		AdminRegisterAccessRequest accessRequest = new AdminRegisterAccessRequest();
		AdminRegisterAccessResponse accessResponse = new AdminRegisterAccessResponse();
		
		accessRequest = requestMapper.mappAdminRegisterAccessRequest(webRequest, accessRequest);
		
		if (!accessRequest.getErrors().isEmpty()) {
			
			accessResponse = responseMapper.mappAdminRegisterAccessResponseInvalidAccessRequest(accessRequest, accessResponse);
			
			return accessResponse;
		}
		
		accessRequest = validator.validateAdminRegisterAccessRequest(accessRequest);
		
		if (!accessRequest.getErrors().isEmpty()) {
			
			accessResponse = responseMapper.mappAdminRegisterAccessResponseInvalidAccessRequest(accessRequest, accessResponse);
			
			return accessResponse;
		}
		
		accessResponse = responseMapper.mappAdminRegisterAccessResponseOk(accessRequest, accessResponse);
		
		return accessResponse;
	}

	public AdminRegisterActionAccessResponse registerAction(AdminRegisterActionWebRequest webRequest) {
		
		AdminRegisterActionAccessRequest accessRequest = new AdminRegisterActionAccessRequest();
		AdminRegisterActionAccessResponse accessResponse = new AdminRegisterActionAccessResponse();
		
		accessRequest = requestMapper.mappAdminRegisterActionAccessRequest(webRequest, accessRequest);
		
		if (!accessRequest.getErrors().isEmpty()) {
			
			accessResponse = responseMapper.mappAdminRegisterActionAccessResponseInvalidAccessRequest(accessRequest, accessResponse);
			
			return accessResponse;
		}
		
		accessRequest = validator.validateAdminRegisterActionAccessRequest(accessRequest);
		
		if (!accessRequest.getErrors().isEmpty()) {
			
			accessResponse = responseMapper.mappAdminRegisterActionAccessResponseInvalidAccessRequest(accessRequest, accessResponse);
			
			return accessResponse;
		}
		
		AdminRegisterActionBuisnessResponse buisnessResponse = adminBuisness.registerAction(accessRequest);
		
		if (!buisnessResponse.getErrors().isEmpty()) {
			
			accessResponse = responseMapper.mappAdminRegisterActionAccessResponseInvalidBuisnessResponse(buisnessResponse, accessResponse);
			
			return accessResponse;
		}
		
		accessResponse = responseMapper.mappAdminRegisterActionAccessResponseOk(buisnessResponse, accessResponse);
		
		return accessResponse;
	}
}
