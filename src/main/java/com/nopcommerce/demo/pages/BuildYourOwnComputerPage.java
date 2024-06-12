package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class BuildYourOwnComputerPage extends Utility {
    By buildYourOwnComputer = By.xpath("//h1[text()='Build your own computer']");
    By intelPentium = By.xpath("//option[@value='1']");
    By ram = By.xpath("//option[@value='5']");
    By hdd = By.xpath("//input[@id='product_attribute_3_7']");
    By os = By.xpath("//input[@id='product_attribute_4_9']");
    By software1 = By.xpath("//input[@id='product_attribute_5_10']");
    By software2 = By.xpath("//input[@id='product_attribute_5_12']");
    By totalAmount = By.xpath("//span[@id='price-value-1']");
    By addToCart = By.xpath("//button[@id='add-to-cart-button-1']");
    By theProductHasBeenAddedToYourShoppingCart = By.xpath("//p[text()='The product has been added to your ']");
    By crossButton = By.xpath("//span[@class='close']");
    By shop1 = By.xpath("//span[text()='Shopping cart']");
    By shop2 = By.xpath("//span[@class='cart-label']");

    public String getVerifyMessage(){
        return getTextFromElement(buildYourOwnComputer);
    }
    public void intelPentium(){
        clickOnElement(intelPentium);
    }
    public void ram(){
        clickOnElement(ram);
    }
    public void hdd(){
        clickOnElement(hdd);
    }
    public void os(){
        clickOnElement(os);
    }
    public void software1(){
        clickOnElement(software1);
    }
    public void software2(){
        clickOnElement(software2);
    }
    public String totalAmount(){
        return getTextFromElement(totalAmount);
    }
    public void addToCart(){
        clickOnElement(addToCart);
    }
    public String theProductHasBeenAddedToYourShoppingCart(){
        return  getTextFromElement(theProductHasBeenAddedToYourShoppingCart);
    }
    public void crossButton(){
        clickOnElement(crossButton);
    }
    public void shop1(){
        mouseHoverToElement(shop1);
    }
    public void shop2(){
        clickOnElement(shop2);
    }
}
