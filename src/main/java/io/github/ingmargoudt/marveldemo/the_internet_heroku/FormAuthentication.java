package io.github.ingmargoudt.marveldemo.the_internet_heroku;

import io.github.ingmargoudt.marvel.Browser;
import io.github.ingmargoudt.marvel.BrowserName;
import io.github.ingmargoudt.marvel.TestExecution;
import io.github.ingmargoudt.marveldemo.the_internet_heroku.flows.FormAuthenticationFlow;
import io.github.ingmargoudt.marveldemo.the_internet_heroku.flows.SecureAreaFlow;
import org.junit.jupiter.api.Test;

public class FormAuthentication extends TestExecution {
    public void prepareTestData() {

    }

    @Test
    @Browser(BrowserName.CHROME)
    public void testFormAuthentication(){
        openURL("https://the-internet.herokuapp.com/login");
        new FormAuthenticationFlow(webDriver).run();
        new SecureAreaFlow(webDriver).run();
        close();
    }
}
