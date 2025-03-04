package gregoire.jdr.queries;

import gregoire.jdr.database.connection.HibernateDatabaseConnection;
import gregoire.jdr.entities.User;
import gregoire.jdr.queries.model.admin.response.AdminRegisterActionQueryResponse;
import gregoire.jdr.repository.model.admin.request.AdminRegisterActionRepositoryRequest;
import jakarta.persistence.TypedQuery;

public class AdminRepositoryQuery {

	private HibernateDatabaseConnection connection;
	
	public AdminRepositoryQuery(HibernateDatabaseConnection connection) {
		this.connection = connection;
	}
	
	public AdminRegisterActionQueryResponse registerActionSearchAdminQuery(AdminRegisterActionRepositoryRequest repositoryRequest, AdminRegisterActionQueryResponse queryResponse) {
		
		String queryString = "SELECT first_name, last_name, login, password FROM User WHERE first_name = :firstName AND last_name = :lastName AND login = :login AND password = :password AND role = :role";
		TypedQuery<User> query = connection.getEntityManager().createQuery(queryString, User.class);
		
		query.setParameter("firstName", repositoryRequest.getFirstName());
		query.setParameter("lastName", repositoryRequest.getLastName());
		query.setParameter("login", repositoryRequest.getLogin());
		query.setParameter("password", repositoryRequest.getPassword());
		query.setParameter("role", repositoryRequest.isRole());
		
		User user = (User) query.getSingleResult();
		
		connection.getEntityManager().close();
		
		try {
			if (user != null) {
				throw new Exception("User already in base !");
			}
		} catch (Exception e) {
			repositoryRequest.setErrors("query", e.getMessage());
		}
		
		queryResponse.setAuthenticated(repositoryRequest.isAuthenticated());
		queryResponse.setRole(repositoryRequest.isRole());
		
		return queryResponse;
	}
	
	public void registerActionPersistAdminQuery(AdminRegisterActionRepositoryRequest repositoryRequest) {
		
		User user = new User();
		
		user.setFirstName(repositoryRequest.getFirstName());
		user.setLastName(repositoryRequest.getLastName());
		user.setLogin(repositoryRequest.getLogin());
		user.setPassword(repositoryRequest.getPassword());
		user.setRole(repositoryRequest.isRole());
		
		connection.getEntityManager().persist(user);
		
		connection.getEntityManager().close();
	}
}
