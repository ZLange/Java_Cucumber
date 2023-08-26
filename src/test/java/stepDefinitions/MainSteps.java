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
    @When("User login into application with {string} and password {string}")
    public void user_login_into_application_with_and_password(String username, String password) {
        System.out.println(username + " and password is "+password);
        //throw new io.cucumber.java.PendingException();
    }

//    @When("User login into application with {string} and password {string} combination")
//    public void user_login_into_application_with_and_password_combination(String username2, String password2) {
//        System.out.println(username2 + " and password is "+password2);
//        //throw new io.cucumber.java.PendingException();
//    }
    // to work for any data type not just strings -> made generic
    @When("^User login into application with (.+) and password (.+) combination$")
    public void user_login_into_application_with_and_password_combination(String username2, String password2) {
        System.out.println(username2 + " and password is "+password2);
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
