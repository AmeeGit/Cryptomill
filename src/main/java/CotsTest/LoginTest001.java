package CotsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest001 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ami Vaishnav\\eclipse-workspace\\SimpleTest\\Drivers103Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://cots.cryptomill.com/");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("amyvaishnav29@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Sushant@143");
		driver.findElement(By.xpath("//*[@id=\"pageLoggedOutContent\"]/div/div[2]/form/fieldset/div/div[2]/button[1]")).click();
		
		driver.findElement(By.className("pure-button pure-button-primary circleCreate")).click();
		
		
	
		

	}

}
