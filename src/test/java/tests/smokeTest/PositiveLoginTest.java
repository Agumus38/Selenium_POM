package tests.smokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class PositiveLoginTest {


   @Test
    public void positiveLoginTest(){
       //3) Bir test method olustur positiveLoginTest()
       //		 https://www.hotelmycamp.com adresine git
       Driver.getDriver().get("https://www.hotelmycamp.com");
       //		login butonuna bas
       HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
       hotelMyCampPage.firstLoginLink.click();
       //test data username: manager ,
       hotelMyCampPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
       //test data password : Manager1!
       hotelMyCampPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
hotelMyCampPage.loginButton.click();
       //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
       Assert.assertTrue(hotelMyCampPage.basariliGirisYaziElementi.isDisplayed());

   }


}
