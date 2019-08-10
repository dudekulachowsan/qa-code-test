package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.BasePage;
import static org.junit.Assert.assertTrue;

public class ShoppingCartPage extends BasePage {

    @FindBy(css="button[data-test-id='cart-remove-item']")
    private WebElement btnRemove;

    @FindBy(xpath="//span[text()=\"You don't have any items in your cart.\"]")
    private WebElement lblCartEmpty;

    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }

    public void validate_item_added_to_cart(String valueToVerify){
        By cartItemLink = By.xpath("//a[@data-test-id='cart-item-link']//span[contains(text(),'"+valueToVerify+"')]");
        boolean itemFound = verifyElementIsPresent(cartItemLink);
        assertTrue(String.format("Item with name '%s' is not added to cart",valueToVerify),itemFound);
    }
    public void remove_item_from_cart(){
        this.btnRemove.click();
    }

    public void validate_cart_is_empty(){
        boolean cartEmptyFlag =   this.lblCartEmpty.isDisplayed();
        assertTrue("Cart is not empty, there might be an issue while removing the item from cart",cartEmptyFlag);
    }

}
