package mobilePage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class HomePage extends MobilePageBase{

    public HomePage(AppiumDriver<MobileElement> driver){
        super(driver);}



  @AndroidFindBy (id = "com.sec.android.app.launcher:id/home_screen")
    //public MobileElement appICon;
    @AndroidFindBy (id = "android:id/text1\n")
    public MobileElement countryList;

    @AndroidFindBy (id = "com.androidsample.generalstore:id/nameField\n")

    public  MobileElement nameField;

    @AndroidFindBy (id = "com.androidsample.generalstore:id/radioMale\n")

    public MobileElement genderRadioBtn ;

    @AndroidFindBy (id = "com.androidsample.generalstore:id/btnLetsShop\n")

    public MobileElement shopBTN;
@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView[2]")
public MobileElement addToCartBtn ;

    @AndroidFindBy (id = "com.androidsample.generalstore:id/appbar_btn_cart\n")

    public MobileElement cartBtn;


    public void lunchApp(){
        MobileElement appIcon= driver.findElement(By.id("\"com.sec.android.app.launcher:id/home_screen\""));
        appIcon.click();
    }


    public void openCountrytList(){
        countryList.click();
    }

    public void enterName (){
        nameField.sendKeys("Mohamed");
    }

    public void selectGender(){
        genderRadioBtn.click();
    }

    public void letsShopBtn(){
        shopBTN.click();
    }

    public void addItem(){
        addToCartBtn.click();
    }

    public void openCart(){
        cartBtn.click();
    }


}
