package kodlama.HrmsSystem.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="mernis_verification")
public class MernisVerification extends VerificationCode{

	
	 @Column(name="mernis_verification_id")
	    private int mernis_verification_id;

	 public MernisVerification() {
		 
	 }
	 
	public MernisVerification(int mernis_verification_id) {
		super();
		this.mernis_verification_id = mernis_verification_id;
	}

	public int getMernis_verification_id() {
		return mernis_verification_id;
	}

	public void setMernis_verification_id(int mernis_verification_id) {
		this.mernis_verification_id = mernis_verification_id;
	}


}
