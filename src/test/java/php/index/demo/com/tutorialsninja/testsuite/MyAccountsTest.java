package php.index.demo.com.tutorialsninja.testsuite;

import org.testng.Assert;
import org.testng.annotations.Test;
import php.index.demo.com.tutorialsninja.pages.*;
import php.index.demo.com.tutorialsninja.testbase.BaseTest;

public class MyAccountsTest extends BaseTest {
    HomePage homePage = new HomePage();
    RegisterAccountPage registerAccountPage = new RegisterAccountPage();
    AccountCreatePage accountCreatePage = new AccountCreatePage();
    LogoutPage logoutPage = new LogoutPage();
    AccountPage accountPage = new AccountPage();
    LoginPage loginPage = new LoginPage();





    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully(){
        //1.1 Click on My Account Link.
        homePage.clickOnMyAccountLink();
        //1.2 Call the method “selectMyAccountOptions” method and pass the parameter “Register”
        homePage.selectMyAccountOptions("Register");
        //1.3 Verify the text “Register Account”
        Assert.assertEquals(registerAccountPage.getTextOfRegisterAccountText(), "Register Account", "Not On Register Page");
    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        //2.1 Click on My Account Link.
        homePage.clickOnMyAccountLink();
        //2.2 Call the method “selectMyAccountOptions” method and pass the parameter “Login”
        homePage.selectMyAccountOptions("Login");
        //2.3 Verify the text “Returning Customer”
        Assert.assertEquals(registerAccountPage.getTextOfReturningCustomerText(), "Returning Customer", "Login page not open");
    }
    @Test
    public void verifyThatUserRegisterAccountSuccessfully(){
        //3.1 Click on My Account Link.
        homePage.clickOnMyAccountLink();
        //3.2 Call the method “selectMyAccountOptions” method and pass the parameter “Register”
        homePage.selectMyAccountOptions("Register");
        //3.3 Enter First Name
        registerAccountPage.sendFirstName("Tesco");
        //3.4 Enter Last Name
        registerAccountPage.sendLastName("Extra");
        //3.5 Enter Email
        registerAccountPage.sendEmail("Tesco");
        //3.6 Enter Telephone
        registerAccountPage.sendTelephone("07896541230");
        //3.7 Enter Password
        registerAccountPage.sendPassword("Tesco1234");
        //3.8 Enter Password Confirm
        registerAccountPage.sendConfirmPassword("Tesco1234");
        //3.9 Select Subscribe Yes radio button
        registerAccountPage.clickOnSubscribeToNewsletter();
        //3.10 Click on Privacy Policy check box
        registerAccountPage.clickOnPrivacyPolicy();
        //3.11 Click on Continue button
        registerAccountPage.clickOnContinueAfterPrivacyButton();
        //3.12 Verify the message “Your Account Has Been Created!”
        Assert.assertEquals(accountCreatePage.getAccountCreationMessage(), "Your Account Has Been Created!", "account not created");
        //3.13 Click on Continue button
        accountCreatePage.clickOnContinueAfterAccountCreation();
        //3.14 Click on My Account Link.
        homePage.clickOnMyAccountLink();
        //3.15 Call the method “selectMyAccountOptions” method and pass the parameter “Logout”
        homePage.selectMyAccountOptions("Logout");
        //3.16 Verify the text “Account Logout”
        Assert.assertEquals(logoutPage.getTextFromLogout(), "Account Logout", "not logged out");
        //3.17 Click on Continue button
        accountPage.clickOnContinueAfterLogout();
        }

    @Test
    public void verifyThatUserShouldLoginAndLogoutSuccessfully() {
        //4.1 Click on My Account Link.
        homePage.clickOnMyAccountLink();
        //4.2 Call the method “selectMyAccountOptions” method and pass the parameter “Register”
        homePage.selectMyAccountOptions("Login");
        //4.3 enter email
        loginPage.sendEmail("iampatel@gmail.com");
        //enter password
        loginPage.sendPassword("HelloNum1");
        //click login
        loginPage.clickOnLogin();
        //verify if expected equals actual
        Assert.assertEquals(accountPage.getMyAccountText(), "My Account", "Not on my account");
        //click my account
        accountPage.clickOnMyAccountLink();
        //choose logout
        homePage.selectMyAccountOptions("Logout");
        //verify if logout has occurred
        Assert.assertEquals(logoutPage.getTextFromLogout(), "Account Logout", "Not logged out");
    }

    }


