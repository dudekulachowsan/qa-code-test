package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pageobjects.HomePage;


import static stepdefinitions.hooks.driver;

public class home_page_steps {

    HomePage homePage = new HomePage(driver);

    @Given("^user is on the ebay homepage$")
    public void go_to_ebay_site(){
        driver.get("https://www.ebay.com.au/");
    }

    @When("^search for an item \"(.*)\"$")
    public void search_for_an_item(String itemToSearch){
        homePage.search_for_an_item(itemToSearch);
    }



}
