package mobileTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import mobilePage.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FoodOrderDeliveryTest extends MobileTestBase{
    HomePage homePage;
    StoreScreenPage storeScreenPage;
    CartScreenPage cartScreenPage;
    CheckoutScreenPage checkoutScreenPage;
    TrackOrderPage trackOrderPage;


    public void scrollDown (){
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Total Amount\").instance(0))").click();

    }



    @Test
    public void foodOrderDelivery () throws InterruptedException {
        homePage = new HomePage((AppiumDriver<MobileElement>) driver);
        storeScreenPage = new StoreScreenPage((AppiumDriver<MobileElement>) driver);
        cartScreenPage = new CartScreenPage((AppiumDriver<MobileElement>) driver);
        checkoutScreenPage = new CheckoutScreenPage((AppiumDriver<MobileElement>) driver);
        trackOrderPage = new TrackOrderPage((AppiumDriver<MobileElement>) driver);
        homePage.clickSearchBar();
        homePage.enterPickUpLocation("Dina");
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
        Thread.sleep(5000);
        scrollDown();
        Thread.sleep(3000);
        checkoutScreenPage.getOrderPrice();
        Thread.sleep(2000);
        checkoutScreenPage.clickPlaceOrder();
        trackOrderPage.getOrderNumber();









    }
}
