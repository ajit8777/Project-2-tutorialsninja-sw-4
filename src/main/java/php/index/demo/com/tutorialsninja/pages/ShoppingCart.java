package php.index.demo.com.tutorialsninja.pages;

import org.openqa.selenium.By;
import php.index.demo.com.tutorialsninja.utilities.Utility;

public class ShoppingCart extends Utility {

    By shoppingCart = By.xpath("//div[@id='content']//h1");

    By textOfProduct = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a");

    By textOfDate = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/small[1]");

    By modelName = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[3]");

    By totalPrice = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[6]");

    By macBookText = By.xpath("//body[1]/div[2]/div[1]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[1]");

    By changeQty = By.xpath("//input[contains(@name, 'quantity')]");

    By updateButton = By.xpath("//button[contains(@data-original-title, 'Update')]");

    By modifiedShoppingCartText = By.xpath("//div[@id='checkout-cart']/div[1]");

    By checkOutButton = By.xpath("//a[@class='btn btn-primary']");




    public String getTextOfShoppingCart(){
        return getTextFromElement(shoppingCart);
    }
    public String getTextOfProduct(){
        return getTextFromElement(textOfProduct);
    }
    public String getTextOfDate(){
        return getTextFromElement(textOfDate);
    }
    public String getTextModelName(){
        return getTextFromElement(modelName);
    }
    public String getTextTotalPrice(){
        return getTextFromElement(totalPrice);
    }
    public String gettextOfMacBook(){
       return getTextFromElement(macBookText);
    }
    public void changeProductQtyTo2(String number){
        sendTextToElement(changeQty, number);
    }
    public void clickOnUpdateButton(){
        clickOnElement(updateButton);
    }

    public String getTextOfModifiedShoppingCartText(){
        return getTextFromElement(modifiedShoppingCartText);
    }
    public void clickOnCheckOutButton(){
        clickOnElement(checkOutButton);
    }
}
