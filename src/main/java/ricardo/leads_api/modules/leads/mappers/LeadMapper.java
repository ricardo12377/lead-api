package ricardo.leads_api.modules.leads.mappers;

import ricardo.leads_api.modules.leads.dtos.LeadResponseMapperDto;
import ricardo.leads_api.modules.leads.entity.Lead;

public class LeadMapper {
	
	public static LeadResponseMapperDto ToHttp(Lead lead) {
		
		return new LeadResponseMapperDto(lead.getId(), lead.getName(), lead.getEmail(), lead.getPreference_product_type(), lead.getDocument());
	}
}
