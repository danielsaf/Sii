/**
 * Created by dsafinski on 2015-04-09.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;



public class Sii extends Core{


    @Test
    public void ShouldTestowkaPlPageBeOpenable() {
        WebElement poznan = driver.findElement(By.id("menu-item-2234"));
        poznan.click();
        assertEquals(driver.getCurrentUrl(), "http://sii.pl/branches/poznan/");
        boolean formularz = driver.findElement(By.id("footer-contact")).isEnabled();
        assertEquals(formularz, true);


    }

    @AfterClass
    public static void tearDown() {
        driver.close();
    }
}

