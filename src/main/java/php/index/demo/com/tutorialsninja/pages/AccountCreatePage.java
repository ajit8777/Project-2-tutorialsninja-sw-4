package php.index.demo.com.tutorialsninja.pages;

import org.openqa.selenium.By;
import php.index.demo.com.tutorialsninja.utilities.Utility;

public class AccountCreatePage extends Utility {

    By accountCreationText = By.xpath("//div[@id='content']/h1");
    By continueAfterAccountCreation = By.xpath("//a[text()='Continue']");

    public String getAccountCreationMessage(){
        return getTextFromElement(accountCreationText);

    }

    public void clickOnContinueAfterAccountCreation(){
        clickOnElement(continueAfterAccountCreation);
    }
}
