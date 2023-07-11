package CodaproductionTest;

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

public class CODATest {

	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ami Vaishnav\\eclipse-workspace\\WebApplicationTest\\Drivers\\chromedriver.exe");

		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		WebDriver driver = new ChromeDriver(options);

		driver.get("https://coda.cryptomill.com/");

		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/form/div[1]/input[1]"))
				.sendKeys("avaishnav@cryptomill.com");

		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/form/div[1]/input[2]")).sendKeys("Sushant@143");

		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/form/div[1]/button/span")).click();

		driver.manage().window().maximize();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/section/div[2]/div[1]/button")).click();

		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Dec00");
		driver.findElement(By.xpath("//*[@id=\"description\"]")).sendKeys("Testing with diff. files");
		driver.findElement(By.xpath("//*[@id=\"member\"]")).sendKeys("amyvaishnav29@gmail.com");
		driver.findElement(
				By.xpath("//*[@id=\"app\"]/div[2]/section/div[2]/div/section/div[1]/div[2]/div/form/div[1]/button"))
				.click();

		driver.findElement(By.xpath("//*[@id=\"create\"]")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//*[@id=\"message\"]")).sendKeys("Upload multiple files....");
		driver.findElement(By.xpath("//*[@id=\"button-addon2\"]")).click();
		Thread.sleep(7000);

		// ..............First file..................//
		driver.findElement(By.id("addFiles")).click();

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

		Thread.sleep(7000);
		driver.findElement(By.xpath("//*[@id=\'button-addon2\']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"messageList\"]/div[2]/article/div[1]/div/div/img")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"messageList\"]/div[2]/article/div[2]/div[1]/i")).click();
		System.out.println("Sucessfully upload first file ............");
		Thread.sleep(5000);
		// ..............Second file..................//
		driver.findElement(By.id("addFiles")).click();

		Robot rob = new Robot();
		rob.delay(5000);
		Thread.sleep(10000);
		StringSelection ssl = new StringSelection("C:\\Users\\Ami Vaishnav\\Desktop\\images.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ssl, null);

		driver.findElement(By.xpath("//*[@id=\"button-addon2\"]")).click();

		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_V);

