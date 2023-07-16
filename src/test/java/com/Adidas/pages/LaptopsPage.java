package com.Adidas.pages;

import com.Adidas.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LaptopsPage {
    public LaptopsPage() {PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy (xpath = "//a[.=\"Sony vaio i5\"]")
    public WebElement sonyVaioi5;

    @FindBy (xpath = "//a[.=\"Dell i7 8gb\"]")
    public WebElement delli78Gb;

}
