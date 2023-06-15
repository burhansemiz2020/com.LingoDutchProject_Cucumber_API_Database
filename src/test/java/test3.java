import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class test3 {
    @Test
    public void test03(){
        String url= "https://lingodutch.nl/version.txt";
        Response response=given().when().get(url);
        //Assertion
        response
                .then()
                .assertThat()
                .statusCode(200)
                .contentType("text/plain")
                .header("Content-Length","5")
                .header("Last-Modified","Thu, 16 Mar 2023 11:52:05 GMT")
                .header("Connection","keep-alive")
                //.header("ETag","641302e5-5")
                .header("Accept-Ranges","bytes");


    }
}
