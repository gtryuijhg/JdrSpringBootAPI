package gregoire.jdr.database.connection;

import org.springframework.stereotype.Component;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

@Component
public class HibernateDatabaseConnection {

	private EntityManagerFactory entityManagerFactory;
	
	public HibernateDatabaseConnection(EntityManagerFactory entityManagerFactory) {
		this.entityManagerFactory = entityManagerFactory;
	}
	
	public EntityManager getEntityManager() {
		return entityManagerFactory.createEntityManager();
	}
}
