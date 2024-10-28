package gregoire.jdr.web.model.admin.request;

import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class AdminRegisterWebRequest {

	private Boolean role;
	
	private Boolean authenticated;
	
	private Map<String, String> errors;
	
	public AdminRegisterWebRequest() {
		
	}

	public Boolean isRole() {
		return role;
	}

	public void setRole(Boolean role) {
		this.role = role;
	}

	public Boolean isAuthenticated() {
		return authenticated;
	}

	public void setAuthenticated(Boolean authenticated) {
		this.authenticated = authenticated;
	}

	public Map<String, String> getErrors() {
		return errors;
	}

	public void setErrors(String field, String errorMessage) {
		this.errors.put(field, errorMessage);
	}
}
