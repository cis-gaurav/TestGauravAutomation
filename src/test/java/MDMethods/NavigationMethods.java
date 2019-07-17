package MDMethods;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import MDElements.Md_Element;

public class NavigationMethods {

public static WebDriver driver;
public static Properties prop;
public static FileInputStream inputFile;
	

public static WebDriver OpenBrowser() throws InterruptedException
	{
	
	System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");                                                         // FOR UBNTU DRIVER
    ChromeOptions chromeOptions = new ChromeOptions();
    chromeOptions.addArguments("--no-sandbox");
    WebDriver driver = new ChromeDriver(chromeOptions);
    
    
    

    
    
    
    
    
    
    
    Thread.sleep(3000);
	
                                      // FOR WINDOWS DRIVER 
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();
	return driver;
	}
	
	public static void Openurlandlogin ()
	{
		driver.get("https://next.testmd.co.uk/login");
		driver.findElement(By.id("login-username")).sendKeys("ms1@reconmail.com");
		driver.findElement(By.id("login-password")).sendKeys("123456789");
		driver.findElement(By.name("commit")).click();
		
	}
	
	public static WebDriver Signup ()
	{
		
		driver.get("https://next.testmd.co.uk/signup");
		if(driver.getPageSource().contains("CHOOSE YOUR ACCOUNT TYPE"))
		{
		System.out.println("Text is Present");
		}
		else
		{
		System.out.println("Text is not Present");
		}
		driver.findElement(By.id("role-id-2")).click();
		driver.findElement(By.name("commit")).click();
		return driver;
		
	}

	public static void getData()
	{
		
//		File file= new File("D:\\Selinium Ecllipse\\MD\\src\\test\\java\\TestNgScripts\\marketdojo.properties");
		File file= new File("src/test/java/TestNgScripts/marketdojo.properties");
		FileInputStream fileIn= null;
		try {
			fileIn = new FileInputStream(file);
		    //Create properties Class object 
		     prop = new Properties();
		    prop.load(fileIn);
		       }
		   
		   catch (Exception e)
		   {
		    e.printStackTrace();
		   }
	}
			                                                           // Quick Quote Methods 

		public static void QQlogin(){
	        driver.get("https://next.testmd.co.uk/login");
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.id("login-username")).sendKeys("sawa@99price.co");
			driver.findElement(By.id("login-password")).sendKeys("123456789");
			driver.findElement(By.name("commit")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath( "//*[@id='app']/div/div/div/div/div/div/div/div[2]/div[2]/a")).click();
	       }
		
		
		public static void QQlogout() throws InterruptedException{
			WebDriverWait wait = new WebDriverWait(NavigationMethods.driver, 3000);
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Md_Element.headerProfile)));
			NavigationMethods.driver.findElement(By.xpath(Md_Element.headerProfile)).click();
			WebDriverWait wait1 = new WebDriverWait(NavigationMethods.driver, 3000);
		    wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Md_Element.headerdropLogout)));
			NavigationMethods.driver.findElement(By.xpath(Md_Element.headerdropLogout)).click();
		}
		
		public static void DirectGetQuote () throws InterruptedException {
			Thread.sleep(8000);
			JavascriptExecutor jse = (JavascriptExecutor)NavigationMethods.driver;
			jse.executeScript("window.scrollBy(0,1000)", "400"); 
			NavigationMethods.driver.findElement(By.xpath(Md_Element.qqGetquote)).click();
			WebDriverWait wait = new WebDriverWait(NavigationMethods.driver, 20);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Md_Element.qqdisGetquote)));
			Assert.assertFalse(NavigationMethods.driver.findElement(By.xpath(Md_Element.qqdisGetquote)).isEnabled());
		}
		
		public static void QQName (){
		   WebDriverWait wait = new WebDriverWait(NavigationMethods.driver, 3000);
		   wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(Md_Element.qqName)));
		   NavigationMethods.driver.findElement(By.id(Md_Element.qqName)).sendKeys("Automate");
		}
		
		public static void QQchecklot () throws InterruptedException{
			NavigationMethods.QQName();
			Thread.sleep(3000);
			JavascriptExecutor jse = (JavascriptExecutor)NavigationMethods.driver;
			jse.executeScript("window.scrollBy(0,250)", "400");
			NavigationMethods.driver.findElement(By.xpath(Md_Element.qqPricechekbox)).click();
		}
		
		
		public static void Scroll(){
			JavascriptExecutor jse = (JavascriptExecutor)NavigationMethods.driver;
			jse.executeScript("window.scrollBy(0,250)", "400"); 			
		}
		
		
		public static void BottomScroll(){
			((JavascriptExecutor) NavigationMethods. driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		}
		
	    public static void QQCreate1lot () throws InterruptedException{
	    	NavigationMethods.QQchecklot();
			NavigationMethods.driver.findElement(By.name(Md_Element.qqLotName0)).sendKeys("0");
			WebDriverWait wait = new WebDriverWait(NavigationMethods.driver, 3000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(Md_Element.qqUom0)));
			Thread.sleep(3000);
			NavigationMethods.driver.findElement(By.name(Md_Element.qqUom0)).sendKeys("mm");
			NavigationMethods.driver.findElement(By.name(Md_Element.qqQuantity0)).sendKeys("10");
			NavigationMethods.driver.findElement(By.xpath(Md_Element.qqAddlot0)).click();
		}
		
		
		
	    public static void QQCreate5lot () throws InterruptedException{                   
		NavigationMethods.QQCreate1lot ();
		Thread.sleep(3000);
		WebDriverWait wait1 = new WebDriverWait(NavigationMethods.driver, 3000);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.name(Md_Element.qqLotName1)));
		NavigationMethods.driver.findElement(By.name(Md_Element.qqLotName1)).sendKeys("1");
		NavigationMethods.driver.findElement(By.name(Md_Element.qqUom1)).sendKeys("mm");
		NavigationMethods.driver.findElement(By.name(Md_Element.qqQuantity1)).sendKeys("10");
		NavigationMethods.driver.findElement(By.xpath(Md_Element.qqAddlot1)).click();
		Thread.sleep(3000);
