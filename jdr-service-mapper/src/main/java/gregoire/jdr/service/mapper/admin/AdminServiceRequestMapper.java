package gregoire.jdr.service.mapper.admin;

import org.springframework.stereotype.Service;

import gregoire.jdr.buisness.model.admin.request.AdminRegisterActionBuisnessRequest;
import gregoire.jdr.service.model.admin.request.AdminRegisterActionServiceRequest;
import gregoire.jdr.service.validators.admin.AdminServiceMapperValidator;

@Service
public class AdminServiceRequestMapper {

	private AdminServiceMapperValidator mapperValidator;
	
	public AdminServiceRequestMapper(AdminServiceMapperValidator mapperValidator) {
		this.mapperValidator = mapperValidator;
	}
	
	public AdminRegisterActionServiceRequest mappAdminRegisterActionServiceRequest(AdminRegisterActionServiceRequest serviceRequest, AdminRegisterActionBuisnessRequest buisnessRequest) {
		
		Boolean role = mapperValidator.validateRegisterActionFieldRole(buisnessRequest.isRole(), serviceRequest);
		
		serviceRequest.setRole(role);
		
		Boolean authenticated = mapperValidator.valiateRegisterActionFieldAuthenticated(buisnessRequest.isAuthenticated(), serviceRequest);
		
		serviceRequest.setAuthenticated(authenticated);
		
		String firstName = mapperValidator.validateRegisterActionFieldFirstName(buisnessRequest.getFirstName(), serviceRequest);
		
		serviceRequest.setFirstName(firstName);
		
		String lastName = mapperValidator.validateRegisterActionFieldLastName(buisnessRequest.getLastName(), serviceRequest);
		
		serviceRequest.setLastName(lastName);
		
		String login = mapperValidator.validateRegisterActionFieldLogin(buisnessRequest.getLogin(), serviceRequest);
		
		serviceRequest.setLogin(login);
		
		String password = mapperValidator.validateRegisterActionFieldPassword(buisnessRequest.getPassword(), serviceRequest);
		
		serviceRequest.setPassword(password);
		
		return serviceRequest;
	}
}
