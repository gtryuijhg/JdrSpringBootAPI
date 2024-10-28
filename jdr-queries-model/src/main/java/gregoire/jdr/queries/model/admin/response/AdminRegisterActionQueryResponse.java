package gregoire.jdr.queries.model.admin.response;

import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class AdminRegisterActionQueryResponse {

	private Boolean role;
	
	private Boolean authenticated;
	
	private Map<String, String> errors;
	
	public AdminRegisterActionQueryResponse() {
		
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

	public void setErrors(Map<String, String> errors) {
		this.errors = errors;
	}
}
