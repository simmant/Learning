import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Test9 {
	public static void main(String[] args) throws Exception {

		// try {
		// byte[] allBytes = Files.readAllBytes(new
		// File("C://UserData//yadavs192//Downloads//download.jpg").toPath());
		// FileOutputStream fileOutputStream = new FileOutputStream(new
		// File("input.txt"));
		// fileOutputStream.write(allBytes);
		// } catch (Exception e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

		File file = new File("C://Users//yadavs192//Desktop//Untitled.png");
		BufferedImage orginalImage = ImageIO.read(file);

		BufferedImage blackAndWhiteImg = new BufferedImage(orginalImage.getWidth(), orginalImage.getHeight(),
				BufferedImage.TYPE_BYTE_BINARY);

		Graphics2D graphics = blackAndWhiteImg.createGraphics();
		graphics.drawImage(orginalImage, 0, 0, null);

		File file2 = new File("test.png");

		if (!file2.exists()) {
			file2.createNewFile();
		}

		ImageIO.write(blackAndWhiteImg, "png", file2);

	}
}
