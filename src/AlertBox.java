import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "E:\\QA\\Udemy_selenium_course\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		driver.manage().window().maximize();
//when u will have only 'OK' box
		driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/button")).click();
		driver.switchTo().alert().accept();
		
//when u will get 'OK or CANCLE' box
		driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/button")).click();
		driver.switchTo().alert().dismiss();
		Thread.sleep(1000);
//when u will have a writing box
		driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[3]/div[2]/button")).click();
		driver.switchTo().alert().sendKeys("morium");
		driver.switchTo().alert().accept();
	}

}
