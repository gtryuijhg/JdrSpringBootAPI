package gregoire.jdr.database.connection;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.jpa.HibernatePersistenceProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@Configuration
@PropertySource(value = { HibernateDatabaseConstants.PROPERTY_SOURCE })
public class HibernateDatabaseConfig {

	private Environment env;
	
	@Bean(destroyMethod = "close")
	public DataSource dataSource() {
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		
		dataSource.setDriverClassName(env.getProperty(HibernateDatabaseConstants.SPRING_DATASOURCE_DRIVER_CLASS_NAME_KEY));
		dataSource.setUrl(env.getProperty(HibernateDatabaseConstants.SPRING_DATASOURCE_URL_KEY));
		dataSource.setUsername(env.getProperty(HibernateDatabaseConstants.SPRING_DATASOURCE_USERNAME_KEY));
		dataSource.setPassword(env.getProperty(HibernateDatabaseConstants.SPRING_DATASOURCE_PASSWORD_KEY));
		
		return dataSource;
	}
	
	@Bean
	public JpaTransactionManager jpaTransactionManager() {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(entityManagerFactoryBean().getObject());
		return transactionManager;
	}
	
	private HibernateJpaVendorAdapter vendorAdapter() {
		HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		vendorAdapter.setShowSql(true);
		return vendorAdapter;
	}
	
	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean() {
		
		LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
		
		entityManagerFactoryBean.setJpaVendorAdapter(vendorAdapter());
		entityManagerFactoryBean.setDataSource(dataSource());
		entityManagerFactoryBean.setPersistenceProviderClass(HibernatePersistenceProvider.class);
		entityManagerFactoryBean.setPackagesToScan(HibernateDatabaseConstants.ENTITYMANAGER_PACKAGES_TO_SCAN);
		entityManagerFactoryBean.setJpaProperties(jpaHibernateProperties());
		
		return entityManagerFactoryBean;
	}
	
	private Properties jpaHibernateProperties() {
		
		Properties properties = new Properties();
		
		properties.put(HibernateDatabaseConstants.HIBERNATE_DIALECT_PROPERTY, env.getProperty(HibernateDatabaseConstants.HIBERNATE_DIALECT_VALUE));
		properties.put(HibernateDatabaseConstants.HIBERNATE_SHOW_SQL_PROPERTY, env.getProperty(HibernateDatabaseConstants.HIBERNATE_SHOW_SQL_VALUE));
		
		return properties;
	}
}
