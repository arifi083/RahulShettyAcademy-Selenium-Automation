package testCases;

import Base.BaseClass;
import org.junit.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {
    @Test
    public void logingTest() throws InterruptedException {
        driver.get(baseUrl);
        Thread.sleep(4000);

        LoginPage lp = new LoginPage(driver);
        lp.setInputUsername(username);
        Thread.sleep(3000);
        lp.setInputPassword(password1);
        Thread.sleep(3000);
        lp.clickLoginBtn();
        Thread.sleep(4000);
        String getErrorMsg = lp.getErrorMsg();
        Assert.assertTrue(getErrorMsg.contains("* Incorrect username or password"));
        System.out.println("Get Error Message" + getErrorMsg);
        Thread.sleep(4000);
        lp.clickForgetPassword();
        Thread.sleep(5000);
        lp.setName(name);
        Thread.sleep(3000);
        lp.setEmail(email);
        Thread.sleep(3000);
        lp.setPhoneNumber(phoneNum);
        Thread.sleep(3000);
        lp.clickResetLoginBtn();
        Thread.sleep(3000);
        String getInforMsg = lp.getInfoMsg();
        Assert.assertTrue(getInforMsg.contains("Please use temporary password"));
        System.out.println("Get info Message" + getInforMsg);
        Thread.sleep(4000);
        lp.clickGotoLoginBtn();
        Thread.sleep(3000);
        lp.setInputPassword2(password2);
        Thread.sleep(3000);
        lp.clickLoginBtn();






    }
}
