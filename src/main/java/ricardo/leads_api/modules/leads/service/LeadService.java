package ricardo.leads_api.modules.leads.service;

import org.springframework.beans.factory.annotation.Autowired;
import ricardo.leads_api.modules.leads.dtos.CreateLeadDTO;
import ricardo.leads_api.modules.leads.entity.Lead;
import ricardo.leads_api.modules.leads.exceptions.LeadAlreadyRegisteredException;
import ricardo.leads_api.modules.leads.repository.LeadRepository;

public class LeadService {
	
	@Autowired
	LeadRepository leadRepository;
	
	public Lead createLead(CreateLeadDTO data) {
		
		this.leadRepository.findByEmail(data.email()).ifPresent((lead) -> {
			throw new LeadAlreadyRegisteredException();
		});
		
		Lead lead = new Lead(data.name(), data.email(), data.preference_product_type(), data.document());
		
		return leadRepository.save(lead);
	}
}
