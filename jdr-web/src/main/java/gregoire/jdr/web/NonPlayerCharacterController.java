package gregoire.jdr.web;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nonPlayerCharacter")
public class NonPlayerCharacterController {

	public NonPlayerCharacterController() {
		
	}
	
	/**
	 * show page to create an npc
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
	 * send request to create an npc
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
	 * show page to update an npc
	 * npc id
	 * 
	 * TODO complete request/response path
	 * TODO define management rules for every request's applicative part
	 * TODO manage exception handling along path
	 */
	@GetMapping("/update/{id}")
	public void update() {
		
	}
	
	/**
	 * send request to update an npc
	 * npc id
	 * 
	 * TODO complete request/response path
	 * TODO define management rules for every request's applicative part
	 * TODO manage exception handling along path
	 */
	@PutMapping("/update/{id}")
	public void updateAction() {
		
	}
	
	/**
	 * show page to delete an npc
	 * npc id
	 * 
	 * TODO complete request/response path
	 * TODO define management rules for every request's applicative part
	 * TODO manage exception handling along path
	 */
	@GetMapping("/delete/{id}")
	public void delete() {
		
	}
	
	/**
	 * send request to delete an npc
	 * npc id
	 * 
	 * TODO complete request/response path
	 * TODO define management rules for every request's applicative part
	 * TODO manage exception handling along path
	 */
	@DeleteMapping("/delete/{id}")
	public void deleteAction() {
		
	}
}
