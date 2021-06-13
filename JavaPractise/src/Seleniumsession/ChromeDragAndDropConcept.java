package Seleniumsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ChromeDragAndDropConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Users//Nivetha Deivendran//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.leafground.com/pages/drop.html");
		
		WebElement Tool = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		
		WebElement Tip = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		
		Actions actions = new Actions(driver);
		
		//actions.clickAndHold(Tool).moveToElement(Tip).release(Tip).build().perform();	or	
		
		actions.dragAndDrop(Tool, Tip).build().perform();	
		
	}

}
