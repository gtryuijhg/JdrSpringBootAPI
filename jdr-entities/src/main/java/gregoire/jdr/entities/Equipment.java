package gregoire.jdr.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "equipment")
public class Equipment {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "outfit")
	private String outfit;
	
	@Column(name = "armor_value")
	private Integer armorValue;
	
	@Column(name = "weapon")
	private String weapon;
	
	@Column(name = "damage_value")
	private Integer damageValue;
	
	@Column(name = "backpack_slots")
	private Integer backpackSlots;
	
	@Column(name = "character_id")
	private Integer characterId;
	
	public Equipment() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOutfit() {
		return outfit;
	}

	public void setOutfit(String outfit) {
		this.outfit = outfit;
	}

	public Integer getArmorValue() {
		return armorValue;
	}

	public void setArmorValue(Integer armorValue) {
		this.armorValue = armorValue;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	public Integer getDamageValue() {
		return damageValue;
	}

	public void setDamageValue(Integer damageValue) {
		this.damageValue = damageValue;
	}

	public Integer getBackpackSlots() {
		return backpackSlots;
	}

	public void setBackpackSlots(Integer backpackSlots) {
		this.backpackSlots = backpackSlots;
	}

	public Integer getCharacterId() {
		return characterId;
	}

	public void setCharacterId(Integer characterId) {
		this.characterId = characterId;
	}
}
