package io.github.ingmargoudt.marveldemo.google.steps;

import io.github.ingmargoudt.marvel.programs.Program;
import io.github.ingmargoudt.marvel.steps.BaseSteps;
import io.github.ingmargoudt.marvel.steps.Step;
import io.github.ingmargoudt.marveldemo.google.pages.ResultPage;
import org.openqa.selenium.WebDriver;

public class ResultPageSteps extends BaseSteps {

    @Program
    ResultPage resultPage;

    protected ResultPageSteps(WebDriver webDriver) {
        super(webDriver);
    }


    @Step
    public String getAmountResults() {
        return read(resultPage.getResultStats());
    }
}
