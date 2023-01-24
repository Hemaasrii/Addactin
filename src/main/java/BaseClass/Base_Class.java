package BaseClass;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Class {

	public static WebDriver driver;

	public static void launchBrowser() {

		// WebDriverManager.chromedriver().setup();
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Addactin\\SignIn\\src\\test\\resources\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}

	public static void getUrl(String Url) {
		try {
			driver.get(Url);
			maxWindow();
		} catch (Exception e) {
			System.out.println("Unable to Load Url" + e.getMessage());
		}

	}

	public static void maxWindow() {
		try {
			driver.manage().window().maximize();
		} catch (Exception e) {
			System.out.println("Unable to Max window" + e.getMessage());
		}
	}

	public static void elementSendKeys(WebElement element, String Value) {
		try {
			element.sendKeys(Value);
		} catch (Exception e) {
			System.out.println("Unable to Pass Value" + e.getMessage());
		}
	}

	public static boolean elementDisplay(WebElement element) {
		boolean displayed = false;
		try {
			displayed = element.isDisplayed();
		} catch (Exception e) {
			System.out.println("Unable to Check Displayed" + e.getMessage());
		}
		return displayed;

	}

	public static void elementOnClick(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			System.out.println("Unable to  Click" + e.getMessage());
		}

	}

	public static String scannerInput(String scanner) {
		String next = null;
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Captcha Text: ");
			next = sc.next();
		} catch (Exception e) {
			System.out.println("Unable to Get Value from the user" + e.getMessage());
		}
		return next;

	}

	public static void threadSleep() throws InterruptedException {
		Thread.sleep(30);

	}

}
