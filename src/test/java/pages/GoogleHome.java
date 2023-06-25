package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHome {
	
	WebDriver driver;
	
	public GoogleHome(WebDriver driver) {
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	//WebElement searchbox = driver.findElement(By.name("q"));
	
	
	@FindBy (name = "q")
	
	WebElement searchbox;
	
	//searchbox.sendKeys(string);
  
	
	  public void enterSearch (String string) {

		  
		  searchbox.sendKeys(string);
	  }
	  
	 // WebElement searchBtn = driver.findElement(By.name("btnk"));
	  
	  @FindBy(name="btnk")
	  WebElement searchBtn;
	  
	  public void clicksearch() {
		
		searchBtn.click();
	  }
}
