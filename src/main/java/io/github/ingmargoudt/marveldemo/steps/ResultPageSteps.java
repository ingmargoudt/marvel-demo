package io.github.ingmargoudt.marveldemo.steps;

import io.github.ingmargoudt.marveldemo.pages.ResultPage;
import io.github.ingmargoudt.programs.Program;
import io.github.ingmargoudt.steps.BaseSteps;
import io.github.ingmargoudt.steps.Step;
import org.openqa.selenium.WebDriver;

public class ResultPageSteps extends BaseSteps {

    @Program
    ResultPage resultPage;

    protected ResultPageSteps(WebDriver webDriver) {
        super(webDriver);
    }


    @Step
    public String getAmountResults(){
        String s = read(resultPage.getResultStats());
        return s;
    }
}
