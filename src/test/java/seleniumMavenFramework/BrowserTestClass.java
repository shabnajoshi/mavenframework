package seleniumMavenFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTestClass {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\seleniumMavenFramework\\src\\main\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://katalon.com/sign-up");
		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		   js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		JavascriptExecutor javaobject = (JavascriptExecutor) driver;
		javaobject.executeScript("window.scrollBy(0,9000)", "");
		Thread.sleep(1000);
		
		javaobject.executeScript("window.scrollBy(0,-900)", "");
		Thread.sleep(1000);

	}

}
