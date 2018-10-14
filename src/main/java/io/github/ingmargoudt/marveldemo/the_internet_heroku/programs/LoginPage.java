package io.github.ingmargoudt.marveldemo.the_internet_heroku.programs;

import io.github.ingmargoudt.marvel.programs.BaseProgram;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BaseProgram {

    @FindBy(id = "username")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    public WebElement submitButton(){
        return get(By.cssSelector("submit"));
    }
}
