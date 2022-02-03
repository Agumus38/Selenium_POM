package tests.day16;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class q1 {

    @Test
    public void test01(){

        Driver.getDriver().get("https://www.amazon.com");
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains("Amazon"));
        Driver.closeDriver();

    }


}
