package stepdefs;

import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class ApiTestSteps {

    private Response response;

    @Given("I send a GET request to {string}")
    public void iSendAGetRequestTo(String endpoint) {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
        response = given()
                .when()
                .get(endpoint)
                .then()
                .statusCode(200)
                .body("id", equalTo(1))
                .extract()
                .response();
    }
}
