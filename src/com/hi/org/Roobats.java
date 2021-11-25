package com.hi.org;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Roobats {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NATURE\\eclipse-workspace\\Selenium Tasting\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		TakesScreenshot ts = (TakesScreenshot) driver;
		File scr = ts.getScreenshotAs(OutputType.FILE);
		File demo = new File("C:\\Users\\NATURE\\eclipse-workspace\\Selenium Tasting\\screenshort\\test.png");
		FileUtils.copyFile(scr, demo);

		WebElement gmail = driver.findElement(By.linkText("Gmail"));
		Actions vs = new Actions(driver);
		vs.contextClick(gmail).perform();
		
		Robot va=new Robot();
		va.keyPress(KeyEvent.VK_DOWN);
		va.keyRelease(KeyEvent.VK_ENTER);
		
		va.keyPress(KeyEvent.VK_DOWN);
		va.keyRelease(KeyEvent.VK_ENTER);

		
		va.keyPress(KeyEvent.VK_DOWN);
		va.keyRelease(KeyEvent.VK_ENTER);

		va.keyPress(KeyEvent.VK_DOWN);
		va.keyRelease(KeyEvent.VK_ENTER);


	}

}
