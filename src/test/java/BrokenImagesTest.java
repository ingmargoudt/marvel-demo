import io.github.ingmargoudt.marvel.BrokenLinksChecker;
import io.github.ingmargoudt.marvel.Browser;
import io.github.ingmargoudt.marvel.BrowserName;
import io.github.ingmargoudt.marvel.TestExecution;
import org.junit.jupiter.api.Test;

public class BrokenImagesTest extends TestExecution {
    public void prepareTestData() {

    }

    @Test
    @Browser(BrowserName.CHROME)
    public void testBrokenImages() {
        openURL("https://www.youtube.com/");
        BrokenLinksChecker.findBrokenImages(webDriver).forEach(System.out::println);
    }
}
