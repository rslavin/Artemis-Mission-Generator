package mission;

public class AbstractNamed implements Named {

	private String id;
	
	@Override
	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String getId() {
		return id;
	}

}
