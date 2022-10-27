package com.browserstack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonTest extends BrowserStackTestNGTest {

    @Test
    public void test() throws Exception {
        driver.get("https://www.amazon.in");

        // Check the title
        Assert.assertTrue(driver.getTitle().matches("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"));

//        // Save the text of the product for later verify
//        String productOnScreenText = driver.findElement(By.xpath("//*[@id=\"1\"]/p")).getText();
//        // Click on add to cart button
//        driver.findElement(By.xpath("//*[@id=\"1\"]/div[4]")).click();
//
//        // See if the cart is opened or not
//        Assert.assertTrue(driver.findElement(By.cssSelector(".float\\-cart__content")).isDisplayed());
//
//        // Check the product inside the cart is same as of the main page
//        String productOnCartText = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/div[2]/div/div[3]/p[1]")).getText();
//        Assert.assertEquals(productOnScreenText, productOnCartText);
    }
}
