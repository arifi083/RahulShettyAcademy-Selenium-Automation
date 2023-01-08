package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public WebDriver driver;
    public LoginPage(WebDriver rdriver){
        driver = rdriver;
        PageFactory.initElements(rdriver,this);
    }

    By inputUsername = By.id("inputUsername");
    By inputPswd = By.name("inputPassword");
    By loginBtn = By.className("signInBtn");
    By errorMsg = By.xpath("//p[@class='error']");
    By forgetPassword = By.linkText("Forgot your password?");
    By inputName = By.xpath("//input[@placeholder='Name']");
    By inputEmail = By.xpath("//input[@placeholder='Email']");

    By phoneNumber = By.xpath("//input[@placeholder='Phone Number']");

    By resetloginBtn = By.className("reset-pwd-btn");
    By gotologinBtn = By.className("go-to-login-btn");

    By infoMsg = By.xpath("//p[@class='infoMsg']");




    public void setInputUsername(String name){
        driver.findElement(inputUsername).sendKeys(name);
    }

    public void setInputPassword(String pass){
        driver.findElement(inputPswd).sendKeys(pass);
    }

    public void clickLoginBtn(){
        driver.findElement(loginBtn).click();
    }

    public String getErrorMsg(){
        String getmsg = driver.findElement(errorMsg).getText();
        return getmsg;
    }

    public void clickForgetPassword(){
        driver.findElement(forgetPassword).click();
    }

    public void setName(String name){
        driver.findElement(inputName).sendKeys(name);
    }
    public void setEmail(String mail){
        driver.findElement(inputEmail).sendKeys(mail);
    }

    public void setPhoneNumber(String number){
        driver.findElement(phoneNumber).sendKeys(number);
    }

    public void clickResetLoginBtn(){
        driver.findElement(resetloginBtn).click();
    }

    public void clickGotoLoginBtn(){
        driver.findElement(gotologinBtn).click();
    }

    public String getInfoMsg(){
        String getinfoMSG= driver.findElement(infoMsg).getText();
        return getinfoMSG;
    }

    public void setInputPassword2(String pass2){
        driver.findElement(inputPswd).sendKeys(pass2);
    }



}
