package Seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDisplayEnableSelectConcept {

	public static void main(String[] args) {
		
		
			
		System.setProperty("webdriver.chrome.driver","C://Users//Nivetha Deivendran//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://classic.freecrm.com/register/");
		
		WebElement submit = driver.findElement(By.id("submitButton"));
		boolean b = submit.isDisplayed();
		System.out.println(b);
		
		boolean b1 = submit.isEnabled();	
		System.out.println(b1);
		
		WebElement check = driver.findElement(By.name("agreeTerms"));
		boolean b2 = check.isSelected();
		System.out.println(b2);
		
		driver.findElement(By.name("agreeTerms")).click();
		
		boolean b3 = check.isSelected();
		System.out.println(b3);
		
		boolean b4 = submit.isEnabled();	
		System.out.println(b4);
	}

}
