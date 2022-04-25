package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Delete {
    protected static String url="https://reqres.in/api/";

    @Step
    public String setDeleteApiEndpoints(){
        return url+"users/2";
    }
    @Step
    public void sendDeleteHttpRequest(){
        SerenityRest.given().delete(setDeleteApiEndpoints());
    }
    @Step
    public void validateHttpResponseCode204(){
        restAssuredThat(response->response.statusCode(204));
    }

}
