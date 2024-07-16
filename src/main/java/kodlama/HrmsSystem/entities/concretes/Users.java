package kodlama.HrmsSystem.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;


@Entity
@Table(name="users")
@Inheritance(strategy =  InheritanceType.JOINED)
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","users"})
public class Users {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	@Column(name="user_id")
	private int id;

	@Column(name="e_mail")
	private String eMail;

	@Column(name="password")
	private String password;

	@Column(name="password_repeat")
	private String passwordRepeat;

	
	public Users() {
		
	}

	public Users(int id, String eMail, String password, String passwordRepeat) {
		super();
		this.id = id;
		this.eMail = eMail;
		this.password = password;
		this.passwordRepeat = passwordRepeat;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String geteMail() {
		return eMail;
	}


	public void seteMail(String eMail) {
		this.eMail = eMail;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getPasswordRepeat() {
		return passwordRepeat;
	}


	public void setPasswordRepeat(String passwordRepeat) {
		this.passwordRepeat = passwordRepeat;
	}


	

}
