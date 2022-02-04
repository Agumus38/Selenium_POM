package tests.day17;

import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_PropertiesFirstClass {
    @Test
    public void positiveLoginTest(){
        //Hotel MyCamp testini POM a tam uygun olarak yapınız

        //https://www. hotelmycamp.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        //        login butonuna bas
        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
       hotelMyCampPage.firstLoginLink.click();
        //    test data username: manager
        hotelMyCampPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
        //    test data password : Manager1!
        hotelMyCampPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
       hotelMyCampPage.loginButton.click();
        //    Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        Driver.closeDriver();

    }

}
