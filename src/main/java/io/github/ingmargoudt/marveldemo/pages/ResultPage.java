package io.github.ingmargoudt.marveldemo.pages;

import io.github.ingmargoudt.programs.BaseProgram;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResultPage extends BaseProgram {

    private By resultStats = By.id("resultStats");

    public ResultPage(WebDriver webDriver) {
        super(webDriver);
    }

    public WebElement getResultStats() {
        return get(resultStats);
    }

}
