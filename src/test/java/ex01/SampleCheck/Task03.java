package ex01.SampleCheck;

import io.restassured.RestAssured;

public class Task03 {
    public static void main(String[] args) {
        // Given() -> Pre Req. - URL, Headers, Auth, Body....
        // When() -> HTTP method? - GET/POST/PUT/PATCH, DELETE...
        // Then() -> Validation -> 200 oK, firstname == Garima

        // Full URL - https://api.zippopotam.us/IN/734005
        // base URI - https://api.zippopotam.us
        // bath Path - /IN/560016

        RestAssured
                .given()
                    .baseUri("https://api.zippopotam.us")
                    .basePath("/IN/560016")
                .when()
                    .get()
                .then()
                    .log().all().statusCode(200);

        // Expected status code <404> but was <200>

    }
}
