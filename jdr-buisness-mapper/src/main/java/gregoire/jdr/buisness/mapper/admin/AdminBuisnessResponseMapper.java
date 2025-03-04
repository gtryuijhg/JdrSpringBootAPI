package gregoire.jdr.buisness.mapper.admin;

import org.springframework.stereotype.Service;

import gregoire.jdr.buisness.model.admin.request.AdminRegisterActionBuisnessRequest;
import gregoire.jdr.buisness.model.admin.response.AdminRegisterActionBuisnessResponse;
import gregoire.jdr.service.model.admin.response.AdminRegisterActionServiceResponse;

@Service
public class AdminBuisnessResponseMapper {

	public AdminBuisnessResponseMapper() {
		
	}

	public AdminRegisterActionBuisnessResponse mappAdminRegisterActionBuisnessResponseInvalidBuisnessRequest(AdminRegisterActionBuisnessRequest buisnessRequest, AdminRegisterActionBuisnessResponse buisnessResponse) {

		buisnessResponse.setRole(buisnessRequest.isRole());
		
		buisnessResponse.setAuthenticated(buisnessRequest.isAuthenticated());
		
		buisnessResponse.setErrors(buisnessRequest.getErrors());
		
		return buisnessResponse;
	}

	public AdminRegisterActionBuisnessResponse mappAdminRegisterActionBuisnessResponseInvalidServiceResponse(AdminRegisterActionServiceResponse serviceResponse, AdminRegisterActionBuisnessResponse buisnessResponse) {
		
		buisnessResponse.setRole(serviceResponse.isRole());
		
		buisnessResponse.setAuthenticated(serviceResponse.isAuthenticated());
		
		buisnessResponse.setErrors(serviceResponse.getErrors());
		
		return buisnessResponse;
	}

	public AdminRegisterActionBuisnessResponse mappAdminRegisterActionBuisnessResponseOk(AdminRegisterActionServiceResponse serviceResponse, AdminRegisterActionBuisnessResponse buisnessResponse) {
		
		buisnessResponse.setRole(serviceResponse.isRole());
		
		buisnessResponse.setAuthenticated(serviceResponse.isAuthenticated());
		
		return buisnessResponse;
	}
}
