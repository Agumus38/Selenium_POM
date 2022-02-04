package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FacebookPage {

 public    FacebookPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath ="//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")
    public WebElement facebookNewAccount;

    @FindBy(xpath = "//button[@title='Allow All Cookies']")
    public WebElement facebookCookies;


    @FindBy(name="email")
    public WebElement emailBox;

    @FindBy(id="pass")
    public WebElement passBox;

    @FindBy(name="login")
    public WebElement loginButton;

    @FindBy(className = "_9ay7")
    public WebElement girilemediYazisiElementi;



}
