package io.github.ingmargoudt.marveldemo.the_internet_heroku.steps;

import io.github.ingmargoudt.marvel.programs.Program;
import io.github.ingmargoudt.marvel.steps.BaseSteps;
import io.github.ingmargoudt.marvel.steps.Step;
import io.github.ingmargoudt.marveldemo.the_internet_heroku.programs.DragAndDropPage;
import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class DragAndDropSteps extends BaseSteps {

    @Program
    DragAndDropPage dragAndDropPage;

    protected DragAndDropSteps(WebDriver webDriver) {
        super(webDriver);
    }

    @Step
    public void performDragAndDrop() {
        assertThat(read(dragAndDropPage.get(dragAndDropPage.getColumnA()))).isEqualTo("A");
        dragAndDropJQuery(dragAndDropPage.getColumnA(), dragAndDropPage.getColumnB());
        assertThat(read(dragAndDropPage.get(dragAndDropPage.getColumnA()))).isEqualTo("B");
    }
}
