package dropdownBootstrap;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MedlabDropDown {

	@Test
	public void BootStrapDropDown() {
		WebDriver driver;

		// Setting the properties for chromedriver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");

		// Initialize the chromedriver for webdriver reference
		driver = new ChromeDriver();

		// Launching application
		driver.get("http://demo.medlablive.in/");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.name("userid")).sendKeys("demo");

		driver.findElement(By.name("password")).sendKeys("demo1212");

		driver.findElement(By.name("Login")).click();

		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

		driver.findElement(By.linkText("Bill Entry")).click();

		driver.findElement(By.name("Patient")).sendKeys("mazin");

		driver.findElement(By.name("Address")).sendKeys("kandanath");

		driver.findElement(By.name("Age")).sendKeys("21");

		// driver.findElement(By.id("select2-Sex-container")).click();

		List<WebElement> allDropDownValues = driver
				.findElements(By.xpath("//*[@id=\"BillEntryForm\"]/div[3]/div[2]/div/div[2]/div[2]/span/span[1]/span"));

		// Finding the count of all elements
		int dropDownCount = allDropDownValues.size();

		// Printing count of all items
		System.out.println("Total items present in the dropdown : " + dropDownCount);

		System.out.println("Total items present in the dropdown : " + dropDownCount);

		// For loop to go each and every element in the dropdown
		for (int i = 0; i < dropDownCount; i++) {
			// if condition to check specific element "Java"
			if (allDropDownValues.get(i).getText().contains("Java")) {

				// Clicking the desired element
				allDropDownValues.get(i).click();
				// Stop continuing the loop as we already found the desired element
				break;
			}

			// Maximize the window
//	driver.manage().window().maximize();

		}
	}
}