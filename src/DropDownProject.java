import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


System.setProperty("webdriver.chrome.driver", "E:\\QA\\Udemy_selenium_course\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Select s= new Select(driver.findElement(By.xpath("//select[@name='country']")));
		System.out.println("After Wait");
		s.selectByValue("3");
		s.selectByVisibleText("ALGERIA");
		
		
		
		
	}

}
