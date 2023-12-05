package php.index.demo.com.tutorialsninja.pages;

import org.openqa.selenium.By;
import php.index.demo.com.tutorialsninja.utilities.Utility;

public class CheckoutPage extends Utility {
    By checkOutText = By.xpath("//h1[normalize-space()='Checkout']");

    By newCustomerText = By.xpath("//div[@class='col-sm-6']/h2[text()='New Customer']");

    By guestCheckoutButton = By.xpath("//input[@value='guest']");

    By continueButton = By.id("button-account");

    By firstName = By.id("input-payment-firstname");
    By lastName = By.id("input-payment-lastname");
    By email = By.id("input-payment-email");
    By telephone = By.id("input-payment-telephone");
    By address1 = By.id("input-payment-address-1");
    By city = By.id("input-payment-city");
    By postcode = By.id("input-payment-postcode");
    By country = By.xpath("//select[@id='input-payment-country']");
    By region = By.xpath("//select[@id='input-payment-zone']");
    By continueButtonOnRegisterPage = By.xpath("//div[@class='buttons']/div[@class='pull-right']/input[@value='Continue']");
    By addCommentField = By.xpath("//div[@class='panel-body']/p[2]/textarea[@name='comment']");
    By termsAndConditionTextBox = By.xpath("//input[@name='agree']");
    By continueButtonInPaymentMethodPage = By.xpath("//input[@id='button-payment-method']");
    By warningMessage = By.xpath("//div[@class='alert alert-danger alert-dismissible']");

    public String getTextOfCheckOutButton() {
        return getTextFromElement(checkOutText);
    }

    public String getTextOfNewCustomerText() {
        return getTextFromElement(newCustomerText);
    }

    public void clickOnGuestCheckoutButton() {
        clickOnElement(guestCheckoutButton);
    }

    public void clickOnContinueButton() {
        clickOnElement(continueButton);
    }

    public void sendTextToFirstNameField(String name) {
        sendTextToElement(firstName, name);
    }

    public void sendTextToLastNameField(String name) {
        sendTextToElement(lastName, name);
    }

    public void sendTextToEmailField(String name) {
        sendTextToElement(email, name);
    }

    public void sendTextToTelephoneField(String name) {
        sendTextToElement(telephone, name);
    }

    public void sendTextToAddress1Field(String name) {
        sendTextToElement(address1, name);
    }

    public void sendTextToCityField(String name) {
        sendTextToElement(city, name);
    }

    public void sendTextToPostcodeField(String name) {
        sendTextToElement(postcode, name);
    }

    public void selectCountryNameFromDropdown(int number) {
        selectByIndexFromDropDown(country, number);
    }

    public void selectRegionNameFromDropdown(int num) {
        selectByIndexFromDropDown(region, num);
    }

    public void clickOnContinueButtonOnRegisterPage() {
        clickOnElement(continueButtonOnRegisterPage);
    }

    public void sendTextToCommentField(String text) {
        sendTextToElement(addCommentField, text);
    }

    public void clickOnTermsAndConditionTextBox() {
        clickOnElement(termsAndConditionTextBox);
    }

    public void clickOnContinueButtonInPaymentMethodPage() {
        clickOnElement(continueButtonInPaymentMethodPage);
    }

    public String getTextOfWarningMessage() {
        return getTextFromElement(warningMessage);
    }
}
