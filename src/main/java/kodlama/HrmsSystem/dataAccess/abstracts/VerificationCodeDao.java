package kodlama.HrmsSystem.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.HrmsSystem.entities.concretes.VerificationCode;


public interface VerificationCodeDao extends JpaRepository<VerificationCode,Integer>{

}
