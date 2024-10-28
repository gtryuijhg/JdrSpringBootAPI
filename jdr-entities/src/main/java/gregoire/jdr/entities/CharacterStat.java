package gregoire.jdr.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "character_stat")
public class CharacterStat {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "level")
	private Integer level;
	
	@Column(name = "health")
	private Integer health;
	
	@Column(name = "max_health")
	private Integer maxHealth;
	
	@Column(name = "energy")
	private Integer energy;
	
	@Column(name = "max_energy")
	private Integer maxEnergy;
	
	@Column(name = "player_character")
	private Boolean playerCharacter;
	
	@Column(name = "character_id")
	private Integer characterId;
	
	public CharacterStat() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Integer getHealth() {
		return health;
	}

	public void setHealth(Integer health) {
		this.health = health;
	}

	public Integer getMaxHealth() {
		return maxHealth;
	}

	public void setMaxHealth(Integer maxHealth) {
		this.maxHealth = maxHealth;
	}

	public Integer getEnergy() {
		return energy;
	}

	public void setEnergy(Integer energy) {
		this.energy = energy;
	}

	public Integer getMaxEnergy() {
		return maxEnergy;
	}

	public void setMaxEnergy(Integer maxEnergy) {
		this.maxEnergy = maxEnergy;
	}

	public Boolean getPlayerCharacter() {
		return playerCharacter;
	}

	public void setPlayerCharacter(Boolean playerCharacter) {
		this.playerCharacter = playerCharacter;
	}

	public Integer getCharacterId() {
		return characterId;
	}

	public void setCharacterId(Integer characterId) {
		this.characterId = characterId;
	}
}
