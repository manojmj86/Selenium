package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.ProductsPage;
import testBase.BaseClass;

public class TC01_LoginTest extends BaseClass{

    @Test
    void logintest(){
        logger.info("**** Test Start **** ");

         try {
             
             LoginPage lp =new LoginPage(driver);
             ProductsPage pp=new ProductsPage(driver);
             
             lp.setUserName("standard_user");
             lp.setPassword("secret_sauce");
             logger.info("Action--> Click Login button");
             lp.clickLogin();
             
             String expected = "PRODUCTS";
             logger.info("<Assertion>");
             Assert.assertEquals(pp.getTitleLabel(),expected);
             
             
          } catch (Exception e) {
             Assert.fail();
             logger.info(">>>> Assertion Failed <<<<<");
          }
             
    }
    
}
