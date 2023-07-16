package com.Adidas.pages;

import com.Adidas.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoblazePage {

    public DemoblazePage () {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="login2")
    public WebElement loginTab;

    @FindBy(id="loginusername")
    public WebElement loginUserName;

    @FindBy(id="loginpassword")
    public WebElement loginPassword;

    @FindBy(xpath = "//button[.='Log in']")
    public WebElement loginButton;

    @FindBy(xpath = "//a[@id='nameofuser']")
    public WebElement welcomeTab;

    @FindBy(xpath = "//a[@onclick=\"byCat('phone')\"]")
    public WebElement categoryPhone;

    @FindBy(xpath = "//a[@onclick=\"byCat('notebook')\"]")
    public WebElement categoryLaptop;

    @FindBy(xpath = "//a[@onclick=\"byCat('monitor')\"]")
    public WebElement categoryMonitors;

    @FindBy(id ="cartur")
    public WebElement cart;

//    public void loginAsUser () {
//        loginUserName.sendKeys(ConfigurationReader.getProperty("username"));
//        loginPassword.sendKeys(ConfigurationReader.getProperty("password"));
//        loginButton.click();
//    }

    public void loginAsUser (String userName, String password) {
        loginUserName.sendKeys(userName);
        loginPassword.sendKeys(password);
        loginButton.click();
    }

}
