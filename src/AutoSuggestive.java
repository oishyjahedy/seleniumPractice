import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


System.setProperty("webdriver.chrome.driver", "E:\\QA\\Udemy_selenium_course\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		//WebElement frist=
		driver.findElement(By.xpath("//ul[@class='fswTabs latoBlack greyText']/li[2]")).click();
				driver.findElement(By.id("o85Z-origin")).clear();
				driver.findElement(By.xpath("//input[@id='fb26547a-60b1-4d14-9427-5288e65d771e']")).sendKeys("JFK");
				driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
				driver.findElement(By.xpath("//input[@id='fb26547a-60b1-4d14-9427-5288e65d771e']")).sendKeys(Keys.ENTER);
				
	}

}
