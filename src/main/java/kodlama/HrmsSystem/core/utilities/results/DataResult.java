package kodlama.HrmsSystem.core.utilities.results;

public class DataResult<T> extends Result{

	private T data;
	
	public DataResult(T data, boolean success, String message) {
		super(success, message);
		this.setData(data);
	}
	
	public DataResult(boolean success, T data) {
		super(success);
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	

	
	

}
