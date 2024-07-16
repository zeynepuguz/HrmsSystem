package kodlama.HrmsSystem.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.HrmsSystem.business.abstracts.VerificationCodeService;
import kodlama.HrmsSystem.dataAccess.abstracts.VerificationCodeDao;
import kodlama.HrmsSystem.entities.concretes.VerificationCode;

@Service
public class VerificationCodeManager implements VerificationCodeService{

	private VerificationCodeDao verificationCodeDao;


	@Autowired
	public VerificationCodeManager(VerificationCodeDao verificationCodeDao) {
		super();
		this.verificationCodeDao = verificationCodeDao;
	}



	@Override
	public List<VerificationCode> getAll() {
		// TODO Auto-generated method stub
		return this.verificationCodeDao.findAll();
	}



	public VerificationCodeDao getVerificationCodeDao() {
		return verificationCodeDao;
	}



	public void setVerificationCodeDao(VerificationCodeDao verificationCodeDao) {
		this.verificationCodeDao = verificationCodeDao;
	}



}
