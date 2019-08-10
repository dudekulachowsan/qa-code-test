package pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.BasePage;

import java.util.List;

public class SearchResultsListingPage extends BasePage {

    @FindBy(xpath="//div[@id='srp-river-results']/descendant::a[@class='s-item__link']")
    private List<WebElement> allLinks;

    @FindBy(css="span[class='srp-save-search__tooltip-close']")
    private WebElement btnTooltipClose;

    @FindBy(id="atcRedesignId_btn")
    private WebElement btnAddToCart;

    @FindBy(xpath="//a[.='Go to cart']")
    private WebElement lnkGoToCart;

    public SearchResultsListingPage(WebDriver driver) {
        super(driver);
    }

    public void select_first_item(){

        boolean tooltipPresent = this.btnTooltipClose.isDisplayed();
        if(tooltipPresent){
            this.btnTooltipClose.click();
        }
        this.allLinks.get(0).click();
    }

    public void click_add_to_cart(){
        clickAnElement(this.btnAddToCart);
    }
    public void click_on_goto_cart(){
        waitForElementToAppear(this.lnkGoToCart);
        clickAnElement(this.lnkGoToCart);
    }

}
