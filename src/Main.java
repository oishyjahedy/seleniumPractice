package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\QA\\Udemy_selenium_course\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");
		
		driver.findElement(By.name("username")).sendKeys("RAHAD123");
		driver.findElement(By.id("password")).sendKeys("123654");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.linkText("Forgot Your Password?")).click();
	}

}
