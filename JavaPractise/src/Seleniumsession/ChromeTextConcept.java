package Seleniumsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTextConcept {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C://Users//Nivetha Deivendran//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Edit.html");
		
		//Giving the Text to the field
		
		driver.findElement(By.id("email")).sendKeys("Test");
		
		//Appending Text to the field
		
		driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input")).sendKeys("Add");
		
		//Getting Text from the field
		
		String Text = driver.findElement(By.name("username")).getAttribute("value");
		System.out.println(Text);
		
		//checking the field is Disenabled.
		
		WebElement disenabled = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/div/div/input"));
		 
		boolean  b = disenabled.isEnabled();
		
		System.out.println(b);
		
		//Clear Text from the field
		
		driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/input")).clear();
		
		Thread.sleep(3000);
		
		driver.close();
	}

}
