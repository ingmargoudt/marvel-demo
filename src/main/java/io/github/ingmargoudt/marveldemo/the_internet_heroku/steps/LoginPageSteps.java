package io.github.ingmargoudt.marveldemo.the_internet_heroku.steps;

import io.github.ingmargoudt.marvel.programs.Program;
import io.github.ingmargoudt.marvel.steps.BaseSteps;
import io.github.ingmargoudt.marvel.steps.Step;
import io.github.ingmargoudt.marveldemo.the_internet_heroku.programs.LoginPage;
import org.openqa.selenium.WebDriver;

public class LoginPageSteps extends BaseSteps {

    @Program
    LoginPage loginPage;


    protected LoginPageSteps(WebDriver webDriver) {
        super(webDriver);
    }

    @Step
    public void enterUsername(String username) {
        write(loginPage.username, username);
    }

    @Step
    public void enterPassWord(String password) {
        write(loginPage.password, password);
    }

    @Step
    public void submitForm() {
        submit(loginPage.username);
    }
}
