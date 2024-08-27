package seleniumIpt;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VisibilityFalse {
	static boolean rustin;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobiles");
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		driver.findElement(By.xpath("//a[text()='IMDb']")).click();
		try {

		} catch (NoSuchElementException e) {

			boolean rustin = driver.findElement(By.xpath("//a[text()='Rustin']")).isDisplayed();
		} finally {
			System.out.println("IsDisplayed :" + rustin);
		}

		driver.quit();

	}

}
