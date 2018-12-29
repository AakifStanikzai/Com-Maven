package com.maven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BaseClass {
	
	WebDriver driver;
	 @Test
	  public void setup() {
	  System.setProperty("webdriver.chrome.driver", "src//driver//chromedriver.exe");
	        		
	        WebDriver  driver = new ChromeDriver();
	        driver.manage().window().fullscreen();
	        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        driver.get("https://opensource-demo.orangehrmlive.com/");
	    }
		
	}

