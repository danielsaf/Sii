/**
 * Created by dsafinski on 2015-04-09.
 */


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import static org.testng.Assert.assertEquals;



public class Core {
    static WebDriver driver;


    @BeforeClass
    public void setUp() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://sii.pl/branches/");
        assertEquals(driver.getCurrentUrl(), "http://sii.pl/branches/");
        WebElement cookies = driver.findElement(By.className("notification__dismiss"));
        cookies.click();


    }

}
