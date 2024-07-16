package kodlama.HrmsSystem.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.HrmsSystem.entities.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer,Integer>{

}
