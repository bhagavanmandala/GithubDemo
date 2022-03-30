package introduction;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class first1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhagavan.mandala\\Downloads\\bhagavan_chrome\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		//System.setProperty("webdriver.gecko.driver", null);
		//WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.edge.driver", "C:\\Users\\bhagavan.mandala\\Downloads\\bhagavan_edgedriver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://github.com/");
		//driver.getTitle();
		//driver.getCurrentUrl();
		//driver.close();
		//driver.findElement(By.id("user_email")).sendKeys("bhagavansai264@gmail.com");
		//driver.findElement(By.id("pass")).sendKeys("9912514243");
		//driver.findElement(By.id("loginbutton")).click();
		//driver.findElement(By.linkText("Forgotten password?")).click();
		//driver.findElement(By.className("btn-mktg")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.linkText("Sign in →")).click();
		//driver.findElement(By.id("login_field")).sendKeys("bhagavansai264@gmail.com");
		//driver.findElement(By.id("password")).sendKeys("Naidu@2804");
		//driver.findElement(By.name("commit")).click();
		//driver.findElement(By.id("identify_email")).sendKeys("8688946448");
		//driver.findElement(By.id("did_submit")).click();
		//driver.findElement(By.name("q")).sendKeys("react");
		
		
		
		
		WebElement p=driver.findElement(By.name("q"));
		p.sendKeys("react");
		p.submit();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Advanced search")).click();
		driver.findElement(By.id("search_language")).sendKeys("javascript");
		driver.findElement(By.id("search_stars")).sendKeys(">45");
		driver.findElement(By.id("search_license")).sendKeys("Boost Software License 1.0");
		driver.findElement(By.id("search_followers")).sendKeys(">50");
		driver.findElement(By.className("btn")).click();
		
		driver.findElement(By.linkText("mvoloskov/decider")).click();
		
		WebElement readmeDriver = driver.findElement(By.xpath("//div[@data-target='readme-toc.content']"));
		String expectedText = readmeDriver.getText();
		//Printing the first 300 characters
		System.out.println(expectedText.substring(0, 300));
		
		
	}

}
