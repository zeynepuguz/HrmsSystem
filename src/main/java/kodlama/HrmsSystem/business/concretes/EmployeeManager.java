package kodlama.HrmsSystem.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.HrmsSystem.business.abstracts.EmployeeService;
import kodlama.HrmsSystem.dataAccess.abstracts.EmployeeDao;
import kodlama.HrmsSystem.entities.concretes.Employee;

@Service
public class EmployeeManager implements EmployeeService{

	private EmployeeDao employeeDao;

	@Autowired
	public EmployeeManager(EmployeeDao employeeDao) {
		super();
		this.employeeDao = employeeDao;
	}


	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return this.employeeDao.findAll();
	}


	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}


	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}



}
