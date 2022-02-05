package tests.smokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class NegativeLoginTest {

    //3 Farkli test Methodunda 3 senaryoyu test et
    //				- yanlisSifre
    //				- yanlisKulllanici
    //				- yanlisSifreKullanici
    //test data yanlis username: manager1 , yanlis password : manager1
    //2) https://www.hotelmycamp.com adresine git
    //3) Login butonuna bas
    //4) Verilen senaryolar ile giris yapilamadigini test et
HotelMyCampPage hotelMyCampPage;
    @Test
    public void wrongPassTest(){
        hotelMyCampPage=new HotelMyCampPage();
Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
hotelMyCampPage.firstLoginLink.click();
hotelMyCampPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
hotelMyCampPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCWrongPassword"));
hotelMyCampPage.loginButton.click();
        Assert.assertTrue(hotelMyCampPage.accessDeniedElement.isDisplayed());
        Driver.closeDriver();
    }
@Test
    public void wrongUsernameTest(){
        hotelMyCampPage=new HotelMyCampPage();
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        hotelMyCampPage.firstLoginLink.click();
        hotelMyCampPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCWrongUsername"));
        hotelMyCampPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        hotelMyCampPage.loginButton.click();
        Assert.assertTrue(hotelMyCampPage.accessDeniedElement.isDisplayed());
        Driver.closeDriver();
}

@Test
    public void wrongUsernamePassword(){
        hotelMyCampPage=new HotelMyCampPage();
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        hotelMyCampPage.firstLoginLink.click();
        hotelMyCampPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
        hotelMyCampPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        hotelMyCampPage.loginButton.click();
        Assert.assertTrue(hotelMyCampPage.basariliGirisYaziElementi.isDisplayed());
        Driver.closeDriver();
}









}
