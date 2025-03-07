package ricardo.leads_api.modules.leads.repository;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import ricardo.leads_api.modules.leads.entity.Lead;

import java.util.Optional;

public interface LeadRepository extends JpaRepository<Lead, String>, JpaSpecificationExecutor<Lead> {
	
	@EntityGraph("Lead")
	Optional<Lead> findByEmail(String email);
}
