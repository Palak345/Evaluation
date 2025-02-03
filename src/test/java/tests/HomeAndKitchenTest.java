package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.HomeAndKitchenPage;

public class HomeAndKitchenTest {
WebDriver driver;
 HomeAndKitchenPage homeAndKitchenPage;
@BeforeClass
public void setup() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  homeAndKitchenPage = new HomeAndKitchenPage(driver);
  }
@Test
public void testSearchItemInHomeAndKitchen() {
	driver.get("https://www.naaptol.com/");
	homeAndKitchenPage.searchForItem("Michrowave Oven");
	Assert.assertTrue(driver.getTitle().contains("Microwave Oven"));
	
}
@AfterClass
public void tearDown() {
	driver.quit();
}
}
