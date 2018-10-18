package io.github.ingmargoudt.marveldemo.the_internet_heroku.flows;

import io.github.ingmargoudt.marvel.Flow;
import io.github.ingmargoudt.marvel.steps.Steps;
import io.github.ingmargoudt.marveldemo.the_internet_heroku.steps.SecureAreaSteps;
import org.openqa.selenium.WebDriver;

public class SecureAreaFlow extends Flow {

    @Steps
    SecureAreaSteps secureAreaSteps;

    public SecureAreaFlow(WebDriver webDriver){
        super(webDriver);
    }
    public void run() {
secureAreaSteps.validateLoggedInMessage();
secureAreaSteps.logout();
    }
}
