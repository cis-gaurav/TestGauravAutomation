package TestNgScripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class BasicTest {
		
	@Test
		public void Signup() throws IOException, InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();





	        driver.get("http://www.yopmail.com/en/");
			driver.findElement(By.id("login")).sendKeys("automate1");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			driver.findElement(By.xpath("//*[@id='lrefr']/span/span")).click();
			
			driver.switchTo().frame("ifinbox");
//			driver.findElement(By.xpath("//span[contains (text(),'Market Dojo')]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//span[@class='lmf' and text()='Market Dojo']")).click();
		    driver.switchTo().defaultContent();
		    driver.switchTo().frame("ifmail");
		    driver.findElement(By.xpath("//a [contains(text(),'next.testmd.co.uk')]")).click();
		    driver.switchTo().defaultContent();
	}
}
