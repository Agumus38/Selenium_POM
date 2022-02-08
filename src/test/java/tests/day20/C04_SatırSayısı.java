package tests.day20;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class C04_SatırSayısı {
    @Test
    public void test01() throws IOException {
//ulkeler excelındekı Sayfa1 ve Sayfa2
        String path="src/test/java/resources/ulkeler.xlsx";
        FileInputStream fis=new FileInputStream(path);
        Workbook workbook= WorkbookFactory.create(fis);

        int sayfa1SatırSayısı=workbook.getSheet("Sayfa1").getLastRowNum();
        int sayfa1FizikiKullanılanSatırSayısı=workbook.getSheet("Sayfa1").getPhysicalNumberOfRows();

        System.out.println("1.sayfa satır sayısı: "+sayfa1SatırSayısı);
        System.out.println("1.sayfa fiziki kullanılan satır sayısı: "+sayfa1FizikiKullanılanSatırSayısı);

        int sayfa2SatırSayısı=workbook.getSheet("Sayfa2").getLastRowNum();
        int sayfa2FizikiKullanılanSatırSayısı=workbook.getSheet("Sayfa2").getPhysicalNumberOfRows();

        System.out.println("2.sayfa satır sayısı: "+sayfa2SatırSayısı);
        System.out.println("2.sayfa fiziki kullanılan satır sayısı: "+sayfa2FizikiKullanılanSatırSayısı);
    }




}
