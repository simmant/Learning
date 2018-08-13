public class Test3 {

	static String[] names = { "Ram", "Shyam", "Mohan", "Rohan", "Saket" };
	static String[] citys = { "Bhopal", "Indore", "Ujjan", "Dewas", "Rewa" };
	static String[] addresses = { "add1", "add2", "add3", "add4", "add5" };
	static StringBuffer buffer = new StringBuffer();

	public static void main(String... strings) {

		for (String a : names) {
			System.out.println(testData(a)+"\n");
			buffer.setLength(0);
		}
	}

	public static String testData(String name) {

		return generateData(name, 0, -1);
	}

	public static String generateData(String combination, int countA, int countB) {
 
		if ((countA == names.length - 1) && (countB == names.length - 1)) {

			return buffer.toString();

		}

		if (countB == addresses.length - 1) {
			countA = countA + 1;
			countB = -1;
		}

		countB = countB + 1;

		buffer.append(combination + citys[countA] + addresses[countB] + "\n");

		return generateData(combination, countA, countB);

	}

}
