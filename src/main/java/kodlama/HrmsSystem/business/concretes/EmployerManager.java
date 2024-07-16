package kodlama.HrmsSystem.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.HrmsSystem.business.abstracts.EmployerService;
import kodlama.HrmsSystem.dataAccess.abstracts.EmployerDao;
import kodlama.HrmsSystem.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService{

	private EmployerDao employerDao;

	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}

	@Override
	public List<Employer> getAll() {
		return this.employerDao.findAll();
	}

	public EmployerDao getEmployerDao() {
		return employerDao;
	}

	public void setEmployerDao(EmployerDao employerDao) {
		this.employerDao = employerDao;
	}



}
