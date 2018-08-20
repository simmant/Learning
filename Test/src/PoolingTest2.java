
public class PoolingTest2 {

	private String name;
	private String suername;

	public PoolingTest2(String name, String surname) {

		this.name = name;
		this.suername = surname;

	}

	public String getName() {

		return this.name;
	}

	public String getSurName() {

		return this.suername;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((suername == null) ? 0 : suername.hashCode());
		return result;
	}

	// @Override
	// public boolean equals(Object obj) {
	// if (this == obj)
	// return true;
	// if (obj == null)
	// return false;
	// if (getClass() != obj.getClass())
	// return false;
	// PoolingTest2 other = (PoolingTest2) obj;
	// if (name == null) {
	// if (other.name != null)
	// return false;
	// } else if (!name.equals(other.name))
	// return false;
	// if (suername == null) {
	// if (other.suername != null)
	// return false;
	// } else if (!suername.equals(other.suername))
	// return false;
	// return true;
	// }
	//

}
