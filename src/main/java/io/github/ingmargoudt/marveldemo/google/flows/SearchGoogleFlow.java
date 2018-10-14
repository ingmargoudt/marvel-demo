package io.github.ingmargoudt.marveldemo.google.flows;

import io.github.ingmargoudt.marvel.Flow;
import io.github.ingmargoudt.marvel.steps.Steps;
import io.github.ingmargoudt.marveldemo.google.GoogleTestData;
import io.github.ingmargoudt.marveldemo.google.steps.ResultPageSteps;
import io.github.ingmargoudt.marveldemo.google.steps.SearchPageSteps;
import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class SearchGoogleFlow extends Flow {

    private GoogleTestData googleTestData;

    @Steps
    private SearchPageSteps searchPageSteps;

    @Steps
    private ResultPageSteps resultPageSteps;

    public SearchGoogleFlow(WebDriver webDriver, GoogleTestData googleTestData) {
        super(webDriver);
        this.googleTestData = googleTestData;
    }

    public void run() {
        searchPageSteps.enterKeyword(googleTestData.getSearchPhrase());
        searchPageSteps.clickOnSearch();
        String numResults = resultPageSteps.getAmountResults();
        assertThat(numResults).as("There is not text in the result stats field").isNotEmpty();

    }
}
