package gregoire.jdr.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "character_info")
public class CharacterInfo {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "character_class")
	private String characterClass;
	
	@Column(name = "character_particularity")
	private String characterParticularity;
	
	@Column(name = "character_id")
	private Integer characterId;
	
	public CharacterInfo() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCharacterClass() {
		return characterClass;
	}

	public void setCharacterClass(String characterClass) {
		this.characterClass = characterClass;
	}

	public String getCharacterParticularity() {
		return characterParticularity;
	}

	public void setCharacterParticularity(String characterParticularity) {
		this.characterParticularity = characterParticularity;
	}

	public Integer getCharacterId() {
		return characterId;
	}

	public void setCharacterId(Integer characterId) {
		this.characterId = characterId;
	}
}
