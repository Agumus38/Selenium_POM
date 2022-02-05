package tests.day18;

import org.testng.annotations.Test;
import pages.HotelMyCampPage;

public class E2E_Testing {


    @Test
    public void createHotel(){
        //1. Tests packagenin altına class olusturun: CreateHotel
        //2. Bir metod olusturun: createHotel
        //3. https://www.hotelmycamp.com adresine git.
        //4. Username textbox ve password metin kutularını locate edin ve asagidaki verileri    girin.
        //	a. Username : manager
        //	b. Password  : Manager1!
        //5. Login butonuna tıklayın.
        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.entryPage();
        //6. Hotel Management/Hotel List menusunden ADD HOTEL butonuna tiklayin
        //7. Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.
        //8. Save butonuna tıklayın.
        //9. “Hotel was inserted successfully” textinin göründüğünü test edin.
        //10. OK butonuna tıklayın.

    }

}
