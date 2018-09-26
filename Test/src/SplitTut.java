public class SplitTut {

	public static void main(String... strings) {
		String s = "1,2,3,4,5,";

		String sArray[] = s.substring(0, s.length() - 1).split(",");

		for (String data : sArray) {
			char b = (char) data.toCharArray()[0];
			int a = b;
			System.out.println(a);
		}

	}

}
