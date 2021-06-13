package Seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxSearchResults {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C://Users//Nivetha Deivendran//Downloads//geckodriver-v0.29.0-win64//geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("http://www.google.com");
		
		driver.findElement(By.id("newtab-search-text")).sendKeys("Trichy");

	}

}
