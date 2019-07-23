package TestNgScripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;import org.apache.poi.ss.formula.functions.Na;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;

import MDElements.Md_Element;
import MDMethods.NavigationMethods;

public class QuickQuotes extends ExtentReportGenerate {
	
	
	
	@BeforeClass
	public void openBrowser() throws InterruptedException
	{
		NavigationMethods.OpenBrowser();
	}
	
	@BeforeMethod
	public void openApplication()
	{
		 
		NavigationMethods.QQlogin();
	}
	
	
//	@Test
//	public void QQByName()                                                                                                                           // VERIFY CREATE QUICK QUOTE BY EVENT NAME 
//	{
//		test=extent.createTest("QQByName");
//		  WebDriverWait wait = new WebDriverWait(NavigationMethods.driver, 20);
//		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(Md_Element.qqName)));
//		  NavigationMethods.driver.findElement(By.id(Md_Element.qqName)).sendKeys("Automate");
//		  WebDriverWait wait2 = new WebDriverWait(NavigationMethods.driver, 20);
//		  wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Md_Element.qqGetquote)));
//		  NavigationMethods.driver.findElement(By.xpath(Md_Element.qqGetquote)).click();
//	}
//	
//	@Test                                                                                                                                          // VERIFY Validation Message on EVENT NAME 
//	public void VerifymsgonEventname() throws InterruptedException
//	{
//	    test=extent.createTest("VerifymsgonEventname");
//	     WebDriverWait wait = new WebDriverWait(NavigationMethods.driver, 5000);
//	     wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(Md_Element.qqName)));
//         NavigationMethods.driver.findElement(By.id(Md_Element.qqName)).click();
//         NavigationMethods.driver.findElement(By.id(Md_Element.qqDeadline)).click();
//         WebDriverWait wait2 = new WebDriverWait(NavigationMethods.driver, 5000);
//	     wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Md_Element.qqvalName1)));
//	     Thread.sleep(5000);
//         NavigationMethods.driver.findElement(By.id(Md_Element.qqName)).sendKeys("Using the system will allow you to benefit from tes");
//         NavigationMethods.driver.findElement(By.id(Md_Element.qqDeadline)).click();
//         WebDriverWait wait3 = new WebDriverWait(NavigationMethods.driver, 5000);
//	     wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Md_Element.qqvalName)));
//         Assert.assertEquals(NavigationMethods.driver.findElement(By.xpath(Md_Element.qqvalName)).getText(), "Name too long (can not be greater than 50 characters)");
//	}
//	
//	@Test
//	public void VerifyGetquotedisLotname() throws InterruptedException{                                                              //VERIFY GET QUOTE BUTTON IS DISABLE  WITHOUT ENETR LOT NAME 
//		test=extent.createTest("VerifyGetquotedis");
//		NavigationMethods.DirectGetQuote();	
//		Assert.assertFalse(NavigationMethods.driver.findElement(By.xpath(Md_Element.qqdisGetquote)).isEnabled());
//	}
//	
//	@Test                                                                                                                                               // VERIFY DATE FIELD 
//	public void VerifyDate() throws InterruptedException{
//		test=extent.createTest("VerifyDate");
//		NavigationMethods.driver.findElement(By.id(Md_Element.qqName)).sendKeys("Test");
//		NavigationMethods.driver.findElement(By.id(Md_Element.qqDeadline)).sendKeys("2019-05-27 12:55");
//		NavigationMethods.driver.findElement(By.xpath(Md_Element.qqGetquote)).click();
//		Assert.assertEquals(NavigationMethods.driver.findElement(By.xpath(Md_Element.qqToasterr)).getText(), "THE DEADLINE YOU HAVE SELECTED IN THE PAST. PLEASE SELECT A DEADLINE DATE IN THE FUTURE.");
//		NavigationMethods.driver.findElement(By.id(Md_Element.qqDeadline)).clear();
//		NavigationMethods.driver.findElement(By.id(Md_Element.qqDeadline)).sendKeys("2020-05-27 12:55");
//		NavigationMethods.driver.findElement(By.id(Md_Element.qqDeadline)).click();
//	}
//	
//	  @Test                                                                                                                                     //VERIFY DESCRIPTION
//	  public void VerifyDes() throws InterruptedException{
//		  test=extent.createTest("VerifyDate");
//		  NavigationMethods.QQName();
//		  Thread.sleep(5000);
//		  NavigationMethods.driver.switchTo().frame(0);
//		  NavigationMethods.driver.findElement(By.xpath(Md_Element.qqDes)).sendKeys("Lorem Ipsum is simply dummy text of the printing");
//		  Thread.sleep(5000);
//		  NavigationMethods.driver.switchTo().defaultContent();
//		  NavigationMethods.QQGetquote();
//	  }
//	
//	  @Test                                                                                                                                     //VERIFY DOC UPLOAD 
//	  public void VerifyDocupload() throws IOException, InterruptedException{
//		  test=extent.createTest("VerifyDocupload");
//		  NavigationMethods.QQName();
//		  ((JavascriptExecutor) NavigationMethods.driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
//		  Thread.sleep(5000);
//		  NavigationMethods.driver.findElement(By.xpath(Md_Element.qqDrop)).click();
//		  Thread.sleep(5000);
//		  Runtime.getRuntime().exec("C:\\Users\\cis1\\Desktop\\AutoIT\\Gaurav_QQ1.exe");
//	  }
//	  
//
//	@Test                                                                                                                                          // VERIFY ADDING 5 LOTS 
//	public void Verfiyadding5lots() throws InterruptedException{
//		test=extent.createTest("Verfiyadding5lots");
//	NavigationMethods.QQCreate5lot();
//	}
//	
//	
//	@Test
//	public void VerifymsgonLotname() throws InterruptedException{                                                                        // VERIFY Validation MESSAGE on LOT NAME (MIN & MAX)
//		test=extent.createTest("VerifymsgonLotname");
//		NavigationMethods.QQchecklot();
//		Assert.assertEquals(NavigationMethods.driver.findElement(By.xpath(Md_Element.qqvalLotnamereq)).getText(), "Required");
//		Thread.sleep(3000);
//		NavigationMethods.Scroll();
//		Thread.sleep(3000);
//		NavigationMethods.driver.findElement(By.name(Md_Element.qqLotName0)).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500.");
//		NavigationMethods.driver.findElement(By.name(Md_Element.qqUom0)).click();
//		Thread.sleep(3000);
//		WebDriverWait wait = new WebDriverWait(NavigationMethods.driver, 2000);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Md_Element.qqvalLotnamemax)));
//		NavigationMethods.driver.findElement(By.name(Md_Element.qqUom0)).click();
//		Assert.assertEquals(NavigationMethods.driver.findElement(By.xpath(Md_Element.qqvalLotnamemax)).getText(), "Lot Name too long (can not be greater than 150 characters)");
//	}
//	
//	
//	@Test
//	    public void VerifymsgonQuantity() throws InterruptedException{                                                                                       //VERIFY VALIDATION MESSAGE ON QUANTITY 
//		test=extent.createTest("VerifymsgonQuantity");
//		NavigationMethods.QQchecklot();
//		NavigationMethods.Scroll();
//		NavigationMethods.driver.findElement(By.name(Md_Element.qqQuantity0)).sendKeys("Test");
//		Thread.sleep(3000);
//		Assert.assertEquals(NavigationMethods.driver.findElement(By.xpath(Md_Element.qqvalLotquanum)).getText(), "Should be a valid number");
//		NavigationMethods.driver.findElement(By.name(Md_Element.qqQuantity0)).clear();
//		WebDriverWait wait= new WebDriverWait(NavigationMethods.driver, 3000);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(Md_Element.qqQuantity0)));
//		NavigationMethods.driver.findElement(By.name(Md_Element.qqQuantity0)).sendKeys("9999999999999");
//		Assert.assertEquals(NavigationMethods.driver.findElement(By.xpath(Md_Element.qqvalLotquamax)).getText(), "Quantity must be less than 999999999999.99");
//		
//	}
//	
//	@Test
//	public void VerifyonDeltelot() throws InterruptedException{                                                                                           //VERIFY DELETE LOT 
//		test=extent.createTest("VerifyonDeltelot");
//		NavigationMethods.QQCreate1lot();
//		WebDriverWait wait = new WebDriverWait(NavigationMethods.driver, 4000);
//     	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Md_Element.qqDelete0)));
//		NavigationMethods.driver.findElement(By.xpath(Md_Element.qqDelete0)).click();
//	}
//
//		
//	@Test
//	public void VerifyGetquotedisQuesLot(){                                                                                             //VERIFY GET QUOTE BUTTON IS DISABLE WHEN QUESTIONNAIRE & LOT IS CHECKED  
//		test=extent.createTest("VerifyGetquotedisQuesLot");
//		NavigationMethods.driver.findElement(By.id(Md_Element.qqName)).sendKeys("Test");                                            
//		NavigationMethods.Scroll(); 
//		NavigationMethods.driver.findElement(By.xpath(Md_Element.qqPricechekbox)).click();
//		NavigationMethods.driver.findElement(By.xpath(Md_Element.qqQuecheckbox)).click();
//		NavigationMethods.driver.findElement(By.xpath(Md_Element.qqGetquote)).click();
//		WebDriverWait wait = new WebDriverWait(NavigationMethods.driver, 2000);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Md_Element.qqdisGetquote)));
//		Assert.assertFalse(NavigationMethods.driver.findElement(By.xpath(Md_Element.qqdisGetquote)).isEnabled());
//	}
//	
//	
//	
//	@Test 
//	public void AddingQuestion() throws InterruptedException{                                                                                           //Verify Adding QUestion 
//		test=extent.createTest("AddingQuestion");
//		NavigationMethods.QQName();
//		((JavascriptExecutor) NavigationMethods. driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
//		Thread.sleep(3000);
//		NavigationMethods.driver.findElement(By.xpath(Md_Element.qqQuecheckbox)).click();
//		WebDriverWait wait = new WebDriverWait(NavigationMethods.driver, 4000);
//     	wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(Md_Element.qqQueName0)));
//		NavigationMethods.driver.findElement(By.name(Md_Element.qqQueName0)).sendKeys("hi");
//		WebDriverWait wait1 = new WebDriverWait(NavigationMethods.driver,4000);
//		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.name(Md_Element.qqQuesDrop)));
//		Select dropdown = new Select(NavigationMethods.driver.findElement(By.name(Md_Element.qqQuesDrop)));
//		dropdown.selectByValue("one_line_text");
//		Thread.sleep(3000);
//		NavigationMethods.driver.findElement(By.xpath(Md_Element.qqAddBtn0)).click();
//		Thread.sleep(3000);
//		NavigationMethods.driver.findElement(By.name(Md_Element.qqQueName1)).sendKeys("hi");
//		WebDriverWait wait2 = new WebDriverWait(NavigationMethods.driver, 4000);
//		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.name(Md_Element.qqQuesDrop1)));
//		Select dropdown1 = new Select(NavigationMethods.driver.findElement(By.name(Md_Element.qqQuesDrop1)));
//		dropdown1.selectByValue("document_upload");
//		NavigationMethods.driver.findElement(By.xpath(Md_Element.qqAddBtn1)).click();
//		NavigationMethods.driver.findElement(By.name(Md_Element.qqQueName2)).sendKeys("hi");
//		WebDriverWait wait5=new WebDriverWait(NavigationMethods.driver,4000);
//		wait5.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name(Md_Element.qqQuesDrop2)));
//		Select dropdown2 = new Select(NavigationMethods.driver.findElement(By.name(Md_Element.qqQuesDrop2)));
//		dropdown2.selectByValue("yes_no");
//	}
//	
//	@Test
//	public void VerifymsgonQues() throws InterruptedException{                                                                           //Verify Validation Messages on Questions
//		test=extent.createTest("VerifymsgonQues");
//		NavigationMethods.QQName();
//		Thread.sleep(5000);
//		((JavascriptExecutor) NavigationMethods. driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
//		Thread.sleep(5000);
//		NavigationMethods.driver.findElement(By.xpath(Md_Element.qqQuecheckbox)).click();
//		Assert.assertEquals(NavigationMethods.driver.findElement(By.xpath(Md_Element.qqValQuenamereq)).getText(), "Required");
//		Assert.assertEquals(NavigationMethods.driver.findElement(By.xpath(Md_Element.qqValQuetype)).getText(), "Required");
//		NavigationMethods.driver.findElement(By.name(Md_Element.qqQueName0)).sendKeys("Any detailed information about the product which will help you to assess the quoteAny detailed information about the product which will help you to assess the quoteAny detailed information about the product which will help you to assess the quoteAsad werer");
//        Assert.assertEquals(NavigationMethods.driver.findElement(By.xpath(Md_Element.qqValQuenamemax)).getText(), "Title too long (can not be greater than 255 characters)");
//	}
//	
//	
//	@Test                                                                                                                         //Verify Delete Questions
//	public void VerifyDelQues() throws InterruptedException{
//		test=extent.createTest("VerifyDelQues");
//		NavigationMethods.QQName();
//		((JavascriptExecutor) NavigationMethods. driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
//		Thread.sleep(3000);
//		NavigationMethods.driver.findElement(By.xpath(Md_Element.qqQuecheckbox)).click();
//		WebDriverWait wait = new WebDriverWait(NavigationMethods.driver, 4000);
//     	wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(Md_Element.qqQueName0)));
//		NavigationMethods.driver.findElement(By.name(Md_Element.qqQueName0)).sendKeys("hi");
//		WebDriverWait wait1 = new WebDriverWait(NavigationMethods.driver,4000);
//		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.name(Md_Element.qqQuesDrop)));
//		Select dropdown = new Select(NavigationMethods.driver.findElement(By.name(Md_Element.qqQuesDrop)));
//		dropdown.selectByValue("one_line_text");
//		NavigationMethods.driver.findElement(By.xpath(Md_Element.qqQuedelete1)).click();
//	}
//
//	@Test
//	public void VerifyAddParticpant() throws InterruptedException{                                                            //Verify Adding Participant Manually 
//		test=extent.createTest("VerifyAddParticpant");
//		NavigationMethods.QQName();
//		Thread.sleep(3000);
//		NavigationMethods.BottomScroll();
//     	Thread.sleep(5000);
//     	NavigationMethods.driver.findElement(By.xpath(Md_Element.qqAddPart)).sendKeys("d1@mailinator.com"); // Valid Email 
//     	WebElement textbox = NavigationMethods.driver.findElement(By.xpath(Md_Element.qqAddPart));
//     	textbox.sendKeys(Keys.ENTER);
//     	WebDriverWait wait = new WebDriverWait(NavigationMethods.driver, 4000);
//     	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Md_Element.qqAddPart)));
//     	NavigationMethods.driver.findElement(By.xpath(Md_Element.qqAddPart)).sendKeys("d1mailinator.com");   // Invalid Email 
//     	WebElement textbox2 = NavigationMethods.driver.findElement(By.xpath(Md_Element.qqAddPart));
//     	textbox2.sendKeys(Keys.ENTER);
//     	Thread.sleep(3000);
//     	NavigationMethods.driver.findElement(By.xpath(Md_Element.qqGetquote1)).click();
//	}
     	
     	
//     	@Test
//     	public void VerifyAddparticpantfromGroup () throws InterruptedException                                               // Verify Adding Participant by Group 
//     	{
//     		NavigationMethods.QQName();
//    		Thread.sleep(3000);
//    	    NavigationMethods.BottomScroll();
//        	Thread.sleep(5000);
////         	WebDriverWait wait = new WebDriverWait(NavigationMethods.driver, 50000);
////        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Md_Element.qqAddgroup)));
//         	NavigationMethods.driver.findElement(By.xpath(Md_Element.qqAddgroup)).click();
//          	NavigationMethods.driver.findElement(By.xpath(Md_Element.qqSelectgroup)).click();
//          	NavigationMethods.driver.findElement(By.xpath(Md_Element.qqSelectGroupDone)).click();
//          	Thread.sleep(5000);
//          	NavigationMethods.BottomScroll();
//           	NavigationMethods.driver.findElement(By.xpath(Md_Element.qqGetquote1)).click();
//     	}
	
	
	  @Test
	  public void VerfiyEditContent() throws InterruptedException{
		  Thread.sleep(8000);
		 NavigationMethods.driver.findElement(By.xpath(Md_Element.qqEditContent)).click();
		 NavigationMethods.driver.findElement(By.xpath(Md_Element.qqEditpoup)).sendKeys("Test");
	  }
	
//	  @AfterMethod
//	  public void ReturnToHome() throws InterruptedException{
//		
//			NavigationMethods.QQlogout();
//		  
//	  }
//
//	  @AfterClass
//	  public void CloseBrowser(){
//		  NavigationMethods.driver.close();  
//	  }
}


