package mobileTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import mobilePage.HomePage;
import mobilePage.OrderDetailsPage;
import org.testng.annotations.Test;

public class NormalOrderTest extends MobileTestBase {

    HomePage homePage;
    OrderDetailsPage orderDetailsPage;

    @Test
    public void normalOrder() {
        homePage = new HomePage((AppiumDriver<MobileElement>) driver);
        orderDetailsPage = new OrderDetailsPage((AppiumDriver<MobileElement>) driver);
        homePage.clickSearchBar();
        homePage.enterPickUpLocation("macdonald");
        homePage.selectFirstResult();
        homePage.clickNextButton();
        homePage.enterStoreName("test1");
        homePage.clickConfirmButton();
        orderDetailsPage.clickAddItem();
        orderDetailsPage.enterItemName("test");
        orderDetailsPage.enterItemDescription("test item description");
        orderDetailsPage.increaseItem();
        orderDetailsPage.increaseItem();
        orderDetailsPage.increaseItem();
        orderDetailsPage.clickImageIcon();
        orderDetailsPage.openGallery();
        orderDetailsPage.allowGalleryAccess();
        orderDetailsPage.selectImage();
        orderDetailsPage.confirmAddingItem();
        orderDetailsPage.clickContinue();
        orderDetailsPage.choosePriceLessThan100();
        orderDetailsPage.clickSubmit();


    }
}
