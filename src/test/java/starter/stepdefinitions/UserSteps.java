package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Get;
import starter.user.Post;

public class UserSteps {
    @Steps
    Get get;
    @Steps
    Post post;
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
    @Given("I set POST api endpoints")
    public void setPostEndpoint(){
        post.setApiEndpoints();
    }
    @When("I send POST HTTP request")
    public void sendHttpRequest(){
        post.sendPostHttpRequest();
    }
    @Then("I receive valid HTTP response code 201")
    public void validateHttpResponse201(){
        post.receivedHttpResponseCode201();
    }
    @And("I receive valid data for new user")
    public void validateDataNewUser(){
        post.validateDataForDetailUser();
    }
}
