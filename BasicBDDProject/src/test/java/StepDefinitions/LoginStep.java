package StepDefinitions;

import java.sql.DriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.LoginPageObjects;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class LoginStep {

	WebDriver driver;

	@Given("I launch the Login page")
	public void i_launch_the_login_page() {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://classic.crmpro.com");
	}

	@When("I enter the username")
	public void i_enter_the_username() {
		new LoginPageObjects(driver).userName().sendKeys("groupautomation");
	}

	@When("I enter the password")
	public void i_enter_the_password() {
		new LoginPageObjects(driver).passWord().sendKeys("Test@12345");
	}

	@When("I click on Login button")
	public void i_click_on_login_button() {
		new LoginPageObjects(driver).submitButton().click();
	}

	@Then("I should be navigated to Home Page")
	public void i_should_be_navigated_to_home_page() {
	    System.out.println("Logged into the system");
	    driver.quit();
	}
}
