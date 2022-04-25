package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class Put {
    protected static String url="https://reqres.in/api/";

    @Step
    public String setPutApiEndpoints(){
        return url+"users/2";
    }
    @Step
    public void sendPutHttpRequest(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "morpheus");
        requestBody.put("job", "zion resident");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPutApiEndpoints());

    }
    @Step
    public void receivedHttpResponseCode200(){
        restAssuredThat(response->response.statusCode(200));
    }
    @Step
    public void validateDataLatestUser(){
        restAssuredThat(response->response.body("'name'",equalTo("morpheus")));
        restAssuredThat(response->response.body("'job'",equalTo("zion resident")));
    }

}
