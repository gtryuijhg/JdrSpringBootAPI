package gregoire.jdr.repository.model.admin.response;

import java.util.Map;

import org.springframework.stereotype.Component;

import gregoire.jdr.entities.User;

@Component
public class AdminRegisterActionRepositoryResponse {

	private Boolean role;
	
	private Boolean authenticated;
	
	private User user;
	
	private Map<String, String> errors;
	
	public AdminRegisterActionRepositoryResponse() {
		
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
	
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}

	public Map<String, String> getErrors() {
		return errors;
	}

	public void setErrors(Map<String, String> errors) {
		this.errors = errors;
	}
}
