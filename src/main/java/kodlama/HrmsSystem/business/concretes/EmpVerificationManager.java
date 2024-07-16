package kodlama.HrmsSystem.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.HrmsSystem.business.abstracts.EmployeeVerificationService;
import kodlama.HrmsSystem.dataAccess.abstracts.EmployeeVerificationDao;
import kodlama.HrmsSystem.entities.concretes.EmployeeVerification;

@Service
public class EmpVerificationManager implements EmployeeVerificationService{

	private EmployeeVerificationDao empVerificationDao;


	@Autowired
	public EmpVerificationManager(EmployeeVerificationDao empVerificationDao) {
		super();
		this.empVerificationDao = empVerificationDao;
	}


	public EmployeeVerificationDao getEmpVerificationDao() {
		return empVerificationDao;
	}


	public void setEmpVerificationDao(EmployeeVerificationDao empVerificationDao) {
		this.empVerificationDao = empVerificationDao;
	}


	@Override
	public List<EmployeeVerification> getAll() {
		// TODO Auto-generated method stub
		return this.empVerificationDao.findAll();
	}



}
