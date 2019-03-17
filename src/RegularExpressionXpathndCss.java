package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegularExpressionXpathndCss {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		

System.setProperty("webdriver.chrome.driver", "E:\\QA\\Udemy_selenium_course\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http:\\rediff.com");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		driver.findElement(By.xpath("//input[@name='login']")).sendKeys("hello");
		driver.findElement(By.cssSelector("input[id*='pass']")).sendKeys("goodbye");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		driver.quit();

	}

}
