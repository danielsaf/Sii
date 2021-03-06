/**
 * Created by dsafinski on 2015-04-09.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.interactions.Actions;


public class Sii extends Core{


    @Test
    public void ShouldTestowkaSiiPoznanPageBeOpenable() {
        WebElement poznan = driver.findElement(By.id("menu-item-2234"));
        poznan.click();
        assertEquals(driver.getCurrentUrl(), "http://sii.pl/branches/poznan/");
        boolean formularz = driver.findElement(By.id("footer-contact")).isEnabled();
        assertEquals(formularz, true);

        /**Actions builder = new Actions(driver);
        builder.contextClick(driver.findElement(By.id("footer-contact")))
                .moveToElement(driver.findElement(By.id("footer-contact")));*/


        WebElement imie = driver.findElement(By.id("f-name"));
        imie.sendKeys("Daniel");
        WebElement email = driver.findElement(By.id("f-mail"));
        email.sendKeys("dsafinski@pl.sii.eu");
        WebElement wiadomosc  = driver.findElement(By.id("f-msg"));
        wiadomosc.sendKeys("Lubie to!");
        WebElement wyslij = driver.findElement(By.name("Wy�lij"));
        wyslij.click();




    }

    @AfterClass
    public static void tearDown() {
        /**driver.close();*/
    }
}

