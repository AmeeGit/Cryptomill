package CodastagingTest;

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

public class UploadMultipleFilesCodas {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\CryptoMill\\eclipse-workspace\\WebApplicationTest\\Driver\\chromedriver.exe");

		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);

		WebDriver driver = new ChromeDriver(options);

		driver.get("https://codas.cryptomill.com");

		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/form/div[1]/input[1]")).sendKeys("amyvaishnav29@gmail.com");

		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/form/div[1]/input[2]")).sendKeys("Sushant@143");

		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/form/div[1]/button/span")).click();

		driver.manage().window().maximize();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/section/div[2]/div[1]/button")).click();

		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("1201B");
		driver.findElement(By.xpath("//*[@id=\"description\"]")).sendKeys("Testing with diff. files");
		driver.findElement(By.xpath("//*[@id=\"member\"]")).sendKeys("avaishnav@cryptomill.com");
		Thread.sleep(5000);

		driver.findElement(
				By.xpath("//*[@id=\"app\"]/div[2]/section/div[2]/div/section/div[1]/div[2]/div/form/div[1]/button"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"create\"]")).click();
		Thread.sleep(7000);

		Robot rb = new Robot();

		rb.delay(5000);            
		StringSelection ssel = new StringSelection("C:\\Users\\Ami Vaishnav\\Desktop\\photo.jpg");

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ssel, null);

		driver.findElement(By.xpath("//*[@id=\"button-addon2\"]")).click();

		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@id=\"button-addon2\"]")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@id=\"message\"]")).sendKeys("Hi this is just testing of function");
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id=\"button-addon2\"]")).click();
		Thread.sleep(3000);

		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"addFiles\"]")).click();
		StringSelection ssl = new StringSelection("C:\\Users\\Ami Vaishnav\\Desktop\\image.BMP");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ssel, null);
		driver.findElement(By.xpath("//*[@id=\"button-addon2\"]")).click();
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id=\"addFiles\"]")).click();
		StringSelection ss = new StringSelection("C:\\Users\\Ami Vaishnav\\Desktop\\images.png");

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ssel, null);

		driver.findElement(By.xpath("//*[@id=\"button-addon2\"]")).click();

		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@id=\"button-addon2\"]")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@id=\"message\"]")).sendKeys("Hi this is just testing of function");
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id=\"button-addon2\"]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"back\"] ")).click();

		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/section/div[3]/article[1]/div/div[5]/div[1]/button"))
				.click();

		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/section/div[3]/button[1]")).click();

	}

}
