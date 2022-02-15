package tests.practice;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TutorialTest;
import utilities.ConfigReader;
import utilities.Driver;

public class Q3 {


//~ url'ye gidin: "http://tutorialsninja.com/demo/index.php?route=common/home"
//~ Phones & PDAs e tıklayın
//~ telefonların marka adını al
//~ tüm elemanlar için ekle düğmesine tıklayın
//~ siyah toplam eklenen sepet düğmesine tıklayın
//~ listenin isimlerini sepetten al
//~ görüntülenen listeden ve sepet listesinden isimleri karşılaştırın
//~ goruntulenen listede toplam fiyatin $583.19 oldugunu test edin


    @Test
    public void test01(){
        TutorialTest tutorialTest=new TutorialTest();
        Driver.getDriver().get(ConfigReader.getProperty("TutorialUrl"));
tutorialTest.PhonesButton.click();

        for (WebElement each : tutorialTest.products
             ) {
            System.out.println(each.getText());
        }

tutorialTest.addAllButton.stream().forEach(x->x.click());

        tutorialTest.cartTotalButton.click();

        for ( WebElement each :tutorialTest.basketList
             ) {
            System.out.println(each.getText());
        }


       // Assert.assertEquals(tutorialTest.basketList,tutorialTest.products);
        //  List<String> goruntulenenUrunler = p3_tutorialPage.products.stream().map(WebElement::getText).collect(Collectors.toCollection(ArrayList::new));
        //        List<String> sepettekiUrunler = p3_tutorialPage.sepettekiUrunler.stream().map(WebElement::getText).collect(Collectors.toCollection(ArrayList::new));
        //        Collections.sort(goruntulenenUrunler);
        //        Collections.sort(sepettekiUrunler);
        //
        //        Assert.assertEquals(goruntulenenUrunler,sepettekiUrunler);

        Assert.assertEquals(tutorialTest.totalPrice.getText(),"$583.19");















    }


}
