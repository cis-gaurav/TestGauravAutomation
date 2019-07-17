package TestNgScripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import MDElements.Md_Element;
import MDMethods.NavigationMethods;
public class LoginTest {
	
	
	@BeforeClass
	public void launchBrowser() throws InterruptedException
	{
		NavigationMethods.getData();
		NavigationMethods.OpenBrowser();
	}
	@BeforeMethod
	public void openApplication()
	{
		 
		NavigationMethods.driver.get(NavigationMethods.prop.getProperty("URL"));
	}
	
  @Test
  public void LogPageTS01() throws InterruptedException {
	  NavigationMethods.driver.findElement(By.name("commit")).click();	
	  WebDriverWait wait = new WebDriverWait(NavigationMethods.driver, 10);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(Md_Element.valMesg)));
	  Assert.assertEquals(NavigationMethods.driver.findElement(By.id(Md_Element.valMesg)).getText(), "Username can't be blank");
	}
  
  @Test
  public void LogPageTS02() throws InterruptedException {
	  NavigationMethods.driver.findElement(By.id(Md_Element.uName)).sendKeys("ms1@.com");
	  NavigationMethods.driver.findElement(By.id(Md_Element.uPwd)).sendKeys("123456789");
	/*  NavigationMethods.driver.findElement(By.name(Md_Element.commitBtn)).click(); 	 */
  }
  
  @Test
  public static void LogPageTS03() {
  NavigationMethods.driver.findElement(By.id(Md_Element.uName)).sendKeys("ms1@reconmail.com");
  NavigationMethods.driver.findElement(By.id(Md_Element.uPwd)).sendKeys("1234567891");
  NavigationMethods.driver.findElement(By.name(Md_Element.commitBtn)).click(); 
  NavigationMethods.driver.findElement(By.xpath(Md_Element.flashEmail)).sendKeys("ms1@reconmail.com");
  NavigationMethods.driver.findElement(By.xpath(Md_Element.flashBtn)).click();
	 
  }
  
//  @Test
//  public void LogPageTS04() throws InterruptedException {
//   NavigationMethods.Openurlandlogin();  
//   NavigationMethods.driver.findElement(By.xpath(Md_Element.headerProfile)).click();
//   NavigationMethods.driver.findElement(By.xpath(Md_Element.headerLogout)).click();
//  }
  
  @Test
  public void LogPageTS05 () throws InterruptedException {
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.uForgotpassword)).click();
  }
  
  @Test
  public void LogPageTS06 () throws InterruptedException{
     NavigationMethods.driver.findElement(By.xpath(Md_Element.headerSgnup)).click();
 }

    @Test
    public void LogPageTS07(){
    NavigationMethods.driver.findElement(By.className(Md_Element.headerSgn)).click();	
}
  
	
  @Test
  public void LogPageTS08(){
	  NavigationMethods.driver.findElement(By.id(Md_Element.uName)).sendKeys("ms");
	  NavigationMethods.driver.findElement(By.id(Md_Element.uPwd)).sendKeys("1234");
	  NavigationMethods.driver.findElement(By.name(Md_Element.commitBtn)).click();
	  Assert.assertEquals(NavigationMethods.driver.findElement(By.id(Md_Element.vallengthU)).getText(), "Username insufficient length (can not be less than 3 characters)");
	  Assert.assertEquals(NavigationMethods.driver.findElement(By.id(Md_Element.vallengthP)).getText(), "Your password must be longer than 8 characters.");
  }
 
  
@Test
public void LogPageTS09(){
NavigationMethods.driver.get("https://exception.next.testmd.co.uk/login?locale=de");
NavigationMethods.driver.findElement(By.id(Md_Element.uName)).sendKeys("ms1@reconmail.com");
NavigationMethods.driver.findElement(By.id(Md_Element.uPwd)).sendKeys("123456789");
NavigationMethods.driver.findElement(By.name(Md_Element.commitBtn)).click();
}

  @AfterMethod
  public void ReturnToHome(){
	  NavigationMethods.driver.navigate().refresh();
  }

  @AfterClass
  public void CloseBrowser(){
	  
	  NavigationMethods.driver.close();  }
  
}
