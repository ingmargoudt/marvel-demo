package io.github.ingmargoudt.marveldemo;

import io.github.ingmargoudt.Flow;
import io.github.ingmargoudt.steps.Steps;
import org.openqa.selenium.WebDriver;

public class SearchGoogleFlow extends Flow {

    @Steps
    private SearchPageSteps searchPageSteps;

    public SearchGoogleFlow(WebDriver webDriver){
        super(webDriver);
    }

    public void run() {
        searchPageSteps.enterKeyword("zebra");
        searchPageSteps.clickOnSearch();
    }
}
