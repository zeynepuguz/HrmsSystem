package kodlama.HrmsSystem.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.HrmsSystem.entities.concretes.MernisVerification;

public interface MernisVerificationDao extends JpaRepository<MernisVerification,Integer>{

}
