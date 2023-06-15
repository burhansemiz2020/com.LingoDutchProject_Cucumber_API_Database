import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class test1 {
    @Test
    public void get01(){
        String url="https://lingodutch.nl/version.txt";

        Response response= given().when().get(url);
        response.prettyPrint();
    }
}
