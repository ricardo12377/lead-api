package ricardo.leads_api.modules.leads.dtos;

import java.util.UUID;

public record LeadResponseMapperDto(UUID id, String name, String email, String preference_product_type,
									String document) {
}
