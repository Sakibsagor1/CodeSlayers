package advance;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandlingCheckBoxes {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		driver.manage().window().maximize();
		
		WebElement lin1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		
		if (lin1.isSelected()== true)
			System.out.println("checkbox 1 is selected");
			else
				System.out.println("checkbox 2 is not selected");
		
		
	
		
		

	}

}
