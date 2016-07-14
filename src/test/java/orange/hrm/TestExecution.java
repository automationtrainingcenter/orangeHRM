package orange.hrm;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestExecution {

	public WebDriver driver;
	public OHRMHomePage hrmHomePage;
	@Before
	public void launchApp() {
		driver = new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrm.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		hrmHomePage = new OHRMHomePage(driver);
	}

	@After
	public void closeApp() {
		driver.close();
	}

	@Given("^user is in hrm home page$")
	public void user_is_in_hrm_home_page() {
		launchApp();
	}

	@When("^user enters username and password and click on login link$")
	public void user_enters_username_and_password_and_click_on_login_link(DataTable dataTable) {
		List<List<String>> userDeatils = dataTable.raw();
		for (int i = 1; i < userDeatils.size(); i++) {
			launchApp();
			hrmHomePage.fillUserName(userDeatils.get(i).get(0));
			hrmHomePage.fillPassword(userDeatils.get(i).get(1));
			hrmHomePage.clickLoginLink();
			closeApp();
		}

		// to print the size of rows and columns
		// System.out.println(userDeatils.size()+" "+userDeatils.get(1).size());

	}

	@When("^user enters \"(.*?)\" in username$")
	public void user_enters_in_username(String userName) throws Throwable {
		hrmHomePage.fillUserName(userName);
	}

	@When("^enters \"(.*?)\" as password$")
	public void valid_password(String password) throws Throwable {
		hrmHomePage.fillPassword(password);
	}

	@When("^click on loginlink$")
	public void click_on_loginlink() throws Throwable {
		System.out.println("login link clicked");
	}

	@Then("^User will get Admin Home page$")
	public void user_will_get_Admin_Home_page() throws Throwable {
		System.out.println("admin home page");
	}

	@Then("^User will get logout link$")
	public void user_will_get_logout_link() throws Throwable {
		hrmHomePage.clickLoginLink();
	}

	@Then("^User will ask to enter valid username/password$")
	public void user_will_ask_to_enter_valid_username_password() throws Throwable {
		System.out.println("please enter valid username or password");
	}

}
