package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class HotelMyCampPage {
    public HotelMyCampPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement firstLoginLink;

    @FindBy(xpath = "//input[@id='UserName']")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@id='Password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//input[@id='btnSubmit']")
    public WebElement loginButton;
    @FindBy(xpath = "//div[@class='validation-summary-errors']")
    public WebElement accessDeniedElement;
    @FindBy(xpath="//span[text()='ListOfUsers']")
    public WebElement basariliGirisYaziElementi;

    @FindBy(xpath = "//span[text()='Hotel Management']")
    public WebElement hotelManagementLink;

    @FindBy (xpath = "(//i[@class='icon-calendar'])[2]")
    public  WebElement hotelListLink;

    @FindBy (xpath = "//i[@class='fa fa-plus']")
    public WebElement addHotelLink;

    @FindBy(xpath = "//input[@id='Code']")
    public WebElement addHotelCodeBox;
    @FindBy(xpath = "//select[@id='IDGroup']")
    public WebElement addHotelDropdown;

    @FindBy(xpath = "//button[@id='btnSubmit']")
    public WebElement addHotelSavebtn;

    public void entryPage(){
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        firstLoginLink.click();
        usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
        passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        loginButton.click();
    }

    public void wait(int sec){
        try {
            Thread.sleep(sec*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



}
