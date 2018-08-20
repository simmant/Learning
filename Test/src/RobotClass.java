import java.awt.Desktop;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;

public class RobotClass {
	static Robot robot;

	public static void main(String... strings) throws Exception {
		robot = new Robot();
		Desktop.getDesktop().open(new File("path/to/google/chrome"));
		robot.delay(2000);
		robot.mouseMove(148, 50);
		robot.delay(100);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.delay(200);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		robot.delay(10000);
		keyPress();
	}

	public static void keyPress() {
		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
		robot.delay(100);
		robot.keyPress(KeyEvent.VK_S);
		robot.delay(100);
		robot.keyPress(KeyEvent.VK_I);
		robot.delay(100);
		robot.keyPress(KeyEvent.VK_M);
		robot.delay(100);
		robot.keyPress(KeyEvent.VK_M);
		robot.delay(100);
		robot.keyPress(KeyEvent.VK_A);
		robot.delay(100);
		robot.keyPress(KeyEvent.VK_N);
		robot.delay(100);
		robot.keyPress(KeyEvent.VK_T);
		robot.delay(100);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(5000);
		robot.mouseMove(176, 473);
		robot.delay(100);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.delay(200);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
	}

}
