package php.index.demo.com.tutorialsninja.pages;

import org.openqa.selenium.By;
import php.index.demo.com.tutorialsninja.utilities.Utility;

public class AccountPage extends Utility {

    By continueAfterLogout = By.xpath("//a[@class='btn btn-primary']");
    By myAccountText = By.xpath("//div[@id='content']/h2[text()='My Account']");
    By myAccountLink = By.xpath("//a[@title='My Account']");

    public void clickOnContinueAfterLogout() {
        clickOnElement(continueAfterLogout);
    }

    public String getMyAccountText() {
        return getTextFromElement(myAccountText);
    }

    public void clickOnMyAccountLink() {
        clickOnElement(myAccountLink);
    }
}
