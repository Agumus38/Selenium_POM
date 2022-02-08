package tests.day18;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HMCWebTablePage;
import pages.HotelMyCampPage;
import utilities.Driver;

import java.util.List;

public class C02_WebTables {
HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
HMCWebTablePage hmcWebTablePage=new HMCWebTablePage();

@Test
    public void loginTest(){
    //● table( ) metodu oluşturun
    //○ Tüm table body’sinin boyutunu(sutun sayisi) bulun. /tbody
    //○ Table’daki tum body’I ve başlıkları(headers) konsolda yazdırın.
    //● printRows( ) metodu oluşturun //tr
    //○ table body’sinde bulunan toplam satir(row) sayısını bulun.
    //○ Table body’sinde bulunan satirlari(rows) konsolda yazdırın.
    //○ 4.satirdaki(row) elementleri konsolda yazdırın
    hotelMyCampPage=new HotelMyCampPage();
    hotelMyCampPage.entryPage();
}

@Test
    public void table(){
    //● table( ) metodu oluşturun
    //○ Tüm table body’sinin boyutunu(sutun sayisi) bulun. /tbody
hmcWebTablePage=new HMCWebTablePage();
    List<WebElement> headerDataList=hmcWebTablePage.headerBırıncıSatırDatalar;
    System.out.println("tablodakı stun sayısı: "+headerDataList.size());
    System.out.println(hmcWebTablePage.tumBodyWebElement.getText());
    //○ Table’daki tum body’I ve başlıkları(headers) konsolda yazdırın.
List<WebElement> bodyTumDataList=hmcWebTablePage.tumBodyDatalarıList;
    System.out.println("body'deki data sayısı: "+bodyTumDataList.size());


}
@Test(dependsOnMethods = "loginTest")
    public void printRows(){
    // //● printRows( ) metodu oluşturun //tr
    //    //○ table body’sinde bulunan toplam satir(row) sayısını bulun.
    hmcWebTablePage=new HMCWebTablePage();

    //    //○ Table body’sinde bulunan satirlari(rows) konsolda yazdırın.

    //    //○ 4.satirdaki(row) elementleri konsolda yazdırın
    Driver.closeDriver();

}




}
