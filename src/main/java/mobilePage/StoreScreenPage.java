package mobilePage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class StoreScreenPage extends MobilePageBase{
    public StoreScreenPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup")
    private MobileElement firstItem;

    @AndroidFindBy (id= "com.mnasat.nashmi:id/text_view_add")
    private MobileElement addBtn;

    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[3]")
    private MobileElement addToCartBtn;

    @AndroidFindBy (id = "com.mnasat.nashmi:id/floatingCart")
    private MobileElement cartBtn;



    //operations

    public void selectFirstItem (){
        firstItem.click();

    }

    public void increaseItemByTwo (){
        addBtn.click();
        addBtn.click();

    }

    public void addToCart (){
        addToCartBtn.click();

    }

    public void openCart (){
        cartBtn.click();

    }




}
