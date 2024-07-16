package kodlama.HrmsSystem.business.abstracts;

import java.util.List;
import kodlama.HrmsSystem.core.utilities.results.DataResult;
import kodlama.HrmsSystem.entities.concretes.Candidate;

public interface CandidateService {

    List<Candidate> getAll();

    DataResult<List<Candidate>> getAllSorted();
    
    DataResult<Candidate> getById(int candidate_id); // Where koşulu

    DataResult<Candidate> getByCandidateIdAndId(int candidate_id, int user_id);

    DataResult<List<Candidate>> getByCandidateIdOrId(int candidate_id, int user_id);

    DataResult<List<Candidate>> getByCandidateIdIn(List<Integer> candidates);
    
    DataResult<List<Candidate>> getAll(int pageNo,int pageSize);
}
