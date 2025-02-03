package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeAndKitchenPage {
   WebDriver driver;

public HomeAndKitchenPage(WebDriver driver) {
	  this.driver = driver;
	  PageFactory.initElements(driver,this);
  }
@FindBy(xpath = "//input[@id='header_search_text']")
WebElement searchPanel;

@FindBy(xpath = "//form[@id='header_search']//div[@class='search']//a[@href='javascript:autoSuggestion.headerSearch()']")
WebElement searchButton;

public void searchForItem(String itemName) {
	searchPanel.sendKeys(itemName);
	searchButton.click();
}
}
