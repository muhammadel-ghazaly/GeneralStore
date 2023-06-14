package webTest;


import org.testng.Assert;
import org.testng.annotations.Test;
import webPage.loginPage;

public class loginTest extends WebTestBase {

    loginPage  loginPage;

    @Test
    public void login (){

        loginPage  = new loginPage (driver);
        loginPage.enterAdminEmail("Role@shgardi.com");
        loginPage.enterAdminPassword("123456");
        loginPage.clickLogin();
        Assert.assertEquals(loginPage.agentDashboardTxt.getText(), "Agent Dashboard" );
        System.out.println(loginPage.agentDashboardTxt.getText());

    }
}
