package kodlama.HrmsSystem.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlama.HrmsSystem.business.abstracts.UserService;
import kodlama.HrmsSystem.core.utilities.results.DataResult;
import kodlama.HrmsSystem.core.utilities.results.Result;
import kodlama.HrmsSystem.entities.concretes.Users;

@RestController
@RequestMapping("/api/users")
public class UsersController {

	private UserService userService;


	@Autowired
	public UsersController(UserService userService) {
		super();
		this.userService = userService;
	}

	@GetMapping("/getall")
	public DataResult<List<Users>> getAll(){

		return this.userService.getAll() ;

	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@PostMapping("/add")
	public Result add(@RequestBody Users user) {
		return this.userService.add(user);
		
	}
	
	 @GetMapping("/getAllAsc")
	    public DataResult<List<Users>> getAllSorted(){
	    	return this.userService.getAllSorted();
	    }
	 
	 @GetMapping("/getAllByPage")
	 public DataResult<List<Users>> getAll
	 (@RequestParam(name = "pageNo") int pageNo,
	    @RequestParam(name ="pageSize") int pageSize){
		 return this.userService.getAll(pageNo, pageSize);
	 }
	
}
