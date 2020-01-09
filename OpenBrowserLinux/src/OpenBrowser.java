import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	private static String OS = System.getProperty("os.name").toLowerCase();

	public static boolean isWindows() {
		return (OS.indexOf("win") >= 0);
	}

	public static boolean isUnix() {
		return (OS.indexOf("nix") >= 0 || OS.indexOf("nux") >= 0 || OS.indexOf("aix") > 0);
	}
	
	public static void main(String[] args) {
		if (isWindows()) {
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		} else if (isUnix()) {
			System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		}
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		System.out.println("You are using OS: " + OS);
		driver.close();
	}
}
