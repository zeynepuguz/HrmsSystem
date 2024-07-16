package kodlama.HrmsSystem.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="employer")
public class Employer extends Users{


	  @Column(name="employer_id")
	    private int employer_id;

	    @Column(name="company_name")
	    private String company_name;

	    @Column(name="website")
	    private String webSite;

	    @Column(name="telephone")
	    private String telephone;
	    
	    public Employer() {
	    }


	    public Employer(int id, String eMail, String password, String passwordRepeat, int employer_id, String company_name,
	                    String webSite, String telephone) {
	        super(id, eMail, password, passwordRepeat);
	        this.employer_id = employer_id;
	        this.company_name = company_name;
	        this.webSite = webSite;
	        this.telephone = telephone;
	    }
	public int getEmployer_id() {
		return employer_id;
	}

	public void setEmployer_id(int employer_id) {
		this.employer_id = employer_id;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public String getWebSite() {
		return webSite;
	}

	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	




}
