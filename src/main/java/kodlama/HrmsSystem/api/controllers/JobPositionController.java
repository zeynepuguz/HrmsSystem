package kodlama.HrmsSystem.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.HrmsSystem.business.abstracts.JobPositionService;
import kodlama.HrmsSystem.entities.concretes.JobPositions;

@RestController
@RequestMapping("/api/jobposition")
public class JobPositionController {

	private JobPositionService jobPositionService;


	@Autowired
	public JobPositionController(JobPositionService jobPositionService) {
		super();
		this.jobPositionService = jobPositionService;
	}

	@GetMapping("/getall")
	public List<JobPositions> getAll(){
		return this.jobPositionService.getAll();
	}

	public JobPositionService getJobPositionService() {
		return jobPositionService;
	}

	public void setJobPositionService(JobPositionService jobPositionService) {
		this.jobPositionService = jobPositionService;
	}


}
