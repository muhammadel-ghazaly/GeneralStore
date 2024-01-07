package mobileTest;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class MobileTestBase {

    public static AndroidDriver driver;


    //Start driver for android

    @BeforeSuite

    public void startDriver() throws MalformedURLException {


        DesiredCapabilities AndroidObject = new DesiredCapabilities();

        AndroidObject.setCapability("platformName", "Android");

        AndroidObject.setCapability("automationName", "UiAutomator2");
        AndroidObject.setCapability("appPackage", "com.androidsample.generalstore");

        AndroidObject.setCapability("appActivity", "com.androidsample.generalstore.SplashActivity - GeneralStore");

        driver = new AndroidDriver<WebElement>(new URL("http://localhost:4723/"), AndroidObject);


    }

}
