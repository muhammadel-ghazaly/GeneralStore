package webTest;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import webPage.allOrdersPage;

public class allOrdersTest extends WebTestBase {

    allOrdersPage allOrdersPage;
    JavascriptExecutor js;

    public void scrollDown() {
        js = (JavascriptExecutor) driver;
        js.executeScript("scrollBy(0,500)");
    }

@Test
    public void openOrderDeatails () throws InterruptedException {
        allOrdersPage = new allOrdersPage(driver);
//    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    allOrdersPage.openAdvancedSearch();
        allOrdersPage.openOrderStatusSection();
        allOrdersPage.uncheckDriverAssigned();
        allOrdersPage.uncheckPickingUp();
        allOrdersPage.uncheckDelivering();
        allOrdersPage.checkDelivered();
        allOrdersPage.clickSearch();
        scrollDown();
        allOrdersPage.openOrderDetails();
        

//    Assert.assertTrue(allOrdersPage.orderType.getText().contains("Order Type"));

    }
}
