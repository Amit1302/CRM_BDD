package stepdefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;

import com.factory.DriverFactory;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.util.ExcelReader;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class HomePageSteps {
	private LoginPage loginpage=new LoginPage(DriverFactory.getDriver());
	private HomePage homepage;
	@Given("user has logged into the application")
	public void user_has_logged_into_the_application(DataTable credTable) {
		List<Map<String, String>> credList = credTable.asMaps();
		String userName = credList.get(0).get("username");
		String password = credList.get(0).get("password");

		DriverFactory.getDriver()
				.get("https://www.odoo.com/web/login");
		homepage = loginpage.login(userName, password);
	}

	@Given("user is on the homepage")
	public void user_is_on_the_homepage() throws InterruptedException {
		Thread.sleep(5000);
	    String actual=homepage.data_base();
	    String expected="Databases";
		Assert.assertEquals(expected, actual);
	}

	@When("user clicks on the search box")
	public void user_clicks_on_the_search_box() throws InterruptedException {
		Thread.sleep(5000);
		
	}

	@Then("user search for {string}")
	public void user_search_for(String string) throws InterruptedException {
		Thread.sleep(5000);
		homepage.search_box();
	}

	@When("user clicks on create button")
	public void user_clicks_on_create_button() throws InterruptedException {
		Thread.sleep(5000);
		homepage.create();
	}

	@Then("user selects eCommerce")
	public void user_selects_e_commerce() throws InterruptedException {
		Thread.sleep(5000);
		homepage.Ecommerce();
	}

	@Then("user clicks on continue")
	public void user_clicks_on_continue() throws InterruptedException {
		Thread.sleep(5000);
		homepage.cn();
	}
	@When("user fills the form from given sheetname {string} and rownumber {int}")
	public void user_fills_the_form_from_given_sheetname_and_rownumber(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException {
		ExcelReader reader = new ExcelReader();
		List<Map<String,String>> testData = 
				reader.getData("C:\\Users\\ASUS\\Desktop\\CRM_Data.xlsx", sheetName);
		
		String name2 = testData.get(rowNumber).get("user_name");
		String email2 = testData.get(rowNumber).get("emailId");
		String website2 = testData.get(rowNumber).get("website");
		String number2 = testData.get(rowNumber).get("number");
		
		homepage.fill_the_form(name2, email2, website2, number2);
		
		
	}

	@When("user clicks on startsnow button")
	public void user_clicks_on_startsnow_button() {
	    homepage.start_now();
	}

	@Then("it shows an error message {string}")
	public void it_shows_an_error_message(String errormsg) {
	    String actual=homepage.error_msg();
	    Assert.assertEquals(errormsg, actual);
	    
	}


}