//		JavascriptExecutor jse1 = (JavascriptExecutor)NavigationMethods.driver;
//		jse1.executeScript("window.scrollBy(0,350)", "400");
	      ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		WebDriverWait wait2 = new WebDriverWait(NavigationMethods.driver, 10);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.name(Md_Element.qqLotName2)));
		NavigationMethods.driver.findElement(By.name(Md_Element.qqLotName2)).sendKeys("2");
		NavigationMethods.driver.findElement(By.name(Md_Element.qqUom2)).sendKeys("mm");
		NavigationMethods.driver.findElement(By.name(Md_Element.qqQuantity2)).sendKeys("10");
		NavigationMethods.driver.findElement(By.xpath(Md_Element.qqAddlot2)).click();
		WebDriverWait wait3 = new WebDriverWait(NavigationMethods.driver, 10);
		wait3.until(ExpectedConditions.visibilityOfElementLocated(By.name(Md_Element.qqLotName3)));
		NavigationMethods.driver.findElement(By.name(Md_Element.qqLotName3)).sendKeys("3");
		NavigationMethods.driver.findElement(By.name(Md_Element.qqUom3)).sendKeys("mm");
		NavigationMethods.driver.findElement(By.name(Md_Element.qqQuantity3)).sendKeys("10");
		NavigationMethods.driver.findElement(By.xpath(Md_Element.qqAddlot3)).click();
		WebDriverWait wait4 = new WebDriverWait(NavigationMethods.driver, 10);
		wait4.until(ExpectedConditions.visibilityOfElementLocated(By.name(Md_Element.qqLotName4)));
		NavigationMethods.driver.findElement(By.name(Md_Element.qqLotName4)).sendKeys("4");
		NavigationMethods.driver.findElement(By.name(Md_Element.qqUom4)).sendKeys("mm");
		NavigationMethods.driver.findElement(By.name(Md_Element.qqQuantity4)).sendKeys("10");
		NavigationMethods.driver.findElement(By.xpath(Md_Element.qqAddlot4)).click();
		
		WebDriverWait wait5 = new WebDriverWait(NavigationMethods.driver, 10);
	    wait5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Md_Element.qqvalLotMax)));
		Assert.assertEquals(NavigationMethods.driver.findElement(By.xpath(Md_Element.qqvalLotMax)).getText(), "only 5 lots are allowed");
	    }
	    
	    
	    public static void QQGetquote(){
	    	 NavigationMethods.driver.findElement(By.xpath(Md_Element.qqGetquote)).click();			
		}
	    
	    
	    
}
		
	    









