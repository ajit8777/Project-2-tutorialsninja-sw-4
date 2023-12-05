package php.index.demo.com.tutorialsninja.pages;

import org.openqa.selenium.By;
import php.index.demo.com.tutorialsninja.utilities.Utility;

public class LoginPage extends Utility {

    By email = By.name("email");
    By password = By.name("password");
    By loginButton = By.xpath("//input[@value='Login']");

    public void sendEmail(String inputEmail) {
        sendTextToElement(email, inputEmail);
    }

    public void sendPassword(String inputPassword) {
        sendTextToElement(password, inputPassword);
    }

    public void clickOnLogin() {
        clickOnElement(loginButton);
    }
}
