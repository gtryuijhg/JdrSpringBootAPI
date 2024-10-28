package gregoire.jdr.access.validators.commons;

import org.springframework.stereotype.Service;

@Service
public class AccessValidatorUtils {

	public AccessValidatorUtils() {
		
	}
	
	public void isBooleanNull(Boolean field, String errorMessage) throws NullPointerException {
		if (field == null) {
			throw new NullPointerException(errorMessage);
		}
	}
	
	public void isBooleanTrue(Boolean field, String errorMessage) throws IllegalArgumentException {
		if (field != true) {
			throw new IllegalArgumentException(errorMessage);
		}
	}
	
	public void isBooleanFalse(Boolean field, String errorMessage) throws IllegalArgumentException {
		if (field != false) {
			throw new IllegalArgumentException(errorMessage);
		}
	}

	public void isStringNull(String field, String errorMessage) throws NullPointerException {
		if (field == null || field.trim().length() == 0) {
			throw new NullPointerException(errorMessage);
		}
	}

	public void isFieldString(String field, String errorMessage) throws IllegalArgumentException {
		if (!String.class.isInstance(field)) {
			throw new IllegalArgumentException(errorMessage);
		}
	}
}
