package tests.day19;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HMCWebTablePage;
import pages.HotelMyCampPage;
import utilities.Driver;

public class C01_WebTableDinamikLocate {
    //3 test methodu olusturalım
    //1.method satır numarası verdıgımda bana o satırdakı dataları yazdırsın
    //2.method satır no ve data numarası gırdıgımde verdıgım datayı yazdırsın
    //3.stun numarası verdıgımde bana tum sutunu yazdırsın
    HMCWebTablePage hmcWebTablePage;
    HotelMyCampPage hotelMyCampPage;
    @Test
    public void satırYazdırTest(){

        hmcWebTablePage=new HMCWebTablePage();
        hmcWebTablePage=new HMCWebTablePage();
        WebElement ucuncusatirElementi=hmcWebTablePage.satırYazdır(4);

        System.out.println(ucuncusatirElementi.getText());

        Driver.closeDriver();

    }

@Test
    public void hucreGetırTesti(){
        hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.entryPage();


        hmcWebTablePage=new HMCWebTablePage();

    System.out.println(hmcWebTablePage.hucreWebelementGetir(5,4));

}

@Test
    public void sutunYazdırTesti(){
        hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.entryPage();

        hmcWebTablePage=new HMCWebTablePage();
        hmcWebTablePage.sutunYazdır(4);

}



}
