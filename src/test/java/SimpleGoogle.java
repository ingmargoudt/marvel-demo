import io.github.ingmargoudt.marvel.Browser;
import io.github.ingmargoudt.marvel.BrowserName;
import io.github.ingmargoudt.marvel.TestExecution;
import io.github.ingmargoudt.marveldemo.google.GoogleTestData;
import io.github.ingmargoudt.marveldemo.google.flows.SearchGoogleFlow;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

public class SimpleGoogle extends TestExecution {

    GoogleTestData googleTestData;

    @Test
    @Browser(BrowserName.CHROME)
    public void simpleGoogle() {
        openURL("https://google.com");
        new SearchGoogleFlow(webDriver, googleTestData).run();
    }


    public void prepareTestData() {
        googleTestData = new GoogleTestData();
        googleTestData.setSearchPhrase("Zebra");
    }


}
