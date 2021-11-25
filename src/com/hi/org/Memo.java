package com.hi.org;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Memo {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NATURE\\eclipse-workspace\\Selenium Tasting\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);

		WebElement number = driver.findElement(By.xpath("//input[contains(@aria-label,'Phone ')]"));
		number.sendKeys("murugavel");
		Thread.sleep(2000);

		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("123454");

		WebElement click = driver.findElement(By.xpath("//button[@type='button'][1]"));
		click.click();
		Thread.sleep(2000);

		WebElement log = driver.findElement(By.xpath("//button[contains(@class,'sqdOP  ')]"));
		log.click();
		Thread.sleep(2000);

		TakesScreenshot ts = (TakesScreenshot) driver;
		File scr = ts.getScreenshotAs(OutputType.FILE);

		File dms = new File("C:\\Users\\NATURE\\eclipse-workspace\\Selenium Tasting\\screenshort\\test.png");
		FileUtils.copyFile(scr, dms);

	}

}