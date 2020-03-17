import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class LoginTest {
public static WebDriver driver;
@BeforeSuite
public void setup() {
	driver= new ChromeDriver();
	
	
}

	public void login() {
		
		driver.get("http://gmail.com");
		//driver.findElement(By.xpath("")).sendKeys("");
		//driver.findElement(By.xpath("")).sendKeys("");
		//driver.findElement(By.xpath("")).click();
	}
@AfterSuite
public void tearDown() {
	

driver.quit();
}}