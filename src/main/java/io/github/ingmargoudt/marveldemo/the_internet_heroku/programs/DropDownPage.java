package io.github.ingmargoudt.marveldemo.the_internet_heroku.programs;

import io.github.ingmargoudt.marvel.programs.BaseProgram;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class DropDownPage extends BaseProgram {

    @FindBy(id = "dropdown")
    WebElement options;

    public DropDownPage(WebDriver webDriver) {
        super(webDriver);
    }

    public Select getOptions(){
        return new Select(options);
    }
}
