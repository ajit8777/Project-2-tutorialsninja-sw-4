package php.index.demo.com.tutorialsninja.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import php.index.demo.com.tutorialsninja.utilities.Utility;

import java.util.List;

public class ProductPage extends Utility {

    By productHPLP3065 = By.xpath("//a[contains(text(),'HP LP3065')]");

    By productHPLP3065Text = By.xpath("//h1[contains(text(),'HP LP3065')]");

    By calenderField = By.xpath("//div[@class = 'input-group date']//button");

    By monthAndYear = By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='picker-switch']");

    By next = By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='next']");

    By selectDate = By.xpath("//div[@class = 'datepicker']/div[1]//tbody/tr/td[@class = 'day']");

    By enterQty1 = By.name("quantity");

    By addToCart = By.xpath("//button[@id='button-cart']");

    By textOfCart = By.cssSelector("body:nth-child(2) div.container:nth-child(4) > div.alert.alert-success.alert-dismissible");

    By shoppingCart = By.xpath("//a[normalize-space()='shopping cart']");

    public void clickOnProductHPLP3065() {
        clickOnElement(productHPLP3065);
    }

    public String getProductHPLP3065Text() {
        return getTextFromElement(productHPLP3065Text);
    }

    public void clickOnCalenderField() {
        clickOnElement(calenderField);
    }

    public String getTextOfMonthAndYear() {
        return getTextFromElement(monthAndYear);
    }
    public void clickOnNext() {
        clickOnElement(next);
    }
    public List<WebElement> selectDateFromCalender(){
        return getListOfElements(selectDate);
    }
    public void enterQty1(String qty){

        sendTextToElement(enterQty1, qty);
    }
    public void clickOnAddToCart(){
        clickOnElement(addToCart);
    }
    public String getTextOfCart() {
        return getTextFromElement(textOfCart);
    }
    public void clickOnShoppingCart() {
        clickOnElement(shoppingCart);
    }
}
