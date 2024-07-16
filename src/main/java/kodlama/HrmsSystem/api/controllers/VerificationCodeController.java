package kodlama.HrmsSystem.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.HrmsSystem.business.abstracts.VerificationCodeService;
import kodlama.HrmsSystem.entities.concretes.VerificationCode;

@RestController
@RequestMapping("/api/verification")
public class VerificationCodeController {

	private VerificationCodeService verificationService;


	@Autowired
	public VerificationCodeController(VerificationCodeService verificationService) {
		super();
		this.verificationService = verificationService;
	}


	@GetMapping("/getall")
	public List<VerificationCode> getAll(){
		return this.verificationService.getAll();
	}

	public VerificationCodeService getVerificationService() {
		return verificationService;
	}


	public void setVerificationService(VerificationCodeService verificationService) {
		this.verificationService = verificationService;
	}



}
