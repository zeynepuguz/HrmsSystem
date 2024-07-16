package kodlama.HrmsSystem.business.concretes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import kodlama.HrmsSystem.business.abstracts.UserService;
import kodlama.HrmsSystem.core.utilities.results.DataResult;
import kodlama.HrmsSystem.core.utilities.results.Result;
import kodlama.HrmsSystem.core.utilities.results.SuccessDataResult;
import kodlama.HrmsSystem.core.utilities.results.SuccessResult;
import kodlama.HrmsSystem.dataAccess.abstracts.UserDao;
import kodlama.HrmsSystem.entities.concretes.Users;

@Service
public class UserManager implements UserService{

	private UserDao userDao;


	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public DataResult<List<Users>> getAll() {
		return new SuccessDataResult<List<Users>>
		(this.userDao.findAll(),"Kişi listelendi.");
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public Result add(Users user) {
		this.userDao.save(user);
		return new SuccessResult("Kişi kaydı yapıldı.");
	}

	@Override
	public DataResult<List<Users>> getAllSorted(){
		Sort sort = Sort.by(Sort.Direction.ASC, "id");
		return  new SuccessDataResult<List<Users>>
		(this.userDao.findAll(sort),"Başarılı");
	}


	@Override
	public DataResult<List<Users>> getAll(int pageNo, int pageSize) {
		
		Pageable pageable = (Pageable) PageRequest.of(pageNo-1, pageSize);
		
		return new SuccessDataResult<List<Users>>
				(this.userDao.findAll(pageable).getContent());
	}
	
	


}
