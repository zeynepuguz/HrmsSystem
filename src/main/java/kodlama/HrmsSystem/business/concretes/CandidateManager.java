package kodlama.HrmsSystem.business.concretes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import kodlama.HrmsSystem.business.abstracts.CandidateService;
import kodlama.HrmsSystem.core.utilities.results.DataResult;
import kodlama.HrmsSystem.core.utilities.results.SuccessDataResult;
import kodlama.HrmsSystem.dataAccess.abstracts.CandidateDao;
import kodlama.HrmsSystem.entities.concretes.Candidate;

@Service
public class CandidateManager implements CandidateService {

    private CandidateDao candidateDao;

    @Autowired
    public CandidateManager(CandidateDao candidateDao) {
        super();
        this.candidateDao = candidateDao;
    }

    @Override
    public List<Candidate> getAll() {
        return this.candidateDao.findAll();
    }

    @Override
    public DataResult<Candidate> getById(int candidate_id) {
        return new SuccessDataResult<>(this.candidateDao.getById(candidate_id), "Kişi listelendi.");
    }

    @Override
    public DataResult<Candidate> getByCandidateIdAndId(int candidate_id, int user_id) {
        return new SuccessDataResult<>(this.candidateDao.getByCandidateIdAndId(candidate_id, user_id), "Kişi listelendi.");
    }

    @Override
    public DataResult<List<Candidate>> getByCandidateIdOrId(int candidate_id, int user_id) {
    	return new SuccessDataResult<>
        (this.candidateDao.getByCandidateIdOrId(candidate_id, user_id), "Kişi listelendi.");
    }

    @Override
    public DataResult<List<Candidate>> getByCandidateIdIn(List<Integer> candidates) {
        return new SuccessDataResult<>(this.candidateDao.getByCandidateIdIn(candidates), "Kişi listelendi.");
    }

	@Override
	public DataResult<List<Candidate>> getAll(int pageNo, int pageSize) {
		Pageable pageable = (Pageable) PageRequest.of(pageNo-1, pageSize);
		
		return new SuccessDataResult<List<Candidate>>
				(this.candidateDao.findAll(pageable).getContent());
	}

	@Override
	public DataResult<List<Candidate>> getAllSorted() {
		Sort sort = Sort.by(Sort.Direction.DESC, "firstName");
		return  new SuccessDataResult<List<Candidate>>
		(this.candidateDao.findAll(sort),"Başarılı");
		
	}
	
}
