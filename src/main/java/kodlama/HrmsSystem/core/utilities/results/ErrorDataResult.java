package kodlama.HrmsSystem.core.utilities.results;

public class ErrorDataResult<T> extends DataResult<T> {

	public ErrorDataResult(T data,String message) {
		super(data,false,message);
	}
	
	public ErrorDataResult(T data) {
		super(false,data);
	}
	
	public ErrorDataResult(String message) {
		super(null,false,message);
	}
	
	public ErrorDataResult() {
		super(false,null);
	}
	

}
