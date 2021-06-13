package Seleniumsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeFrameConcept {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C://Users//Nivetha Deivendran//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
		
		driver.switchTo().frame(0);
		
		WebElement one = driver.findElement(By.id("Click"));
		one.click();
		
		String text = driver.findElement(By.id("Click")).getText();
		System.out.println(text);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		
		WebElement two = driver.findElement(By.id("Click1"));
		two.click();
		
		String text2 = driver.findElement(By.id("Click1")).getText();
		System.out.println(text2);
		
		driver.switchTo().defaultContent();
		
		List<WebElement> total = driver.findElements(By.tagName("iframe"));
		
		int totalframes = total.size();
		
		System.out.println(totalframes);
		
		
	}

}
