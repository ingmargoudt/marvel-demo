package io.github.ingmargoudt.marveldemo;

import io.github.ingmargoudt.TestExecution;
import org.junit.jupiter.api.Test;

public class SimpleGoogle extends TestExecution {

    @Test
    public void simpleGoogle() {
        webDriver.get("https://google.com");
        new SearchGoogleFlow(webDriver).run();
        close();
    }

    public void prepareTestData() {

    }

}
