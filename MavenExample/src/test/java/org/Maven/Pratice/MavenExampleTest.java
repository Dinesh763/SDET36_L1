package org.Maven.Pratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MavenExampleTest {
	@Test
	public void testSetup1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Reporter.log("HIA"+Thread.currentThread().getId(),true);
		driver.quit();

	}

	@Test
	public void testSetup2() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.quit();
		Reporter.log("HIB"+Thread.currentThread().getId(),true);
	}

	@Test
	public void testSetup3() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Reporter.log("HIC"+Thread.currentThread().getId(),true);
		driver.quit();
	}
}
