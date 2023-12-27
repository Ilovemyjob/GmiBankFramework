package gmibank.stepdefinitions;
import gmibank.utilities.ConfigReader;
import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;


public class ApiStepDefinitions {
    @Given("kullanici kendisine verilen token ile apiye baglanir")
    public void kullanici_kendisine_verilen_token_ile_apiye_baglanir() {
        Response response = given().headers(// responsu ustte alarak alttada method getirilip icinde yazdirilabiliyor

                "Authorization",
                "Bearer " + ConfigReader.getProperty("token"),//bunu kopyala ve confir yapistir
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                            .when()
                            .get(ConfigReader.getProperty("api_url"))// url
                            .then()
                            .contentType(ContentType.JSON)
                            .extract()
                            .response();

        System.out.println(response.prettyPrint());

    }
}
