package io.github.ingmargoudt.marveldemo;

import io.github.ingmargoudt.TestExecution;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class SimpleGoogle extends TestExecution {

    GoogleTestData googleTestData;

    @Test
    public void simpleGoogle() {
        webDriver.get("https://google.com");
        new SearchGoogleFlow(webDriver, googleTestData).run();
    }

    public void prepareTestData() {
        googleTestData = new GoogleTestData();
        googleTestData.setSearchPhrase("Zebra");
    }

    @AfterEach
    public void cooldown() {
        close();
    }

}
