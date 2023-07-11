package WebviewerStagingTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\CryptoMill\\eclipse-workspace\\WebApplicationTest\\Driver\\chromedriver.exe");

		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		WebDriver driver = new ChromeDriver(options);

		driver.get("https://webviews.cryptomill.com");

		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("amyvaishnav29@gmail.com");

		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Sushant@143");

		driver.findElement(By.xpath("//*[@id=\"pageContent\"]/div/div[2]/form[1]/fieldset/div/div[2]/button[1]"))
				.click();

		driver.manage().window().maximize();

		Thread.sleep(5000);

		driver.findElement(By.id("file")).sendKeys("C:\\Users\\CryptoMill\\Desktop\\Pic.1 (Protected .bmp).cot");

		Thread.sleep(4000);
		driver.findElement(By.id("file")).sendKeys("C:\\Users\\CryptoMill\\Desktop\\Pic.2 (Protected .png).cot");
		Thread.sleep(4000);
		driver.findElement(By.id("file")).sendKeys("C:\\Users\\CryptoMill\\Desktop\\Pic.3 (Protected .jpg).cot");
		Thread.sleep(8000);
		driver.findElement(By.id("file")).sendKeys("C:\\Users\\CryptoMill\\Desktop\\Test File 01 (Protected .xls).cot");
		Thread.sleep(6000);
		driver.findElement(By.id("file")).sendKeys("C:\\Users\\CryptoMill\\Desktop\\Test File 02 (Protected .pdf).cot");
		Thread.sleep(8000);
		driver.findElement(By.id("file"))
				.sendKeys("C:\\Users\\CryptoMill\\Desktop\\Test File 03 (Protected .pptx).cot");
		Thread.sleep(7000);
		driver.findElement(By.id("file")).sendKeys("C:\\Users\\CryptoMill\\Desktop\\Test File 04 (Protected .csv).cot");
		Thread.sleep(8000);
		driver.findElement(By.id("file")).sendKeys("C:\\Users\\CryptoMill\\Desktop\\Test File 05 (Protected .txt).cot");
		Thread.sleep(8000);
		driver.findElement(By.id("file"))
				.sendKeys("C:\\Users\\CryptoMill\\Desktop\\Test file 06 (Protected .docx).cot");
		Thread.sleep(8000);
		driver.findElement(By.id("file")).sendKeys("C:\\Users\\CryptoMill\\Desktop\\Video (Protected .mp4).cot");
		Thread.sleep(15000);
		driver.findElement(By.xpath("//*[@id=\"navContent\"]/div/div/div[3]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\'btn0\']")).click();

	}
}
