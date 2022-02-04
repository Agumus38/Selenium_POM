package tests.day17;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.Driver;

public class C05_HMCPositiveLogin {
    @Test
    public void test01() {
        //         https://www. hotelmycamp.com/ adresine git
        Driver.getDriver().get("https://www.hotelmycamp.com/");
        //        login butonuna bas
        HotelMyCampPage hotelMyCampPage = new HotelMyCampPage();
        hotelMyCampPage.firstLoginLink.click();
        //    test data username: manager1 ,
        hotelMyCampPage.usernameBox.sendKeys("manager");
        hotelMyCampPage.passwordBox.sendKeys("Manager1!");
        //    test data password : manager1!
        hotelMyCampPage.loginButton.click();
        Assert.assertTrue(hotelMyCampPage.basariliGirisYaziElementi.isDisplayed());
  Driver.closeDriver();
    }
}