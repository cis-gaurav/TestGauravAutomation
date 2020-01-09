package TestNgScripts;

import org.testng.annotations.Test;

import MDElements.Md_Element;
import MDMethods.NavigationMethods;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class CategoryDojo extends ExtentReportGenerate {

	@BeforeClass // Open Chrome Browser
	public void OpenBrowser() throws InterruptedException {
		NavigationMethods.OpenBrowser();
	}

	@BeforeMethod // CD Home Page Dashboard
	public void openApplication() throws InterruptedException {
		NavigationMethods.CDlogin();
	}

	 @Test (priority=1)
	 public void verifyPortfolioPage() throws InterruptedException, IOException {
	 test = extent.createTest("verifyPortfolioPage");
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.cdshowall)).click();
	 WebDriverWait wait= new WebDriverWait(NavigationMethods.driver, 3000);
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Md_Element.cdporttxt)));
	 }
	
	 @Test (priority=2)
	 public void verfiyRedirecttoeventpage() {
	 test=extent.createTest("verfiyRedirecttoeventpage");
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.cdshowall)).click();
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.cdevent)).click();
	 WebDriverWait wait = new WebDriverWait(NavigationMethods.driver, 3000);
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Md_Element.cdeditport)));
	 }
	
	 @Test (priority=3)
	 public void verifcategorypage() {
	 test=extent.createTest("verifcategorypage");
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.cdshowall)).click();
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.cdcat)).click();
	 WebDriverWait wait = new WebDriverWait(NavigationMethods.driver, 3000);
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Md_Element.cdeditcat)));
	 }
	
	 @Test (priority=4)
	 public void verifyCloneevent() throws InterruptedException{
	 test=extent.createTest("verifyCloneevent");
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.cdClonedrp)).click();
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.cdClone)).click();
	 Thread.sleep(3000);
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.cdlCloneselect)).click();
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.cdcloneselectele)).click();
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.cdclonepopbtn)).click();
	 WebDriverWait wait= new WebDriverWait(NavigationMethods.driver, 5000);
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Md_Element.cdclonemsg)));
	 }
	
	 @Test (priority=5)
	 public void verfiyDownloadReport() throws InterruptedException {
	 test=extent.createTest("verfiyDownloadReport");
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.cdshowall)).click();
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.cdevent)).click();
	 WebDriverWait wait = new WebDriverWait(NavigationMethods.driver, 3000);
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Md_Element.cdeditport)));
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.cdReportsummary)).click();
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.cdExportbtn)).click();
	 // Export All
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.cdExportbyReprot)).click();
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.cdSourcingstrBtn)).click();
	 //Sourcing Report
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.cdExportbyReprot)).click();
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.cdSpendBtn)).click();
	 // Spend Report
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.cdExportbyReprot)).click();
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.cdTimeBtn)).click();
	 // Time Report
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.cdExportbyReprot)).click();
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.cdSavingbtn)).click();
	 //Saving Report
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.cdExportbyReprot)).click();
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.cdPowerbtn)).click();
	 //Power Balance Report
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.cdExportbyReprot)).click();
	 NavigationMethods.driver.findElement(By.xpath(Md_Element.cdReportbtn)).click();
	 //Report Summary
	 }

	@Test (priority=6)
	public void verifycloseWidget() throws InterruptedException {
		test=extent.createTest("verifycloseWidget");
		Actions  act = new Actions (NavigationMethods.driver);
		act.moveToElement(NavigationMethods.driver.findElement(By.xpath(Md_Element.cdSpendport))).click().build().perform();  // Mouse Hover on the Spend Portifolio 
		NavigationMethods.driver.findElement(By.xpath(Md_Element.cdWdgtClose)).click();  // Click on close icon on widget 
		NavigationMethods.driver.switchTo().alert().dismiss(); // Dismiss The Alert       
	}
	
	@Test  (priority=7)
	public void verifyMinWidget () throws InterruptedException{
		test=extent.createTest("verifyMinWidget");
		Actions  act = new Actions (NavigationMethods.driver);
		act.moveToElement(NavigationMethods.driver.findElement(By.xpath(Md_Element.cdSpendport))).click().build().perform();  // Mouse Hover on the Spend Portifolio 
		NavigationMethods.driver.findElement(By.xpath(Md_Element.cdWdgtSetting)).click();   // Click on Setting icon on widget 
		Thread.sleep(3000);
		NavigationMethods.driver.findElement(By.xpath(Md_Element.cdWdgtDropdown)).click();
		Thread.sleep(3000);
		NavigationMethods.driver.findElement(By.xpath(Md_Element.cdWdgtSelectTen)).click();
		NavigationMethods.driver.findElement(By.xpath(Md_Element.cdWdgtSavebtn)).click();			
	}

	
	@Test  (priority=8)
	public void verifyRedirecttoMD () throws InterruptedException{
		test=extent.createTest("verifyRedirecttoMD");
		NavigationMethods.Scroll();
		NavigationMethods.driver.findElement(By.xpath(Md_Element.CdgoToMDbtn)).click();
		Thread.sleep(3000);
        Assert.assertEquals(NavigationMethods.driver.findElement(By.xpath(Md_Element.MdDashlink)).getText(), "Dashboard");
		NavigationMethods.driver.findElement(By.xpath(Md_Element.MdHeaderlinkOpp)).click();	
		
	}
	
	
	@Test  (priority=9)
	public void verifyCreateEvent(){
		test=extent.createTest("verifyCreateEvent");
		NavigationMethods.driver.findElement(By.xpath(Md_Element.cdCreatePortBtn)).click();
		NavigationMethods.driver.findElement(By.xpath(Md_Element.cdNewEvent)).click();
		NavigationMethods.driver.findElement(By.xpath(Md_Element.cdsaveBtn)).click();
		NavigationMethods.driver.findElement(By.xpath(Md_Element.cdPortName)).sendKeys("Automate Event");
		NavigationMethods.driver.findElement(By.xpath(Md_Element.cdPortDes)).sendKeys("Lorem Ipsum");
		NavigationMethods.driver.findElement(By.xpath(Md_Element.cdSpendOrg)).sendKeys("10000");
		NavigationMethods.driver.findElement(By.xpath(Md_Element.cdsaveBtn)).click();
		NavigationMethods.driver.findElement(By.xpath(Md_Element.cdSpendCat)).sendKeys("10");
		NavigationMethods.driver.findElement(By.xpath(Md_Element.cdAnnualSpend)).sendKeys("10");
		NavigationMethods.driver.findElement(By.xpath(Md_Element.cdsaveBtn)).click();
		NavigationMethods.driver.findElement(By.xpath(Md_Element.cdSupplier)).sendKeys("10");
		NavigationMethods.driver.findElement(By.xpath(Md_Element.cdsaveBtn)).click();
		NavigationMethods.driver.findElement(By.xpath(Md_Element.cdGlobe)).clear();
		NavigationMethods.driver.findElement(By.xpath(Md_Element.cdGlobe)).sendKeys("100");
		NavigationMethods.driver.findElement(By.xpath(Md_Element.cdSupply)).sendKeys("10");
		NavigationMethods.driver.findElement(By.xpath(Md_Element.cdTender)).sendKeys("10");
		NavigationMethods.driver.findElement(By.xpath(Md_Element.cdResponse)).sendKeys("10");
		NavigationMethods.driver.findElement(By.xpath(Md_Element.cdApporvSuply)).sendKeys("10");
		NavigationMethods.Scroll();
		NavigationMethods.driver.findElement(By.xpath(Md_Element.cdImplementSuply)).sendKeys("10");
		NavigationMethods.Scroll();
		NavigationMethods.driver.findElement(By.xpath(Md_Element.cdsaveBtn)).click();
	}
	
	@AfterMethod
	public void ReturnToHome() throws InterruptedException {
		Thread.sleep(3000);
		NavigationMethods.CDlogout();
	}

	@AfterClass
	public void TearDown() {
		NavigationMethods.driver.close();
	}

}
