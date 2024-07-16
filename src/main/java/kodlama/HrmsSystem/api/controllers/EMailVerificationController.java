package kodlama.HrmsSystem.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.HrmsSystem.business.abstracts.EMailVerificationService;
import kodlama.HrmsSystem.entities.concretes.EMailVerification;

@RestController
@RequestMapping("/api/emailverification")
public class EMailVerificationController {

	private EMailVerificationService eMailVerificationService;


	@Autowired
	public EMailVerificationController(EMailVerificationService eMailVerificationService) {
		super();
		this.eMailVerificationService = eMailVerificationService;
	}


	@GetMapping("/getall")
	public List<EMailVerification> getAll(){
		return this.eMailVerificationService.getAll();
	}

	public EMailVerificationService geteMailVerificationService() {
		return eMailVerificationService;
	}

	public void seteMailVerificationService(EMailVerificationService eMailVerificationService) {
		this.eMailVerificationService = eMailVerificationService;
	}


}
