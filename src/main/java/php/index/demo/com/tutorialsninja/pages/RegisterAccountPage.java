package php.index.demo.com.tutorialsninja.pages;

import org.openqa.selenium.By;
import php.index.demo.com.tutorialsninja.utilities.Utility;

import java.util.Random;

public class RegisterAccountPage extends Utility {
    By registerAccountText = By.xpath("//div[@id='content']/h1");
    By returningCustomerText = By.xpath("//div[@class='well']/h2[text()='Returning Customer']");
    By firstName = By.name("firstname");
    By lastName = By.name("lastname");
    By email = By.name("email");
    By telephone = By.name("telephone");
    By password = By.name("password");
    By confirmPassword = By.name("confirm");
    By newsletter = By.name("newsletter");
    By privacyPolicy = By.name("agree");
    By continueAfterPrivacyButton = By.xpath("//input[@type='submit']");

    public String getTextOfRegisterAccountText(){
        return getTextFromElement(registerAccountText);
    }
    public String getTextOfReturningCustomerText(){
        return getTextFromElement(returningCustomerText);
    }
    public void sendFirstName(String inputFirstName) {
        sendTextToElement(firstName, inputFirstName);
    }

    public void sendLastName(String inputLastName) {
        sendTextToElement(lastName, inputLastName);
    }

    public void sendEmail(String text) {
        Random random = new Random();
        int number = random.nextInt(1000);
        sendTextToElement(email, text + number + "@gmail.com");
    }

    public void sendTelephone(String inputTelephone) {
        sendTextToElement(telephone, inputTelephone);
    }

    public void sendPassword(String inputPassword) {
        sendTextToElement(password, inputPassword);
    }

    public void sendConfirmPassword(String inputConfirmPassword) {
        sendTextToElement(confirmPassword, inputConfirmPassword);
    }

    public void clickOnSubscribeToNewsletter() {
        clickOnElement(newsletter);
    }

    public void clickOnPrivacyPolicy() {
        clickOnElement(privacyPolicy);
    }

    public void clickOnContinueAfterPrivacyButton() {
        clickOnElement(continueAfterPrivacyButton);
    }
}
