package gregoire.jdr.repository.model.admin.request;

import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class AdminRegisterActionRepositoryRequest {

	private Boolean role;
	
	private Boolean authenticated;
	
	private String firstName;
	
	private String lastName;
	
	private String login;
	
	private String password;
	
	private Map<String, String> errors;
	
	public AdminRegisterActionRepositoryRequest() {
		
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

	public Map<String, String> getErrors() {
		return errors;
	}

	public void setErrors(String field, String errorMessage) {
		this.errors.put(field, errorMessage);
	}
}
