package tests.day16;

import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.Driver;

public class C04_HotelMyCampPositiveLogin {
    @Test(groups = "miniRegression")
    public void pozitifLoginTesti(){

        //		https://www. hotelmycamp.com/ adresine git
        Driver.getDriver().get("https://www.hotelmycamp.com/");
        //		login butonuna bas

        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.firstLoginLink.click();
        //	test data username: manager ,
        hotelMyCampPage.usernameBox.sendKeys("manager");

        //	test data password : Manager1!
        hotelMyCampPage.passwordBox.sendKeys("Manager1!");
        hotelMyCampPage.loginButton.click();

        //	Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et

        Driver.closeDriver();
    }
}
