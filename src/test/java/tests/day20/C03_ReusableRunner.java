package tests.day20;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ReusableMethods;

public class C03_ReusableRunner {
    @Test
    public void test01(){
        //Ulkeler excelındekı Sayfa1 de 11.index de ki satırın 2.indexeki hucresının
        //Azerbaycan oldugunu test edın
        String path="src/test/java/resources/ulkeler.xlsx";
String expectedData="Azerbaycan";
        String actualData= ReusableMethods.hucreGetir(path,"Sayfa1",11,2).toString();
        Assert.assertEquals(actualData,expectedData);


    }

}
