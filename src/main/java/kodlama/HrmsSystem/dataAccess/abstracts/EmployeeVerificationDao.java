package kodlama.HrmsSystem.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.HrmsSystem.entities.concretes.EmployeeVerification;

public interface EmployeeVerificationDao extends JpaRepository<EmployeeVerification,Integer>{

}
