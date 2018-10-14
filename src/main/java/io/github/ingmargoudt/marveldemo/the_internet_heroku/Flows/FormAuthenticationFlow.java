package io.github.ingmargoudt.marveldemo.the_internet_heroku.Flows;

import io.github.ingmargoudt.marvel.Flow;
import io.github.ingmargoudt.marvel.steps.Steps;
import io.github.ingmargoudt.marveldemo.the_internet_heroku.steps.LoginPageSteps;
import org.openqa.selenium.WebDriver;

public class FormAuthenticationFlow extends Flow {

    @Steps
    LoginPageSteps loginPageSteps;

    public FormAuthenticationFlow(WebDriver webDriver) {
        super(webDriver);
    }

    public void run() {
        loginPageSteps.enterUsername("tomsmith");
        loginPageSteps.enterPassWord("SuperSecretPassword!");
        loginPageSteps.submitForm();
    }
}
