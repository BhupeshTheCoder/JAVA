import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		//Thread.sleep(3000);
		driver.get("https://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("Virat Kholi");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]")).click();
		driver.findElement(By.name("btnK")).click();
		driver.manage().window().maximize();
		

	}

}
