package TestNgScripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.poi.ss.formula.functions.Na;
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
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import MDElements.Md_Element;
import MDMethods.NavigationMethods;

@Listeners(CustomListner.class) // USED TO TAKE SCREENSHOTS
public class QuickQuotes extends ExtentReportGenerate {

	@BeforeClass
	public void openBrowser() throws InterruptedException {
		NavigationMethods.OpenBrowser();
		
	}

	@BeforeMethod
	public void openApplication() throws InterruptedException {
		NavigationMethods.QQlogin();
	}

	
	@Test (priority=1)                                 // Create Quick Quote with all details
	public  void VerfiySimpleQuote() throws InterruptedException, IOException {
	test = extent.createTest("VerfiySimpleQuote");
	NavigationMethods.SimpleQuote();
	}
	
	@Test 
	public void VerfiySummaryPage() throws InterruptedException{     // Verify summary page 
		test=extent.createTest("VerfiySummaryPage");
		NavigationMethods.driver.findElement(By.id(Md_Element.qqName)).sendKeys("Automate");  // Event Name
		NavigationMethods.driver.findElement(By.id(Md_Element.qqDeadline)).sendKeys("2020-05-27 12:55");  // Deadline
		Thread.sleep(3000);
		NavigationMethods.driver.switchTo().frame(0); // Iframe 
		Thread.sleep(2000);
		NavigationMethods.driver.findElement(By.xpath(Md_Element.qqDes)).sendKeys("Lorem Ipsum is simply dummy text of the printing");
		Thread.sleep(3000);
		NavigationMethods.driver.switchTo().defaultContent();
		NavigationMethods.Scroll();
		Thread.sleep(3000);
		NavigationMethods.driver.findElement(By.xpath(Md_Element.qqPricechekbox)).click();
		NavigationMethods.driver.findElement(By.name(Md_Element.qqLotName0)).sendKeys("Iron");
		WebDriverWait wait = new WebDriverWait(NavigationMethods.driver, 3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(Md_Element.qqUom0)));
		Thread.sleep(3000);
		NavigationMethods.driver.findElement(By.name(Md_Element.qqUom0)).sendKeys("mm");
		NavigationMethods.driver.findElement(By.name(Md_Element.qqQuantity0)).sendKeys("10");
		NavigationMethods.driver.findElement(By.xpath(Md_Element.qqAddPart)).sendKeys("d2@mailinator.com"); // Valid Email 
		WebElement textbox = NavigationMethods.driver.findElement(By.xpath(Md_Element.qqAddPart));
	    textbox.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
	    NavigationMethods.driver.findElement(By.xpath(Md_Element.qqGetquote1)).click();
	    Thread.sleep(7000);
	    Assert.assertEquals(NavigationMethods.driver.findElement(By.xpath(Md_Element.qqSumDate)).getText(),"May 27, 2020 12:55 IST");    // Verify Deadline
	    NavigationMethods.driver.findElement(By.xpath(Md_Element.qqSumCollBrif)).click();// Carousel Brief 

