package SeleniumFramework_WebDriverManager.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {

              public static void main(String[] args) {

            	  WebDriverManager.chromedriver().setup();
				  WebDriver driver = new ChromeDriver();
				  
				  driver.get("http:google.com/");
			     
				  ////input[@name='q']
	            
				WebElement textBox = driver.findElement(By.xpath("//input[@name='q']"));
	              
	            textBox.sendKeys("Automation Step by Step");
	              
	            textBox.sendKeys(Keys.ENTER);
	              
	           // driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Automation Step by Step");
	            //textBox.sendKeys(Keys.ENTER);
				  
		         // driver.close(); 
				  
				  //driver.quit();
	}
}
