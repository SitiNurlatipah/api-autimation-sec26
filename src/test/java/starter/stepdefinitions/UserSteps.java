package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Delete;
import starter.user.Get;
import starter.user.Post;
import starter.user.Put;

public class UserSteps {
    @Steps
    Get get;
    @Steps
    Post post;
    @Steps
    Delete delete;
    @Steps
    Put put;
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
    @Given("I set DELETE api endpoints")
    public void setDeleteEndpoint(){
        delete.setDeleteApiEndpoints();
    }
    @When("I send DELETE HTTP request")
    public void sendDeleteHttpRequest(){
        delete.sendDeleteHttpRequest();
    }
    @Then("I receive HTTP response code 204")
    public void validateHttpResponse204(){
        delete.validateHttpResponseCode204();
    }
    @Given("I set PUT api endpoints")
    public void setPutEndpoint(){
        put.setPutApiEndpoints();
    }
    @When("I send PUT HTTP request")
    public void sendPutHttpRequest(){
        put.sendPutHttpRequest();
    }
    @Then("I receive HTTP response code 200")
    public void validatePutHttpResponse200(){
        put.receivedHttpResponseCode200();
    }
    @And("I receive valid user latest data")
    public void validateUserLatestData(){
        put.validateDataLatestUser();
    }


}