		rob.keyRelease(KeyEvent.VK_CONTROL);
		rob.keyRelease(KeyEvent.VK_V);

		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\'button-addon2\']")).click();
		System.out.println("Sucessfully upload second  file ............");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"messageList\"]/div[3]/article/div[1]/div/div/img")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"messageList\"]/div[3]/article/div[2]/div[1]/i")).click();
		Thread.sleep(5000);
		// ..............Third file..................//
		driver.findElement(By.xpath("//*[@id=\"addFiles\"]")).click();
		Robot robo = new Robot();
		robo.delay(3000);
		StringSelection sl = new StringSelection("C:\\Users\\Ami Vaishnav\\Desktop\\image.bmp");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sl, null);
		driver.findElement(By.xpath("//*[@id=\"button-addon2\"]")).click();

		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);

		robo.keyRelease(KeyEvent.VK_CONTROL);
		robo.keyRelease(KeyEvent.VK_V);

		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"button-addon2\"]")).click();
		System.out.println("Sucessfully upload third  file ............");
		Thread.sleep(10000);
		driver.findElement(By.xpath(" //*[@id=\"messageList\"]/div[4]/article/div[1]/div/div/img")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"messageList\"]/div[4]/article/div[2]/div[1]/i")).click();
		Thread.sleep(5000);
		// ..............Fourth file..................//

		driver.findElement(By.xpath("//*[@id=\"addFiles\"]")).click();
		Robot rt = new Robot();
		rt.delay(3000);
		StringSelection ss = new StringSelection("C:\\Users\\Ami Vaishnav\\Desktop\\Abc.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		driver.findElement(By.xpath("//*[@id=\"button-addon2\"]")).click();

		rt.keyPress(KeyEvent.VK_CONTROL);
		rt.keyPress(KeyEvent.VK_V);

		rt.keyRelease(KeyEvent.VK_CONTROL);
		rt.keyRelease(KeyEvent.VK_V);

		rt.keyPress(KeyEvent.VK_ENTER);
		rt.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"button-addon2\"]")).click();
		System.out.println("Sucessfully upload forth  file ............");
		Thread.sleep(10000);
		driver.findElement(By.xpath(" //*[@id=\"messageList\"]/div[5]/article/div[1]/div/div/img")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"messageList\"]/div[5]/article/div[2]/div[1]/i")).click();
		Thread.sleep(5000);

		// ..............Fifth file..................//
		driver.findElement(By.xpath("//*[@id=\"addFiles\"]")).click();
		Robot ro = new Robot();
		ro.delay(3000);
		StringSelection s = new StringSelection("C:\\Users\\Ami Vaishnav\\Desktop\\file.01.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);

		driver.findElement(By.xpath("//*[@id=\"button-addon2\"]")).click();

		ro.keyPress(KeyEvent.VK_CONTROL);
		ro.keyPress(KeyEvent.VK_V);

		ro.keyRelease(KeyEvent.VK_CONTROL);
		ro.keyRelease(KeyEvent.VK_V);

		ro.keyPress(KeyEvent.VK_ENTER);
		ro.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(7000);
		driver.findElement(By.xpath("//*[@id=\"button-addon2\"]")).click();

		System.out.println("Sucessfully upload  Fifth  file ............");
		Thread.sleep(10000);
		driver.findElement(By.xpath(" //*[@id=\"messageList\"]/div[6]/article/div[1]/div/div/img")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"messageList\"]/div[6]/article/div[2]/div[1]/i")).click();
		Thread.sleep(5000);

		// ..............Sixth file..................//
		driver.findElement(By.xpath("//*[@id=\"addFiles\"]")).click();
		Robot roo = new Robot();
		roo.delay(5000);
		StringSelection sc = new StringSelection("C:\\Users\\Ami Vaishnav\\Desktop\\airtel_song.mp3");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sc, null);

		driver.findElement(By.xpath("//*[@id=\"button-addon2\"]")).click();

		roo.keyPress(KeyEvent.VK_CONTROL);
		roo.keyPress(KeyEvent.VK_V);

		roo.keyRelease(KeyEvent.VK_CONTROL);
		roo.keyRelease(KeyEvent.VK_V);

		roo.keyPress(KeyEvent.VK_ENTER);
		roo.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(7000);
		driver.findElement(By.xpath("//*[@id=\"button-addon2\"]")).click();
		System.out.println("Sucessfully upload Sixth  file ............");

		Thread.sleep(10000);
		driver.findElement(By.xpath(" //*[@id=\"messageList\"]/div[7]/article/div[1]/div/div/img")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"messageList\"]/div[7]/article/div[2]/div[1]/i")).click();
		Thread.sleep(5000);
		// ..............Seventh file..................//

		driver.findElement(By.xpath("//*[@id=\"addFiles\"]")).click();
		Robot r = new Robot();
		r.delay(5000);
		StringSelection sli = new StringSelection("C:\\Users\\Ami Vaishnav\\Desktop\\file_example.mp4");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sli, null);

		driver.findElement(By.xpath("//*[@id=\"button-addon2\"]")).click();

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);

		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(7000);
		driver.findElement(By.xpath("//*[@id=\"button-addon2\"]")).click();
		System.out.println("Sucessfully upload Seventh  file ............");
		Thread.sleep(10000);
		driver.findElement(By.xpath(" //*[@id=\"messageList\"]/div[8]/article/div[1]/div/div/img")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"messageList\"]/div[8]/article/div[2]/div[1]/i")).click();
		Thread.sleep(5000);
		// ..............Eighth file..................//

		driver.findElement(By.xpath("//*[@id=\"addFiles\"]")).click();
		Robot bo = new Robot();
		bo.delay(3000);
		StringSelection sle = new StringSelection("C:\\Users\\Ami Vaishnav\\Desktop\\0804.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sle, null);

		driver.findElement(By.xpath("//*[@id=\"button-addon2\"]")).click();

		bo.keyPress(KeyEvent.VK_CONTROL);
		bo.keyPress(KeyEvent.VK_V);

		bo.keyRelease(KeyEvent.VK_CONTROL);
		bo.keyRelease(KeyEvent.VK_V);

		bo.keyPress(KeyEvent.VK_ENTER);
		bo.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"button-addon2\"]")).click();
		System.out.println("Sucessfully upload Eighth  file ............");
		Thread.sleep(10000);
		driver.findElement(By.xpath(" //*[@id=\"messageList\"]/div[9]/article/div[1]/div/div/img")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"messageList\"]/div[9]/article/div[2]/div[1]/i")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id=\"back\"] ")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/section/div[3]/article[1]/div/div[5]/div[1]/button"))
				.click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/section/div[3]/button[1]")).click();
	}

}
