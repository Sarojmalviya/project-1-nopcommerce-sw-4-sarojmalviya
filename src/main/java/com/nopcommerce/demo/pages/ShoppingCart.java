package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCart extends Utility {

    By shoppingCartMessage =By.xpath("//span[@class='cart-label']");
    By changeQty = By.xpath("//div[@class='quantity up']");
    By verifyTotalAmount = By.xpath("//span[@class='value-summary']//strong[text()='$2,950.00']");
    By checkbox = By.xpath("termsofservice");
    By checkout = By.xpath("//button[@id='checkout']");

    public String shoppingCart3(){
       return getTextFromElement(shoppingCartMessage);
    }
    public void changeQty(){
        clickOnElement(changeQty);
    }
    public String verifyTotalAmount(){
        return getTextFromElement(verifyTotalAmount);
    }
    public void iAgreeWithTermsOfService(){
        clickOnElement(checkbox);
    }
    public void checkout(){
        clickOnElement(checkout);
    }

}
