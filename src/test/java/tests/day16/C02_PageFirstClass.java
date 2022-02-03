package tests.day16;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C02_PageFirstClass {
    // Amazona gidelim
    //arama kutusuna nutella yazıp aratalım
    //arama sonuclarının nutella ıcerdıgını test edelım

    @Test
    public void test01(){
        Driver.getDriver().get("https://www.amazon.com");
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.amazonSearchBox.sendKeys("Nutella"+ Keys.ENTER);
        String actualResult=amazonPage.resultElement.getText();
        Assert.assertTrue(actualResult.contains("Nutella"));
Driver.closeDriver();
    }
@Test
    public void test02(){
        Driver.getDriver().get("https://www.amazon.com");
AmazonPage amazonPage=new AmazonPage();
amazonPage.amazonSearchBox.sendKeys("java"+Keys.ENTER);
String resultTextElement=amazonPage.resultElement.getText();
Assert.assertTrue(resultTextElement.contains("java"));
        Driver.closeDriver();
}




}
