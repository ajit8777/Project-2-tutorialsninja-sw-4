package php.index.demo.com.tutorialsninja.pages;

import org.openqa.selenium.By;
import php.index.demo.com.tutorialsninja.utilities.Utility;

public class MacBook extends Utility {

    By macBookText = By.xpath("//h1[contains(text(),'MacBook')]");
    By addToCart = By.xpath("//button[@id='button-cart']");
    By productAddingText = By.xpath("//div[@class='alert alert-success alert-dismissible']");
    By shoppingCartButton = By.xpath("//a[contains(text(),'shopping cart')]");

    public String getMacBookText(){
        return getTextFromElement(macBookText);
    }
    public void clickOnAddToCartButton(){
        clickOnElement(addToCart);
    }
    public String getTextOfProductSuccessfullyAdd(){
        return getTextFromElement(productAddingText);
    }
    public void clickOnShoppingCart(){
        clickOnElement(shoppingCartButton);
    }
}
