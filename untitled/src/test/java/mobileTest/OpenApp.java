package mobileTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import mobilePage.HomePage;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class OpenApp extends MobileTestBase{

    HomePage homePage;
    @Test
public void OpenApp(){

homePage =new HomePage((AppiumDriver<MobileElement>)driver);
    driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
    homePage.lunchApp();







}
}

