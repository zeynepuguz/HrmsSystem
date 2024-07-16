package kodlama.HrmsSystem.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
public class Employee extends Users{


	  @Column(name="employee_id")
	    private int employee_id;

	    @Column(name="first_name")
	    private String firstName;

	    @Column(name="last_name")
	    private String lastName;

	    
	    
	    public Employee() {
			super();
		}

		public Employee(int id, String eMail, String password, String passwordRepeat, int employee_id, String firstName,
	                    String lastName) {
	        super(id, eMail, password, passwordRepeat);
	        this.employee_id = employee_id;
	        this.firstName = firstName;
	        this.lastName = lastName;
	    }

	public int getEmployee_id() {
		return employee_id;
	}


	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}




}
