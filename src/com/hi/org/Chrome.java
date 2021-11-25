package com.hi.org;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Chrome {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NATURE\\eclipse-workspace\\Selenium Tasting\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.fasb.org/signup");
		driver.navigate().back();

		WebElement mail = driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]"));
		mail.sendKeys("Murugavel@gmail.com");

		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("879870MM");

		WebElement newcreat = driver.findElement(By.linkText("New to Flipkart? Create an account"));
		newcreat.click();

		driver.navigate().forward();

		WebElement name = driver.findElement(By.xpath("//input[@class='required email']"));
		name.sendKeys("Murugavel0408@gmail.com");

		WebElement one = driver.findElement(By.id("mce-ADDRESS-country"));
		Select d = new Select(one);
		d.selectByVisibleText("India");

		WebElement number = driver.findElement(By.id("mce-TEL"));
		number.sendKeys("6383909846");
		Thread.sleep(2000);
		WebElement two = driver.findElement(By.xpath("//option[@value='Academic']"));
		two.click();

		WebElement manage = driver.findElement(By.linkText("STANDARDS"));
		Actions as = new Actions(driver);
		as.moveToElement(manage).perform();
		WebElement conspet = driver.findElement(By.linkText("Concepts Statements"));
		as.moveToElement(conspet).perform();
		Thread.sleep(2000);
		JavascriptExecutor ts = (JavascriptExecutor) driver;
		ts.executeScript("arguments[0].click();", conspet);
		
		WebElement scroll = driver.findElement(By.xpath("//ul[@class='second-foot-list']"));
		JavascriptExecutor n = (JavascriptExecutor) driver;
		n.executeScript("arguments[0].scrollIntoView();", scroll);
		Thread.sleep(2000);

		WebElement upscrol = driver.findElement(By.xpath("(//div[@class='container'])[2]"));
		JavascriptExecutor gd = (JavascriptExecutor) driver;
		gd.executeScript("arguments[0].scrollIntoView();", upscrol);
		Thread.sleep(2000);

		TakesScreenshot t = (TakesScreenshot) driver;
		File Scr = t.getScreenshotAs(OutputType.FILE);
		File rcs = new File("C:\\Users\\NATURE\\eclipse-workspace\\Project\\screenshot\\test.png");
		FileUtils.copyFile(Scr, rcs);

		WebElement scrolldown = driver.findElement(By.xpath("//div[@class='container clearfix']"));
		JavascriptExecutor tf = (JavascriptExecutor) driver;
		tf.executeScript("arguments[0].scrollIntoView();", scrolldown);

		driver.navigate().forward();
		driver.navigate().to("http://demo.automationtesting.in/Frames.html");

		WebElement Single = driver.findElement(By.xpath("(//a[@class='analystic'])[1]"));
		Single.click();
		driver.switchTo().frame(0);

		WebElement textbox = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		textbox.sendKeys("number");
		driver.switchTo().defaultContent();

		Thread.sleep(2000);
		WebElement outline = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		outline.click();

		Thread.sleep(2000);

		WebElement outframe = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(outframe);
		Thread.sleep(2000);

		WebElement inline = driver.findElement(By.xpath("(//iframe[@src='SingleFrame.html'])[1]"));

		driver.switchTo().frame(inline);
		Thread.sleep(2000);

		WebElement text = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		text.sendKeys("murugavel");

	}

}
