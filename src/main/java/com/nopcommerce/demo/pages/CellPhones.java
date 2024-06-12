package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class CellPhones extends Utility {
    By cellPhones = By.linkText("Cell phones");
    By verifyCellPhone = By.xpath("//h1[normalize-space()='Cell phones']");
    By listPage = By.xpath("//a[normalize-space()='List']");
    By nokiaLumia1020 = By.xpath("//h2[@class='product-title']//a[contains(text(),'Nokia Lumia 1020')]");
    By verifyNokiaLumia = By.xpath("//h1[normalize-space()='Nokia Lumia 1020']");
    By verifyNumber = By.xpath("//span[@id='price-value-20']");
    By changeQty = By.xpath("//input[@id='product_enteredQuantity_20']");
    By addToCart = By.xpath("//button[@id='add-to-cart-button-20']");
    By theProductHasAddedToYourShoppingCart = By.xpath("//p[@class='content']");
    By closeButton = By.xpath("//span[@title='Close']");
    By shoppingCart = By.xpath("//a[normalize-space()='shopping cart']");
    By shoppingCartClick = By.xpath("//a[normalize-space()='shopping cart']");
    By verifyShoppingCart = By.xpath("//h1[normalize-space()='Shopping cart']");
    By verifyQty = By.xpath("//div[@class='product-quantity']//input");
    By veriyTotal = By.xpath("//span[@class='product-subtotal']");
    By iAgreeWithTheTermsOfService = By.xpath("termsofservice");
    By checkOutButton = By.xpath("checkout");
    By checkbox = By.xpath("//input[@id='termsofservice']");
    By checkout = By.xpath("//button[@id='checkout']");
    public void cellPhones(){
        mouseHoverToElement(cellPhones);
    }
    public String verifyCellPhone(){
        return getTextFromElement(verifyCellPhone);
    }
    public void listPage1(){
        clickOnElement(listPage);
    }
    public void nokiaLumia10201(){
        clickOnElement(nokiaLumia1020);
    }
    public String verifyNokiaLumia1(){
        return getTextFromElement(verifyNokiaLumia);
    }
    public String verifyNumber1(){
        return getTextFromElement(verifyNumber);
    }
    public void changeQty(){
        clickOnElement(changeQty);
    }
    public void addToCart(){
        clickOnElement(addToCart);
    }
    public String theProductHasBeenAddedToYourShoppingCart(){
        return getTextFromElement(theProductHasAddedToYourShoppingCart);
    }
    public void closeButton(){
        clickOnElement(closeButton);
    }
    public void shoppingCart(){
        mouseHoverToElement(shoppingCart);
    }
    public void shoppingCartClick1(){
        clickOnElement(shoppingCartClick);
    }
    public String verifyShoppingCart1(){
        return getTextFromElement(verifyShoppingCart);
    }
    public String verifyqty1(){
        return getTextFromElement(verifyQty);
    }
    public String verifyTotal1(){
        return getTextFromElement(veriyTotal);
    }
    public void termsofservices(){
        clickOnElement(iAgreeWithTheTermsOfService);
    }
    public void checkoutButton1(){
        clickOnElement(checkOutButton);
    }
    public void clickOnCheckbox(){
        clickOnElement(checkbox);
    }
    public void clickOnCheckout(){
        clickOnElement(checkout);
    }


}
