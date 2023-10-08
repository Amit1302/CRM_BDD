package stepdefinitions;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.factory.DriverFactory;
import com.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps  {
	
	private LoginPage loginpage = new LoginPage(DriverFactory.getDriver());
	
	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
		DriverFactory.getDriver()
		.get("https://www.odoo.com/web/login");
	}

	@Then("reset password link should be available")
	public void reset_password_link_should_be_available() {
	    Assert.assertTrue(loginpage.resetPwdLink());
	}

	@When("user enters the username as {string}")
	public void user_enters_the_username_as(String user_name) {
	    loginpage.enter_username(user_name);
	}

	@When("user enters the password as {string}")
	public void user_enters_the_password_as(String pwd) {
	    loginpage.enter_pwd(pwd);
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
	    loginpage.click_login();
	}

	@When("user verifies the try it for free button is available on the homepage")
	public void user_verifies_the_try_it_for_free_button_is_available_on_the_homepage() {
	    Assert.assertTrue(loginpage.tryitforFree());
	}

	@When("user verifies the alert should be {string}")
	public void user_verifies_the_alert_should_be(String msg) {
	    String text=loginpage.invalidLoginMsg();
	    Assert.assertEquals(msg, text);
	}

	
	
	 
	

}