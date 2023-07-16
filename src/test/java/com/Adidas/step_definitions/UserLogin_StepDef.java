package com.Adidas.step_definitions;

import com.Adidas.pages.CartPage;
import com.Adidas.pages.DemoblazePage;
import com.Adidas.pages.LaptopsPage;
import com.Adidas.pages.SonyVaioi5Page;
import com.Adidas.utilities.ConfigurationReader;
import com.Adidas.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class UserLogin_StepDef {

    DemoblazePage homePage = new DemoblazePage();
    LaptopsPage laptopsPage = new LaptopsPage();
    SonyVaioi5Page sonyVaioi5Page = new SonyVaioi5Page();
    CartPage cartPage = new CartPage();

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));


    @Given("I am on the homepage")
    public void i_am_on_the_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @And ("I go to login page")
    public void i_go_to_login_page() {
        homePage.loginTab.click();
    }

    @When("I enter username {string}")
    public void i_enter_username(String username) {
        homePage.loginUserName.sendKeys(username);
    }

    @When("I enter password {string}")
    public void i_enter_password(String password) {
        homePage.loginPassword.sendKeys(password);
    }

    @When("click the sign in button")
    public void click_the_sign_in_button() {
        wait.until(ExpectedConditions.visibilityOf(homePage.loginButton));
        homePage.loginButton.click();
    }

    @Then("dashboard should be displayed")
    public void dashboard_should_be_displayed() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(homePage.welcomeTab));
        Assert.assertTrue("User was not logged", homePage.welcomeTab.isDisplayed());
    }

    @Given("I navigate to the Laptop Category")
    public void I_navigate_to_the_Laptop_Category() {
        homePage.categoryLaptop.click();
    }

    @And("Navigate to Sony vaio i5")
    public void navigate_to_Sony_vaio_i5() {
        wait.until(ExpectedConditions.visibilityOf(laptopsPage.sonyVaioi5));
        laptopsPage.sonyVaioi5.click();
    }
    @And("Navigate to Dell i7 8gb")
    public void navigate_to_Dell_i7_8gb() {
        laptopsPage.delli78Gb.click();
    }

    @And("click on Add to cart")
    public void click_on_Add_to_cart(){
        sonyVaioi5Page.addToCart.click();
    }
    @Then("Accept pop up confirmation")
    public void accept_pop_up_confirmation() {
        wait.until(ExpectedConditions.alertIsPresent());
        Driver.getDriver().switchTo().alert().accept();
        Driver.getDriver().switchTo().parentFrame();
    }

    @Given("Navigate to Cart")
    public void navigate_to_Cart () {
        homePage.cart.click();
    }
    @Then("Delete {string} from cart")
    public void delete_from_cart(String Item) {
        wait.until(ExpectedConditions.visibilityOf(cartPage.deleteDeli));
        cartPage.deleteDeli.click();
    }

    @Given("Click on Place order")
    public void click_on_Place_order (){
        cartPage.placeOrder.click();
    }
    @Given("Fill in all web form fields")
    public void fill_in_all_web_form_fields() {

    }
    @Then("Click on Purchase")
    public void click_on_Purchase() {

    }

    @Given("Capture and log purchase Id and Amount")
    public void capture_and_log_purchase_id_and_amount() {

    }
    @Given("Assert purchase amount equals expected")
    public void assert_purchase_amount_equals_expected() {

    }
    @Then("Click on Ok")
    public void click_on_Ok () {

    }

}
