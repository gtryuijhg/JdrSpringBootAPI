package gregoire.jdr.buisness;

import org.springframework.stereotype.Service;

import gregoire.jdr.access.model.admin.request.AdminRegisterActionAccessRequest;
import gregoire.jdr.buisness.mapper.admin.AdminBuisnessRequestMapper;
import gregoire.jdr.buisness.mapper.admin.AdminBuisnessResponseMapper;
import gregoire.jdr.buisness.model.admin.request.AdminRegisterActionBuisnessRequest;
import gregoire.jdr.buisness.model.admin.response.AdminRegisterActionBuisnessResponse;
import gregoire.jdr.buisness.validators.admin.AdminBuisnessValidator;
import gregoire.jdr.service.AdminService;
import gregoire.jdr.service.model.admin.response.AdminRegisterActionServiceResponse;

@Service
public class AdminBuisness {
	
	private AdminBuisnessRequestMapper requestMapper;
	private AdminBuisnessResponseMapper responseMapper;
	private AdminBuisnessValidator validator;
	private AdminService adminService;

	public AdminBuisness(AdminBuisnessRequestMapper requestMapper, AdminBuisnessResponseMapper responseMapper, AdminBuisnessValidator validator, AdminService adminService) {
		this.requestMapper = requestMapper;
		this.responseMapper = responseMapper;
		this.validator = validator;
		this.adminService = adminService;
	}
	
	public AdminRegisterActionBuisnessResponse registerAction(AdminRegisterActionAccessRequest accessRequest) {
		
		AdminRegisterActionBuisnessRequest buisnessRequest = new AdminRegisterActionBuisnessRequest();
		AdminRegisterActionBuisnessResponse buisnessResponse = new AdminRegisterActionBuisnessResponse();
		
		/**
		 * complete mapping and control
		 */
		buisnessRequest = requestMapper.mappAdminRegisterActionBuisnessRequest(accessRequest, buisnessRequest);
		
		if (!buisnessRequest.getErrors().isEmpty()) {
			
			buisnessResponse = responseMapper.mappAdminRegisterActionBuisnessResponseInvalidBuisnessRequest(buisnessRequest, buisnessResponse);
			
			return buisnessResponse;
		}
		
		buisnessRequest = validator.validateAdminRegisterActionBuisnessRequest(buisnessRequest);
		
		if (!buisnessRequest.getErrors().isEmpty()) {
			
			buisnessResponse = responseMapper.mappAdminRegisterActionBuisnessResponseInvalidBuisnessRequest(buisnessRequest, buisnessResponse);
			
			return buisnessResponse;
		}
		
		AdminRegisterActionServiceResponse serviceResponse = adminService.registerAction(buisnessRequest);
		
		if (!serviceResponse.getErrors().isEmpty()) {
			
			buisnessResponse = responseMapper.mappAdminRegisterActionBuisnessResponseInvalidServiceResponse(serviceResponse, buisnessResponse);
			
			return buisnessResponse;
		}
		
		buisnessResponse = responseMapper.mappAdminRegisterActionBuisnessResponseOk(serviceResponse, buisnessResponse);
		
		return buisnessResponse;
	}
}
