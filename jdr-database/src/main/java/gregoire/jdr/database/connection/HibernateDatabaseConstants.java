package gregoire.jdr.database.connection;

public abstract class HibernateDatabaseConstants {

	public static final String PROPERTY_SOURCE = "classpath:application.properties";
	
	public static final String[] ENTITYMANAGER_PACKAGES_TO_SCAN = {
		"gregoire.jdr.entities"
	};
	
	//datasource keys
	public static final String SPRING_DATASOURCE_DRIVER_CLASS_NAME_KEY = "spring.datasource.driver-class-name";
	public static final String SPRING_DATASOURCE_URL_KEY = "spring.datasource.url";
	public static final String SPRING_DATASOURCE_USERNAME_KEY = "spring.datasource.username";
	public static final String SPRING_DATASOURCE_PASSWORD_KEY = "spring.datasource.password";
	
	//properties keys
	public static final String HIBERNATE_DIALECT_PROPERTY = "hibernate.dialect";
	public static final String HIBERNATE_SHOW_SQL_PROPERTY = "hibernate.show_sql";
	
	//properties values
	public static final String HIBERNATE_DIALECT_VALUE = "spring.jpa.properties.hibernate.dialect";
	public static final String HIBERNATE_SHOW_SQL_VALUE = "spring.jpa.show-sql";
}
