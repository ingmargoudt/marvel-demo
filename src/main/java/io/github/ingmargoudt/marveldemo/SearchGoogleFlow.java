package io.github.ingmargoudt.marveldemo;

import io.github.ingmargoudt.Flow;
import io.github.ingmargoudt.steps.Steps;
import org.openqa.selenium.WebDriver;

public class SearchGoogleFlow extends Flow {

    private GoogleTestData googleTestData;

    @Steps
    private SearchPageSteps searchPageSteps;

    public SearchGoogleFlow(WebDriver webDriver,  GoogleTestData googleTestData){
        super(webDriver);
        this.googleTestData = googleTestData;
    }

    public void run() {
        searchPageSteps.enterKeyword(googleTestData.getSearchPhrase());
        searchPageSteps.clickOnSearch();
    }
}
