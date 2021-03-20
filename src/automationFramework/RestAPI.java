package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstTestCase {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("Test");;
		driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("GIT");;
		driver.findElement(By.cssSelector("['btn']")).click();
		System.out.println(driver.getTitle());
		
		driver.quit();
	}

}
