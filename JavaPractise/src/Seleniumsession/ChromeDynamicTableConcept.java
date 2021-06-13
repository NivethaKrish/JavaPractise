package Seleniumsession;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDynamicTableConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C://Users//Nivetha Deivendran//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		
	List<WebElement> Columns = 	driver.findElements(By.tagName("th"));
	int colsize = Columns.size();
	System.out.println(colsize);

	
	List<WebElement> Rows = 	driver.findElements(By.tagName("tr"));
	int rowsize = Rows.size();
	System.out.println(rowsize);
	
	
	
	
	WebElement progress= driver.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));
	String value = progress.getText();
	System.out.println(value);
	
	List<WebElement> allprogress = 	driver.findElements(By.xpath("//td[2]"));
	
	List<Integer> intlist = new ArrayList<Integer>();
	
	for (WebElement webElement : allprogress) {
		String individual = webElement.getText().replace("%", "");
		intlist.add(Integer.parseInt(individual));
	}
	
	System.out.println(intlist);
	
	int maxval = Collections.max(intlist);
	System.out.println(maxval);
	
	String stringpath = Integer.toString(maxval) + "%";
	
	
	String path = " //td[normalize-space()=" + "\""+ stringpath + "\""+ "]" + "//following::td[1]/input";
	System.out.println(path);
	
	WebElement give = driver.findElement(By.xpath(path));
	give.click();
			
	System.out.println("Completed");
	}
	
	
}
