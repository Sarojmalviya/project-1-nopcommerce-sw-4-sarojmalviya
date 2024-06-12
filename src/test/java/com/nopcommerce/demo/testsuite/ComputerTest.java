package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComputerTest extends TestBase{
    HomePage homePage = new HomePage();
    Desktop desktop = new Desktop();
    BuildYourOwnComputerPage buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    ShoppingCart shoppingCart = new ShoppingCart();
    WelcomeSignIn welcomesignin = new WelcomeSignIn();
    @Test
    public void verifyProductArrangeInAlphaBaticalOrder(){
        //1.1 Click on Computer Menu.
        homePage.clickOnComputerLink();
        //1.2 Click on Desktop
        desktop.clickOnDesktopLink();
        //1.3 Select Sort By position "Name: Z to A"
        desktop.selectByValueFromDropDown();
        //1.4 Verify the Product will arrange in Descending order.
        List<String> actualList = desktop.listProductList();
        System.out.println(actualList);
        List<String> sortedProductNames = new ArrayList<>(actualList);
        sortedProductNames.sort(Comparator.reverseOrder());
        System.out.println(sortedProductNames);
        boolean Sorted = actualList.equals(sortedProductNames);
        Assert.assertFalse(Sorted);
    }
    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException{
        //2.1 Click on Computer Menu.
        homePage.clickOnComputerLink();
        //2.2 Click on Desktop
        desktop.clickOnDesktopLink();
        //2.3 Select Sort By position "Name: A to Z"
        desktop.selectByValueFromDropDown1();
        //2.4 Click on "Add To Cart"
        driver.navigate().refresh();
        desktop.addToCart();
        //2.5 Verify the Text "Build your own computer"
         String expactedMessage = "Build your own computer";
         String actualMessage = buildYourOwnComputerPage.getVerifyMessage();
         Assert.assertEquals(expactedMessage,actualMessage);
        //2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
        Thread.sleep(3000);
        buildYourOwnComputerPage.intelPentium();
        //2.7.Select "8GB [+$60.00]" using Select class.
        Thread.sleep(3000);
        buildYourOwnComputerPage.ram();
        //2.8 Select HDD radio "400 GB [+$100.00]"
         buildYourOwnComputerPage.hdd();
        //2.9 Select OS radio "Vista Premium [+$60.00]"
        Thread.sleep(3000);
        buildYourOwnComputerPage.os();
        //2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander[+$5.00]"
        Thread.sleep(3000);
        buildYourOwnComputerPage.software1();
        Thread.sleep(3000);
        buildYourOwnComputerPage.software2();
        //2.11 Verify the price "$1,475.00"
        Thread.sleep(3000);
        String expectedTotal = "$1,475.00";
        String actualTotal = buildYourOwnComputerPage.totalAmount();
        Assert.assertEquals(expectedTotal,actualTotal);
        //2.12 Click on "ADD TO CARD" Button.
        buildYourOwnComputerPage.addToCart();
        //2.13 Verify the Message "The product has been added to your shopping cart" on Top green Bar
        String expectedMessage = "The product has been added to your shopping cart";
        String actualMessage1 = buildYourOwnComputerPage.theProductHasBeenAddedToYourShoppingCart();
        Assert.assertEquals(expectedMessage,actualMessage1);
        //After that close the bar clicking on the cross button.
        buildYourOwnComputerPage.crossButton();
        //2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        buildYourOwnComputerPage.shop1();
        buildYourOwnComputerPage.shop2();
        //2.15 Verify the message "Shopping cart"
        String expectedMessage1 = "Shopping cart";
        String actualmessage1 = shoppingCart.shoppingCart3();
        Assert.assertEquals(expectedMessage1,actualmessage1);
        //2.16 Change the Qty to "2" and Click on "Update shopping cart"
        shoppingCart.changeQty();
        //2.17 Verify the Total"$2,950.00"
        String expectedTotal1 = "$2,950.00";
        String actualTotal1 = shoppingCart.verifyTotalAmount();
        Assert.assertEquals(expectedTotal1, actualTotal1);
        //2.18 click on checkbox “I agree with the terms of service”
        shoppingCart.iAgreeWithTermsOfService();
        //2.19 Click on “CHECKOUT”
         shoppingCart.checkout();
         //2.20 Verify the Text “Welcome, Please Sign In!”
         String expectedText = "Welcome, Please Sign In!";
         String actualtext = welcomesignin.welcomeSignIn();
         Assert.assertEquals(expectedText,actualtext);
         //2.21Click on “CHECKOUT AS GUEST” Tab
         welcomesignin.checkOutGuest();
        //2.22 Fill the all mandatory field
        welcomesignin.enterFirstName("Saroj");
        welcomesignin.lastNameField("Malviya");
        welcomesignin.emailIdField("sarojmalviya123@gmail.com");
        welcomesignin.countryId("233");
        welcomesignin.cityName("Harrow");
        welcomesignin.address("Raynerslane");
        welcomesignin.postCode("ha03sx");
        welcomesignin.phoneNumber("07721541514");
        //2.23 Click on “CONTINUE”
        welcomesignin.continueButton();
        //2.24 Click on Radio Button “Next Day Air($0.00)”
        welcomesignin.nextDayAir();
        //2.25 Click on “CONTINUE”
        welcomesignin.button1();
        //2.26 Select Radio Button “Credit Card”
        welcomesignin.creditCard1();
        //2.27 Select “Master card” From Select credit card dropdown
        welcomesignin.masterCard1();
        //2.28 Fill all the details
        welcomesignin.enterCardholderName("Saroj malviya");
        welcomesignin.enterCardNumber("1234 5678 9101 1121 34");
        WebElement expirymonthdropdown = driver.findElement(By.xpath("//select[@id='ExpireMonth']"));
        Select select3 = new Select(expirymonthdropdown);
        select3.selectByValue("3");
        WebElement expiryyeardropdown = driver.findElement(By.xpath("//select[@id='ExpireYear']"));
        Select select4 = new Select(expiryyeardropdown);
        select4.selectByValue("2025");
        welcomesignin.enterCardCode("111");
        // 2.29 Click on “CONTINUE”
        welcomesignin.clickContinueTab3();
        //2.30 Verify “Payment Method” is “Credit Card”
        String expectedMethod = "Payment Method:Credit Card";
        String actualMethod = welcomesignin.paymentMethod1();
        String actualMethod1 = welcomesignin.creditCardPayment1();
        Assert.assertEquals(expectedMethod,actualMethod,actualMethod1);
        //2.32 Verify “Shipping Method” is “Next Day Air”
        String expectedResult = "Shipping Method:Next Day Air";
        String actualResult = welcomesignin.shippingMethod1();
        Assert.assertEquals(expectedResult,actualResult);
        //2.33 Verify Total is “$2,950.00”
        //2.34 Click on “CONFIRM”
        welcomesignin.confirmButtom1();
        //2.35 Verify the Text “Thank You”
        String expectedT1 = "Thank you";
        String actualT1 = welcomesignin.thankYou();
        Assert.assertEquals(expectedT1,actualT1);
        //2.36 Verify the message “Your order has been successfully processed!”
        String expectedT2 = "Your order has been successfully processed!";
        String actualT2 = welcomesignin.successfullyProcessed1();
        Assert.assertEquals(expectedT2, actualT2);
        //2.37 Click on “CONTINUE”
        welcomesignin.confirmButtom1();
        //2.37 Verify the text “Welcome to our store”
        String expectedT3 = "Welcome to our store";
        String actualT3 = welcomesignin.welcomeToOurStore();
        Assert.assertEquals(expectedT3,actualT3);
    }

}


