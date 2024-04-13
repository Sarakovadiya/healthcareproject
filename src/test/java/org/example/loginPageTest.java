package org.example;

import org.openqa.selenium.WebDriver;
import org.ogit add .
        penqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class loginPageTest {

    WebDriver driver = null;
    //call constructor and name of counstruct same as class name and method name
    @BeforeTest
    public void Testsetup(){
        System.setProperty("webdriver.chrome.driver", "/Users/sarakovadiya/Documents/chromedriver");

        driver =new ChromeDriver();


    }
   @Test
    public void loginPageTest(){
        loginpageObject loginobj = new loginpageObject(driver);
        driver.get("https://katalon-demo-cura.herokuapp.com/profile.php"); //URL in the browser
        loginobj.setTextboxusername("John Doe");
        loginobj.setTextboxpassword("ThisIsNotAPassword");
        loginobj.loginbutton();


    }
    @AfterTest
    public void Geardown(){
        driver.close();
        System.out.println("Sucessfully closed");
    }

}
