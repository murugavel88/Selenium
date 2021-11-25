package com.hi.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NATURE\\eclipse-workspace\\Selenium Tasting\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();

		WebElement conform = driver.findElement(By.xpath("//a[@href='#Textbox']"));
		conform.click();
		WebElement ok = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		ok.click();
		driver.switchTo().alert().sendKeys("mani");
		driver.switchTo().alert().dismiss();
	}

}
