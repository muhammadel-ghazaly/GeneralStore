package webTest;

import org.testng.annotations.Test;
import webPage.homePage;

public class homeTest extends WebTestBase {

    homePage homePage;
@Test
    public void openOrders () throws InterruptedException {
        homePage = new homePage(driver);
        homePage.openSideMenu();
        homePage.clickOrders();
        homePage.clickallOrders();

    }
}
