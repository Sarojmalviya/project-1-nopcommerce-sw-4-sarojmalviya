package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.CellPhones;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicsTest extends TestBase {
    HomePage homePage = new HomePage();
    CellPhones cellPhones = new CellPhones();
    RegisterPage registerPage = new RegisterPage();
    @Test
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully(){
        //1.1 Mouse Hover on “Electronics” Tab
        homePage.clickOnElectronicsLink();
        //1.2 Mouse Hover on “Cell phones” and click
        cellPhones.cellPhones();
        //1.3 Verify the text “Cell phones”
        String expectedText = "Cell phones";
        String actualText = cellPhones.verifyCellPhone();
        Assert.assertEquals(expectedText,actualText);
    }
    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully(){
        //2.1 Mouse Hover on “Electronics” Tab
        homePage.clickOnElectronicsLink();
        //2.2 Mouse Hover on “Cell phones” and click
        cellPhones.cellPhones();
        //2.3 Verify the text “Cell phones”
        String expectedText = "Cell phones";
        String actualText = cellPhones.verifyCellPhone();
        Assert.assertEquals(expectedText,actualText);
        //2.4 Click on List View Tab
        cellPhones.listPage1();
        //2.5 Click on product name “Nokia Lumia 1020” link
        cellPhones.nokiaLumia10201();
        //2.6 Verify the text “Nokia Lumia 1020”
         String expectedText1 = "Nokia Lumia 1020";
         String actualText1 = cellPhones.verifyNokiaLumia1();
         Assert.assertEquals(expectedText1,actualText1);
         //2.7 Verify the price “$349.00”
        String expectedText2 = "$349.00";
        String actualText2 = cellPhones.verifyNumber1();
        Assert.assertEquals(expectedText2,actualText2);
        //2.8 Change quantity to 2
         cellPhones.changeQty();
        //2.9 Click on “ADD TO CART” tab
         cellPhones.addToCart();
        //2.10 Verify the Message "The product has been added to your shopping cart" on Top green Bar
        String expectedText3 = "The product has been added to your shopping cart";
        String actualText3 = cellPhones.theProductHasBeenAddedToYourShoppingCart();
        Assert.assertEquals(expectedText3,actualText3);
        //After that close the bar clicking on the cross button.
        cellPhones.closeButton();
        //2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
         cellPhones.shoppingCart();
         cellPhones.shoppingCartClick1();
         //2.12 Verify the message "Shopping cart"
         String expectedText4 = "Shopping cart";
         String actualText4 = cellPhones.verifyShoppingCart1();
         Assert.assertEquals(expectedText4,actualText4);
        //2.13 Verify the quantity is 2
        String expectedText5 = "2";
        String actualText5 = cellPhones.verifyqty1();
        Assert.assertEquals(expectedText5,actualText5);
        //2.14 Verify the Total $698.00
        String expectedText6 = "$698.00";
        String actualText6 = cellPhones.verifyTotal1();
        Assert.assertEquals(expectedText6,actualText6);
        //2.15 click on checkbox “I agree with the terms of service”
        cellPhones.termsofservices();
        //2.16 Click on “CHECKOUT”
        cellPhones.checkoutButton1();
        //2.17 Verify the Text “Welcome, Please Sign In!”
        String expetedMessage = "Welcome, Please Sign In!";
        String actualMessage = registerPage.verifyWelcomeSignIn1();
        Assert.assertEquals(expetedMessage,actualMessage);
        //2.18 Click on “REGISTER” tab
        registerPage.clickRegister();
        //2.19 Verify the text “Register”
        String expectedText7 = "Register";
        String actualText7 = registerPage.verifyRegisterText();
        Assert.assertEquals(actualText, expectedText, "Register");
        //2.20 Fill the mandatory fields
        registerPage.setFirstName("Saroj");
        registerPage.setLastName("Malviya");
        registerPage.setEmailId("sarojmalviya@gmail.com");
        registerPage.setPasswordField("saroj123");
        registerPage.setConfirmPassword("saroj123");
        //2.21 Click on “REGISTER” Button
        registerPage.clickOnRegisterTab();
        //2.22 Verify the message “Your registration completed”
        String expectedText8 = "Your registration completed";
        String actualText8 = registerPage.verifyRegisterText();
        Assert.assertEquals(expectedText8,actualText8);
        //2.23 Click on “CONTINUE” tab
        registerPage.continueButton();
        //2.24 Verify the text “Shopping card”
        String expectedText9 = "Shopping card";
        String actualText9 = registerPage.verifyShoppingCart1();
        Assert.assertEquals(expectedText9,actualText9);
        //2.25 click on checkbox “I agree with the terms of service”
         cellPhones.clickOnCheckbox();
        //2.26 Click on “CHECKOUT”
        cellPhones.clickOnCheckout();
        //2.27 Fill the Mandatory fields
        registerPage.countryId1();
        registerPage.enterCity("Harrow");
        registerPage.enteraddress("315");
        registerPage.enterPostCode("396445");
        registerPage.enterPhoneNumber("7721541514");
        //2.28 Click on “CONTINUE”
        registerPage.saveButton1();
        //2.29 Click on Radio Button “2nd Day Air ($0.00)”
        registerPage.radioButton1();
        //2.30 Click on “CONTINUE”
        registerPage.continueButton();
        //2.31 Select Radio Button “Credit Card”
        registerPage.radioButton();
        //2.32 Select “Visa” From Select credit card dropdown
        registerPage.continuePaymentNext1();
        //2.33 Fill all the details
        registerPage.cardHolderName("Saroj");
        registerPage.creditCardNumber("5374101301649805");
        registerPage.expiryYear("2026");
        registerPage.cardCode("123");
        //2.34 Click on “CONTINUE”
        registerPage.continueToDetailsButton1();
        //2.35 Verify “Payment Method” is “Credit Card”
        String expectedMess5 = "Credit Card";
        String actualMess5 = registerPage.paymentMethodText1();
        Assert.assertEquals(expectedMess5,actualMess5);
        //2.36 Verify “Shipping Method” is “2nd Day Air”
        String expectedMess4 = "2nd Day Air";
        String actualMess4 = registerPage.shippingMethod2();
        Assert.assertEquals(expectedMess4,actualMess4);
        //2.37 Verify Total is “$698.00”
        String expectedMess3 = "$698.00";
        String actualMess3 = registerPage.finalTotal1();
        Assert.assertEquals(expectedMess3,actualMess3);
        //2.38 Click on “CONFIRM”
        registerPage.confirmButton1();
        //2.39 Verify the Text “Thank You”
        String expectedMess2 = "Thank You";
        String actualMess2 = registerPage.thankYouText1();
        Assert.assertEquals(expectedMess2,actualMess2);
        //2.40 Verify the message “Your order has been successfully processed!”
        String expectedMessage = "Your order has been successfully processed!";
        String actualMessage1 = registerPage.orderConfirmationMessage1();
        Assert.assertEquals(expectedMessage,actualMessage1);
        //2.41 Click on “CONTINUE”
        registerPage.continueAfterPayment1();
        //2.42 Verify the text “Welcome to our store”
        String expected = "Welcome to our store";
        String actual = registerPage.welcomeToStore();
        Assert.assertEquals(expected,actual);
        //2.43 Click on “Logout” link
        registerPage.logOut1();
        //2.44 Verify the URL is “https://demo.nopcommerce.com/”
        expectedText = "https://demo.nopcommerce.com/";
        actualText = driver.getCurrentUrl();
        Assert.assertEquals(actualText, expectedText);
    }

}
