package com.Adidas.pages;

import com.Adidas.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SonyVaioi5Page {

    public SonyVaioi5Page() {PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy (xpath = "//a[.='Add to cart']")
    public WebElement addToCart;

}
