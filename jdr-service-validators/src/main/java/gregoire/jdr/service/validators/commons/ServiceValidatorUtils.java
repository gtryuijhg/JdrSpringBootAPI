package gregoire.jdr.service.validators.commons;

import org.springframework.stereotype.Service;

@Service
public class ServiceValidatorUtils {

	public ServiceValidatorUtils() {
		
	}
	
	public void isBooleanNull(Boolean field, String errorMessage) throws NullPointerException {
		if (field == null) {
			throw new NullPointerException(errorMessage);
		}
	}
	
	public void isFieldBoolean(Boolean field, String errorMessage) throws IllegalArgumentException {
		if (!Boolean.class.isInstance(field)) {
			throw new IllegalArgumentException(errorMessage);
		}
	}
	
	public void isStringNull(String field, String errorMessage) throws NullPointerException {
		if (field == null) {
			throw new NullPointerException(errorMessage);
		}
	}
	
	public void isFieldString(String firstName, String errorMessage) throws IllegalArgumentException {
		if (!String.class.isInstance(firstName)) {
			throw new IllegalArgumentException(errorMessage);
		}
	}
}
