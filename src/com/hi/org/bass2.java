package com.hi.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class bass2 extends bassclass {
	public static WebDriver driver;

	public static void main(String[] args) {
		 driver = getbrowers("chrome");
		geturl("https://www.google.co.in/");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("amazon");
		
		
		
		

	}

}