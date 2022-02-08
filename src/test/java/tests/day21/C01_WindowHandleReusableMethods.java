package tests.day21;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utilities.Driver;

public class C01_WindowHandleReusableMethods {
    @Test
    public void test01(){
        Driver.getDriver().get("https://demoqa.com/browser-windows");
        String ilkSayfaWindowHandle=Driver.getDriver().getWindowHandle();
        Driver.getDriver().findElement(By.xpath("//button[@id='tabButton']")).click();






    }
}
