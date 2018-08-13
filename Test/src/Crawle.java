import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

public class Crawle {

	public static void main(String... strings) throws IOException {

		String hello = "hello";
		
		BufferedImage img = ImageIO.read(new ByteArrayInputStream(hello.getBytes()));
		
		File outputfile = new File("saved.png");
		
		if(!outputfile.exists()){
			outputfile.createNewFile();
		}
		
		ImageIO.write(img, "png", outputfile); 
		 Image image  = ImageIO.read(new File("saved.png"));
		//System.out.println(compare(a1, a2));

	}

	static boolean compare(byte[] a1, byte[] a2) {

		System.out.println("size of 1st file:" + a1.length);
		System.out.println("size of 2nd file:" + a2.length);
		int a = a1.length - a2.length;
		boolean flag = false;
		List<Boolean> trueCase = new ArrayList<>();

		if (a >= 0) {

			for (int i = 0; i < a2.length; i++) {

				if (a1[i] == a2[i]) {

					trueCase.add(true);

				}

			}
			System.out.println("true case size : " + trueCase.size());
			if (trueCase.size() == a2.length) {

				flag = true;
			}

		} else {

			for (int i = 0; i < a1.length; i++) {

				if (a1[i] == a2[i]) {

					trueCase.add(true);

				}

			}

			if (trueCase.size() == a1.length) {

				flag = true;
			}

		}

		return flag;

	}

	static byte[] getByteByFile(File file) {
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		try {
			FileInputStream inputStream = new FileInputStream(file);

			byte[] b = new byte[1024];

			int c;
			while ((c = inputStream.read(b)) != -1) {
				os.write(b, 0, c);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

		return os.toByteArray();

	}

}
