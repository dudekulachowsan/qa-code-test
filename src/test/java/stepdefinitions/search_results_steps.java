package stepdefinitions;

import cucumber.api.java.en.And;
import pageobjects.SearchResultsListingPage;

import static stepdefinitions.hooks.driver;

public class search_results_steps {
    SearchResultsListingPage  searchResultsListingPage = new SearchResultsListingPage(driver);

    @And("^user adds first item to the cart from the results list$")
    public void add_first_item_to_cart(){
        searchResultsListingPage.select_first_item();
        searchResultsListingPage.click_add_to_cart();
    }
    @And("^go to cart$")
    public void go_to_cart(){
        searchResultsListingPage.click_on_goto_cart();
    }

}
