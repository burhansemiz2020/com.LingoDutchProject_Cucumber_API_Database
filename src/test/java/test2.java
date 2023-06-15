import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class test2 {
    @Test
    public void test02(){
        String url="https://lingodutch.nl/version.txt";
        Response response = given().when().get(url);
        System.out.println("status code: "+response.getStatusCode()+
                "\ncontent type: "+response.getContentType()+
                "\ncontent length: "+response.getHeader("Content-Length")+
                "\nlast modified: "+response.getHeader("Last-Modified")+
                "\nconnection: "+response.getHeader("Connection")+
                "\ne-tag: "+response.getHeader("ETag")+
                "\nresponse time: "+ response.getTime()+"ms"+
                "\naccepte reanges: "+response.getHeader("Accept-Ranges"));



    }
}
