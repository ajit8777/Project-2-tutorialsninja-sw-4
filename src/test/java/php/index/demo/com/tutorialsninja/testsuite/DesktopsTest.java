package php.index.demo.com.tutorialsninja.testsuite;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import php.index.demo.com.tutorialsninja.pages.DesktopPage;
import php.index.demo.com.tutorialsninja.pages.HomePage;
import php.index.demo.com.tutorialsninja.pages.ProductPage;
import php.index.demo.com.tutorialsninja.pages.ShoppingCart;
import php.index.demo.com.tutorialsninja.testbase.BaseTest;

import java.util.List;

public class DesktopsTest extends BaseTest {
    HomePage homePage = new HomePage();
    TopMenuTest topMenuTest = new TopMenuTest();
    DesktopPage desktopPage = new DesktopPage();
    ProductPage productPage = new ProductPage();
    ShoppingCart shoppingCart = new ShoppingCart();

    @Test
    public void verifyProductArrangeInAlphaBaticalOrder() throws InterruptedException {

        //1.1 Mouse hover on Desktops Tab.and click
        homePage.mouseHoverToDesktopAndClick();
        //1.2 Click on “Show All Desktops”
        topMenuTest.selectMenu("Show AllDesktops");
        Thread.sleep(7000);
        //1.3 Select Sort By position "Name: Z to A"
        List<String> expectedOrder = desktopPage.expectedList();
        List<String> actualOrder = desktopPage.getSortByAlphabeticalSelection();
        System.out.println("expected: " + expectedOrder);
        System.out.println("actual: " + actualOrder);
        //1.4 Verify the Product will arrange in Descending order.
        Assert.assertEquals(actualOrder, expectedOrder, "Product not sorted into Z to A order");

    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        //2.1 Mouse hover on Currency Dropdown and click
        homePage.clickOnCurrency();
        //2.2 Mouse hover on £Pound Sterling and click
        homePage.selectPoundSterlingFromCurrencyDropdown();
        //2.3 Mouse hover on Desktops Tab.
        homePage.mouseHoverToDesktopAndClick();
        //2.4 Click on “Show All Desktops”
        topMenuTest.selectMenu("Show AllDesktops");
        //2.5 Select Sort By position "Name: A to Z"
        desktopPage.sortingProductNameAToZ("Name (A - Z)");
        //2.6 Select product “HP LP3065”
        productPage.clickOnProductHPLP3065();
        //2.7 Verify the Text "HP LP3065"
        String expectedText = "HP LP3065";
        String actualText = productPage.getProductHPLP3065Text();
        Assert.assertEquals(actualText, expectedText, "HP LP3065 Product not display");
        //2.8 Select Delivery Date "2023-11-27"
        String year = "2023";
        String month = "November";
        String date = "27";
        productPage.clickOnCalenderField();
        while (true) {
            String monthAndYear = productPage.getTextOfMonthAndYear();
            String[] arr = monthAndYear.split(" ");
            String mon = arr[0];
            String yer = arr[1];
            if (mon.equalsIgnoreCase(month) && yer.equalsIgnoreCase(year)) {
                break;
            } else {
                productPage.clickOnNext();
            }
        }
        List<WebElement> allDates = productPage.selectDateFromCalender();
        for (WebElement e : allDates) {
            if (e.getText().equalsIgnoreCase(date)) {
                e.click();
                break;
            }
        }
        //2.9.Enter Qty "1” using Select class.
        productPage.enterQty1("1");
        //2.10 Click on “Add to Cart” button
        productPage.clickOnAddToCart();
        //2.11 Verify the Message “Success: You have added HP LP3065 to your shopping cart!”
        String expectedTextOfCart = "Success: You have added HP LP3065 to your shopping cart!";
        String actualTextOfCart = productPage.getTextOfCart().substring(0,56);
        Assert.assertEquals(actualTextOfCart, expectedTextOfCart, "Product not added to cart");
        Thread.sleep(3000);
        //2.12 Click on link “shopping cart” display into success message
        productPage.clickOnShoppingCart();
        //2.13 Verify the text "Shopping Cart"
        String expectedText3 = "Shopping Cart";
        String actualText3 = shoppingCart.getTextOfShoppingCart().substring(0,13);
        Assert.assertEquals(actualText3,expectedText3,"text not matching");
        //2.14 Verify the Product name "HP LP3065"
        Assert.assertEquals("HP LP3065", shoppingCart.getTextOfProduct(), "Product name not matched");
        //2.15 Verify the Delivery Date "2023-11-27"
        Assert.assertTrue(shoppingCart.getTextOfDate().contains("2023-11-27"), "Delivery date not matched");
        //2.16 Verify the Model "Product21"
        Assert.assertEquals( shoppingCart.getTextModelName(), "Product 21", "Model not matched" );
        //2.17 Verify the Todat "£74.73"
        String expectedText4 = "£74.73";
        String actualText4 = shoppingCart.getTextTotalPrice();
        Assert.assertEquals(actualText4, expectedText4, "total not matched");

    }
}

