package io.github.ingmargoudt.marveldemo.the_internet_heroku.steps;

import io.github.ingmargoudt.marvel.programs.Program;
import io.github.ingmargoudt.marvel.steps.BaseSteps;
import io.github.ingmargoudt.marvel.steps.Step;
import io.github.ingmargoudt.marveldemo.the_internet_heroku.programs.DropDownPage;
import org.openqa.selenium.WebDriver;

public class DropDownPageSteps extends BaseSteps {
    @Program
    DropDownPage dropDownPage;

    protected DropDownPageSteps(WebDriver webDriver) {
        super(webDriver);
    }

    @Step
    public void selectOption(String option) {
        dropDownPage.getOptions().selectByVisibleText(option);
    }
}
