package orange.hrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HRMHomePage {
	
	//username fied
	@FindBy(id="txtUsername")
	private WebElement userName;
	
	//password
	@FindBy(id="txtPassword")
	private WebElement password;
	
	//login link
	@FindBy(id="btnLogin")
	private WebElement loginLink;
	
	public HRMHomePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void fillUserName(String username){
		this.userName.sendKeys(username);
	}
	
	public void fillPassword(String password){
		this.password.sendKeys(password);
	}
	
	public void clickLoginLink(){
		this.loginLink.click();
	}
	

}
