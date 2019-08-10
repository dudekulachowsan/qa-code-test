package stepdefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.ShoppingCartPage;

import static stepdefinitions.hooks.driver;

public class shopping_cart_steps {
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);

    @Then("verify item is added to the cart \"(.*)\"")
    public void verify_item_added_to_cart(String itemToCheck){
        shoppingCartPage.validate_item_added_to_cart(itemToCheck);
    }

    @When("^user removes the item from the cart$")
    public void remove_item_from_cart(){
        shoppingCartPage.remove_item_from_cart();
    }

    @Then("^verify the cart is empty$")
    public void verify_cart_is_empty(){
        shoppingCartPage.validate_cart_is_empty();
    }
}
