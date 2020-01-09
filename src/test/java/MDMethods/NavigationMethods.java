package MDMethods;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import MDElements.Md_Element;

public class NavigationMethods {

	public static WebDriver driver;
	public static Properties prop;
	public static FileInputStream inputFile;
	private static String OS = System.getProperty("os.name").toLowerCase();
	
	
	public static WebDriver OpenBrowser() throws InterruptedException {

//     System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver"); // // FOR UBNTU DRIVER
//	   ChromeOptions chromeOptions = new ChromeOptions();     // chromeOptions.addArguments("--no-sandbox");
//     WebDriver driver = new ChromeDriver(chromeOptions);
		if (isWindows()) {
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe"); // FOR WINDOWS DRIVER
		} else if (isUnix()) {
			System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver"); // For Linux
		}
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}

	

	public static boolean isWindows() {
		return (OS.indexOf("win") >= 0);
	}

	public static boolean isUnix() {
		return (OS.indexOf("nix") >= 0 || OS.indexOf("nux") >= 0 || OS.indexOf("aix") > 0);
	}

	
	
	
	public static void Openurlandlogin() {
		driver.get("https://next.testmd.co.uk/login");
		driver.findElement(By.id("login-username")).sendKeys("ms1@reconmail.com");
		driver.findElement(By.id("login-password")).sendKeys("123456789");
		driver.findElement(By.name("commit")).click();

	}

	public static WebDriver Signup() {

		driver.get("https://next.testmd.co.uk/signup");
		if (driver.getPageSource().contains("CHOOSE YOUR ACCOUNT TYPE")) {
			System.out.println("Text is Present");
		} else {
			System.out.println("Text is not Present");
		}
		driver.findElement(By.id("role-id-2")).click();
		driver.findElement(By.name("commit")).click();
		return driver;

	}

