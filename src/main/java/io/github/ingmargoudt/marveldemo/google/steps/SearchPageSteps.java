package io.github.ingmargoudt.marveldemo.google.steps;

import io.github.ingmargoudt.marvel.programs.Program;
import io.github.ingmargoudt.marvel.steps.BaseSteps;
import io.github.ingmargoudt.marvel.steps.Step;
import io.github.ingmargoudt.marveldemo.google.pages.SearchPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SearchPageSteps extends BaseSteps {

    @Program
    private SearchPage searchPage;

    /**
     * @param webDriver
     */
    protected SearchPageSteps(WebDriver webDriver) {
        super(webDriver);
    }

    @Step
    public void enterKeyword(String keyword) {
        write(searchPage.getSearchBox(), keyword);
        sendKeys(searchPage.getSearchBox(), Keys.ESCAPE);
        sendKeys(searchPage.getSearchBox(), Keys.ENTER);
    }

    @Step
    public void clickOnSearch() {
        clickOn(searchPage.getSearchButton());
    }
}
