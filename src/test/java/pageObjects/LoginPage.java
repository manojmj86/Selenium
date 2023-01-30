package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    public  LoginPage(WebDriver driver) {
        super(driver);
        
    }



    //elements 

    @FindBy (xpath = "//input[@id='user-name']")
    WebElement txtUserName;
    @FindBy(xpath = "//input[@id='password']")
    WebElement txtPassword;
    @FindBy (name = "login-button")
    WebElement btnLogin;

    //Action methods 
    public void setUserName(String username) {
        txtUserName.clear();
        txtUserName.sendKeys("standard_user");
    }
    public void setPassword(String password) {
        txtPassword.clear();
        txtPassword.sendKeys("secret_sauce");
    }

    public void clickLogin(){
        btnLogin.click();
    }
    
}
