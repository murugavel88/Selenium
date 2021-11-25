package com.hi.org;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NATURE\\eclipse-workspace\\Selenium Tasting\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();

		System.out.println("***********coulam****************");
		List<WebElement> alldata = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[3]"));
		for (WebElement data : alldata) {
			System.out.println(data.getText());

			Thread.sleep(2000);

		}
		System.out.println("**************total****************");
		List<WebElement> data = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
		for (WebElement webElement : data) {
			System.out.println(webElement.getText());
			
		}
//		for (WebElement row : data) {
//			System.out.println(row.getText());
//
//		}
		System.out.println("**********oneelamats***************");
		WebElement one = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[6]/td[3]"));
		System.out.println(one.getText());

		TakesScreenshot f = (TakesScreenshot) driver;
		File fol = f.getScreenshotAs(OutputType.FILE);
		File dol = new File("C:\\Users\\NATURE\\eclipse-workspace\\Selenium Tasting\\screenshort\\test.png");
		FileUtils.copyFile(fol, dol);

		System.out.println(data.size());
		Thread.sleep(2000);

		WebElement scroldown = driver.findElement(By.xpath("(//a[@class='w3-button ws-grey w3-block w3-round'])[2]"));
		JavascriptExecutor ts =  (JavascriptExecutor) driver;
		ts.executeScript("arguments[0].scrollIntoView()", scroldown);
		
		Thread.sleep(2000);

		WebElement upaero = driver.findElement(By.xpath("(//a[@class='w3-right w3-btn'])[1]"));
		JavascriptExecutor hp = (JavascriptExecutor) driver;
		hp.executeScript("arguments[0].scrollIntoView()", upaero);
		
		List<WebElement> total = driver.findElements(By.xpath("//div[@class='w3-white w3-padding notranslate w3-padding-16']"));
		System.out.println(total.size());
	

	}

}
