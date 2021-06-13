package Seleniumsession;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeWindowHandleConcept {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C://Users//Nivetha Deivendran//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		
		String oldwindow = driver.getWindowHandle();
		
		WebElement button1 = driver.findElement(By.id("home"));
		button1.click();
		
		Set<String> window = driver.getWindowHandles();
		
		for (String newwindow : window) {
			
			driver.switchTo().window(newwindow);
			
		}
		
		WebElement edit = driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a/img"));
		edit.click();
		driver.close();
		driver.switchTo().window(oldwindow);
		
		WebElement counts = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		counts.click();
		
		int number = driver.getWindowHandles().size();
		System.out.println(number);
		
		driver.switchTo().window(oldwindow);
		
		
		
		WebElement dontcloseme = driver.findElement(By.xpath("//*[@id=\"color\"]"));
		dontcloseme.click();
	
	Thread.sleep(5000);
	
		Set<String> newwindowhandles = driver.getWindowHandles();
		
		for (String allwindows : newwindowhandles) {
			
			if( !allwindows.equals(oldwindow))
			{
				driver.switchTo().window(allwindows);
				
				Thread.sleep(1000);
				
				driver.close();
				
				Thread.sleep(1000);
			}
			
			
			 
		}
		System.out.println("*****************************");
		
	}

}
