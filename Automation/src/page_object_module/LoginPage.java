package page_object_module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//DECLARATION
	@FindBy(id="username")
	private WebElement unTbx;
	@FindBy(name="pwd")
	private WebElement pwdTbx;
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement lgBtn;

	public LoginPage(WebDriver driver) {
		//INITIALIZATION
		PageFactory.initElements(driver, this);
	}
	//Business logic method
	public void setLogin(String un,String pw) {
		//UTILIZATION
		unTbx.sendKeys(un);
		pwdTbx.sendKeys(pw);
		lgBtn.click();
	}

}
