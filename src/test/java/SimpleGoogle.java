import io.github.ingmargoudt.marvel.Browser;
import io.github.ingmargoudt.marvel.BrowserName;
import io.github.ingmargoudt.marvel.TestExecution;
import io.github.ingmargoudt.marveldemo.GoogleTestData;
import io.github.ingmargoudt.marveldemo.flows.SearchGoogleFlow;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

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

    @AfterEach
    public void cooldown() {
        close();
    }

}
