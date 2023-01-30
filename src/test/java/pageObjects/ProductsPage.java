package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage{

    public  ProductsPage(WebDriver driver) {
        super(driver);
    }

    //elements 

    @FindBy (xpath = "//span[@class='title']")
    WebElement lblTitle;
    @FindBy (xpath = "//button[@id='react-burger-menu-btn']")
    WebElement btnMenu;
    @FindBy(linkText = "Logout")
    WebElement lnkLogout;

    //Methods 

    public String getTitleLabel( ) {
        
        return lblTitle.getText();
        
    }

    public void Logout(){
        btnMenu.click();
        lnkLogout.click();
    }
    
}
