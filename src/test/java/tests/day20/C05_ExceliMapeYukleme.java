package tests.day20;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ReusableMethods;

import java.io.FileNotFoundException;
import java.util.Map;

public class C05_ExceliMapeYukleme {
    @Test
    public void test01() throws FileNotFoundException {

        String path="src/test/java/resources/ulkeler.xlsx";
        String sayfaAdı="Sayfa1";

        Map<String,String> ulkelerMap=ReusableMethods.mapOlustur(path,sayfaAdı);

        System.out.println(ulkelerMap.get("Turkey"));

        Assert.assertTrue(ulkelerMap.containsKey("Netherlands"));




    }
}
