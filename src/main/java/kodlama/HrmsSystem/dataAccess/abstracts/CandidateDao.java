package kodlama.HrmsSystem.dataAccess.abstracts;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import kodlama.HrmsSystem.entities.concretes.Candidate;

public interface CandidateDao extends JpaRepository<Candidate, Integer> {

    @Query("SELECT c FROM Candidate c WHERE c.candidate_id = ?1")
    Candidate getById(int candidate_id); 

    @Query("SELECT c FROM Candidate c WHERE c.candidate_id = ?1 AND c.user.id = ?2")
    Candidate getByCandidateIdAndId(int candidate_id, int user_id);

    @Query("SELECT c FROM Candidate c WHERE c.candidate_id = ?1 OR c.user.id = ?2")
    List<Candidate> getByCandidateIdOrId(int candidate_id, int user_id);

    @Query("SELECT c FROM Candidate c WHERE c.candidate_id IN ?1")
    List<Candidate> getByCandidateIdIn(List<Integer> candidates);

    @Query("SELECT c FROM Candidate c WHERE c.id = ?1 AND c.candidate_id = ?2")
    List<Candidate> getByIdAndCandidate(int id, int candidate_id);


}
