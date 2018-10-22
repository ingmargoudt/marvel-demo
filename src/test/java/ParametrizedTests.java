import io.github.ingmargoudt.marvel.Browser;
import io.github.ingmargoudt.marvel.BrowserName;
import io.github.ingmargoudt.marvel.TestExecution;
import io.github.ingmargoudt.marveldemo.google.GoogleTestData;
import io.github.ingmargoudt.marveldemo.google.flows.SearchGoogleFlow;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParametrizedTests extends TestExecution {

    GoogleTestData googleTestData;

    public void prepareTestData() {
        googleTestData = new GoogleTestData();
    }

    @ParameterizedTest
    @ValueSource(strings = {"Zebra", "Elephant", "Mongoose"})
    @Browser(BrowserName.CHROME)
    public void parameterTest(String keyWord) {
        openURL("https://google.com");
        googleTestData.setSearchPhrase(keyWord);
        new SearchGoogleFlow(webDriver, googleTestData).run();
    }
}
