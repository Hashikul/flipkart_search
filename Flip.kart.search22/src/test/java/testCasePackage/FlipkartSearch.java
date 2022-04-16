package testCasePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import driverPackage.BaseDriver;

public class FlipkartSearch extends BaseDriver {
	String baseUrl = "https://www.flipkart.com";

	@Test
	public void locatorLearning() throws InterruptedException {
		driver.get(baseUrl);
		driver.manage().window().maximize();
		Thread.sleep(2000);

		
		driver.findElement(By.className("_2doB4z")).click();
		Thread.sleep(5000);

		driver.findElement(By.name("q")).sendKeys("smart watches" + Keys.ENTER);
		Thread.sleep(5000);
		
		
	}
}
