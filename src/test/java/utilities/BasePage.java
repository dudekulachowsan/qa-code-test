package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    private static final int TIMEOUT = 2;
    private static final int POLLING = 100;

    protected WebDriver driver;
    private WebDriverWait wait;

    public BasePage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, TIMEOUT, POLLING);
        PageFactory.initElements(driver,this);
    }

    public void clickAnElement(WebElement element){
        element.click();
    }

    public boolean verifyElementIsPresent(By locator){
        return driver.findElement(locator).isDisplayed();
    }

    protected void waitForElementToAppear(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
}
