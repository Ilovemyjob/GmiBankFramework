package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmiBankPage {

    public GmiBankPage() {
        PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement dropDown;

    @FindBy(linkText = "Register")
    public WebElement registerButton;



    @FindBy(id = "ssn")
    public WebElement ssnBox;

    @FindBy(id = "firstname")
    public WebElement firstNameBox;

    @FindBy(id = "lastname")
    public WebElement lastNameBox;

    @FindBy(id = "address")
    public WebElement addressBox;

    @FindBy(id = "mobilephone")
    public WebElement mobilePhoneBox;

    @FindBy(id = "username")
    public WebElement usernameBox;

    @FindBy(id = "email")
    public WebElement emailBox;

}





