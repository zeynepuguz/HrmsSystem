package kodlama.HrmsSystem.business.abstracts;

import java.util.List;

import kodlama.HrmsSystem.entities.concretes.VerificationCode;

public interface VerificationCodeService {

	List<VerificationCode> getAll();
}
