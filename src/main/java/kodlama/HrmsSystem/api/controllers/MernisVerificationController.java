package kodlama.HrmsSystem.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.HrmsSystem.business.abstracts.MernisVerificationService;
import kodlama.HrmsSystem.entities.concretes.MernisVerification;

@RestController
@RequestMapping("/api/mernisverification")
public class MernisVerificationController {

	private MernisVerificationService mVService;


	@Autowired
	public MernisVerificationController(MernisVerificationService mVService) {
		super();
		this.mVService = mVService;
	}


	@GetMapping("/getall")
	public List<MernisVerification> getAll(){
		return this.mVService.getAll();
	}

	public MernisVerificationService getmVService() {
		return mVService;
	}


	public void setmVService(MernisVerificationService mVService) {
		this.mVService = mVService;
	}



}
