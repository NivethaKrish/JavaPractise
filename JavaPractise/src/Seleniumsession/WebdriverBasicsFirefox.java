package Seleniumsession;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class WebdriverBasicsFirefox {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver","C://Users//Nivetha Deivendran//Downloads//geckodriver-v0.29.0-win64//geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("http://www.google.com");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.equals("Google"))
		{
			System.out.println("correct-title");
		}
		else
		{
			System.out.println("Incorrect-title");
		}
		
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		
		driver.quit();
	}

}
