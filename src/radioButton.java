import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  

System.setProperty("webdriver.chrome.driver", "E:\\QA\\Udemy_selenium_course\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@value='Female']")).click();
		driver.findElement(By.id("buttoncheck")).click();
		driver.findElement(By.xpath("//div[text()=\"Group Radio Buttons Demo\"]/following-sibling::div/div/label //input[@value='Male']")).click();
		
		for(int i=1;i<5;i++) {
			driver.findElement(By.xpath("//input[@name='ageGroup']")).click();
		}
	}

}
