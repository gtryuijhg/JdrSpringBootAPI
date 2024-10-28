package gregoire.jdr.web;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

	public UserController() {
		
	}
	
	/**
	 * show page to register a user
	 * 
	 * TODO complete request/response path
	 * TODO define management rules for every request's applicative part
	 * TODO manage exception handling along path
	 */
	@GetMapping("/register")
	public void register() {
		
	}
	
	/**
	 * send request to register a user
	 * 
	 * TODO complete request/response path
	 * TODO define management rules for every request's applicative part
	 * TODO manage exception handling along path
	 */
	@PostMapping("/register")
	public void registerAction()  {
		
	}
	
	/**
	 * show page to connect a user
	 * 
	 * TODO complete request/response path
	 * TODO define management rules for every request's applicative part
	 * TODO manage exception handling along path
	 */
	@GetMapping("/signin")
	public void signin() {
		
	}
	
	/**
	 * send request to connect a user
	 * 
	 * TODO complete request/response path
	 * TODO define management rules for every request's applicative part
	 * TODO manage exception handling along path
	 */
	@PostMapping("/signin")
	public void signinAction() {
		
	}
	
	/**
	 * show page to update an user password
	 * user id in session
	 * 
	 * TODO complete request/response path
	 * TODO define management rules for every request's applicative part
	 * TODO manage exception handling along path
	 */
	@GetMapping("/update")
	public void update() {
		
	}
	
	/**
	 * send request to update an user password
	 * user id in session
	 * 
	 * TODO complete request/response path
	 * TODO define management rules for every request's applicative part
	 * TODO manage exception handling along path
	 */
	@PutMapping("/update")
	public void updateAction() {
		
	}
	
	/**
	 * show page to delete a user account
	 * user id in session
	 * 
	 * TODO complete request/response path
	 * TODO define management rules for every request's applicative part
	 * TODO manage exception handling along path
	 */
	@GetMapping("/delete")
	public void delete() {
		
	}
	
	/**
	 * send request to delete user account
	 * user id in session
	 * 
	 * TODO complete request/response path
	 * TODO define management rules for every request's applicative part
	 * TODO manage exception handling along path
	 */
	@DeleteMapping("/delete")
	public void deleteAction() {
		
	}
	
	/**
	 * show homepage to user account
	 * user id in session
	 * 
	 * TODO complete request/response path
	 * TODO define management rules for every request's applicative part
	 * TODO manage exception handling along path
	 */
	@GetMapping("/home")
	public void home() {
		
	}
	
	/**
	 * destroy session data and redirect to user connection page
	 */
	@GetMapping("/disconnect")
	public void disconnect() {
		
	}
}
