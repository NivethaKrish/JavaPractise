package Seleniumsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ChromeDropdownConcept {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C://Users//Nivetha Deivendran//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		
		//dropdown selecting by index.
		
				WebElement dd1 = driver.findElement(By.id("dropdown1"));
				
				Select select1 = new Select(dd1);
				
				select1.selectByVisibleText("Loadrunner");
				
				Thread.sleep(3000);
		
				//getting the options in the dropdown
				
				
				WebElement dd4 = driver.findElement(By.className("dropdown"));
				
				Select select21 = new Select(dd4);
				
				List<WebElement> list = select21.getOptions();
				
				int sizevalue = list.size();
				
				System.out.println(sizevalue);
				
				Thread.sleep(3000);
				
				//selecting multiple options
				
				
				WebElement dd5 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
				
				Select multiselect = new Select(dd5);
				
				multiselect.selectByIndex(1);
				multiselect.selectByIndex(2);
				multiselect.selectByIndex(3);
				multiselect.selectByIndex(4);
				
				Thread.sleep(3000);
				
				System.out.println("Completed");
	}

}
