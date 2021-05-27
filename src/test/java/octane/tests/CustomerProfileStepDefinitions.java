package octane.tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CustomerProfileStepDefinitions {

    @Given("Navigate to portal")
    public void navigate_to_portal() {
        System.out.println("Navigate to portal...");
    }

    @When("add profile")
    public void add_profile() {
        System.out.println("add profile...");
    }

    @Then("user added")
    public void user_added() {
        System.out.println("user added...");
        assertTrue(true);
    }

    @When("delete profile")
    public void delete_profile() {
        System.out.println("delete profile...");
    }

    @Then("user deleted")
    public void user_deleted() {
        System.out.println("user deleted...");
        assertTrue(true);
    }

    @When("select option {string}")
    public void select_option(String string1) {
        System.out.println("select option " + string1);
    }

    @When("click {int}")
    public void click(Integer int1) {
        System.out.println("click " + int1);
    }

    @Then("option updated")
    public void option_updated() {
        System.out.println("option deleted...");
        assertTrue(true);
    }

}
