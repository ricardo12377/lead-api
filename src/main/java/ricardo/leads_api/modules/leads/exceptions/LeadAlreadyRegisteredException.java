package ricardo.leads_api.modules.leads.exceptions;

import org.springframework.http.HttpStatus;
import ricardo.leads_api.exceptions.AppException;

public class LeadAlreadyRegisteredException extends AppException {
	public LeadAlreadyRegisteredException() {
		super("Lead já existe", HttpStatus.CONFLICT);
	}
}
