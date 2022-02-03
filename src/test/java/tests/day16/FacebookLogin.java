package tests.day16;

import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.Driver;

public class FacebookLogin {

    @Test
    public void test01(){
        //1 - https://www.facebook.com/ adresine gidin
        Driver.getDriver().get("https://www.facebook.com/");

        //2- POM’a uygun olarak email, sifre kutularini ve giris yap butonunu locate edin
        //3- Faker class’ini kullanarak email ve sifre degerlerini yazdirip, giris butonuna basin
        //4- Basarili giris yapilamadigini test edin
    }



}
