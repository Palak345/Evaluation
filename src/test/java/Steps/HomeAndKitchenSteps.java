package Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Pages.HomeAndKitchenPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeAndKitchenSteps {
  WebDriver driver;
 HomeAndKitchenPage homeAndKitchenPage;

@Given("I am on the Naaptol homepage")
  public void navigateToHomePage() {
	  driver = new ChromeDriver(); 
	  driver.get("https://www.naaptol.com/");
	  homeAndKitchenPage = new HomeAndKitchenPage(driver);
  }
 
@When("I search for {string}")
public void searchForItem(String item) {
	homeAndKitchenPage.searchForItem(item);
}

@Then("I should see results related to {string}")
public void verifyResults(String item) {
	Assert.assertTrue(driver.getTitle().contains(item));
	driver.quit();
}
}
