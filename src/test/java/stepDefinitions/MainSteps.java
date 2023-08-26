package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

// to get this structure just run the test and let it fail, then copy from terminal
public class MainSteps {
    @Given("User is on NetBanking page")
    public void user_is_on_net_banking_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User landed on netbanking page");
        //throw new io.cucumber.java.PendingException();
    }
    @When("User login into application")
    public void user_login_into_application() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User logged into application ");
        //throw new io.cucumber.java.PendingException();
    }
    @Then("Home page is displayed")
    public void home_page_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Home page is displayed");
        //throw new io.cucumber.java.PendingException();
    }
    @Then("Cards are displayed")
    public void cards_are_displayed() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Cards are displayed");
        //throw new io.cucumber.java.PendingException();
    }

}
