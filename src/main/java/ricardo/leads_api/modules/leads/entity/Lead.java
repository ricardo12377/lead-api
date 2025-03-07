package ricardo.leads_api.modules.leads.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import java.util.UUID;

@Entity(name = "lead")
public class Lead {
	
	
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
	
	private String name;
	
	private String email;
	
	private String preference_product_type;
	
	private String document;
	
	public Lead(String name, String email, String preference_product_type, String document) {
		this.name = name;
		this.email = email;
		this.preference_product_type = preference_product_type;
		this.document = preference_product_type;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setId(UUID id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPreference_product_type(String preference_product_type) {
		this.preference_product_type = preference_product_type;
	}
	
	public void setDocument(String document) {
		this.document = document;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getName() {
		return name;
	}
	
	public UUID getId() {
		return id;
	}
	
	public String getPreference_product_type() {
		return preference_product_type;
	}
	
	public String getDocument() {
		return document;
	}
}
