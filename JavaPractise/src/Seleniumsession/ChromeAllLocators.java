package Seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeAllLocators {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver","C://Users//Nivetha Deivendran//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");
		
		WebElement byid = driver.findElement(By.id("email"));
		byid.sendKeys("Test");
		
		Thread.sleep(2000);
		
		
		driver.get("http://www.leafground.com/pages/Edit.html");
		
		WebElement byxpath = driver.findElement(By.xpath("//*[@id=\'email\']"));
		byxpath.sendKeys("NEWQA");
		
		Thread.sleep(2000);
				
		
		driver.get("http://www.leafground.com/pages/Edit.html");
		
		WebElement bycss = driver.findElement(By.cssSelector("#email"));
		bycss.sendKeys("Hello");
		
		Thread.sleep(2000);
				
		
		driver.get("http://www.leafground.com/pages/radio.html");
		
		WebElement byclassname = driver.findElement(By.className("myradio"));
		byclassname.click();
				
		Thread.sleep(2000);
		
		WebElement byname = driver.findElement(By.name("news"));
		byname.click();
				
		Thread.sleep(2000);
		
		driver.get("http://www.leafground.com/pages/Link.html");
		
		WebElement bylinktext = driver.findElement(By.linkText("Go to Home Page"));
		bylinktext.click();
				
		Thread.sleep(2000);

		driver.get("http://www.leafground.com/pages/Link.html");
		
		WebElement bypartiallink = driver.findElement(By.partialLinkText("Find where am "));
		bypartiallink.click();
				
		Thread.sleep(2000);
		
		
	}

}
