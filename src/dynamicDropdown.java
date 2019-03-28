import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty ("webdriver.chrome.driver","E:\\QA\\Udemy_selenium_course\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver(); 
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		// launch Chrome and redirect it to the Base URL
		driver.get("https://www.spicejet.com/" );
		//Maximizes the browser window
		driver.manage().window().maximize() ;
		driver.findElement(By.id("divpaxinfo")).click();
	
		Thread.sleep(2000l);
		/* this is a right  term but not the good one, like new on work
		 *  
		driver.findElement(By.id("hrefIncAdt")).click();
		driver.findElement(By.id("hrefIncAdt")).click();
		driver.findElement(By.id("btnclosepaxoption")).click();
		*/
		
		/*another way to do this
		 * 
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(
		ExpectedConditions.visibilityOfElementLocated(By.id("hrefIncAdt")));
		int i=1;
		while (i<5) {
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		//close browser
	//	driver.close();		
	}
	*/
		
		/*when using while loop	
		 * 
		 * int i=1;
		while(i<5) {
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		
		*/
		//when using for loop
		for(int i=1;i<5;i++) {
			driver.findElement(By.id("hrefIncAdt")).click();

		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		}
	

}