	public void Failed(String testMethodName) { // USED TO TAKE SCREENSHOTS
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile,
					new File("D:\\Selinium Ecllipse\\MD\\Screenshots\\" + "failshot" + testMethodName + "_" + ".jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void getData() {

		// File file= new File("D:\\Selinium
		// Ecllipse\\MD\\src\\test\\java\\TestNgScripts\\marketdojo.properties");
		File file = new File("src/test/java/TestNgScripts/marketdojo.properties");
		FileInputStream fileIn = null;
		try {
			fileIn = new FileInputStream(file);
			// Create properties Class object
			prop = new Properties();
			prop.load(fileIn);
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}
//-------------------------------------------------------------------------------------------------------------
                               //	 QUICK QUOTES COMMON METHODS
//----------------------------------------------------------------------------------------------------------------
	
	public static void QQlogin() throws InterruptedException {
		driver.get("https://next.testmd.co.uk/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("login-username")).sendKeys("sawa@99price.co");
		driver.findElement(By.id("login-password")).sendKeys("123456789");
		driver.findElement(By.name("commit")).click();
		driver.findElement(By.xpath("//*//A[@class='btn btn-primary btn-fixed pull-right']")).click();
//		Thread.sleep(3000);
//		try {
//			driver.findElement(By.xpath("//*[@id='wm-shoutout-181645']/div[4]/div[2]/span[2]")).click(); // Walkme poup
//			driver.findElement(By.xpath("//*[@id='wm-shoutout-177578']/div[1]")).click(); // Walkme poup
//			
//		} catch (NoSuchElementException e) {
//			e.printStackTrace();
//		}

	}
	
		public static void QQlogout() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(NavigationMethods.driver, 5000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Md_Element.headerProfile)));
		NavigationMethods.driver.findElement(By.xpath(Md_Element.headerProfile)).click();
		WebDriverWait wait1 = new WebDriverWait(NavigationMethods.driver, 5000);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Md_Element.headerdropLogout)));
		NavigationMethods.driver.findElement(By.xpath(Md_Element.headerdropLogout)).click();
	}

	public static void DirectGetQuote() throws InterruptedException {
		Thread.sleep(8000);
		JavascriptExecutor jse = (JavascriptExecutor) NavigationMethods.driver;
		jse.executeScript("window.scrollBy(0,1000)", "400");
		NavigationMethods.driver.findElement(By.xpath(Md_Element.qqGetquote)).click();
		WebDriverWait wait = new WebDriverWait(NavigationMethods.driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Md_Element.qqdisGetquote)));
		Assert.assertFalse(NavigationMethods.driver.findElement(By.xpath(Md_Element.qqdisGetquote)).isEnabled());
	}

	public static void QQName() {
		WebDriverWait wait = new WebDriverWait(NavigationMethods.driver, 3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(Md_Element.qqName)));
		NavigationMethods.driver.findElement(By.id(Md_Element.qqName)).sendKeys("Automate");
	}

	public static void QQchecklot() throws InterruptedException {
		NavigationMethods.QQName();
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor) NavigationMethods.driver;
		jse.executeScript("window.scrollBy(0,250)", "400");
		NavigationMethods.driver.findElement(By.xpath(Md_Element.qqPricechekbox)).click();
	}

	public static void Scroll() {
		JavascriptExecutor jse = (JavascriptExecutor) NavigationMethods.driver;
		jse.executeScript("window.scrollBy(0,250)", "400");
	}

	public static void BottomScroll() {
		((JavascriptExecutor) NavigationMethods.driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	public static void QQCreate1lot() throws InterruptedException {
		NavigationMethods.QQchecklot();
		Thread.sleep(3000);
		NavigationMethods.driver.findElement(By.name(Md_Element.qqLotName0)).sendKeys("Steel Scrap lot 1");
		WebDriverWait wait = new WebDriverWait(NavigationMethods.driver, 5000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(Md_Element.qqUom0)));
		Thread.sleep(3000);
		NavigationMethods.driver.findElement(By.name(Md_Element.qqUom0)).sendKeys("mm");
		NavigationMethods.driver.findElement(By.name(Md_Element.qqQuantity0)).sendKeys("10");
		NavigationMethods.driver.findElement(By.xpath(Md_Element.qqAddlot0)).click();
	}

	public static void QQDescription() throws InterruptedException {
		NavigationMethods.driver.findElement(By.id(Md_Element.qqName)).sendKeys("Description");
		NavigationMethods.driver.findElement(By.id(Md_Element.qqDeadline)).sendKeys("2019-05-27 12:55");
		Thread.sleep(5000);
		NavigationMethods.driver.switchTo().frame(0);
		NavigationMethods.driver.findElement(By.xpath(Md_Element.qqDes))
				.sendKeys("Lorem Ipsum is simply dummy text of the printing");
		Thread.sleep(5000);
		NavigationMethods.driver.switchTo().defaultContent();
		NavigationMethods.QQGetquote();
	}

	public static void QQCreate5lot() throws InterruptedException {
		NavigationMethods.QQCreate1lot();
		Thread.sleep(3000);
		WebDriverWait wait1 = new WebDriverWait(NavigationMethods.driver, 3000);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.name(Md_Element.qqLotName1)));
		NavigationMethods.driver.findElement(By.name(Md_Element.qqLotName1)).sendKeys("Steel Scrap lot 2");
		NavigationMethods.driver.findElement(By.name(Md_Element.qqUom1)).sendKeys("mm");
		NavigationMethods.driver.findElement(By.name(Md_Element.qqQuantity1)).sendKeys("10");
		NavigationMethods.driver.findElement(By.xpath(Md_Element.qqAddlot1)).click();
		Thread.sleep(3000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		WebDriverWait wait2 = new WebDriverWait(NavigationMethods.driver, 10);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.name(Md_Element.qqLotName2)));
		NavigationMethods.driver.findElement(By.name(Md_Element.qqLotName2)).sendKeys("Steel Scrap lot 3");
		NavigationMethods.driver.findElement(By.name(Md_Element.qqUom2)).sendKeys("mm");
		NavigationMethods.driver.findElement(By.name(Md_Element.qqQuantity2)).sendKeys("10");
		NavigationMethods.driver.findElement(By.xpath(Md_Element.qqAddlot2)).click();
		WebDriverWait wait3 = new WebDriverWait(NavigationMethods.driver, 10);
		wait3.until(ExpectedConditions.visibilityOfElementLocated(By.name(Md_Element.qqLotName3)));
		NavigationMethods.driver.findElement(By.name(Md_Element.qqLotName3)).sendKeys("Steel Scrap lot 4");
		NavigationMethods.driver.findElement(By.name(Md_Element.qqUom3)).sendKeys("mm");
		NavigationMethods.driver.findElement(By.name(Md_Element.qqQuantity3)).sendKeys("10");
		NavigationMethods.driver.findElement(By.xpath(Md_Element.qqAddlot3)).click();
		WebDriverWait wait4 = new WebDriverWait(NavigationMethods.driver, 10);
		wait4.until(ExpectedConditions.visibilityOfElementLocated(By.name(Md_Element.qqLotName4)));
		NavigationMethods.driver.findElement(By.name(Md_Element.qqLotName4)).sendKeys("Steel Scrap lot 5");
		NavigationMethods.driver.findElement(By.name(Md_Element.qqUom4)).sendKeys("mm");
		NavigationMethods.driver.findElement(By.name(Md_Element.qqQuantity4)).sendKeys("10");
		NavigationMethods.driver.findElement(By.xpath(Md_Element.qqAddlot4)).click();

		WebDriverWait wait5 = new WebDriverWait(NavigationMethods.driver, 10);
		wait5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Md_Element.qqvalLotMax)));
		Assert.assertEquals(NavigationMethods.driver.findElement(By.xpath(Md_Element.qqvalLotMax)).getText(),
				"only 5 lots are allowed");
	}

	public static void QQGetquote() {
		NavigationMethods.driver.findElement(By.xpath(Md_Element.qqGetquote)).click();
	}

	public static void SimpleQuote() throws InterruptedException, IOException {
//		driver.findElement(By.xpath("//*[@id='wm-shoutout-181645']/div[4]/div[2]/span[2]")).click(); // WalkmePoPup
//																						
//		driver.findElement(By.xpath("//*[@id='wm-shoutout-177578']/div[1]")).click(); // WalkmePoPup
//																			
		
		NavigationMethods.driver.findElement(By.id(Md_Element.qqName)).sendKeys("Automate");
		NavigationMethods.driver.findElement(By.id(Md_Element.qqDeadline)).sendKeys("2020-09-18 19:12");
		Thread.sleep(3000);
		NavigationMethods.Scroll();
		NavigationMethods.driver.switchTo().frame(0);
		Thread.sleep(3000);
		NavigationMethods.driver.findElement(By.xpath(Md_Element.qqDes)).sendKeys("Lorem Ipsum is simply dummy text of the printing");
		Thread.sleep(3000);
		NavigationMethods.driver.switchTo().defaultContent();
//		((JavascriptExecutor) NavigationMethods.driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
//		Thread.sleep(3000);
		NavigationMethods.driver.findElement(By.xpath(Md_Element.qqDrop)).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\cis1\\Desktop\\AutoIT\\Gaurav_QQ1.exe");
		NavigationMethods.QQCreate1lot();
		((JavascriptExecutor) NavigationMethods.driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(3000);
		NavigationMethods.driver.findElement(By.xpath(Md_Element.qqQuecheckbox)).click();
		WebDriverWait wait = new WebDriverWait(NavigationMethods.driver, 4000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(Md_Element.qqQueName0)));
		NavigationMethods.driver.findElement(By.name(Md_Element.qqQueName0)).sendKeys("hi");
		WebDriverWait wait1 = new WebDriverWait(NavigationMethods.driver, 4000);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.name(Md_Element.qqQuesDrop)));
		Select dropdown = new Select(NavigationMethods.driver.findElement(By.name(Md_Element.qqQuesDrop)));
		dropdown.selectByValue("one_line_text");
		NavigationMethods.driver.findElement(By.xpath(Md_Element.qqAddPart)).sendKeys("d1@mailinator.com"); // Valid  Email
		WebElement textbox = NavigationMethods.driver.findElement(By.xpath(Md_Element.qqAddPart));
		textbox.sendKeys(Keys.ENTER);
	    NavigationMethods.driver.findElement(By.xpath(Md_Element.qqinviteClick)).click();
		Thread.sleep(3000);
		NavigationMethods.driver.findElement(By.xpath(Md_Element.qqGetquote)).click();
	}

	public static void CreateQuestion() throws InterruptedException {
		NavigationMethods.QQName();
		((JavascriptExecutor) NavigationMethods.driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(3000);
		NavigationMethods.driver.findElement(By.xpath(Md_Element.qqQuecheckbox)).click();
		WebDriverWait wait = new WebDriverWait(NavigationMethods.driver, 4000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(Md_Element.qqQueName0)));
		NavigationMethods.driver.findElement(By.name(Md_Element.qqQueName0)).sendKeys("Whats your name");
		WebDriverWait wait1 = new WebDriverWait(NavigationMethods.driver, 4000);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.name(Md_Element.qqQuesDrop)));
		Select dropdown = new Select(NavigationMethods.driver.findElement(By.name(Md_Element.qqQuesDrop)));
		dropdown.selectByValue("one_line_text");
		Thread.sleep(3000);
		NavigationMethods.driver.findElement(By.xpath(Md_Element.qqAddBtn0)).click();
		Thread.sleep(3000);
		NavigationMethods.driver.findElement(By.name(Md_Element.qqQueName1)).sendKeys("Upload you Liscence");
		WebDriverWait wait2 = new WebDriverWait(NavigationMethods.driver, 4000);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.name(Md_Element.qqQuesDrop1)));
		Select dropdown1 = new Select(NavigationMethods.driver.findElement(By.name(Md_Element.qqQuesDrop1)));
		dropdown1.selectByValue("document_upload");
		NavigationMethods.driver.findElement(By.xpath(Md_Element.qqAddBtn1)).click();
		NavigationMethods.driver.findElement(By.name(Md_Element.qqQueName2)).sendKeys("Did you Delivry product in India");
		WebDriverWait wait5 = new WebDriverWait(NavigationMethods.driver, 4000);
		wait5.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name(Md_Element.qqQuesDrop2)));
		Select dropdown2 = new Select(NavigationMethods.driver.findElement(By.name(Md_Element.qqQuesDrop2)));
		dropdown2.selectByValue("yes_no");
	}

                                           //-------------------------------------------------------------------------------------------
                                                               // CD COMMON METHODS 
                                          //----------------------------------------------------------------------------------

	
	public static void CDlogin(){
    NavigationMethods.driver.get("https://next.testmd.co.uk/categorydojo/users/sign_in");
    NavigationMethods.driver.findElement(By.xpath(Md_Element.cdUname)).sendKeys("1@suremail.info");
    NavigationMethods.driver.findElement(By.xpath(Md_Element.cdPass)).sendKeys("Password123!");
    NavigationMethods.driver.findElement(By.xpath(Md_Element.cdLoginbtn)).click();
    }
	
	
	public static void CDlogout(){
		NavigationMethods.driver.findElement(By.xpath(Md_Element.cdLogout)).click();
	}
    }
