package Seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; 

public class Locators {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C://Users//Nivetha Deivendran//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.name("login")).sendKeys("Tom");
		
		driver.findElement(By.name("passwd")).sendKeys("Test@1234");
	

	}
	
	
}
