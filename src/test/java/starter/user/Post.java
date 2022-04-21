package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class Post {
    protected static String url="https://reqres.in/api/";

    @Step("I set POST api endpoints")
    public String setApiEndpoints(){
        return url+"users/2";
    }
    @Step("I send POST HTTP request")
    public void sendPostHttpRequest(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "morpheus");
        requestBody.put("job", "leader");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setApiEndpoints());

    }
    @Step("I receive valid HTTP response code 201")
    public void receivedHttpResponseCode201(){
        restAssuredThat(response->response.statusCode(201));
    }
    @Step("I receive valid data for new user")
    public void validateDataForDetailUser(){
        restAssuredThat(response->response.body("'name'",equalTo("morpheus")));
        restAssuredThat(response->response.body("'job'",equalTo("leader")));
    }

}
