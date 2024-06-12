package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By loginLink = By.linkText("Log in");
    By computersLink = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']");
    By registerLink = By.linkText("Register");
    By electronicsLink = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']");
    By apparelLink = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Apparel']");
    By digitalDownloadsLink = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Digital downloads']");
    By booksLink = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Books']");
    By jewelryLink = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Jewelry']");
    By giftCardsLink = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Gift Cards']");

    public void clickOnLoginLink(){
    clickOnElement(loginLink);
    }
    public void clickOnComputerLink(){
        clickOnElement(computersLink);
    }
    public void clickOnRegisterLink(){
        clickOnElement(registerLink);
    }
    public void clickOnElectronicsLink(){
        clickOnElement(electronicsLink);
    }
    public void clickOnApparelLink(){
        clickOnElement(apparelLink);
    }
    public void clickOnDigitalDownloadLink(){
        clickOnElement(digitalDownloadsLink);
    }
    public void clickOnBooksLink(){
        clickOnElement(booksLink);
    }
    public void clickOnJewelryLink(){
        clickOnElement(jewelryLink);
    }
    public void clickOnGiftCardLink(){
        clickOnElement(giftCardsLink);
    }

}
