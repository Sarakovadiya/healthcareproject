package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class loginpageObject {

    By textbox_username = By.id("txt-username");
    By textbox_password = By.id("txt-password");
    By login_button = By.id("btn-login");

    WebDriver driver = null;

    //Constructor
    public loginpageObject(WebDriver driver) {
        this.driver = driver;
    }

    public void setTextboxusername(String text){

        driver.findElement(textbox_username).sendKeys(text);

    }
    public void setTextboxpassword(String password){
        driver.findElement(textbox_password).sendKeys(password);
    }
    public void loginbutton(){
        driver.findElement(login_button).sendKeys(Keys.RETURN);

    }

}
