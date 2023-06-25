package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import common.GoogleBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleHome;

public class GoogleSearch11 extends GoogleBase{
	
	GoogleHome gh;

	 WebDriver driver;
	 
	@Given("I am on the google homepage")
	public void i_am_on_the_google_homepage() {
		
		launchbrowser();
		
	  
		
		
		//WebDriverManager.chromedriver().setup();
		//driver = new ChromeDriver ();
		
		//driver.get("https://www.google.com/");
		//driver.manage().window().maximize();
		
		
	}

	@When("I enter search {string}")
	public void i_enter_search(String string) {
		
		gh = new GoogleHome(driver);
		gh.clicksearch();
		
		
		
	    
		//identify the web elements (finding the locator) &named it
		
//	WebElement searchBox;
//  searchBox = driver.findElement(By.name("q"));
		
//		WebElement searchbox = driver.findElement(By.name("q"));
		
		
		//performing action
		
//		searchbox.sendKeys(string);
	}

	@When("I click on the google search button")
	public void i_click_on_the_google_search_button() {
		
		gh = new GoogleHome (driver);
		gh.clicksearch();
		
		//WebElement searchBtn;
		
		//searchBtn = driver.findElement(By.name("btnk"));
		
		//WebElement searchBtn = driver.findElement(By.name("btnk"));
		
		//searchBtn.click();
	   
	}

	@Then("I receive related result")
	public void i_receive_related_result() {
		
		
		
	   
		WebElement resultStats;
		resultStats = driver.findElement(By.id("result-stats"));
		
		String displayResult =resultStats.getText();
		
		//String result = resultStats.getText();
		
		System.out.println(".....");
		
		System.out.println(displayResult);
	
	}

}