package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DemoGuruPage {

public DemoGuruPage(){
    PageFactory.initElements(Driver.getDriver(),this);

}

@FindBy(xpath = "//a[contains(text(),'BANK')]")
    public WebElement BankButton;

    @FindBy(xpath = "//a[contains(text(),'SALES')]")
    public WebElement SalesButton;

    @FindBy(xpath = "//a[contains(text(),'LOAN')]")
    public WebElement LoanButton;

    @FindBy (xpath = "(//a[contains(text(),'5000')])[2]")
    public WebElement first5k;

    @FindBy (xpath = "(//a[contains(text(),'5000')])[4]")
    public WebElement second5k;

    @FindBy(xpath = "(//li[@class='placeholder'])[1]")
    public  WebElement DebitAccount;

    @FindBy(xpath = "(//li[@class='placeholder'])[2]")
    public  WebElement DebitAmount;

    @FindBy(xpath = "(//li[@class='placeholder'])[3]")
    public WebElement CreditAccount;

    @FindBy(xpath = "(//li[@class='placeholder'])[4]")
    public WebElement CreditAmount;




}
