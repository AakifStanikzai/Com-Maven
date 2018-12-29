package StepDifination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest {
	WebDriver driver;

	@Given("^Open Chrome and start application$")
	public void open_Chrome_and_start_application() throws Throwable {
	  System.setProperty("webdriver,chromedriver", "\\Drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	}

	@When("^I enter valid \"(.*?)\" and valid \"(.*?)\"$")
	public void i_enter_valid_and_valid(String arg1, String arg2) throws Throwable {
		driver.findElement(By.id("userName")).sendKeys("Omid StanikZai");
		driver.findElement(By.id("password")).sendKeys("omid121987");
		
	 
	}

	@Then("^user should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable {
	  driver.findElement(By.id("btnLogin")).click();
	}

	@Then("^application should be closed$")
	public void application_should_be_closed() throws Throwable {
	  
	}


}
