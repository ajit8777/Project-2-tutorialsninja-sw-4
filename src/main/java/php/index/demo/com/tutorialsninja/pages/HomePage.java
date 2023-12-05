package php.index.demo.com.tutorialsninja.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import php.index.demo.com.tutorialsninja.utilities.Utility;

import java.util.List;

public class HomePage extends Utility {

    By listOfWebElememts = By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*");

    By desktop = By.linkText("Desktops");

    By desktopText = By.xpath("//h2[contains(text(),'Desktops')]");

    By laptopsAndNotebooks = By.linkText("Laptops & Notebooks");

    By laptopsAndNotebooksText = By.xpath("//h2[contains(text(),'Laptops & Notebooks')]");

    By components = By.linkText("Components");

    By componentsText = By.xpath("//h2[contains(text(),'Components')]");

    By currency = By.xpath("//span[contains(text(),'Currency')]");

    By PoundSterling = By.xpath("//button[normalize-space()='£Pound Sterling']");

    By showAllLaptopAndNotebooks = By.xpath("//a[normalize-space()='Show AllLaptops & Notebooks']");

    By myAccountLink = By.xpath("//span[normalize-space()='My Account']");

    By listOfMyAccountElement = By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']/li");


    public List<WebElement> getAllTopManuName() {
        List<WebElement> getListOfElements = driver.findElements(listOfWebElememts);
        return getListOfElements;
    }

    public void clickOnDesktop() {
        mouseHoverToElementAndClick(desktop);
    }

    public String getDesktopText() {
        return getTextFromElement(desktopText);
    }

    public void clickOnLaptopsAndNotebooks() {
        mouseHoverToElementAndClick(laptopsAndNotebooks);
    }

    public String getLaptopsAndNotebooksText() {
        return getTextFromElement(laptopsAndNotebooksText);
    }

    public void clickOnComponents() {
        mouseHoverToElementAndClick(components);
    }

    public String getComponentsText() {
        return getTextFromElement(componentsText);
    }

    public void mouseHoverToDesktopAndClick() {
        mouseHoverToElementAndClick(desktop);
    }

    public void clickOnCurrency() {
        clickOnElement(currency);
    }

    public void selectPoundSterlingFromCurrencyDropdown() {
        mouseHoverToElement(PoundSterling);
    }

    public void clickOnShowAllLaptopAndNotebooks() {
        mouseHoverToElementAndClick(showAllLaptopAndNotebooks);
    }

    public void clickOnMyAccountLink() {
        clickOnElement(myAccountLink);
    }

    public void selectMyAccountOptions(String option) {
        List<WebElement> myAccountList = getListOfElements(listOfMyAccountElement);
        for (WebElement option1 : myAccountList){
            if (option1.getText().equals(option)){
                option1.click();
                break;
            }
        }
    }
}
