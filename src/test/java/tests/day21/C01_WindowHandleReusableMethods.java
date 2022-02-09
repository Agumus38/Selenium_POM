package tests.day21;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

import java.util.Set;

public class C01_WindowHandleReusableMethods {
    @Test
    public void test01(){
        Driver.getDriver().get("https://demoqa.com/browser-windows");
        String ilkSayfaWindowHandle=Driver.getDriver().getWindowHandle();
        Driver.getDriver().findElement(By.xpath("//button[@id='tabButton']")).click();

        Set<String> handleSeti=Driver.getDriver().getWindowHandles();

        String ıkıncıSayfaHandle="";

        for (String each:handleSeti
             ) {
            if(!each.equals(ilkSayfaWindowHandle)){
                ıkıncıSayfaHandle=each;
            }
        }

        Driver.getDriver().switchTo().window(ıkıncıSayfaHandle);

        String  actualTitle=Driver.driver.getTitle();
        String expectedTitle="New Window";

Assert.assertEquals(actualTitle,expectedTitle);




    }
}
