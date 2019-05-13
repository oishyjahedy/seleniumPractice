package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class E2EndProject {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "E:\\QA\\Udemy_selenium_course\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		Select s = new Select(driver.findElement(By.id("Adults")));
		s.selectByVisibleText("5");
		
		Select p=new Select(driver.findElement(By.id("Childrens")));
		p.selectByVisibleText("1");
		Thread.sleep(2000l);
		
		driver.findElement(By.xpath("//div[@class='span span15 datePicker']")).click();
		driver.findElement(By.cssSelector(".ui-datepicker-days-cell-over.selected")).click();
		
		driver.findElement(By.id("MoreOptionsLink")).click();
		driver.findElement(By.xpath("//input[@placeholder='Airline name']")).sendKeys("DELTA");
		driver.findElement(By.id("SearchBtn")).click();
		
		
	}
	

}
