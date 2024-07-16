package kodlama.HrmsSystem.business.abstracts;

import java.util.List;

import kodlama.HrmsSystem.entities.concretes.JobPositions;

public interface JobPositionService {

	List<JobPositions> getAll();
}
