
public class Test10 {

	public static void main(String... strings) {

		String name = "SIMMANT";

		String s = encode(name);
		System.out.println("encoded String :" + s);
		//decode(s);
	}

	public static String encode(String sr) {

		StringBuffer buffer = new StringBuffer();

		for (char c : sr.toCharArray()) {

			String result = "";

			char[] alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

			int k = c;

			if (k > 51) {

				int[] intTab = String.valueOf(k).chars().map(Character::getNumericValue).toArray();

				for (int i : intTab) {
					result = alphabet[i] + result;
				}

				buffer.append(result + ",");

			} else {

				buffer.append(alphabet[k] + ",");

			}

		}
		return buffer.toString();
	}

	public static void decode(String sr) {

		String[] sArray = sr.split(",");
		char[] alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
		for (String s : sArray) {
			char[] cArray = s.toCharArray();
			String s1 = "";
			for (char c : cArray) {
				for (int i = 0; i < alphabet.length; i++) {
					if (c == alphabet[i]) {
						s1 = i + s1;

					}

				}
			}

			char k = (char) Integer.parseInt(s1);
			System.out.println(k);
		}

	}

}

