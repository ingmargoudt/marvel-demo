import io.github.ingmargoudt.marvel.Browser;
import io.github.ingmargoudt.marvel.BrowserName;
import io.github.ingmargoudt.marvel.TestExecution;
import io.github.ingmargoudt.marveldemo.the_internet_heroku.flows.DropDownPageFlow;
import org.junit.jupiter.api.Test;

public class ComboBoxTest extends TestExecution {
    public void prepareTestData() {

    }

    @Test
    @Browser(BrowserName.CHROME)
    public void runComboBoxTest() {
        openURL("https://the-internet.herokuapp.com/dropdown");
        new DropDownPageFlow(webDriver).run();
    }
}
