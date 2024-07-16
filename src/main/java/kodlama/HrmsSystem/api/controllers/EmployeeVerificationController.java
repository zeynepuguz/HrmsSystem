package kodlama.HrmsSystem.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.HrmsSystem.business.abstracts.EmployeeVerificationService;
import kodlama.HrmsSystem.entities.concretes.EmployeeVerification;

@RestController
@RequestMapping("/api/getall")
public class EmployeeVerificationController {

	private EmployeeVerificationService empVerificationService;


	@Autowired
	public EmployeeVerificationController(EmployeeVerificationService empVerificationService) {
		super();
		this.empVerificationService = empVerificationService;
	}


	@GetMapping("/getall")
	public List<EmployeeVerification> getAll(){
		return this.empVerificationService.getAll();
	}

	public EmployeeVerificationService getEmpVerificationService() {
		return empVerificationService;
	}

	public void setEmpVerificationService(EmployeeVerificationService empVerificationService) {
		this.empVerificationService = empVerificationService;
	}


}
