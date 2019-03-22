

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\QA\\Udemy_selenium_course\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	//	driver.get("http://www.globalsqa.com/demo-site/");
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
	//	driver.findElement(By.name("username")).sendKeys("RAHAD123");
	//	driver.findElement(By.id("password")).sendKeys("123654");
	//	driver.findElement(By.id("Login")).click();
	//	driver.findElement(By.linkText("Forgot Your Password?")).click();
// 		global site practice
		
	//	driver.findElement(By.xpath("//div[@class=\'row price_table_holder col_4\']/div[2]/ul/li[3]")).click();
		
	//	driver.findElement(By.xpath("//div[contains(@class,\"price_table_holder\")]/div[2]/ul/li/following-sibling::li[4]")).click();
		
	//	driver.findElement(By.cssSelector("input[type='email']")).sendKeys("hello");
		
	//	driver.findElement(By.cssSelector("input[ value='Subscribe'] ")).click();
		
	//	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("bnjhgfrt");
		
		
		// google practice #CSS
		
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("nvcxddrtuuhg");
		
		
	}

}
