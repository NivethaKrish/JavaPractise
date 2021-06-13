package Seleniumsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeAutoCompletionConcept {

	public static void main(String[] args) throws InterruptedException {
		
		
			
		System.setProperty("webdriver.chrome.driver","C://Users//Nivetha Deivendran//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.leafground.com/pages/autoComplete.html");
		
		/*WebElement input = driver.findElement(By.id("tags"));
		input.sendKeys("S");
		
		Thread.sleep(3000);
		
		List<WebElement> options = driver.findElements(By.xpath("//*[@id=\'ui-id-10\']/li"));
		
		System.out.println(options.size());
		
		for (WebElement webElements : options) {
			
			if(webElements.getText().equals("Web Services"))
			{
				webElements.click();
				break;
			}
			
		} */
		
		
	}

}
