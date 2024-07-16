package kodlama.HrmsSystem.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.HrmsSystem.business.abstracts.EMailVerificationService;
import kodlama.HrmsSystem.dataAccess.abstracts.EMailVerificationDao;
import kodlama.HrmsSystem.entities.concretes.EMailVerification;

@Service
public class EMailVerificationManager implements EMailVerificationService{

	private EMailVerificationDao eMailVerificationDao;


	@Autowired
	public EMailVerificationManager(EMailVerificationDao eMailVerificationDao) {
		super();
		this.eMailVerificationDao = eMailVerificationDao;
	}


	@Override
	public List<EMailVerification> getAll() {
		// TODO Auto-generated method stub
		return this.eMailVerificationDao.findAll();
	}


	public EMailVerificationDao geteMailVerificationDao() {
		return eMailVerificationDao;
	}


	public void seteMailVerificationDao(EMailVerificationDao eMailVerificationDao) {
		this.eMailVerificationDao = eMailVerificationDao;
	}



}
