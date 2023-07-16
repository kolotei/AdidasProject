package com.Adidas.pages;

import com.Adidas.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    public CartPage (){PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "//table//td[.=\"Dell i7 8gb\"]/..//a[.=\"Delete\"]")
    public WebElement deleteDeli;

    @FindBy(xpath = "//button[.=\"Place Order\"]")
    public WebElement placeOrder;

}
