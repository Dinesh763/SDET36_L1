package org.Maven.Pratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MavenExample2Test {
	@Test
	public void testSetup21() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Reporter.log("HIE"+Thread.currentThread().getId(),true);
		driver.quit();

	}
	@Test
	public void testSetup22() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Reporter.log("HIF"+Thread.currentThread().getId(),true);
		driver.quit();

	}


}
