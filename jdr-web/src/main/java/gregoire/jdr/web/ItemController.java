package gregoire.jdr.web;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/item")
public class ItemController {

	public ItemController() {
		
	}
	
	/**
	 * show page to create an item
	 * game id
	 * 
	 * TODO complete request/response path
	 * TODO define management rules for every request's applicative part
	 * TODO manage exception handling along path
	 */
	@GetMapping("/create/{id}")
	public void create() {
		
	}
	
	/**
	 * send request to create an item
	 * game id
	 * 
	 * TODO complete request/response path
	 * TODO define management rules for every request's applicative part
	 * TODO manage exception handling along path
	 */
	@PostMapping("/create/{id}")
	public void createAction() {
		
	}
	
	/**
	 * show page to update an item
	 * item id
	 * 
	 * TODO complete request/response path
	 * TODO define management rules for every request's applicative part
	 * TODO manage exception handling along path
	 */
	@GetMapping("/update/{id}")
	public void update() {
		
	}
	
	/**
	 * send request to update an item
	 * item id
	 * 
	 * TODO complete request/response path
	 * TODO define management rules for every request's applicative part
	 * TODO manage exception handling along path
	 */
	@PutMapping("/update/{id}")
	public void updateAction() {
		
	}
	
	/**
	 * show page to delete an item
	 * item id
	 * 
	 * TODO complete request/response path
	 * TODO define management rules for every request's applicative part
	 * TODO manage exception handling along path
	 */
	@GetMapping("/delete/{id}")
	public void delete() {
		
	}
	
	/**
	 * send request to delete an item
	 * item id
	 * 
	 * TODO complete request/response path
	 * TODO define management rules for every request's applicative part
	 * TODO manage exception handling along path
	 */
	@DeleteMapping("/delete/{id}")
	public void deleteAction() {
		
	}
	
	/**
	 * show page to list all the items of a game
	 * game id in session
	 * 
	 * TODO complete request/response path
	 * TODO define management rules for every request's applicative part
	 * TODO manage exception handling along path
	 */
	@GetMapping("/list")
	public void list() {
		
	}
	
	/**
	 * show page infos on an item
	 * item id
	 * 
	 * TODO complete request/response path
	 * TODO define management rules for every request's applicative part
	 * TODO manage exception handling along path
	 */
	@GetMapping("/get/{id}")
	public void get() {
		
	}
}