		Thread.sleep(2000);
	    Assert.assertEquals(NavigationMethods.driver.findElement(By.xpath(Md_Element.qqSumBrief)).getText(),"Lorem Ipsum is simply dummy text of the printing");  // Verify Brief
	    NavigationMethods.driver.findElement(By.xpath(Md_Element.qqSumCollSum)).click(); // Carousel Summary 
	    Thread.sleep(3000);
	    Assert.assertEquals(NavigationMethods.driver.findElement(By.xpath(Md_Element.qqSumLotname)).getText(),"Iron"); // Verify Lot Name 
	    Assert.assertEquals(NavigationMethods.driver.findElement(By.xpath(Md_Element.qqSumQunty)).getText(),"10.00");  //Verify Quantity 
	    NavigationMethods.driver.findElement(By.xpath(Md_Element.qqSumCollPart)).click(); // Carousel Particpant  
	    Thread.sleep(3000);
	    Assert.assertEquals(NavigationMethods.driver.findElement(By.xpath(Md_Element.qqSumPart)).getText(),"Not Accepted Invite");        
	}
	
	
	 @Test (priority=2)                                //Create Quick Quote By Only "Name"
	 public void QQByName()
	 {
	 test=extent.createTest("QQByName");
	 WebDriverWait wait = new WebDriverWait(NavigationMethods.driver, 20);
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(Md_Element.qqName)));
	 NavigationMethods.driver.findElement(By.id(Md_Element.qqName)).sendKeys("Automate");
	 WebDriverWait wait2 = new WebDriverWait(NavigationMethods.driver, 20);
	 wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Md_Element.qqGetquote)));
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.qqGetquote)).click();
	 }
	

	 @Test  (priority=3)                                  // Check Validation messages on QuickQuote "Name" field
	 public void VerifymsgonEventname() throws InterruptedException
	 {
	 test=extent.createTest("VerifymsgonEventname");
	 WebDriverWait wait = new WebDriverWait(NavigationMethods.driver, 5000);
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(Md_Element.qqName)));
	 NavigationMethods.driver.findElement(By.id(Md_Element.qqName)).click();
	 NavigationMethods.driver.findElement(By.id(Md_Element.qqDeadline)).click();
	 WebDriverWait wait2 = new WebDriverWait(NavigationMethods.driver, 5000);
	 wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Md_Element.qqvalName1)));
	 Thread.sleep(5000);
	 NavigationMethods.driver.findElement(By.id(Md_Element.qqName)).sendKeys("Using the system will allow you to benefit from tes");
	 NavigationMethods.driver.findElement(By.id(Md_Element.qqDeadline)).click();
	 WebDriverWait wait3 = new WebDriverWait(NavigationMethods.driver, 5000);
	 wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Md_Element.qqvalName)));
	 Assert.assertEquals(NavigationMethods.driver.findElement(By.xpath(Md_Element.qqvalName)).getText(),"Name too long (can not be greater than 50 characters)");
	 }
	 
	 
	 @Test (priority=4)                              //VERIFY GET QUOTE BUTTON IS DISABLE WITHOUT ENETR LOT NAME
	 public void VerifyGetquotedisLotname() throws InterruptedException{
	 test=extent.createTest("VerifyGetquotedis");
	 NavigationMethods.DirectGetQuote();
	 Assert.assertFalse(NavigationMethods.driver.findElement(By.xpath(Md_Element.qqdisGetquote)).isEnabled());
	 }
	 
	 
	 @Test (priority=5)                               // VERIFY DATE FIELD
	 public void VerifyDate() throws InterruptedException{
	 test=extent.createTest("VerifyDate");
	 NavigationMethods.driver.findElement(By.id(Md_Element.qqName)).sendKeys("Test");
	 NavigationMethods.driver.findElement(By.id(Md_Element.qqDeadline)).sendKeys("2019-05-27 12:55");
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.qqGetquote)).click();
	 Assert.assertEquals(NavigationMethods.driver.findElement(By.xpath(Md_Element.qqToasterr)).getText(),"THE DEADLINE YOU HAVE SELECTED IN THE PAST. PLEASE SELECT A DEADLINE DATE IN THE FUTURE.");
	 NavigationMethods.driver.findElement(By.id(Md_Element.qqDeadline)).clear();
	 NavigationMethods.driver.findElement(By.id(Md_Element.qqDeadline)).sendKeys("2020-05-27 12:55");
	 NavigationMethods.driver.findElement(By.id(Md_Element.qqDeadline)).click();
	 }
	 
	 @Test (priority=6)                             //VERIFY DOC UPLOAD
	 public void VerifyDocupload() throws IOException, InterruptedException{
	 test=extent.createTest("VerifyDocupload");
	 NavigationMethods.QQName();
	 ((JavascriptExecutor)
	 NavigationMethods.driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
	 Thread.sleep(5000);
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.qqDrop)).click();
	 Thread.sleep(5000);
	 Runtime.getRuntime().exec("C:\\Users\\cis1\\Desktop\\AutoIT\\Gaurav_QQ1.exe");
	 }
	 
	
	 @Test (priority=7)                               // VERIFY ADDING 5 LOTS
	 public void Verfiyadding5lots() throws InterruptedException{
	 test=extent.createTest("Verfiyadding5lots");
	 NavigationMethods.QQCreate5lot();
	 }
	
	 @Test (priority=8)                              // VERIFY Validation MESSAGE on LOT NAME (MIN & MAX)
	 public void VerifymsgonLotname() throws InterruptedException{  
	 test=extent.createTest("VerifymsgonLotname");
	 NavigationMethods.QQchecklot();
	 Assert.assertEquals(NavigationMethods.driver.findElement(By.xpath(Md_Element.qqvalLotnamereq)).getText(),"Required");
	 Thread.sleep(3000);
	 NavigationMethods.Scroll();
	 Thread.sleep(3000);
	 NavigationMethods.driver.findElement(By.name(Md_Element.qqLotName0)).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry.Lorem Ipsum has been the industry's standard dummy text ever since the1500.dgdfgdffgdg");
	 Thread.sleep(3000);
	 Assert.assertEquals(NavigationMethods.driver.findElement(By.xpath(Md_Element.qqvalLotnamemax)).getText(),"Lot Name too long (can not be greater than 150 characters)");
	 }
	
	 @Test (priority=9)                                    //VERIFY VALIDATION MESSAGE ON QUANTITY
	 public void VerifymsgonQuantity() throws InterruptedException{ 
	 test=extent.createTest("VerifymsgonQuantity");
	 NavigationMethods.QQchecklot();
	 NavigationMethods.Scroll();
	 Thread.sleep(3000);
	 NavigationMethods.driver.findElement(By.name(Md_Element.qqQuantity0)).sendKeys("This is not Text Field");
	 Assert.assertEquals(NavigationMethods.driver.findElement(By.xpath(Md_Element.qqvalLotquanum)).getText(),"Should be a valid number");
	 NavigationMethods.driver.findElement(By.name(Md_Element.qqQuantity0)).clear();
	 Thread.sleep(3000);
	 WebDriverWait wait= new WebDriverWait(NavigationMethods.driver, 3000);
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(Md_Element.qqQuantity0)));
	 NavigationMethods.driver.findElement(By.name(Md_Element.qqQuantity0)).sendKeys("9999999999999");
	 Assert.assertEquals(NavigationMethods.driver.findElement(By.xpath(Md_Element.qqvalLotquamax)).getText(),"Quantity must be less than 999999999999.99");
	 }
	 
	
	 @Test (priority=10)                              //VERIFY DELETE LOT
	 public void VerifyonDeltelot() throws InterruptedException{ 
	 test=extent.createTest("VerifyonDeltelot");
	 NavigationMethods.QQCreate1lot();
	 WebDriverWait wait = new WebDriverWait(NavigationMethods.driver, 4000);
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Md_Element.qqDelete0)));
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.qqDelete0)).click();
	 }
	 
	 
	 @Test (priority=11)                    //VERIFY GET QUOTE BUTTON IS DISABLE WHEN QUESTIONNAIRE & LOT IS CHECKED
	 public void VerifyGetquotedisQuesLot(){ 
	 test=extent.createTest("VerifyGetquotedisQuesLot");
	 NavigationMethods.driver.findElement(By.id(Md_Element.qqName)).sendKeys("Test");
	 NavigationMethods.Scroll();
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.qqPricechekbox)).click();
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.qqQuecheckbox)).click();
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.qqGetquote)).click();
	 WebDriverWait wait = new WebDriverWait(NavigationMethods.driver, 2000);
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Md_Element.qqdisGetquote)));
	 Assert.assertFalse(NavigationMethods.driver.findElement(By.xpath(Md_Element.qqdisGetquote)).isEnabled());
	 }

	 @Test (priority=12)                        //Verify Adding All type of QUestions
	 public void AddingQuestion() throws InterruptedException{ 
	 test=extent.createTest("AddingQuestion");
     NavigationMethods.CreateQuestion();
	 }
	 

	 @Test (priority=13)                       //Verify Validation Messages on Questions
	 public void VerifymsgonQues() throws InterruptedException{ 
	 test=extent.createTest("VerifymsgonQues");
	 NavigationMethods.QQName();
	 Thread.sleep(5000);
	 ((JavascriptExecutor) NavigationMethods.
	 driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
	 Thread.sleep(5000);
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.qqQuecheckbox)).click();
	 Assert.assertEquals(NavigationMethods.driver.findElement(By.xpath(Md_Element.qqValQuenamereq)).getText(),"Required");
	 Assert.assertEquals(NavigationMethods.driver.findElement(By.xpath(Md_Element.qqValQuetype)).getText(),"Required");
	 NavigationMethods.driver.findElement(By.name(Md_Element.qqQueName0)).sendKeys("Any detailed information about the product which will help you to assess the quoteAny detailed information about the product which will help you to assess the quoteAny detailed information about the product which will help you to assess the quoteAsad werer");
	 Assert.assertEquals(NavigationMethods.driver.findElement(By.xpath(Md_Element.qqValQuenamemax)).getText(),"Title too long (can not be greater than 255 characters)");
	 }
	
	 @Test (priority=14)                               //Verify Delete Questions
	 public void VerifyDelQues() throws InterruptedException{
	 test=extent.createTest("VerifyDelQues");
	 NavigationMethods.QQName();
	 ((JavascriptExecutor) NavigationMethods.
	 driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
	 Thread.sleep(3000);
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.qqQuecheckbox)).click();
	 WebDriverWait wait = new WebDriverWait(NavigationMethods.driver, 4000);
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(Md_Element.qqQueName0)));
	 NavigationMethods.driver.findElement(By.name(Md_Element.qqQueName0)).sendKeys("hi");
	 WebDriverWait wait1 = new WebDriverWait(NavigationMethods.driver,4000);
	 wait1.until(ExpectedConditions.visibilityOfElementLocated(By.name(Md_Element.qqQuesDrop)));
	 Select dropdown = new
	 Select(NavigationMethods.driver.findElement(By.name(Md_Element.qqQuesDrop)));
	 dropdown.selectByValue("one_line_text");
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.qqQuedelete1)).click();
	 }
	
	 @Test (priority=15)                                  //Verify Adding Participant Manually
	 public void VerifyAddParticpant() throws InterruptedException{ 
	 test=extent.createTest("VerifyAddParticpant");
	 NavigationMethods.QQName();
	 Thread.sleep(3000);
	 NavigationMethods.BottomScroll();
	 Thread.sleep(5000);
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.qqAddPart)).sendKeys("d1@mailinator.com");// Valid Email
	 WebElement textbox =
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.qqAddPart));
	 textbox.sendKeys(Keys.ENTER);
	 WebDriverWait wait = new WebDriverWait(NavigationMethods.driver, 4000);
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Md_Element.qqAddPart)));
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.qqAddPart)).sendKeys("d1mailinator.com"); // Invalid Email
	 WebElement textbox2 =
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.qqAddPart));
	 textbox2.sendKeys(Keys.ENTER);
	 Thread.sleep(3000);
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.qqGetquote1)).click();
	 }
	
	 @Test (priority=16)    // Verify Adding Participant by Group
	 public void VerifyAddparticpantfromGroup () throws InterruptedException
	 {
	 NavigationMethods.QQName();
	 Thread.sleep(3000);
	 NavigationMethods.BottomScroll();
	 Thread.sleep(5000);
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.qqAddgroup)).click();
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.qqSelectgroup)).click();
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.qqSelectGroupDone)).click();
	 Thread.sleep(5000);
	 NavigationMethods.BottomScroll();
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.qqGetquote1)).click();
	 }
	
	 @Test (priority=17)
	 public void VerfiyEditContent() throws InterruptedException{
	 Thread.sleep(8000);
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.qqEditContent)).click();
	 NavigationMethods.driver.switchTo().frame(0);
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.qqEditpoup)).sendKeys("Test");
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.qqEditpoup)).sendKeys(Keys.chord(Keys.CONTROL,"a"));
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.qqEditpoup)).sendKeys(Keys.ARROW_RIGHT);
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.qqEditpoup)).sendKeys("Test");
	 NavigationMethods.driver.switchTo().defaultContent();
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.qqSavepop)).click();
	 }
	
	
	 @Test (priority=18)                               // VERIFY Deleting Bid 
	 public void VerifyDleteBids() throws InterruptedException{
	 test=extent.createTest("VerifyDleteBids");
	 Thread.sleep(3000);
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.qqSandtHeader)).click();
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.qqSandNewquotebtn)).click();
	 Thread.sleep(5000);
	 NavigationMethods.QQCreate5lot();  // Adding 5 lots 
	 Thread.sleep(3000);
	 NavigationMethods.Scroll();
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.qqSandCo1part)).click();
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.qqSandCo2part)).click();
	 WebDriverWait wait1 =new WebDriverWait(NavigationMethods.driver, 9000);
	 wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Md_Element.qqSandGetQuote)));
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.qqSandGetQuote)).click();
	 Thread.sleep(3000);
	 Select dropdown = new Select(NavigationMethods.driver.findElement(By.xpath("//select[@class='form-control']")));  
	 dropdown.selectByVisibleText("Act as Sandpit Co 1"); 
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.qqSanHeaderEvent)).click();    
	 try{                                                                                                          //Try Catch For Wallkme popup when acting as Sandpit Co 1                                                            
	 NavigationMethods.driver.findElement(By.xpath("//div[@class='wm-close-button walkme-x-button']")).click();
	 }
     catch(Exception e){
     }
	 WebDriverWait wait2 =new WebDriverWait(NavigationMethods.driver, 8000);
	 wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Md_Element.qqInvitePartCo1)));
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.qqInvitePartCo1)).click();
	 WebDriverWait wait3 =new WebDriverWait(NavigationMethods.driver, 8000);
	 wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Md_Element.qqInvitePartAccept)));  // Accept By Participant 
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.qqInvitePartAccept)).click();
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.qqRfqTab)).click();
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.qqPlacebid1)).click();
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.qqEnterBids1)).sendKeys("10");
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.qqSubmitbid1)).click();
	 WebDriverWait wait4 =new WebDriverWait(NavigationMethods.driver, 8000);
	 wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Md_Element.qqConfirmPopup)));
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.qqConfirmPopup)).click();
	 Thread.sleep(3000);   
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.qqPlacebid2)).click();
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.qqEnterBids1)).sendKeys("20");
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.qqSubmitbid1)).click();
	 WebDriverWait wait6 =new WebDriverWait(NavigationMethods.driver, 10000);
	 wait6.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Md_Element.qqConfirmPopup)));
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.qqConfirmPopup)).click();
	 Thread.sleep(2000);
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.qqPlacebid3)).click();
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.qqEnterBids1)).sendKeys("30");    // Placing Bids  on Lot 3
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.qqSubmitbid1)).click();
	 Thread.sleep(2000);
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.qqConfirmPopup)).click();
	 Thread.sleep(2000);
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.qqRejectlot4)).click();
	 Thread.sleep(2000);
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.qqConfirmPopup)).click();
	 Select dropdown1 = new Select(NavigationMethods.driver.findElement(By.xpath("//select[@class='form-control']")));  
	 dropdown1.selectByVisibleText("Act as Host");                                                                         //Act As Host Again 
	 Thread.sleep(8000);
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.qqSumCollPart1)).click();
	 WebDriverWait wait8 =new WebDriverWait(NavigationMethods.driver, 10000);
	 wait8.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Md_Element.qqSumColLot1bid)));
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.qqSumColLot1bid)).click();
	 Thread.sleep(2000);
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.qqSumColLot1bidDelete)).click();
	 Thread.sleep(2000);
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.qqSumColLot1bidDeletePoupup)).click();
	 Thread.sleep(2000);
	 Assert.assertEquals(NavigationMethods.driver.findElement(By.xpath(Md_Element.qqDeletebidToaster)).getText(),"BID SUCCESSFULLY DELETED");
     }
	
	 @Test                      //Verify Allow Resubmission 
	 public void VerfiyAllowResubmisson() throws InterruptedException, IOException{ 
	 test=extent.createTest("VerfiyAllowResubmisson");
	 Thread.sleep(3000);
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.qqSandtHeader)).click();
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.qqSandNewquotebtn)).click();
	 Thread.sleep(5000);
     NavigationMethods.CreateQuestion();
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.qqSandCo1part)).click();
     NavigationMethods.driver.findElement(By.xpath(Md_Element.qqSandCo2part)).click();
	 WebDriverWait wait1 =new WebDriverWait(NavigationMethods.driver, 9000);
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Md_Element.qqSandGetQuote)));
     NavigationMethods.driver.findElement(By.xpath(Md_Element.qqSandGetQuote)).click();
     NavigationMethods.driver.findElement(By.xpath(Md_Element.qqSandGetQuote)).click();
     Thread.sleep(5000);
	 Select dropdown = new Select(NavigationMethods.driver.findElement(By.xpath("//select[@class='form-control']")));  
	 dropdown.selectByVisibleText("Act as Sandpit Co 1"); 
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.qqSanHeaderEvent)).click();    
	 try{                                                                                                          //Try Catch For Wallkme popup when acting as Sandpit Co 1                                                            
	 NavigationMethods.driver.findElement(By.xpath("//div[@class='wm-close-button walkme-x-button']")).click();
	 }
     catch(Exception e){
     }
	 WebDriverWait wait2 =new WebDriverWait(NavigationMethods.driver, 8000);
	 wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Md_Element.qqInvitePartCo1)));
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.qqInvitePartCo1)).click();
	 WebDriverWait wait3 =new WebDriverWait(NavigationMethods.driver, 8000);
	 wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Md_Element.qqInvitePartAccept)));                // Accept By Participant 
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.qqInvitePartAccept)).click();
	 
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.qqQuestionTab)).click();                                       // Particpant submiting Answer 
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.qqAnswerFirst)).sendKeys("Lorem ipsum, or lipsum as it is sometihing to test blah blah blah !@#$%^&*(0");
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.qqAnswerSecond)).click();
	 Thread.sleep(2000);
	 Runtime.getRuntime().exec("C:\\Users\\cis1\\Desktop\\AutoIT\\Gaurav_QQ1.exe");
	 NavigationMethods.Scroll();
	 Thread.sleep(2000);
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.qqAnswerThird)).click();
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.qqSubmitAnswer)).click();                     //Submit Answers                             
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.qqConfirmPopupPart)).click();                 // Confirmation Popup               
	 Select dropdown1 = new Select(NavigationMethods.driver.findElement(By.xpath("//select[@class='form-control']")));  
	 dropdown1.selectByVisibleText("Act as Host");
	 Thread.sleep(8000); 
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.qqSumCollPart)).click();
	 Thread.sleep(2000); 
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.qqAllowResubmission)).click();
	 }

	
	@AfterMethod
	public void ReturnToHome() throws InterruptedException {
	Thread.sleep(3000);
	NavigationMethods.QQlogout();
	}

	@AfterClass
	public void CloseBrowser() {
	NavigationMethods.driver.close();
	}
}
