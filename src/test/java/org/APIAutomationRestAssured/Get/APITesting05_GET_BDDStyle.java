package org.APIAutomationRestAssured.Get;

import io.restassured.RestAssured;

public class APITesting05_GET_BDDStyle {

        // Base, URL,
        public static void main(String[] args) {

            String pincode = "560016";

            RestAssured.given()
                    .baseUri("https://api.zippopotam.us")
                    .basePath("/IN/"+pincode)
                    .when().log().all().get()
                    .then().log().all().statusCode(200);

            pincode = "-1";
            RestAssured.given()
                    .baseUri("https://api.zippopotam.us")
                    .basePath("/IN/"+pincode)
                    .when().log().all().get()
                    .then().log().all().statusCode(404);
        }
    }

    // org.APIAutomationRestAssured.Get.APITesting07_GET_NonBDDStyle