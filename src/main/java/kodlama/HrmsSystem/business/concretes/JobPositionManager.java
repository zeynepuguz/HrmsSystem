package kodlama.HrmsSystem.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.HrmsSystem.business.abstracts.JobPositionService;
import kodlama.HrmsSystem.dataAccess.abstracts.JobPositionDao;
import kodlama.HrmsSystem.entities.concretes.JobPositions;

@Service
public class JobPositionManager implements JobPositionService{

	private JobPositionDao jobPositionDao;


	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}


	@Override
	public List<JobPositions> getAll() {
		// TODO Auto-generated method stub
		return this.jobPositionDao.findAll();
	}


	public JobPositionDao getJobPositionDao() {
		return jobPositionDao;
	}


	public void setJobPositionDao(JobPositionDao jobPositionDao) {
		this.jobPositionDao = jobPositionDao;
	}



}
