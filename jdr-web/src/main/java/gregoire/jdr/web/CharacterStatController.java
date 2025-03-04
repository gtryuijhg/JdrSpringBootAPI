package gregoire.jdr.web;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/characterStat")
public class CharacterStatController {

	public CharacterStatController() {
		
	}
	
	/**
	 * show page create stat player character/non player character
	 * id character
	 * boolean true (1) (player)/ false (0) (non player)
	 * 
	 * TODO complete request/response path
	 * TODO define management rules for every request's applicative part
	 * TODO manage exception handling along path
	 */
	@GetMapping("/create/{id}/{bool}")
	public void create() {
		
	}
	
	/**
	 * send request to create stat player character/non player character
	 * id character
	 * boolean true (1) (player)/ false (0) (non player)
	 * 
	 * TODO complete request/response path
	 * TODO define management rules for every request's applicative part
	 * TODO manage exception handling along path
	 */
	@PostMapping("/create/{id}/{bool}")
	public void createAction() {
		
	}
	
	/**
	 * show page to update stat player character/non player character
	 * id character
	 * boolean true (1) (player)/ false (0) (non player)
	 * 
	 * TODO complete request/response path
	 * TODO define management rules for every request's applicative part
	 * TODO manage exception handling along path
	 */
	@GetMapping("/update/{id}/{bool}")
	public void update() {
		
	}
	
	/**
	 * send request to update stat player character/non player character
	 * id character
	 * boolean true (1) (player)/ false (0) (non player)
	 * 
	 * TODO complete request/response path
	 * TODO define management rules for every request's applicative part
	 * TODO manage exception handling along path
	 */
	@PutMapping("/update/{id}/{bool}")
	public void updateAction() {
		
	}
	/**
	 * show page to update stat player character/non player character
	 * id character
	 * boolean true (1) (player) / false (0) (non player)
	 * 
	 * TODO complete request/response path
	 * TODO define management rules for every request's applicative part
	 * TODO manage exception handling along path
	 */
	@GetMapping("/delete/{id}/{bool}")
	public void delete() {
		
	}
	/**
	 * send request to delete stat player character / non player character
	 * id character
	 * boolean true (1) (player) / false (0) (non player)
	 * 
	 * TODO complete request/response path
	 * TODO define management rules for every request's applicative part
	 * TODO manage exception handling along path
	 */
	@DeleteMapping("/delete/{id}/{bool}")
	public void deleteAction() {
		
	}
}
