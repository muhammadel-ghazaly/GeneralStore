package mobileTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import mobilePage.CheckoutPage;
import mobilePage.HomePage;
import mobilePage.OrderDetailsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class NormalOrderTest extends MobileTestBase {

    HomePage homePage;
    OrderDetailsPage orderDetailsPage;
    CheckoutPage checkoutPage;
    public void scrollDown (){
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Total Amount\").instance(0))").click();

    }

    @Test
    public void normalOrder() throws InterruptedException {
        homePage = new HomePage((AppiumDriver<MobileElement>) driver);
        orderDetailsPage = new OrderDetailsPage((AppiumDriver<MobileElement>) driver);
        checkoutPage = new CheckoutPage((AppiumDriver<MobileElement>) driver);
        homePage.clickSearchBar();
        homePage.enterPickUpLocation("macdonald");
        homePage.selectFirstResult();
        driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
        homePage.getOrderDeliveryFee();
        homePage.clickNextButton();
        homePage.enterStoreName("test1");
        homePage.clickConfirmButton();
        Thread.sleep(2000);
        orderDetailsPage.clickAddItem();
        orderDetailsPage.enterItemName("test");
        orderDetailsPage.enterItemDescription("test item description");
        orderDetailsPage.increaseItem();
        orderDetailsPage.increaseItem();
        orderDetailsPage.increaseItem();
        orderDetailsPage.clickImageIcon();
        orderDetailsPage.openGallery();
        orderDetailsPage.allowAccessPhotos();
        orderDetailsPage.selectImage();
        orderDetailsPage.confirmAddingItem();
        orderDetailsPage.clickAddItem();
        orderDetailsPage.enterItemName("test2");
        orderDetailsPage.enterItemDescription("test item description2");
        orderDetailsPage.increaseItem();
        orderDetailsPage.increaseItem();
        orderDetailsPage.increaseItem();
        orderDetailsPage.clickImageIcon();
        orderDetailsPage.openGallery();
        orderDetailsPage.selectImage();
        orderDetailsPage.confirmAddingItem();
        orderDetailsPage.clickAddOnTheWayItem();
        orderDetailsPage.enterItemName("test2");
        orderDetailsPage.enterItemDescription("test item description2");
        orderDetailsPage.increaseItem();
        orderDetailsPage.increaseItem();
        orderDetailsPage.increaseItem();
        orderDetailsPage.clickImageIcon();
        orderDetailsPage.openGallery();
        orderDetailsPage.selectImage();
        orderDetailsPage.confirmAddingItem();
        orderDetailsPage.clickContinue();
        orderDetailsPage.choosePriceLessThan100();
        orderDetailsPage.clickSubmit();
        checkoutPage.getDeliveryFee();
        Thread.sleep(3000);
        checkoutPage.checkCashPaymentMethod();
        scrollDown();
        checkoutPage.getDeliveryFeeBeforeDiscount();
        Assert.assertEquals(homePage.DeliveryFee,checkoutPage.DeliveryFee);
        Assert.assertEquals(checkoutPage.DeliveryFee,checkoutPage.DeliveryFeeBeforeDiscount);
        checkoutPage.clickPlaceOrder();





    }
}
