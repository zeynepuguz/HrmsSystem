package kodlama.HrmsSystem.api.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import kodlama.HrmsSystem.business.abstracts.CandidateService;
import kodlama.HrmsSystem.core.utilities.results.DataResult;
import kodlama.HrmsSystem.entities.concretes.Candidate;

@RestController
@RequestMapping("/api/candidates")
public class CandidateController {

    private CandidateService candidateService;

    @Autowired
    public CandidateController(CandidateService candidateService) {
        super();
        this.candidateService = candidateService;
    }

    @GetMapping("/getall")
    public List<Candidate> getAll() {
        return this.candidateService.getAll();
    }

    public CandidateService getCandidateService() {
        return candidateService;
    }

    public void setCandidateService(CandidateService candidateService) {
        this.candidateService = candidateService;
    }

    @GetMapping("/getById")
    public DataResult<Candidate> getById
    (@RequestParam(name = "candidate_id") int candidate_id) {
        return this.candidateService.getById(candidate_id);
    }
    
    @GetMapping("/getByCandidateIdAndId")
    public DataResult<Candidate> getByCandidateIdAndId
    (@RequestParam(name = "candidate_id") int candidate_id,
    	@RequestParam(name = "id") int id){
    	 return this.candidateService.getByCandidateIdAndId(candidate_id,id);
    }
    
    @GetMapping("/getAllByPage")
    DataResult<List<Candidate>> getAll(@RequestParam(name = "pageNo") int pageNo,
    		@RequestParam(name ="pageSize") int pageSize){
		return this.candidateService.getAll(pageNo, pageSize);
    }
    
    @GetMapping("/getAllDesc")
    public DataResult<List<Candidate>> getAllSorted(){
    	return this.candidateService.getAllSorted();
    }
    
}
