package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Get;

public class UserSteps {
    @Steps
    Get get;
    @Given("I set GET api endpoints")
    public void setGetApiEndpoints(){
        get.setApiEndpoints();
    }
    @When("I send GET HTTP request")
    public void sendGetHttpsRequest(){
        get.sendGetHttpRequest();
    }
    @Then("I receive valid HTTP response code 200")
    public void receiveValidHttpResponseCode(){
        get.validateHttpResponseCode200();
    }
    @And("I receive valid data for detail user")
    public void receiveValidData(){
        get.validateDataForDeatilUser();
    }
}
