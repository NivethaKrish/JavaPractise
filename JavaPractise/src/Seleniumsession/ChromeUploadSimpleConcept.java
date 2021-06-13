package Seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeUploadSimpleConcept {

	public static void main(String[] args) {
		
		
			
		System.setProperty("webdriver.chrome.driver","C://Users//Nivetha Deivendran//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.leafground.com/pages/upload.html");
		
		WebElement choose = driver.findElement(By.name("filename"));
		choose.sendKeys("C://Users//Nivetha Deivendran//Downloads//testleaf1.xlsx");
		

	}

}
