package tests.day16;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.Driver;

public class FacebookLogin {

    @Test
    public void test01() throws InterruptedException {
        //1 - https://www.facebook.com/ adresine gidin
        Driver.getDriver().get("https://www.facebook.com/");
FacebookPage facebookPage=new FacebookPage();

        //2- POM’a uygun olarak email, sifre kutularini ve giris yap butonunu locate edin
        Faker faker=new Faker();
        facebookPage.emailBox.sendKeys(faker.internet().emailAddress());
        facebookPage.passBox.sendKeys(faker.internet().password());
        facebookPage.loginButton.click();
        //3- Faker class’ini kullanarak email ve sifre degerlerini yazdirip, giris butonuna basin
        //4- Basarili giris yapilamadigini test edin
        Assert.assertTrue(facebookPage.girilemediYazisiElementi.isDisplayed());
Thread.sleep(3000);
   Driver.closeDriver();
    }



}
