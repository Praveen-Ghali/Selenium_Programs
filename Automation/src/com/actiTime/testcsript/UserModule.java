package com.actiTime.testcsript;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.actiTime.generic.BaseClass;
import com.actiTime.generic.FileLibrary;
@Listeners(com.actiTime.generic.ListenerImplementation.class)
public class UserModule extends BaseClass {
	@Test
	public void createUser() throws InterruptedException, EncryptedDocumentException, IOException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[@class='content users']")).click();
		driver.findElement(By.xpath("//div[@class='buttonText']")).click();
		//String un="GHALI,PRAVEEN";
		FileLibrary f=new FileLibrary();
		
		String fname = f.getCreateUserExceldata("UserDetails", 1, 0);
		String lName = f.getCreateUserExceldata("UserDetails", 1, 1);
		String eMail = f.getCreateUserExceldata("UserDetails", 1, 2);
		String un = f.getCreateUserExceldata("UserDetails", 1, 3);
		String pwd = f.getCreateUserExceldata("UserDetails", 1, 4);
		driver.findElement(By.id("userDataLightBox_firstNameField")).sendKeys(fname);
		driver.findElement(By.id("userDataLightBox_lastNameField")).sendKeys(lName);
		driver.findElement(By.id("userDataLightBox_emailField")).sendKeys(eMail);
		driver.findElement(By.id("userDataLightBox_usernameField")).sendKeys(un);
		driver.findElement(By.id("userDataLightBox_passwordField")).sendKeys(pwd);
		driver.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys(pwd);
		driver.findElement(By.id("userDataLightBox_timeZoneGroupSelectorPlaceholder")).click();
		driver.findElement(By.xpath("(//a[@class='x-menu-item'])[4]")).click();
		driver.findElement(By.xpath("//div[@class='valueCell hireDateValueCell']")).click();
		driver.findElement(By.xpath("((//table[@class='x-date-inner']//tbody/tr)[5]//span)[1]")).click();
		driver.findElement(By.xpath("//span[text()='Create User']")).click();
		driver.navigate().back();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//a[@class='content users']")).click();
		String text = driver.findElement(By.xpath("//tr[@class='userListRow disabled accountPermission settingsPermission customerProjectPermission taskPermission']//span[@class='userNameSpan']")).getText();
		System.out.println(text);
		/*SoftAssert s=new SoftAssert();
		s.assertEquals("GHALI,PRAVEEN", text);
		s.assertAll();*/
		if (text.contains("PRAVEEN")) {
			System.out.println("Pass");
		}
		else {
			System.out.println("fail");
		}
		
		
	}
}
