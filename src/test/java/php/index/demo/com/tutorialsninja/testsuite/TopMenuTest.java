package php.index.demo.com.tutorialsninja.testsuite;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import php.index.demo.com.tutorialsninja.pages.HomePage;
import php.index.demo.com.tutorialsninja.testbase.BaseTest;

public class TopMenuTest extends BaseTest {
    HomePage homePage = new HomePage();

    public void selectMenu(String menu) {
        homePage.getAllTopManuName();
        try {
            for (WebElement element : homePage.getAllTopManuName()) {
                if (element.getText().equalsIgnoreCase(menu)) {
                    element.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            homePage.getAllTopManuName();
        }
    }

    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        //1.1 Mouse hover on “Desktops” Tab and click
        homePage.clickOnDesktop();
        //1.2 call selectMenu method and pass the menu = “Show AllDesktops”
        selectMenu("Show AllDesktops");
        //1.3 Verify the text ‘Desktops’
        String expectedText = "Desktops";
        String actualText = homePage.getDesktopText();
        Assert.assertEquals(expectedText, actualText, "Not navigate to Desktop page");
    }

    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully() {
        //2.1 Mouse hover on “Laptops & Notebooks” Tab and click
        homePage.clickOnLaptopsAndNotebooks();
        //2.2 call selectMenu method and pass the menu = “Show AllLaptops & Notebooks”
        selectMenu("Show AllLaptops & Notebooks");
        //2.3 Verify the text ‘Laptops & Notebooks’
        String expectedText1 = "Laptops & Notebooks";
        String actualText1 =homePage.getLaptopsAndNotebooksText();
        Assert.assertEquals(actualText1, expectedText1, "Not navigate to Laptops and Notebooks page Laptops & Notebooks");
    }

    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully(){

        //3.1 Mouse hover on “Components” Tab and click
        homePage.clickOnComponents();
        //3.2 call selectMenu method and pass the menu = “Show AllComponents”
        selectMenu("Show AllComponents");
        //3.3 Verify the text ‘Components’
        String expectedText3 = "Components";
        String actualText3 = homePage.getComponentsText();
        Assert.assertEquals(actualText3, expectedText3, "Not navigate to Laptops and Notebooks page Components");
    }
}



