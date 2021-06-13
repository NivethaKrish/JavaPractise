package Seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenImageConcept {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C://Users//Nivetha Deivendran//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.google.com");
		
		WebElement brokenimage  = driver.findElement(By.xpath("//*[@id=\"gb\"]/div[2]/div[3]/div[2]/div[2]/div/a/img"));
		
		if(brokenimage.getAttribute("natural width").equals("0"))
		{
			System.out.println("Broken Image");
		}
		
		else
		{
			System.out.println("Not a Broken");
		}
	}

}
