
public class PoolingMain {

	public static void main(String... strings) {
		// PoolingTest1 p = new PoolingTest1("test", "test");
		// PoolingTest1 p2 = new PoolingTest1("test", "test");
		// System.out.println(p.hashCode());
		// System.out.println(p2.hashCode());

		PoolingTest2 p = new PoolingTest2("test", "test");
		PoolingTest2 p2 = new PoolingTest2("test", "test");
		System.out.println(p.hashCode());
		System.out.println(p2.hashCode());
	}

}
