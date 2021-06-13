package Seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLinksConcept {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C://Users//Nivetha Deivendran//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Link.html");
		
		
		driver.findElement(By.linkText("Go to Home Page")).click();
		
		driver.get("http://www.leafground.com/pages/Link.html");
		
		driver.findElement(By.partialLinkText("Find where am supposed to")).click();
		
		driver.quit();
		
		
		
	}

}
