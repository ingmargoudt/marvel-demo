package io.github.ingmargoudt.marveldemo.the_internet_heroku.flows;

import io.github.ingmargoudt.marvel.Flow;
import io.github.ingmargoudt.marvel.steps.Steps;
import io.github.ingmargoudt.marveldemo.the_internet_heroku.steps.DragAndDropSteps;
import org.openqa.selenium.WebDriver;

public class DragAndDropFlow extends Flow {

    @Steps
    DragAndDropSteps dragAndDropSteps;

    public DragAndDropFlow(WebDriver webDriver){
        super(webDriver);
    }


    public void run() {
    dragAndDropSteps.performDragAndDrop();
    }
}
