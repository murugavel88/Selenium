package com.hi.org;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class bassclass {
 public static   WebDriver driver;
	public static WebDriver getbrowers(String broswername) {
		
		try {
			if (broswername.equalsIgnoreCase("chrome")) {
				  System.setProperty("webdriver.chrome.driver", "C:\\Users\\NATURE\\eclipse-workspace\\Selenium Tasting\\driver\\chromedriver.exe");
				 driver=new ChromeDriver();
			}else if (broswername.equalsIgnoreCase("ie")) {
				 System.setProperty("webdriver.chrome.driver", "C:\\Users\\NATURE\\eclipse-workspace\\Selenium Tasting\\driver\\IEDriverServer.exe");
			     driver=new ChromeDriver();
			}else {
				System.out.println("invalied broswers");
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;


	}
public static void geturl(String url) {
	try {
		driver.get(url);
	} catch (Exception e) {
		e.printStackTrace();
	}

}

}
