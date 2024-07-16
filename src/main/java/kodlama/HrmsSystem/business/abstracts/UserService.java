package kodlama.HrmsSystem.business.abstracts;

import java.util.List;
import kodlama.HrmsSystem.core.utilities.results.Result;
import kodlama.HrmsSystem.core.utilities.results.DataResult;
import kodlama.HrmsSystem.entities.concretes.Users;

public interface UserService {

	DataResult<List<Users>> getAll();
	Result add(Users user);
	
	DataResult<List<Users>> getAll(int pageNo,int pageSize);
	
	 DataResult<List<Users>> getAllSorted();
	
	}
