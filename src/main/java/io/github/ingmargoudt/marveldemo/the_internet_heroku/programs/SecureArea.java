package io.github.ingmargoudt.marveldemo.the_internet_heroku.programs;

import io.github.ingmargoudt.marvel.programs.BaseProgram;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class SecureArea extends BaseProgram {

    @FindBy(id = "flash")
    private WebElement loggedInMessage;

    @FindBy(className = "icon-signout")
    private WebElement signOut;

    public SecureArea(WebDriver webDriver) {
        super(webDriver);
    }
}
