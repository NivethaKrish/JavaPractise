package Seleniumsession;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeAlertConcept {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C://Users//Nivetha Deivendran//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		
		
		
		WebElement alertbox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));
		
		alertbox.click();
		
		Alert alert = driver.switchTo().alert();
		
		Thread.sleep(3000);
		
		alert.accept();
		
		
		Thread.sleep(3000);
		
		WebElement confirmbox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		
		confirmbox.click();
		
		Alert alert2 = driver.switchTo().alert();
		
		Thread.sleep(3000);
		
		alert2.dismiss();
		
		
		
		Thread.sleep(3000);
		
		WebElement promptbox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/button"));
		
		promptbox.click();
		
		Alert alert3 = driver.switchTo().alert();
		
		Thread.sleep(3000);
	
		alert3.sendKeys("Unicorn");
		
		Thread.sleep(3000);
		alert3.dismiss();
	}

}
