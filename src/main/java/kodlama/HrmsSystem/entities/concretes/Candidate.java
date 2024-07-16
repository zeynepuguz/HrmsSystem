package kodlama.HrmsSystem.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="candidate")
public class Candidate extends Users{



    @Column(name="candidate_id")
    private int candidate_id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="identity_id")
    private String identityId;

    @Column(name="birth_year")
    private int birthYear;
    
    

    public Candidate() {
		super();
	}

	public Candidate(int id, String eMail, String password, String passwordRepeat, int candidate_id, String firstName,
                     String lastName, String identityId, int birthYear) {
        super(id, eMail, password, passwordRepeat);
        this.candidate_id = candidate_id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.identityId = identityId;
        this.birthYear = birthYear;
    }

	public int getCandidate_id() {
		return candidate_id;
	}

	public void setCandidate_id(int candidate_id) {
		this.candidate_id = candidate_id;
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

	public String getIdentityId() {
		return identityId;
	}

	public void setIdentityId(String identityId) {
		this.identityId = identityId;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	@OneToOne
	@JoinColumn(name="user_id")
	private Users user;


}
