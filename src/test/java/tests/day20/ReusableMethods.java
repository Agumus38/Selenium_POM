package tests.day20;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ReusableMethods {
    public  static Cell hucreGetir(String path,String sayfaIsmı,int satırIndex, int hucreIndex){
        Cell cell=null;
        try {
            FileInputStream fileInputStream=new FileInputStream(path);
            Workbook workbook= WorkbookFactory.create(fileInputStream);
            cell=workbook.getSheet(sayfaIsmı).getRow(satırIndex).getCell(hucreIndex);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return cell;
    }
public static Map<String,String> mapOlustur(String path, String sayfaAdı) throws FileNotFoundException {
        Map<String,String> excelMap=new TreeMap<>();
        Workbook workbook = null;


    try {
        FileInputStream fis=new FileInputStream(path);
        workbook=WorkbookFactory.create(fis);
    } catch (IOException e) {
        e.printStackTrace();
    }

    int satırSayısı=workbook.getSheet(sayfaAdı).getLastRowNum();
String key="";
String value="";


    for (int i = 0; i <satırSayısı ; i++) {
        key=workbook.getSheet(sayfaAdı).getRow(i).getCell(0).toString();
        value=workbook.getSheet(sayfaAdı).getRow(i).getCell(1).toString()+
                ", "+workbook.getSheet(sayfaAdı).getRow(i).getCell(2).toString()+
                ","+workbook.getSheet(sayfaAdı).getRow(i).getCell(3).toString();
        excelMap.put(key,value);

    }


    return excelMap;
}

}
