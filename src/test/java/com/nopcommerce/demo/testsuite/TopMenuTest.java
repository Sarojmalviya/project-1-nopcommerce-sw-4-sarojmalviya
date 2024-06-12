package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {
    HomePage homePage = new HomePage();

    public void selectMenu(String menu) {
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='" +menu+ "']")).click();
    }

    @Test
    public void verifyPageNavigation(){
        selectMenu("Computers");
        selectMenu("Electronics");
        selectMenu("Apparel");
        selectMenu("Digital downloads");
        selectMenu("Books");
        selectMenu("Jewelry");
        selectMenu("Gift Cards");
    }
}
