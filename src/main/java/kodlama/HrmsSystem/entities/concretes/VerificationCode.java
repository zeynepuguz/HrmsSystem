package kodlama.HrmsSystem.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

@Entity
@Table(name="verification_code")
@Inheritance(strategy = InheritanceType.JOINED)
public class VerificationCode{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	@Column(name="verification_id")
	private int verification_id;

	@Column(name="user_type")
	private String user_type;

	@Column(name="is_verified")
	private Boolean is_verified;

	public VerificationCode() {
		
	}

	

	public VerificationCode(int verification_id, String user_type, Boolean is_verified) {
		super();
		this.verification_id = verification_id;
		this.user_type = user_type;
		this.is_verified = is_verified;
	}



	public int getVerification_id() {
		return verification_id;
	}

	public void setVerification_id(int verification_id) {
		this.verification_id = verification_id;
	}

	public String getUser_type() {
		return user_type;
	}

	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}

	public Boolean getIs_verified() {
		return is_verified;
	}

	public void setIs_verified(Boolean is_verified) {
		this.is_verified = is_verified;
	}

}
