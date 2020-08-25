import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class loginTest {
public static WebDriver driver;
@BeforeTest
public void setUp() {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\EPIQ\\NewWorkspace\\GitTest1\\src\\driver\\geckodriver.exe");
	driver=new FirefoxDriver();
	
}
@Test
public void doLogin() {
	driver.get("http://www.google.co.in");
	System.out.println("HHHH");
	/*
	 * 
	 * 
	 * This is change.
	 * 
	 * 
	 * THERE IS TEST
	 */
}

@AfterTest
public void tearDown() {
	driver.quit();
}
}
