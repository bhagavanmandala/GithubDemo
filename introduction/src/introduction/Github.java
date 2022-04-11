package introduction;

import java.time.Duration;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Github {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\bhagavan.mandala\\Downloads\\bhagavan_edgedriver\\msedgedriver.exe");
		//webDriver -- interface
		//EdgeDriver -- class
		//driver object has to access all the methods in chromeDriver that is defined in webDriver
		WebDriver driver = new EdgeDriver();
		//wait for 5 sec to 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//open github
		driver.get("https://github.com/");
		//in search bar search "react"
		WebElement p=driver.findElement(By.name("q"));
		p.sendKeys("react");
		//click on submit
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
