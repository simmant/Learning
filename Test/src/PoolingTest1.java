
public final class PoolingTest1 {

 	private String name; 
	private String suername;
	
	public PoolingTest1(String name,String surname){
		
		this.name = name;
		this.suername = surname;
		
	}
	
	public String getName(){
		String name = new String(this.name);
		return name;
	}
	
	public String getSurName(){
		String suername = new String(this.suername);
		return suername;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((suername == null) ? 0 : suername.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PoolingTest1 other = (PoolingTest1) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (suername == null) {
			if (other.suername != null)
				return false;
		} else if (!suername.equals(other.suername))
			return false;
		return true;
	}

	
	
	
	
}
