package gregoire.jdr.buisness.validators.commons;

import org.springframework.stereotype.Service;

@Service
public class BuisnessValidatorUtils {

	public BuisnessValidatorUtils() {
		
	}
	
	public void isBooleanNull(Boolean field, String errorMessage) throws NullPointerException {
		if (field == null) {
			throw new NullPointerException(errorMessage);
		}
	}

	public void isStringNull(String field, String errorMessage) throws NullPointerException {
		if (field == null || field.trim().length() == 0) {
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
	
	public void isFieldString(String field, String errorMessage) throws IllegalArgumentException {
		if (!String.class.isInstance(field)) {
			throw new IllegalArgumentException(errorMessage);
		}
	}
	
	public void isFieldTooShort(String field, int length, String errorMessage) throws IllegalArgumentException {
		if (field.trim().length() < 8) {
			throw new IllegalArgumentException(errorMessage);
		}
	}
	
	public void isFieldTooLong(String field, int length, String errorMessage) throws IllegalArgumentException {
		if (field.trim().length() > 20) {
			throw new IllegalArgumentException(errorMessage);
		}
	}

	public void isFieldMatchingRegex(String field, String regex, String errorMessage) throws IllegalArgumentException {
		if (field.matches(regex)) {
			throw new IllegalArgumentException(errorMessage);
		}
	}

	public void isFieldNotMatchingRegex(String field, String regex, String errorMessage) throws IllegalArgumentException {
		if (!field.matches(regex)) {
			throw new IllegalArgumentException(errorMessage);
		}
	}

	public void areFieldsEquals(String password, String confirmPassword, String errorMessage) throws IllegalArgumentException {
		if (!password.equals(confirmPassword)) {
			throw new IllegalArgumentException(errorMessage);
		}
	}
}
