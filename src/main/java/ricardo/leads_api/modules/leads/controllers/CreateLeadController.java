package ricardo.leads_api.modules.leads.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ricardo.leads_api.modules.leads.dtos.CreateLeadDTO;
import ricardo.leads_api.modules.leads.dtos.LeadResponseMapperDto;
import ricardo.leads_api.modules.leads.entity.Lead;
import ricardo.leads_api.modules.leads.mappers.LeadMapper;
import ricardo.leads_api.modules.leads.service.LeadService;

@RestController
@RequestMapping("/api")
public class CreateLeadController {
	@Autowired
	private LeadService leadService;
	
	@PostMapping("")
	public ResponseEntity<LeadResponseMapperDto> create(@RequestBody CreateLeadDTO data) {
		Lead lead = this.leadService.createLead(data);
		
		LeadResponseMapperDto leadMapper = LeadMapper.ToHttp(lead);
		
		return ResponseEntity.ok(leadMapper);
	}
	
	@GetMapping()
	public String helloWorld() {
		return "Helloo";
	}
}
