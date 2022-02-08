package tests.day20;

import org.testng.annotations.Test;
import utilities.ReusableMethods;

import java.io.FileNotFoundException;

public class C05_ExceliMapeYukleme {
    @Test
    public void test01() throws FileNotFoundException {

        String path="src/test/java/resources/ulkeler.xlsx";
        String sayfaAdı="Sayfa1";

        System.out.println(ReusableMethods.mapOlustur(path, sayfaAdı));

    }
}
