package orange.hrm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestExecution  {
	
	public WebDriver driver;
	public HRMHomePage hrmHomePage;
	
	@Before
	public void launchApp(){
		driver = new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrm.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		hrmHomePage = new HRMHomePage(driver);
	}
	
	@After
	public void closeApp(){
		driver.close();
	}

	@When("^user enters vaid username$")
	public void user_enters_vaid_username() throws Throwable {
		hrmHomePage.fillUserName("Admin");
	}

	@When("^valid password$")
	public void valid_password() throws Throwable {
		hrmHomePage.fillPassword("admin");
	}

	@When("^click on loginlink$")
	public void click_on_loginlink() throws Throwable {
		System.out.println("login link clicked");
	}

	@Then("^User will get Admin Home page$")
	public void user_will_get_Admin_Home_page() throws Throwable {
		System.out.println("admin home page");
	}
	
	@When("^user enters valid username$")
	public void user_enters_valid_username() throws Throwable {
	    hrmHomePage.fillUserName("admin");
	}

	@Then("^User will get logout link$")
	public void user_will_get_logout_link() throws Throwable {
		hrmHomePage.clickLoginLink();
	}

	@When("^enters invalid password$")
	public void enters_invalid_password() throws Throwable {
		hrmHomePage.fillPassword("Admin");
	}

	@Then("^User will ask to enter valid username/password$")
	public void user_will_ask_to_enter_valid_username_password() throws Throwable {
		System.out.println("please enter valid username or password");
	}

}
