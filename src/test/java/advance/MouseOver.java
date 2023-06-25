package advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class MouseOver {


	public static void main(String[] args) {
		
		WebDriverManager. chromedriver(). setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/hovers");
		driver.manage().window().maximize();
		
		WebElement img2 = driver.findElement(By.xpath("(//img[@alt='User Avatar'])[2]"));
		
		WebElement lnk2 = driver.findElement(By.xpath("(//a[text()='View profile']) [2]"));
		
		
		Actions act = new Actions(driver);
		act.moveToElement(img2).moveToElement(lnk2).click().build().perform();
		
		// driver.close();
		

	}

}
