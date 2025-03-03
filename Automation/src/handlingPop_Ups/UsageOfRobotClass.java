package handlingPop_Ups;


import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.sql.Driver;

public class UsageOfRobotClass {
	public static void main(String[] args) throws Exception {
		Runtime.getRuntime().exec("notepad");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_R);
		r.keyPress(KeyEvent.VK_C);
		r.keyPress(KeyEvent.VK_B);
		r.keyRelease(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		//r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_I);
		r.keyPress(KeyEvent.VK_P);
		r.keyPress(KeyEvent.VK_L);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		
		
	}

}
