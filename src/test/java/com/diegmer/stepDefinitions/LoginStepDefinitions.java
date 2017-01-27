package com.diegmer.stepDefinitions;

import com.diegmer.com.diegmer.serenitySteps.LoginSteps;
import com.diegmer.features.LoginGmailPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

/**
 * Created by diego.merino on 27/01/2017.
 */
public class LoginStepDefinitions {

    @Steps
    LoginSteps loginSteps;

    @Given("^I navigate to \"([^\"]*)\"$")
    public void i_navigate_to(String arg1) throws Throwable {
        loginSteps.openGmailPage();
    }

    @Given("^I enter \"([^\"]*)\" into input field having id \"([^\"]*)\"$")
    public void i_enter_into_input_field_having_id(String arg1, String arg2) throws Throwable {
        loginSteps.inputMail(arg1);
    }

    @Then("^I click on element having id \"([^\"]*)\"$")
    public void i_click_on_element_having_id(String arg1) throws Throwable {
        loginSteps.clickNext();
    }

    @When("^I wait for (\\d+) sec$")
    public void i_wait_for_sec(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I close browser$")
    public void i_close_browser() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}
