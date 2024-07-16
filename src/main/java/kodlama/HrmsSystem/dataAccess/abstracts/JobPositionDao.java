package kodlama.HrmsSystem.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.HrmsSystem.entities.concretes.JobPositions;

public interface JobPositionDao extends JpaRepository<JobPositions,Integer>{

}
