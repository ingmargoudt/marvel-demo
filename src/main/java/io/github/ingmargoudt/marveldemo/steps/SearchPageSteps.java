package io.github.ingmargoudt.marveldemo.steps;

import io.github.ingmargoudt.marveldemo.pages.SearchPage;
import io.github.ingmargoudt.programs.Program;
import io.github.ingmargoudt.steps.BaseSteps;
import io.github.ingmargoudt.steps.Step;
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
    public void enterKeyword(String keyword){
       write(searchPage.getSearchBox(), keyword);
       sendKeys(searchPage.getSearchButton(), Keys.ESCAPE);
    }

    @Step
    public void clickOnSearch() {
        clickAndClose(searchPage.getSearchButton());
    }
}
