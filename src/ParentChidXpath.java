package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentChidXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


System.setProperty("webdriver.chrome.driver", "E:\\QA\\Udemy_selenium_course\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@id=\"username_container\"]/input")).sendKeys("american idol");
		
		
		
		
		driver.quit();
		
	}

}
