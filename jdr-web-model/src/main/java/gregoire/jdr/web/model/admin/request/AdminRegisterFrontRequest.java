package gregoire.jdr.web.model.admin.request;

import org.springframework.stereotype.Component;

@Component
public class AdminRegisterFrontRequest {

	private Boolean role;
	
	private Boolean authenticated;
	
	public AdminRegisterFrontRequest() {
		
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
}
