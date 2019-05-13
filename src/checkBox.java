import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class checkBox {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub


System.setProperty("webdriver.chrome.driver", "E:\\QA\\Udemy_selenium_course\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		driver.manage().window().maximize();
		
	    Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
		driver.findElement(By.id("checkBoxOption1")).click();
		System.out.println((driver.findElement(By.id("checkBoxOption1")).isSelected()));
 		Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected()); 
		
 		driver.findElement(By.id("checkBoxOption1")).click();
	
		Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
		
		System.out.println(driver.findElements(By.xpath("//div[@id='checkbox-example']/descendant::input[@type='checkbox']")).size());
		
		
		
	}

}
