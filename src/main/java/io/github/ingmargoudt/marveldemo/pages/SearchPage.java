package io.github.ingmargoudt.marveldemo.pages;

import io.github.ingmargoudt.programs.BaseProgram;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class SearchPage extends BaseProgram {

    @FindBy(name = "q")
    private WebElement searchBox;

    @FindBy(name = "btnK")
    private WebElement searchButton;

    /**
     * @param webDriver
     */
    public SearchPage(WebDriver webDriver) {
        super(webDriver);
    }
}
