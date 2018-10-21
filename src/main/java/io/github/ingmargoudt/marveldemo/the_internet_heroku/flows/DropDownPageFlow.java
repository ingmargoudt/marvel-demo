package io.github.ingmargoudt.marveldemo.the_internet_heroku.flows;

import io.github.ingmargoudt.marvel.Flow;
import io.github.ingmargoudt.marvel.steps.Steps;
import io.github.ingmargoudt.marveldemo.the_internet_heroku.steps.DropDownPageSteps;
import org.openqa.selenium.WebDriver;

public class DropDownPageFlow extends Flow {

    @Steps
    DropDownPageSteps dropDownPageSteps;

    public DropDownPageFlow(WebDriver webDriver) {
        super(webDriver);
    }

    public void run() {
        dropDownPageSteps.selectOption("Option 1");
        dropDownPageSteps.selectOption("Option 2");
    }
}
