package demo;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions c=new ChromeOptions();
		//c.addArguments("headless");
		c.addArguments("start-maximized");

		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(c);

		
		
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement element = driver.findElement(By.xpath("//input[@class='wikipedia-search-input']"));
		element.sendKeys("selenium");
		element.sendKeys(Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> elements = driver.findElements(By.xpath("//div[@id=\"wikipedia-search-result-link\"]/a"));
		System.out.println(elements);
		for (WebElement e : elements) {
			System.out.println(e.getText());
			e.click();
			System.out.println(driver.getCurrentUrl()+driver.getTitle());

		}
		System.out.println(driver.getCurrentUrl()+" "+driver.getTitle());
         Set<String> windowHandles = driver.getWindowHandles();
         System.out.println(windowHandles);
         
        List<String>list=new ArrayList<>(windowHandles);
        
        System.out.println("===================================");
        for(String l:list) {
        	driver.switchTo().window(l);
			System.out.println(driver.getCurrentUrl()+driver.getTitle());

        }
        
        for(String l:list) {
         	driver.switchTo().window(l);
			System.out.println(driver.getCurrentUrl()+driver.getTitle());
			if(driver.getTitle().equals("Selenium (software) - Wikipedia")) {
				driver.findElement(By.xpath("//a[@class=\"mw-logo\"]")).click();
			    Thread.sleep(2000); 
				break;
			}
        }
        
        String windowHandle = driver.getWindowHandle();
        driver.switchTo().window(list.get(0));
         driver.findElement(By.linkText("Blog")).click();

		driver.quit();
       
         
         
    
		
		
		

	}

}
