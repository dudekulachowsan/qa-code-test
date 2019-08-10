package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.BasePage;

public class HomePage extends BasePage {

    @FindBy(id="gh-ac")
    private WebElement txtSearch;

    @FindBy(id="gh-btn")
    private WebElement btnSearch;

    public HomePage(WebDriver driver){
        super(driver);
    }

    public void search_for_an_item(String valueToSearch){
        this.txtSearch.sendKeys(valueToSearch);
        this.btnSearch.click();
    }
}
