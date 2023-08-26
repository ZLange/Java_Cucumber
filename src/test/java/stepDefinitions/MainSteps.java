package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

// to get this structure just run the test and let it fail, then copy from terminal
public class MainSteps {
    @Given("setup the entries in DB")
    public void setup_the_entries_in_db()
    {
        System.out.println("Entries in DB are setup");
    }
    @Given("launch the browser from config variables")
    public void launch_the_browser_from_config_variables()
    {
        System.out.println("Browser launched from config variables");
    }
    @When("hit the homepage URL of banking page")
    public void hit_the_homepage_url_of_banking_page()
    {
        System.out.println("Hit the homepage URL ");
    }

    @Given("User is on NetBanking page")
    public void user_is_on_net_banking_page()
    {
        System.out.println("User landed on netbanking page");
    }

    @Given("User is on Practice page")
    public void user_is_on_practice_page()
    {
        System.out.println("User is on Practice page");
    }

    @When("User Signup into application")
    public void user_signup_into_application(List<String> data)
    {
        //driver.findElement(sendKeys(data.get(0)  -> for selenium
        System.out.println(data.get(0));
        System.out.println(data.get(1));
        System.out.println(data.get(2));
        System.out.println(data.get(3));
    }

    @When("User login into application with {string} and password {string}")
    public void user_login_into_application_with_and_password(String username, String password)
    {
        System.out.println(("********************************"));
        System.out.println(username + " and password is "+password);
        //throw new io.cucumber.java.PendingException();
    }

//    @When("User login into application with {string} and password {string} combination")
//    public void user_login_into_application_with_and_password_combination(String username2, String password2)
//    {
//        System.out.println(username2 + " and password is "+password2);
//    }
    // to work for any data type not just strings -> made generic
    @When("^User login into application with (.+) and password (.+) combination$")
    public void user_login_into_application_with_and_password_combination(String username2, String password2)
    {
        System.out.println(("********************************"));
        System.out.println(username2 + " and password is "+password2);
    }

    @Then("Home page is displayed")
    public void home_page_is_displayed()
    {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Home page is displayed");
    }

    @Then("Cards are displayed")
    public void cards_are_displayed()
    {
        System.out.println("Cards are displayed");
    }

}
