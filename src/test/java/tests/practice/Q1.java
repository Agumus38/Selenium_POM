package tests.practice;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.DemoGuruPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Q1 {
     //

  //  http://demo.guru99.com/test/drag_drop.html url e git

   // DEBIT SIDE da Account bolumune BANK butonunu surukle ve birak

    //DEBIT SIDE da Amount bolumune 5000 butonunu surukle ve birak
    //CREDIT SIDE da Amount bolumune ise ikinci 5000  butonunu surukle ve birak
    //Perfect butonun goruntulendigini dogrulayin
     //
@Test
    public void test01(){
    Driver.getDriver().get(ConfigReader.getProperty("DemoGuruUrl"));

    Actions actions=new Actions(Driver.getDriver());

    DemoGuruPage demoGuruPage=new DemoGuruPage();

actions.dragAndDrop(demoGuruPage.BankButton,demoGuruPage.DebitAccount)
        .dragAndDrop(demoGuruPage.first5k,demoGuruPage.DebitAmount)
        .dragAndDrop(demoGuruPage.second5k,demoGuruPage.CreditAmount)
        .perform();
Driver.closeDriver();



}


}
