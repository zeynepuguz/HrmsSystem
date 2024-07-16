package kodlama.HrmsSystem.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlama.HrmsSystem.entities.concretes.Users;

@Repository
public interface UserDao extends JpaRepository<Users,Integer>{
	//JpaRepository extendition vasıtasıyla hangi tabloya id veri tipiyle sorguların hazırlanması gerektiğini repository'ye söyler.
	
	
}
