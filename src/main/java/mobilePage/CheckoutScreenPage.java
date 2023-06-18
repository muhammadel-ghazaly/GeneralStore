package mobilePage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.interactions.Actions;

public class CheckoutScreenPage extends MobilePageBase{
    public String OrderPrice;
    public CheckoutScreenPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[4]/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView")
    private MobileElement cashCheckBtn;


    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.Button")
    private MobileElement placeOrderBtn;

    @AndroidFindBy (id = "com.mnasat.nashmi:id/tv_price_before_discount")
    public MobileElement orderPrice;

    //operations

    public void checkCashPaymentMethod (){
        cashCheckBtn.click();

    }

    public void clickPlaceOrder (){
        placeOrderBtn.click();

    }

    public void getOrderPrice (){
        OrderPrice = orderPrice.getText();
        System.out.println(OrderPrice);

    }


}
