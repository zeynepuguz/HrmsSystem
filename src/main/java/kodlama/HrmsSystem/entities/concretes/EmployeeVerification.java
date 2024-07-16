package kodlama.HrmsSystem.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;


@Entity
@Table(name="employee_verification")
public class EmployeeVerification extends VerificationCode{

	
	
	  @Column(name="emp_verification_id")
	    private int emp_verification_id;

	  
	  
	 
	public EmployeeVerification() {
		
	}
	
	public EmployeeVerification(int emp_verification_id) {
		super();
		this.emp_verification_id = emp_verification_id;
	}

	public int getEmp_verification_id() {
		return emp_verification_id;
	}

	public void setEmp_verification_id(int emp_verification_id) {
		this.emp_verification_id = emp_verification_id;
	}



}
