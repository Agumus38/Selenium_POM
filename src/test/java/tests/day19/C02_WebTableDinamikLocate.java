package tests.day19;

import org.testng.annotations.Test;
import pages.DemoqaPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_WebTableDinamikLocate {


    @Test
    public void demoqaTest(){
        Driver.getDriver().get(ConfigReader.getProperty("DemoqaUrl"));
        //1. “https://demoqa.com/webtables” sayfasina gidin
        //2. Headers da bulunan department isimlerini yazdirin
        DemoqaPage demoqaPage=new DemoqaPage();
        System.out.println("baslık satırı elementı: "+demoqaPage.baslıkSatırElement.getText());
        //3. sutunun basligini yazdirin
        System.out.println(demoqaPage.baslıklarWebelementList.get(2).getText());

        //4. Tablodaki tum datalari yazdirin
        System.out.println(demoqaPage.bodyTekElement.getText());
        //5. Tabloda kac cell (data) oldugunu yazdirin
        System.out.println(demoqaPage.tumDataWebElementList.size());
        //6. Tablodaki satir sayisini yazdirin

        //7. Tablodaki sutun sayisini yazdirin
        //8. Tablodaki 3.kolonu yazdirin
        //9. Tabloda "First Name" i Kierra olan kisinin Salary'sini yazdirin
        //10. Page sayfasinda bir method olusturun, Test sayfasindan satir ve sutun sayisini
        //girdigimde bana datayi yazdirsi



Driver.closeDriver();
    }



}
