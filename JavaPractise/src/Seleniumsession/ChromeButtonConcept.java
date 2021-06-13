package Seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeButtonConcept {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C://Users//Nivetha Deivendran//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
		
		//Click the button
		
		driver.findElement(By.id("home")).click();
		
		
		//Position of the button
		
		driver.get("http://www.leafground.com/pages/Button.html");
		
		WebElement position = driver.findElement(By.id("position"));
		
		Point xypoint = position.getLocation();
		
		int xvalue = xypoint.getX();
		int yvalue = xypoint.getY();
		
		System.out.println("Xvalue" + xvalue);
		System.out.println("Yvalue" + yvalue);
		
		//Color of the button
		
		WebElement color = driver.findElement(By.id("color"));
		
		String colorvalue = color.getCssValue("background-color");
		
		System.out.println(colorvalue);
		
		//Height and width of the button
		
		WebElement size = driver.findElement(By.id("size"));
		
		int height = size.getSize().getHeight();
		int width = size.getSize().getWidth();
		
		System.out.println(height);
		System.out.println(width);
		
	
		
	}
	

}
