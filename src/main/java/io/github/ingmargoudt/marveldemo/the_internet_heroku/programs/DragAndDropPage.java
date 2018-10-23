package io.github.ingmargoudt.marveldemo.the_internet_heroku.programs;

import io.github.ingmargoudt.marvel.programs.BaseProgram;
import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Getter
public class DragAndDropPage extends BaseProgram {

    By columnA = By.id("column-a");


    By columnB = By.id("column-b");

    public DragAndDropPage(WebDriver webDriver) {
        super(webDriver);
    }
}
