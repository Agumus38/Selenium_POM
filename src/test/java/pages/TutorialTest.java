package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class TutorialTest {

 public    TutorialTest(){
       PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id=\"menu\"]/div[2]/ul/li[6]/a")
    public WebElement PhonesButton;

    @FindBy(tagName ="h4" )
public List<WebElement> products;

@FindBy(xpath ="//*[text()='Add to Cart']" )
public List<WebElement> addAllButton;

@FindBy(xpath = "(//button[@type='button'])[5]")
    public  WebElement cartTotalButton;

@FindBy(xpath ="//td[@class='text-left']" )
public List<WebElement> basketList;

@FindBy(xpath = "//td[.='$583.19']")
    public WebElement totalPrice;

























}
