package Seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeRadioButtonConcept {

	public static void main(String[] args) {
		
		
			
		System.setProperty("webdriver.chrome.driver","C://Users//Nivetha Deivendran//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.leafground.com/pages/radio.html");
		
		WebElement radio1 = driver.findElement(By.id("yes"));
		radio1.click();
		
		WebElement radio2 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/label[2]/input"));
		boolean one	= radio2.isSelected();
		System.out.println(one);
		
		WebElement radio3 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/label[3]/input"));
		boolean two = radio3.isSelected();
		System.out.println(two);
		
		WebElement radio4 = driver.findElement(By.name("age"));
		radio4.click();
		
		

	}

}
