package ricardo.leads_api.modules.leads.dtos;

public record CreateLeadDTO(String name, String email, String preference_product_type, String document) {
}
