import io.github.ingmargoudt.marvel.Browser;
import io.github.ingmargoudt.marvel.BrowserName;
import io.github.ingmargoudt.marvel.TestExecution;
import io.github.ingmargoudt.marveldemo.the_internet_heroku.flows.DragAndDropFlow;
import org.junit.jupiter.api.Test;

public class DragAndDropTest extends TestExecution {
    public void prepareTestData() {

    }


    @Test
    @Browser(BrowserName.CHROME)
    public void testDragAndDrop() {
        openURL("https://the-internet.herokuapp.com/drag_and_drop");
        new DragAndDropFlow(webDriver).run();
    }
}
