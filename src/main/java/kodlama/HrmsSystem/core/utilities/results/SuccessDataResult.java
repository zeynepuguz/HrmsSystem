package kodlama.HrmsSystem.core.utilities.results;

public class SuccessDataResult<T> extends DataResult<T> {

	public SuccessDataResult(T data,String message) {
		super(data,true,message);
	}
	
	public SuccessDataResult(T data) {
		super(true,data);
	}
	
	public SuccessDataResult(String message) {
		super(null,true,message);
	}
	
	public SuccessDataResult() {
		super(true,null);
	}
	

}
