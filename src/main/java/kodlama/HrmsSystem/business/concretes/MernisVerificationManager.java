package kodlama.HrmsSystem.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.HrmsSystem.business.abstracts.MernisVerificationService;
import kodlama.HrmsSystem.dataAccess.abstracts.MernisVerificationDao;
import kodlama.HrmsSystem.entities.concretes.MernisVerification;

@Service
public class MernisVerificationManager implements MernisVerificationService{

	private MernisVerificationDao mernisDao;


	@Autowired
	public MernisVerificationManager(MernisVerificationDao mernisDao) {
		super();
		this.mernisDao = mernisDao;
	}



	@Override
	public List<MernisVerification> getAll() {
		// TODO Auto-generated method stub
		return this.mernisDao.findAll();
	}



	public MernisVerificationDao getMernisDao() {
		return mernisDao;
	}



	public void setMernisDao(MernisVerificationDao mernisDao) {
		this.mernisDao = mernisDao;
	}


}
