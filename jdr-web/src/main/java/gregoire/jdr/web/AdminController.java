package gregoire.jdr.web;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gregoire.jdr.access.AdminAccess;
import gregoire.jdr.access.model.admin.response.AdminRegisterAccessResponse;
import gregoire.jdr.access.model.admin.response.AdminRegisterActionAccessResponse;
import gregoire.jdr.web.mapper.admin.AdminWebRequestMapper;
import gregoire.jdr.web.mapper.admin.AdminWebResponseMapper;
import gregoire.jdr.web.model.admin.request.AdminRegisterActionFrontRequest;
import gregoire.jdr.web.model.admin.request.AdminRegisterActionWebRequest;
import gregoire.jdr.web.model.admin.request.AdminRegisterFrontRequest;
import gregoire.jdr.web.model.admin.request.AdminRegisterWebRequest;
import gregoire.jdr.web.model.admin.response.AdminRegisterActionWebResponse;
import gregoire.jdr.web.model.admin.response.AdminRegisterWebResponse;
import gregoire.jdr.web.validators.admin.AdminWebValidator;

@RestController
@RequestMapping("/admin")
public class AdminController {

	private AdminWebRequestMapper requestMapper;
	private AdminWebResponseMapper responseMapper;
	private AdminWebValidator validator;
	private AdminAccess adminAccess;
	
	public AdminController(AdminWebRequestMapper requestMapper, AdminWebResponseMapper responseMapper, AdminWebValidator validator, AdminAccess adminAccess) {
		this.requestMapper = requestMapper;
		this.responseMapper = responseMapper;
		this.validator = validator;
		this.adminAccess = adminAccess;
	}
	/**
	 * 
	 * @param frontRequest
	 * @return webResponse
	 * 
	 * TODO complete request/response path : DONE
	 * TODO define management rules for every request's applicative part : DONE
	 * TODO manage exception handling along path : DONE
	 * 
	 * show the admin account register page
	 */
	@GetMapping("/register")
	public AdminRegisterWebResponse register(@RequestBody AdminRegisterFrontRequest frontRequest) {
		
		AdminRegisterWebRequest webRequest = new AdminRegisterWebRequest();
		AdminRegisterWebResponse webResponse = new AdminRegisterWebResponse();
		
		//mapp front request to web request (verify all parameters are not null)
		webRequest = requestMapper.mappAdminRegisterWebReqest(frontRequest, webRequest);
		
		//if any parameter null, throw exception and mapp webResponse with return
		if (!webRequest.getErrors().isEmpty()) {
			
			webResponse = responseMapper.mappAdminRegisterWebResponseInvalidWebRequest(webRequest, webResponse);
			
			return webResponse;
		}
		
		//call web validator (clean request parameters if needed and verify types of request parameters)
		webRequest = validator.validateAdminRegisterWebRequest(webRequest);
		
		//if any parameters not a boolean
		if (!webRequest.getErrors().isEmpty()) {
			
			webResponse = responseMapper.mappAdminRegisterWebResponseInvalidWebRequest(webRequest, webResponse);
			
			return webResponse;
		}
		
		//call access request
		AdminRegisterAccessResponse accessResponse = adminAccess.register(webRequest);
		
		//if errors in accessResponse
		if (!accessResponse.getErrors().isEmpty()) {
			
			webResponse = responseMapper.mappAdminRegisterWebResponseErrorsAccessResponse(accessResponse, webResponse);
			
			return webResponse;
		}
		
		webResponse = responseMapper.mappAdminRegisterWebResponseOk(accessResponse, webResponse);
			
		return webResponse;
	}
	
	/**
	 * send request to create admin account
	 * 
	 * TODO complete request/response path
	 * TODO define management rules for every request's applicative part
	 * TODO manage exception handling along path
	 */
	@PostMapping("/register")
	public AdminRegisterActionWebResponse registerAction(@RequestBody AdminRegisterActionFrontRequest frontRequest) {
		
		AdminRegisterActionWebRequest webRequest = new AdminRegisterActionWebRequest();
		AdminRegisterActionWebResponse webResponse = new AdminRegisterActionWebResponse();
		
		//verify any parameter not null
		webRequest = requestMapper.mappAdminRegisterActionWebRequest(frontRequest, webRequest);
		
		if (!webRequest.getErrors().isEmpty()) {
			
			webResponse = responseMapper.mappAdminRegisterActionWebResponseInvalidWebRequest(webRequest, webResponse);
			
			return webResponse;
		}
		
		//verify all parameters valid
		webRequest = validator.validateAdminRegisterActionWebRequest(webRequest);
		
		if (!webRequest.getErrors().isEmpty()) {
			
			webResponse = responseMapper.mappAdminRegisterActionWebResponseInvalidWebRequest(webRequest, webResponse);
			
			return webResponse;
		}
		
		//call access part (check if authentication valid)
		AdminRegisterActionAccessResponse accessResponse = adminAccess.registerAction(webRequest);
		
		//if errors in access response
		if (!accessResponse.getErrors().isEmpty()) {
			
			webResponse = responseMapper.mappAdminRegisterActionWebResponseErrorsAccessResponse(accessResponse, webResponse);
			
			return webResponse;
		}
		
		webResponse = responseMapper.mappAdminRegisterActionWebResponseOk(accessResponse, webResponse);
		
		return webResponse;	
	}
	
	/**
	 * show the admin account connection page
	 * 
	 * TODO complete request/response path
	 * TODO define management rules for every request's applicative part
	 * TODO manage exception handling along path
	 */
	@GetMapping("/signin")
	public void signin() {
		
	}
	
	/**
	 * send request to connect an admin
	 * 
	 * TODO complete request/response path
	 * TODO define management rules for every request's applicative part
	 * TODO manage exception handling along path
	 */
	@PostMapping("/signin")
	public void signinAction() {
		
	}
	
	/**
	 * show page to update admin account password
	 * 
	 * TODO complete request/response path
	 * TODO define management rules for every request's applicative part
	 * TODO manage exception handling along path
	 */
	@GetMapping("/update")
	public void update() {
		
	}
	
	/**
	 * send request to update admin account password
	 * 
	 * TODO complete request/response path
	 * TODO define management rules for every request's applicative part
	 * TODO manage exception handling along path
	 */
	@PutMapping("/update")
	public void updateAction() {
		
	}
	
	/**
	 * show page to delete an admin account
	 * 
	 * TODO complete request/response path
	 * TODO define management rules for every request's applicative part
	 * TODO manage exception handling along path
	 */
	@GetMapping("/delete")
	public void delete() {
		
	}
	
	/**
	 * send request to delete an admin account
	 * 
	 * TODO complete request/response path
	 * TODO define management rules for every request's applicative part
	 * TODO manage exception handling along path
	 */
	@DeleteMapping("/delete")
	public void deleteAction() {
		
	}
	
	/**
	 * show homepage to admin account
	 * admin id in session
	 * 
	 * TODO complete request/response path
	 * TODO define management rules for every request's applicative part
	 * TODO manage exception handling along path
	 */
	@GetMapping("/home")
	public void home() {
		
	}
	
	/**
	 * destroy session data and redirect to admin connection page
	 */
	@GetMapping("/disconnect")
	public void disconnect() {
		
	}
}
