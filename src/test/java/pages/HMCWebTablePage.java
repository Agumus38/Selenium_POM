package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HMCWebTablePage {

   public HMCWebTablePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
@FindBy(xpath = "//tbody//tr[1]//td")
    public List<WebElement> headerBırıncıSatırDatalar;

   @FindBy(xpath = "//tbody")
    public WebElement tumBodyWebElement;

    @FindBy(xpath = "//tbody//td")
    public List<WebElement> tumBodyDatalarıList;


    @FindBy(xpath = "//tbody//tr")
    public WebElement satırlarList;

    public WebElement satırYazdır(int satırNo){
        String satırDinamikXpath="//tbody//tr["+satırNo+"]";
WebElement satırElement=Driver.getDriver().findElement(By.xpath(satırDinamikXpath));

return  satırElement;
    }


    public String  hucreWebelementGetir(int satir, int sutun) {
        // 2.satirin 4.datasi   //tbody//tr[2]//td[4]
        // 4.satirin 5.datasi   //tbody//tr[4]//td[5]

        String dinamikHucreXpath="//tbody//tr["+ satir  +"]//td["+ sutun  +"]";
        WebElement istenenHucreElementi=Driver.getDriver().findElement(By.xpath(dinamikHucreXpath));
        String hucreDatasi=istenenHucreElementi.getText();

        return hucreDatasi;
    }


    public void sutunYazdır(int sutun) {



    }






}
