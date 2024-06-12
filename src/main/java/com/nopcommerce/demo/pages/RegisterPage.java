package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {
    By verifyWelcomeSignIn = By.xpath("//h1[text()='Welcome, Please Sign In!']");
    By clickRegister = By.xpath("//button[normalize-space()='Register']");
    By registerText = By.xpath("//h1[contains(text(),'Register')]");
    By firstName = By.id("FirstName");
    By lastName = By.id("LastName");
    By emailId = By.id("Email");
    By passwordField = By.id("Password");
    By confirmPassword = By.id("ConfirmPassword");
    By registerTab = By.id("register-button");
    By verifyShoppingCart = By.xpath("//h1[text()='Shopping cart']");
    By completeRegistration = By.xpath("//div[@class='result']");
    By continueTab = By.xpath("//a[normalize-space()='Continue']");
    By countryId = By.xpath("BillingNewAddress_CountryId");
    By city1 = By.xpath("BillingNewAddress_City");
    By address1 = By.xpath("BillingNewAddress_Address1");
    By postCode = By.xpath("BillingNewAddress_ZipPostalCode");
    By phoneNumber = By.xpath("BillingNewAddress_PhoneNumber");
    By saveButton = By.name("save");
    By radioButton = By.id("shippingoption_2");
    By continuButton1 = By.cssSelector(".button-1.shipping-method-next-step-button");
    By radioCreditCardButton = By.id("paymentmethod_1");
    By continuePaymentNext = By.xpath("//button[@class='button-1 payment-method-next-step-button']");
    By cardHolderName = By.id("CardholderName");
    By creditCardNumber = By.id("CardNumber");
    By expiryYear = By.id("ExpireYear");
    By cardCode = By.id("CardCode");
    By continueToDetailsButton = By.xpath("//button[@class='button-1 payment-info-next-step-button']");
    By paymentMethodText = By.xpath("//span[normalize-space()='Credit Card']");
    By shippingMethod2Day = By.xpath("//span[normalize-space()='2nd Day Air']");
    By finalTotal698 = By.xpath("//span[@class='value-summary']//strong[contains(text(),'$698.00')]");
    By confirmButton = By.xpath("//button[normalize-space()='Confirm']");
    By thankYouText = By.xpath("//h1[normalize-space()='Thank you']");
    By orderConfirmationMessage = By.xpath("//strong[normalize-space()='Your order has been successfully processed!']");
    By continueButtonAfterPayment = By.xpath("//button[normalize-space()='Continue']");
    By welcomeToStoreMessage = By.xpath("//h2[normalize-space()='Welcome to our store']");
    By logOut = By.xpath("//a[normalize-space()='Log out']");

    public String verifyWelcomeSignIn1(){
        return getTextFromElement(verifyWelcomeSignIn);
    }
    public void clickRegister(){
        clickOnElement(clickRegister);
    }

    public String verifyRegisterText(){
        return getTextFromElement(registerText);
    }
    public void setFirstName(String firstName1){
        sendTextToElement(firstName, firstName1);
    }
    public void setLastName(String lastName1){
        sendTextToElement(lastName,lastName1);
    }
    public void setEmailId(String emailId1){
        sendTextToElement(emailId,emailId1);
    }
    public void setPasswordField(String passwordField1){
        sendTextToElement(passwordField, passwordField1);
    }
    public void setConfirmPassword(String confirmPassword1){
        sendTextToElement(confirmPassword, confirmPassword1);
    }
    public void clickOnRegisterTab(){
        clickOnElement(registerTab);
    }
    public String verifyShoppingCart1(){
       return getTextFromElement(verifyShoppingCart);
    }

    public String verifyRegistrationComplete(){
       return getTextFromElement(completeRegistration);
    }

    public void countryId1(){
        clickOnElement(countryId);
    }

    public void enterCity(String city) {
        sendTextToElement(city1,city);
    }
    public void enteraddress(String add) {
        sendTextToElement(address1,add);
    }
    public void enterPostCode(String pCode) {
        sendTextToElement(postCode,pCode);
    }
    public void enterPhoneNumber(String pNumber) {
        sendTextToElement(phoneNumber,pNumber);
    }
    public void saveButton1(){
        clickOnElement(saveButton);
    }
    public void radioButton1(){
        clickOnElement(radioButton);
    }
    public void continueButton(){
        clickOnElement(continuButton1);
    }
    public void radioButton(){
        clickOnElement(radioCreditCardButton);
    }
    public void continuePaymentNext1(){
        clickOnElement(continuePaymentNext);
    }
    public void cardHolderName(String name) {
        sendTextToElement(cardHolderName,name);
    }public void creditCardNumber(String number) {
        sendTextToElement(creditCardNumber,number);
    }public void expiryYear(String year) {
        sendTextToElement(expiryYear,year);
    }public void cardCode(String code) {
        sendTextToElement(cardCode,code);
    }
    public void continueToDetailsButton1(){
        clickOnElement(continueToDetailsButton);
    }

    public String paymentMethodText1(){
        return getTextFromElement(paymentMethodText);
    }
    public String shippingMethod2(){
        return getTextFromElement(shippingMethod2Day);
    }
    public String finalTotal1(){
        return getTextFromElement(finalTotal698);
    }
    public void confirmButton1(){
        clickOnElement(confirmButton);
    }
    public String thankYouText1(){
        return getTextFromElement(thankYouText);
    }
    public String orderConfirmationMessage1(){
        return getTextFromElement(orderConfirmationMessage);
    }
    public void continueAfterPayment1(){
        clickOnElement(continueButtonAfterPayment);
    }
    public String welcomeToStore(){
        return getTextFromElement(welcomeToStoreMessage);
    }
    public void logOut1(){
        clickOnElement(logOut);
    }

}
