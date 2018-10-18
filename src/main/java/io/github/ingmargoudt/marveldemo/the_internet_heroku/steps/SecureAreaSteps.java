package io.github.ingmargoudt.marveldemo.the_internet_heroku.steps;

import io.github.ingmargoudt.marvel.programs.Program;
import io.github.ingmargoudt.marvel.steps.BaseSteps;
import io.github.ingmargoudt.marvel.steps.Step;
import io.github.ingmargoudt.marveldemo.the_internet_heroku.programs.SecureArea;
import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class SecureAreaSteps extends BaseSteps {

    @Program
    SecureArea secureArea;

    protected SecureAreaSteps(WebDriver webDriver) {
        super(webDriver);
    }

    @Step
    public void validateLoggedInMessage() {
        assertThat(read(secureArea.getLoggedInMessage()).trim()).contains("You logged into a secure area!");
    }

    @Step
    public void logout() {
        clickOn(secureArea.getSignOut());
    }
}
