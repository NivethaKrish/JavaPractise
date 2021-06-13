package Seleniumsession;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDownloadFileConcept {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C://Users//Nivetha Deivendran//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.leafground.com/pages/download.html");
		
		WebElement download = driver.findElement(By.xpath("//*[@id=\'wrapper\']/div/div[3]/div[2]/a[1]"));
		download.click();
		 Thread.sleep(1000);
		 
		 File file = new File("C:\\Users\\Nivetha Deivendran\\Downloads");
		 
		 File[] lists = file.listFiles();
		 
		 for (File file2 : lists) {
			if(file2.getName().equals("testleaf.xlsx"))
			{
				System.out.println("downloaded");
				break;
			}
		}

	}

}
