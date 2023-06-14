package webPage;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class allOrdersPage extends WebPageBase {
    public allOrdersPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "/html/body/app-root/section/div/app-list/div[1]/div[2]/button[2]/span[1]")
    public WebElement advancedSearchBt;

    @FindBy (id= "mat-select-value-1")
    public WebElement orderStatus;

    @FindBy (id = "mat-option-19")
    public WebElement driverAssignedChBox;

    @FindBy (id= "mat-option-20")
    public WebElement pickingUpChBox;

    @FindBy (id = "mat-option-21")
    public WebElement deliveringChBox;

    @FindBy (id= "mat-option-22")
    public WebElement deliveredChBox;

    @FindBy (id = "btn_search")
    public WebElement searchBt;

    @FindBy (css = "#btn_search > span.mat-button-wrapper > i")
    public WebElement detailsView;

    @FindBy (xpath = "/html/body/app-root/section/div/app-order-details/div[2]/div/mat-card/div[3]/div[1]/ul/li[4]")
    public WebElement orderType;




  //Operations
  public void openAdvancedSearch (){
      advancedSearchBt.click();

  }

    public void openOrderStatusSection (){
        orderStatus.click();

    }

    public void uncheckDriverAssigned (){
        driverAssignedChBox.click();

    }

    public void uncheckPickingUp (){
        pickingUpChBox.click();

    }

    public void uncheckDelivering (){
        deliveringChBox.click();

    }

    public void checkDelivered (){
        deliveredChBox.click();
        deliveredChBox.sendKeys(Keys.ESCAPE);

    }

    public void clickSearch () throws InterruptedException {
//        Thread.sleep(3000);
//        Actions actions = new Actions(driver);
//        actions.doubleClick(searchBt).perform();
        searchBt.click();

    }

    public void openOrderDetails () throws InterruptedException {
        Thread.sleep(3000);
        detailsView.click();

    }





}
