package org.automation;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;


public class LoginApi {

    public static void main(String[] args) {



            // Set the base URI
            RestAssured.baseURI = "https://thinking-tester-contact-list.herokuapp.com"; // Replace with your API base URI

            // Create a JSON object for the request payload
            String loginPayload = "{ \"email\": \"harshvs18@gmail.com\", \"password\": \"Udit@1280\" }";

            // Send the POST request and get the response
                    Response response = given()
                    .header("Content-Type", "application/json")
                    .body(loginPayload)
                    .when()
                    .post("/users/login") // Replace with your API endpoint
                    .then()
                    .statusCode(200) // Replace with the expected status code
                                // Replace with the expected response body
                    .extract().response();

            // Print the response
            System.out.println(response.asString());


    }
    }