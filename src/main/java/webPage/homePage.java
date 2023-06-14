package webPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homePage extends WebPageBase {
    public homePage(WebDriver driver) {
        super(driver);
    }

//Elements
    @FindBy (xpath = "/html/body/app-root/app-menu/div")
    public WebElement sideMenu;

    @FindBy (xpath = "/html/body/app-root/app-menu/div/ul/li[4]/div/a/span")
    public WebElement orders;

    @FindBy (xpath = "/html/body/app-root/app-menu/div/ul/li[4]/ul/li[3]/a")
    public WebElement allOrders;


//Operations
    public void openSideMenu () throws InterruptedException {
        sideMenu.click();

    }

    public void clickOrders (){
        orders.click();

    }

    public void clickallOrders (){
        allOrders.click();

    }
}
