package gregoire.jdr.web;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/characterSkill")
public class CharacterSkillController {

	public CharacterSkillController() {
		
	}
	
	/**
	 * show page to create player character's skill
	 * player character's id
	 * 
	 * TODO complete request/response path
	 * TODO define management rules for every request's applicative part
	 * TODO manage exception handling along path
	 */
	@GetMapping("/create/{id}")
	public void create() {
		
	}
	
	/**
	 * send request to create player caracter's skill
	 * player character's id
	 * 
	 * TODO complete request/response path
	 * TODO define management rules for every request's applicative part
	 * TODO manage exception handling along path
	 */
	@PostMapping("/create/{id}")
	public void createAction() {
		
	}
	
	/**
	 * show page to update player character's skill
	 * skill's id
	 * 
	 * TODO complete request/response path
	 * TODO define management rules for every request's applicative part
	 * TODO manage exception handling along path
	 */
	@GetMapping("/update/{id}")
	public void update() {
		
	}
	
	/**
	 * send request to update player character's skill
	 * skill's id
	 * 
	 * TODO complete request/response path
	 * TODO define management rules for every request's applicative part
	 * TODO manage exception handling along path
	 */
	@PutMapping("/update/{id}")
	public void updateAction() {
		
	}
	
	/**
	 * show page to delete player character's skill
	 * skill's id
	 * 
	 * TODO complete request/response path
	 * TODO define management rules for every request's applicative part
	 * TODO manage exception handling along path
	 */
	@GetMapping("/delete/{id}")
	public void delete() {
		
	}
	
	/**
	 * send request to delete player character's skill
	 * skill's id
	 * 
	 * TODO complete request/response path
	 * TODO define management rules for every request's applicative part
	 * TODO manage exception handling along path
	 */
	@DeleteMapping("/delete/{id}")
	public void deleteAction() {
		
	}
}
