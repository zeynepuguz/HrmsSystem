package kodlama.HrmsSystem.business.abstracts;

import java.util.List;

import kodlama.HrmsSystem.entities.concretes.Employee;


public interface EmployeeService {

	List<Employee> getAll();
}
