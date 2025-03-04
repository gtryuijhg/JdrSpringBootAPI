package gregoire.jdr.web;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/playerCharacter")
public class PlayerCharacterController {

	public PlayerCharacterController() {
		
	}
	
	/**
	 * show page to create a player character
	 * user id in session
	 * game id in session
	 * 
	 * TODO complete request/response path
	 * TODO define management rules for every request's applicative part
	 * TODO manage exception handling along path
	 */
	@GetMapping("/create")
	public void create() {
		
	}
	
	/**
	 * send request to create a player character
	 * user id in session
	 * game id in session
	 * 
	 * TODO complete request/response path
	 * TODO define management rules for every request's applicative part
	 * TODO manage exception handling along path
	 */
	@PostMapping("/create")
	public void createAction() {
		
	}
	
	/**
	 * show page to update a player character
	 * player character id
	 * 
	 * TODO complete request/response path
	 * TODO define management rules for every request's applicative part
	 * TODO manage exception handling along path
	 */
	@GetMapping("/update/{id}")
	public void update() {
		
	}
	
	/**
	 * send request to yupdate player character
	 * player character id
	 * 
	 * TODO complete request/response path
	 * TODO define management rules for every request's applicative part
	 * TODO manage exception handling along path
	 */
	@PutMapping("/update/{id}")
	public void updateAction() {
		
	}
	
	/**
	 * show page to delete a player character
	 * player character id
	 * 
	 * TODO complete request/response path
	 * TODO define management rules for every request's applicative part
	 * TODO manage exception handling along path
	 */
	@GetMapping("/delete/{id}")
	public void delete() {
		
	}
	
	/**
	 * send request to delete a player character
	 * player character id
	 * 
	 * TODO complete request/response path
	 * TODO define management rules for every request's applicative part
	 * TODO manage exception handling along path
	 */
	@DeleteMapping("/delete/{id}")
	public void deleteAction() {
		
	}
	
	/**
	 * list all characters of a player
	 * player id in session
	 * 
	 * TODO complete request/response path
	 * TODO define management rules for every request's applicative part
	 * TODO manage exception handling along path
	 */
	@GetMapping("/list")
	public void list() {
		
	}
	
	/**
	 * show complete sheet of a player character
	 * player character id
	 * 
	 * infos with player character id :
	 * character infos
	 * character ability
	 * character stat
	 * character equipment
	 * character skill
	 * 
	 * TODO complete request/response path
	 * TODO define management rules for every request's applicative part
	 * TODO manage exception handling along path
	 */
	@GetMapping("/get/{id}")
	public void get() {
		
	}
}
