package demo;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		System.out.println(System.getProperty("user.dir"));
       driver.get("https://testautomationpractice.blogspot.com/");
       
       WebElement element = driver.findElement(By.id("country"));
       Select s=new Select(element);
       s.selectByIndex(4);
       
       element=driver.findElement(By.id("colors"));
       s=new Select(element);
       s.selectByVisibleText("Yellow");

		driver.get("https://letcode.in/waits");
		driver.findElement(By.id("accept")).click();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
		w.until(ExpectedConditions.alertIsPresent());
		Alert a = driver.switchTo().alert();
       Thread.sleep(1000);
		a.accept();

 	driver.get("https://letcode.in/frame");
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().frame(0);
		driver.findElement(By.name("fname")).sendKeys("Oranium Tech");
		driver.findElement(By.name("lname")).sendKeys("chromepet");

		driver.switchTo().frame(1);
		driver.findElement(By.name("email")).sendKeys("oraniumTech@gmail.com");

		driver.switchTo().parentFrame();
		driver.findElement(By.name("lname")).sendKeys("vlachery");

		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Courses")).click();
//		
		
		screenshotdemo(driver);

	}

	public static void screenshotdemo(ChromeDriver driver) throws IOException {
	   TakesScreenshot ts = (TakesScreenshot) driver;
	   File path = ts.getScreenshotAs(OutputType.FILE);
	   File des=new File(System.getProperty("user.dir")+"\\Screenshots\\screenshot_"+System.currentTimeMillis()+".jpg") ; 
	   FileHandler.copy(path, des);
	}

}
