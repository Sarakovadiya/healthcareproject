package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginPageTest {

    WebDriver driver = null;
    //call constructor and name of counstruct same as class name and method name
    public static void main(String[] args) {
         new loginPageTest();
    }
    public loginPageTest(){
        System.setProperty("webdriver.chrome.driver", "/Users/sarakovadiya/Documents/chromedriver");

        driver =new ChromeDriver();

        loginpageObject loginobj = new loginpageObject(driver);
        driver.get("https://katalon-demo-cura.herokuapp.com/profile.php"); //URL in the browser
        loginobj.setTextboxusername("John Doe");
        loginobj.setTextboxpassword("ThisIsNotAPassword");
        loginobj.loginbutton();
        driver.close();

    }

}
