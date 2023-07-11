
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

public class AllFilesUpload {

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

		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("test000");
		driver.findElement(By.xpath("//*[@id=\"description\"]")).sendKeys("Testing with diff. files");
		driver.findElement(By.xpath("//*[@id=\"member\"]")).sendKeys("avaishnav@cryptomill.com");
		driver.findElement(By.id("create")).click();
		Thread.sleep(5000);

		driver.findElement(By.id("message")).sendKeys("Testing files ");

		driver.findElement(By.id("button-addon2")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"addFiles\"]")).click();
		Thread.sleep(3000);
		Robot rb = new Robot();
		rb.delay(3000);
		StringSelection ssel = new StringSelection("C:\\Users\\CryptoMill\\Desktop\\images");

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ssel, null);
		// driver.findElement(By.id("button-addon2")).click();

		driver.findElement(By.xpath("//*[@id=\"button-addon2\"]")).click();

		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"button-addon2\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"addFiles\"]")).click();
		Thread.sleep(3000);
		Robot ro = new Robot();
		

		ro.delay(3000);

		StringSelection ssl = new StringSelection("C:\\Users\\CryptoMill\\Desktop\\image");

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ssl, null);

		driver.findElement(By.xpath("//*[@id=\"button-addon2\"]")).click();

		ro.keyPress(KeyEvent.VK_CONTROL);
		ro.keyPress(KeyEvent.VK_V);

		ro.keyRelease(KeyEvent.VK_CONTROL);
		ro.keyRelease(KeyEvent.VK_V);

		ro.keyPress(KeyEvent.VK_ENTER);
		ro.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"button-addon2\"]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"addFiles\"]")).click();
		Thread.sleep(3000);

		Robot rbo = new Robot();

		rbo.delay(3000);

		StringSelection sl = new StringSelection("C:\\Users\\CryptoMill\\Desktop\\photo");

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sl, null);

		driver.findElement(By.xpath("//*[@id=\"button-addon2\"]")).click();

		rbo.keyPress(KeyEvent.VK_CONTROL);
		rbo.keyPress(KeyEvent.VK_V);

		rbo.keyRelease(KeyEvent.VK_CONTROL);
		rbo.keyRelease(KeyEvent.VK_V);

		rbo.keyPress(KeyEvent.VK_ENTER);
		rbo.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"button-addon2\"]")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id=\"addFiles\"]")).click();
		Thread.sleep(3000);
		Robot rt = new Robot();

		rt.delay(5000);

		StringSelection sc = new StringSelection("C:\\Users\\CryptoMill\\Desktop\\airtel_song");

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sc, null);

		driver.findElement(By.xpath("//*[@id=\"button-addon2\"]")).click();

		rt.keyPress(KeyEvent.VK_CONTROL);
		rt.keyPress(KeyEvent.VK_V);

		rt.keyRelease(KeyEvent.VK_CONTROL);
		rt.keyRelease(KeyEvent.VK_V);

		rt.keyPress(KeyEvent.VK_ENTER);
		rt.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"button-addon2\"]")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id=\"addFiles\"]")).click();
		Thread.sleep(3000);
		Robot r = new Robot();

		r.delay(5000);

		StringSelection s = new StringSelection("C:\\Users\\CryptoMill\\Desktop\\file_MP4");

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);

		driver.findElement(By.xpath("//*[@id=\"button-addon2\"]")).click();

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);

		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"button-addon2\"]")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id=\"addFiles\"]")).click();
		Thread.sleep(3000);
		Robot rob = new Robot();

		rob.delay(5000);

		StringSelection sel = new StringSelection("C:\\Users\\CryptoMill\\Desktop\\Abc");

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);

		driver.findElement(By.xpath("//*[@id=\"button-addon2\"]")).click();

		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_V);

		rob.keyRelease(KeyEvent.VK_CONTROL);
		rob.keyRelease(KeyEvent.VK_V);

		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"button-addon2\"]")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id=\"addFiles\"]")).click();
		Thread.sleep(3000);
		Robot roo = new Robot();

		roo.delay(5000);

		StringSelection el = new StringSelection("C:\\Users\\CryptoMill\\Desktop\\file02");

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(el, null);

		driver.findElement(By.xpath("//*[@id=\"button-addon2\"]")).click();

		roo.keyPress(KeyEvent.VK_CONTROL);
		roo.keyPress(KeyEvent.VK_V);

		roo.keyRelease(KeyEvent.VK_CONTROL);
		roo.keyRelease(KeyEvent.VK_V);

		roo.keyPress(KeyEvent.VK_ENTER);
		roo.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"button-addon2\"]")).click();
		Thread.sleep(5000);

		Robot b = new Robot();

		b.delay(5000);

		StringSelection sell = new StringSelection("C:\\Users\\CryptoMill\\Desktop\\file.01");

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sell, null);

		driver.findElement(By.xpath("//*[@id=\"button-addon2\"]")).click();

		b.keyPress(KeyEvent.VK_CONTROL);
		b.keyPress(KeyEvent.VK_V);

		b.keyRelease(KeyEvent.VK_CONTROL);
		b.keyRelease(KeyEvent.VK_V);

		b.keyPress(KeyEvent.VK_ENTER);
		b.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"button-addon2\"]")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id=\"addFiles\"]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"message\"]")).sendKeys("Hi this is just testing of function");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"button-addon2\"]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"back\"] ")).click();

		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/section/div[3]/article[1]/div/div[5]/div[1]/button"))
				.click();

		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/section/div[3]/button[1]")).click();

	}

}
