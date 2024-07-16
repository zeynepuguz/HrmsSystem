package kodlama.HrmsSystem.business.abstracts;

import java.util.List;

import kodlama.HrmsSystem.entities.concretes.EMailVerification;

public interface EMailVerificationService {

	List<EMailVerification> getAll();
}
