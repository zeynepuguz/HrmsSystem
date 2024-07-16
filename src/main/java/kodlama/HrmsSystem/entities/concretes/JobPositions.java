package kodlama.HrmsSystem.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="job_positions")
public class JobPositions {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)

	@Column(name="id")
	private int id;

	@Column(name="job_name")
	private String jobName;

	
	public JobPositions() {
		super();
	}

	public JobPositions(int id, String jobName) {
		super();
		this.id = id;
		this.jobName = jobName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}


}
