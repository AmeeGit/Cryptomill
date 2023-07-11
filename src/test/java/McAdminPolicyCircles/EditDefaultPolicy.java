package McAdminPolicyCircles;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EditDefaultPolicy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ami Vaishnav\\eclipse-workspace\\WebApplicationTest\\Drivers\\chromedriver.exe");

		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		WebDriver driver = new ChromeDriver(options);

		driver.get("https://cot.cryptomill.com");

		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("avaishnav@cryptomill.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Sushant@143");
		driver.findElement(By.xpath("//*[@id=\"pageLoggedOutContent\"]/div/div[2]/form/fieldset/div/div[2]/button[1]"))
				.click();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("policies")).click();

		driver.findElement(By.xpath("//*[@id=\"policiesCollection\"]/div[4]")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@id=\"pageStackOneContent\"]/div/div/div/div[1]/button")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"apCircles\"]")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@id=\"canEditCircleDefaults\"]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// Thread.sleep(7000);
		driver.findElement(
				By.xpath("//*[@id=\"popupContent\"]/div[2]/div[2]/div/div[2]/div[1]/form/fieldset/div[9]/button"))
				.click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id=\"circles\"]")).click();

	}

}
