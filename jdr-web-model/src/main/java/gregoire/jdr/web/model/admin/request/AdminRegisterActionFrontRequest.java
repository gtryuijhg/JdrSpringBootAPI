package gregoire.jdr.web.model.admin.request;

import org.springframework.stereotype.Component;

@Component
public class AdminRegisterActionFrontRequest {

	private Boolean role;
	
	private Boolean authenticated;
	
	private String firstName;
	
	private String lastName;
	
	private String login;
	
	private String password;
	
	private String confirmPassword;
	
	public AdminRegisterActionFrontRequest() {
		
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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
}
