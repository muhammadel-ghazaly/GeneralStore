package mobilePage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.concurrent.TimeUnit;

public class OrderDetailsPage extends MobilePageBase{
    public OrderDetailsPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }
    @AndroidFindBy (id = "com.mnasat.nashmi:id/btnAddMain")
    private MobileElement addItemBt;

    @AndroidFindBy (id = "com.mnasat.nashmi:id/btnAddExtra")
    private MobileElement addExtraItemBtn;

    @AndroidFindBy (id = "com.mnasat.nashmi:id/etName")
    private MobileElement itemNameTxt;

    @AndroidFindBy (id = "com.mnasat.nashmi:id/etDescription")
    private MobileElement itemDescriptionTxt;

    @AndroidFindBy (id = "com.mnasat.nashmi:id/imageView")
    private MobileElement addImageBt;

    @AndroidFindBy (id = "com.android.permissioncontroller:id/permission_allow_button")
    private MobileElement allowBt;

    @AndroidFindBy (id = "com.mnasat.nashmi:id/view_gallery")
    private MobileElement galleryBt;

    @AndroidFindBy (id ="com.mnasat.nashmi:id/btnIncrease")
    private MobileElement increaseBt;

    @AndroidFindBy (id = "com.mnasat.nashmi:id/btn_submit")
    private MobileElement confirmAddItemBt;

    @AndroidFindBy (id = "com.android.permissioncontroller:id/permission_allow_button")
    private MobileElement galleryAccessBt;

    @AndroidFindBy (xpath = "//android.widget.LinearLayout[@content-desc=\"Screenshot_20230511-122553_Shgardi.jpg, 224 kB, 11 May\"]/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.ImageView")
    private MobileElement imagePh;

    @AndroidFindBy (id = "com.mnasat.nashmi:id/btn_submit")
    private MobileElement continueBt;

    @AndroidFindBy (id = "com.mnasat.nashmi:id/tvLessThan100")
    private MobileElement priceLessThan100Bt;

    @AndroidFindBy (id = "com.mnasat.nashmi:id/confirm")
    private MobileElement submitBt;



    //operations
    public void clickAddItem (){
        addItemBt.click();

    }

    public void enterItemName(String ItemName){
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        itemNameTxt.sendKeys(ItemName);

    }

    public void enterItemDescription(String ItemDescription){
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        itemDescriptionTxt.sendKeys(ItemDescription);

    }

    public void clickImageIcon (){
        addImageBt.click();

    }

    public void increaseItem (){
        increaseBt.click();

    }

    public void confirmAddingItem (){
        confirmAddItemBt.click();

    }

    public void openGallery (){
        galleryBt.click();

    }



    public void allowAccessPhotos(){
        allowBt.click();

    }

    public void selectImage (){
        imagePh.click();

    }

    public void clickContinue (){
        continueBt.click();

    }

    public void choosePriceLessThan100 (){
        priceLessThan100Bt.click();

    }

    public void clickSubmit (){
        submitBt.click();

    }

    public void clickAddOnTheWayItem (){
        addExtraItemBtn.click();

    }
}
