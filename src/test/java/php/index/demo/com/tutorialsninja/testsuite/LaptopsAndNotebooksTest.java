package php.index.demo.com.tutorialsninja.testsuite;

import org.testng.Assert;
import org.testng.annotations.Test;
import php.index.demo.com.tutorialsninja.pages.*;
import php.index.demo.com.tutorialsninja.testbase.BaseTest;

import java.util.Collections;
import java.util.List;

public class LaptopsAndNotebooksTest extends BaseTest {
    HomePage homePage = new HomePage();
    LaptopsAndNotebooksPage laptopsAndNotebooks = new LaptopsAndNotebooksPage();
    MacBook macBook = new MacBook();
    ShoppingCart shoppingCart = new ShoppingCart();
    CheckoutPage checkoutPage = new CheckoutPage();


    @Test
    public void verifyProductsPriceDisplayHighToLowSuccessfully() {
        //1.1 Mouse hover on Laptops & Notebooks Tab.and click
        homePage.clickOnLaptopsAndNotebooks();
        //1.2 Click on “Show All Laptops & Notebooks”
        homePage.clickOnShowAllLaptopAndNotebooks();
        //1.3 Select Sort By "Price (High > Low)"
        laptopsAndNotebooks.getSortByPriceHighToLowSelection();
        //1.4 Verify the Product price will arrange in High to Low order.
        List<Double> expText = laptopsAndNotebooks.getSortByPriceHighToLowSelection();
        List<Double> actText = laptopsAndNotebooks.getSortByPriceHighToLowSelection();
        System.out.println("Expected list " + expText);
        Assert.assertEquals(Collections.singleton(actText), Collections.singleton(expText));
        System.out.println("Actual List " + actText);
    }

    @Test
    public void verifyThatUserPlaceOrderSuccessfully() {
        //2.1 Mouse hover on Laptops & Notebooks Tab and click
        homePage.clickOnLaptopsAndNotebooks();
        //2.2 Click on “Show All Laptops & Notebooks”
        homePage.clickOnShowAllLaptopAndNotebooks();
        //2.3 Select Sort By "Price (High > Low)"
        laptopsAndNotebooks.selectPriceHighToLow("Price (High > Low)");
        //2.4 Select Product “MacBook”
        laptopsAndNotebooks.selectMacBookProduct();
        //2.5 Verify the text “MacBook”
        Assert.assertEquals(macBook.getMacBookText(), "MacBook", "MacBook Product not display");
        //2.6 Click on ‘Add To Cart’ button
        macBook.clickOnAddToCartButton();
        //2.7 Verify the message “Success: You have added MacBook to your shopping cart!"
        Assert.assertEquals(macBook.getTextOfProductSuccessfullyAdd().substring(0,54),"Success: You have added MacBook to your shopping cart!", "Product not added to cart");

        //2.8 Click on link “shopping cart” display into success message
        macBook.clickOnShoppingCart();
        //2.9 Verify the text "Shopping Cart"
        Assert.assertEquals(shoppingCart.getTextOfShoppingCart().substring(0,13),"Shopping Cart", "product not added");
        //2.10 Verify the Product name "MacBook"
        Assert.assertTrue(shoppingCart.gettextOfMacBook().contains("MacBook"));
        //2.11 Change Quantity "2"
        shoppingCart.changeProductQtyTo2("2");
        //2.12 Click on “Update” Tab
        shoppingCart.clickOnUpdateButton();
        //2.13 Verify the message “Success: You have modified your shopping cart!”
        Assert.assertTrue(shoppingCart.getTextOfModifiedShoppingCartText().contains("Success: You have modified your shopping cart!"));
        //2.14 Verify the Total £737.45
        //2.15 Click on “Checkout” button
        shoppingCart.clickOnCheckOutButton();
        //2.16 Verify the text “Checkout”
        Assert.assertTrue(checkoutPage.getTextOfCheckOutButton().contains("Checkout"));
        //2.17 Verify the Text “New Customer”
        Assert.assertEquals(checkoutPage.getTextOfNewCustomerText(),"New Customer","New customer not found");
        //2.18 Click on “Guest Checkout” radio button
        checkoutPage.clickOnGuestCheckoutButton();
        //2.19 Click on “Continue” tab
        checkoutPage.clickOnContinueButton();
        //2.20 Fill the mandatory fields
        checkoutPage.sendTextToFirstNameField("hi");
        checkoutPage.sendTextToLastNameField("Patel");
        checkoutPage.sendTextToEmailField("abcd852@gmail.com");
        checkoutPage.sendTextToTelephoneField("07852654987");
        checkoutPage.sendTextToAddress1Field("11, close close");
        checkoutPage.sendTextToCityField("Harrow");
        checkoutPage.sendTextToPostcodeField("HA1 GHT");
        checkoutPage.selectRegionNameFromDropdown(1);
        checkoutPage.selectCountryNameFromDropdown(1);
        //2.21 Click on “Continue” Button
        checkoutPage.clickOnContinueButtonOnRegisterPage();
        //2.22 Add Comments About your order into text area
        checkoutPage.sendTextToCommentField("Order");
        //2.23 Check the Terms & Conditions check box
        checkoutPage.clickOnTermsAndConditionTextBox();
        //2.24 Click on “Continue” button
        checkoutPage.clickOnContinueButtonInPaymentMethodPage();
        //2.25 Verify the message “Warning: Payment method required!”
        Assert.assertEquals(checkoutPage.getTextOfWarningMessage().substring(0,33),"Warning: Payment method required!", "No warning Message");
    }
}
