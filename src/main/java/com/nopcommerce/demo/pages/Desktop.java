package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Desktop extends Utility {
    By desktopLink = By.linkText("Desktops");
    By sortByLink = By.xpath("//option[normalize-space()='Name: Z to A']");
    By productNames = By.xpath("//h2[@class='product-title']//a");
    By sortByLink1 = By.xpath("(//option[@value='5'])[1]");
    By addToCart = By.xpath("//button[text()='Add to cart']");

    public void clickOnDesktopLink(){
        clickOnElement(desktopLink);
    }
    public void selectByValueFromDropDown(){
        clickOnElement(sortByLink);
    }
    public List<String>listProductList(){
        List<String>listofProducts = new ArrayList<>();

        for(WebElement ele : findMultipleElements(productNames)){
            listofProducts.add(ele.getText().trim());
        }
        return listofProducts;
    }
     public void selectByValueFromDropDown1(){
        clickOnElement(sortByLink1);
     }
     public void addToCart(){
        clickOnElement(addToCart);
    }


}
