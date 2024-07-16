package kodlama.HrmsSystem.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.HrmsSystem.entities.concretes.EMailVerification;


public interface EMailVerificationDao extends JpaRepository<EMailVerification,Integer>{

}
