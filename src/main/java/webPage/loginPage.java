package webPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage extends WebPageBase {

    public loginPage(WebDriver driver) {
        super(driver);
    }

    //Elements
    @FindBy (id = "email")
   public WebElement emailTxtBox;

    @FindBy (id= "password")
    public WebElement passwordTxtBox;

    @FindBy (id= "loginButton")
    public WebElement loginBt;

    @FindBy (xpath = "/html/body/app-root/section/div/app-home/div/div/div[2]/span")
    public WebElement agentDashboardTxt;



    //Operations
    public void enterAdminEmail (String email){

        emailTxtBox.sendKeys(email);
    }

    public void enterAdminPassword (String password){
        passwordTxtBox.sendKeys(password);

    }

    public void clickLogin(){
        loginBt.click();

    }
}
