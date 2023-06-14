package mobileTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import mobilePage.CartScreenPage;
import mobilePage.CheckoutScreenPage;
import mobilePage.HomePage;
import mobilePage.StoreScreenPage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FoodOrderDeliveryTest extends MobileTestBase{
    HomePage homePage;
    StoreScreenPage storeScreenPage;
    CartScreenPage cartScreenPage;
    CheckoutScreenPage checkoutScreenPage;
    JavascriptExecutor js;
    public void scrollDown() {
        js = (JavascriptExecutor) driver;
        js.executeScript("scrollBy(0,200)");
    }



    @Test
    public void foodOrderDelivery () throws InterruptedException {
        homePage = new HomePage((AppiumDriver<MobileElement>) driver);
        storeScreenPage = new StoreScreenPage((AppiumDriver<MobileElement>) driver);
        cartScreenPage = new CartScreenPage((AppiumDriver<MobileElement>) driver);
        checkoutScreenPage = new CheckoutScreenPage((AppiumDriver<MobileElement>) driver);
        homePage.clickSearchBar();
        homePage.enterPickUpLocation("Sau");
        driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
        homePage.selectFirstStore();
        driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
        storeScreenPage.selectFirstItem();
        storeScreenPage.increaseItemByTwo();
        storeScreenPage.addToCart();
        storeScreenPage.openCart();
        cartScreenPage.getTotalPrice();
        cartScreenPage.clickCheckout();
        Thread.sleep(3000);
        checkoutScreenPage.checkCashPaymentMethod();
    checkoutScreenPage.clickPlaceOrder();








    }
}
