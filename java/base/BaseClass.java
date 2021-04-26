package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {

	public static ChromeDriver driver;
	public Properties prop;
	
	@BeforeClass
	public void readProperty() throws IOException {
		FileInputStream fis = new FileInputStream("./src/main/resources/config.properties");
		prop = new Properties();
		prop.load(fis);
	}
	
	@BeforeMethod
	public void preCondition() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		driver.get(prop.getProperty("url"));
	}
	

	@AfterMethod
	public void postCondition() {
		driver.close();
	}
}
