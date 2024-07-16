package kodlama.HrmsSystem.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;


@Entity
@Table(name="e_mail_verification")
public class EMailVerification extends VerificationCode{
	
	 @Column(name="email_verification_id")
	    private int email_verification_id;

	    public EMailVerification() {
	    	
	    }

	public EMailVerification(int email_verification_id) {
			super();
			this.email_verification_id = email_verification_id;
		}

	public int getEmail_verificatiın_id() {
		return email_verification_id;
	}

	public void setEmail_verificatiın_id(int email_verification_id) {
		this.email_verification_id = email_verification_id;
	}


}
