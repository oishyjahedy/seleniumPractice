package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathCsspractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


System.setProperty("webdriver.chrome.driver", "E:\\QA\\Udemy_selenium_course\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http:\\facebook.com");
		driver.manage().window().maximize();
		//Xpath practice
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("my xpath ");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("my password");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		driver.findElement(By.xpath("//a[@id='reg-link']")).click();
		driver.findElement(By.xpath("//input[@data-type='text']")).sendKeys("XPATH");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("CSS12354");
		driver.findElement(By.xpath("//form[@name='reg']/descendant::input[@name='reg_email__']")).sendKeys("0174145631");
//		driver.findElement(By.xpath("//input[@name='reg_email_'")).sendKeys("014789523564");
		
		
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.quit();
		
	}

}
