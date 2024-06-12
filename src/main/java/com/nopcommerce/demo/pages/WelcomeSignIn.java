package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class WelcomeSignIn extends Utility {
    By welcomepleaseSignin = By.xpath("//h1[text()='Welcome, Please Sign In!']");
    By checkOutAsGuest  = By.xpath("//button[@class='button-1 checkout-as-guest-button']");
    By firstNameField = By.id("BillingNewAddress_FirstName");
    By lastNameField = By.id("BillingNewAddress_LastName");
    By emailIdField = By.id("BillingNewAddress_Email");
    By countryId = By.id("BillingNewAddress_CountryId");
    By cityName = By.id("BillingNewAddress_City");
    By address = By.id("BillingNewAddress_Address1");
    By postCode = By.id("BillingNewAddress_ZipPostalCode");
    By phoneNumber = By.id("BillingNewAddress_PhoneNumber");
    By continueButton = By.id("//button[@class='button-1 new-address-next-step-button']");
    By nextDayAir = By.id("shippingoption_1");
    By button = By.id("//button[@class='button-1 shipping-method-next-step-button']");
    By creditCard = By.id("paymentmethod_1");
    By masterCard = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/div[1]/button[1]");
    By cardholderName = By.xpath("//input[@id='CardholderName']");
    By cardNumber = By.xpath("(//input[@id='CardNumber'])[1]");
    By cardCode = By.xpath("//input[@id='CardCode']");
    By continueTab3 = By.xpath("(//button[@class='button-1 payment-info-next-step-button'])[1]");
    By paymentMethod = By.xpath("//span[normalize-space()='Payment Method:']");
    By creditCardPayment = By.xpath("//span[normalize-space()='Credit Card']");
    By shippingMethod = By.xpath("//span[normalize-space()='Shipping Method:']");
    By confirmButton1 = By.xpath("//button[text()='Confirm']");
    By thankYou = By.xpath("//h1[text()='Thank you']");
    By successfullyProcessed = By.xpath("//strong[text()='Your order has been successfully processed!']");
    By  continuButton1 = By.xpath("//button[@class='button-1 order-completed-continue-button']");
    By welcomeToOurStore = By.xpath("//h2[text()='Welcome to our store']");
    public String welcomeSignIn(){
        return getTextFromElement(welcomepleaseSignin);
    }
    public void checkOutGuest(){
        clickOnElement(checkOutAsGuest);
    }
    public void enterFirstName(String firstName) {
        sendTextToElement(firstNameField,firstName);
    }
    public void lastNameField(String lastName){
        sendTextToElement(lastNameField,lastName);
    }
    public void emailIdField(String emailId){
        sendTextToElement(emailIdField,emailId);
    }
    public void countryId(String countryId1){
        selectByValueFromDropDown(countryId,countryId1);
    }
    public void cityName(String cityName1){
        sendTextToElement(cityName,cityName1);
    }
    public void address(String address1){
        sendTextToElement(address,address1);
    }
    public void postCode(String postCode1){
        sendTextToElement(postCode,postCode1);
    }
    public void phoneNumber(String phoneNumber1){
        sendTextToElement(phoneNumber,phoneNumber1);
    }
    public void continueButton(){
        clickOnElement(continueButton);
    }
    public void nextDayAir(){
        clickOnElement(nextDayAir);
    }
    public void button1(){
        clickOnElement(button);
    }
    public void creditCard1(){
        clickOnElement(creditCard);
    }
    public void masterCard1(){
        clickOnElement(masterCard);
    }
    public void enterCardholderName(String CardholderName){
        sendTextToElement(cardholderName, CardholderName);
    }
    public void enterCardNumber(String CardNumber){
        sendTextToElement(cardNumber, CardNumber);
    }
    public void enterCardCode(String CardCodeNumber){
        sendTextToElement(cardCode, CardCodeNumber);
    }
    public void clickContinueTab3(){
        clickOnElement(continueTab3);
    }
    public String paymentMethod1(){
        return getTextFromElement(paymentMethod);
    }
    public String creditCardPayment1(){
        return getTextFromElement(creditCardPayment);
    }
    public String shippingMethod1(){
        return getTextFromElement(shippingMethod);
    }
    public void confirmButtom1(){
        clickOnElement(confirmButton1);
    }
    public String thankYou(){
        return getTextFromElement(thankYou);
    }
    public String successfullyProcessed1(){
        return getTextFromElement(successfullyProcessed);
    }
    public void contineButton1(){
        clickOnElement(continuButton1);
    }
    public String welcomeToOurStore(){
        return getTextFromElement(welcomeToOurStore);
    }




}
