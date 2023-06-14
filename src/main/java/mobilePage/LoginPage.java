package mobilePage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.concurrent.TimeUnit;

public class LoginPage extends MobilePageBase{
    public LoginPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @AndroidFindBy (id = "com.mnasat.nashmi:id/tvCountryCodeNumber")
    public MobileElement countryCodeBt;

    @AndroidFindBy (id = "com.mnasat.nashmi:id/etCurrentNumber")
    public MobileElement phoneNumberTxt;

    @AndroidFindBy (id = "com.mnasat.nashmi:id/btn_continue")
    public MobileElement continueBt;

    @AndroidFindBy (id = "com.mnasat.nashmi:id/cl_select_egypt")
    private MobileElement egyptCountryCodeBt;

    @AndroidFindBy (id = "com.mnasat.nashmi:id/etNewPassword")
    private  MobileElement passwordTxt;

    @AndroidFindBy (id = "com.mnasat.nashmi:id/btnLogin")
    private MobileElement confirmBt;



    //operations

    public void openCountryCodeList (){
        countryCodeBt.click();

    }

    public void selectEgyptCode (){
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        egyptCountryCodeBt.click();

    }

    public void enterUserPhoneNumber (String userPhone){

        phoneNumberTxt.sendKeys(userPhone);
    }

    public void clickContinue (){
        continueBt.click();

    }
    public void enterUserPassword (String userPassword) throws InterruptedException {
        Thread.sleep(2000);
        passwordTxt.sendKeys(userPassword);
    }

    public void clickConfirmToLogin (){
        confirmBt.click();

    }

}
