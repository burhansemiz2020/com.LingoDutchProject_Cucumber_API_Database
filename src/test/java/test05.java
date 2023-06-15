import org.json.JSONObject;
import org.junit.Test;

public class test05 {
    @Test
    public void test05(){
        //Once inner olusturulur
        JSONObject dateJsonObject=new JSONObject();
        dateJsonObject.put("chekin","2018/01/01");
        dateJsonObject.put("checkout", "2019/01/01");
        //sonra outer
        JSONObject requestBody=new JSONObject();
        requestBody.put("additionalneeds","Breakfast");
        requestBody.put("bookingdates", dateJsonObject);
        requestBody.put("totalprice",111);
        requestBody.put("depositpaid",true);
        requestBody.put("lastname", "Brown");
        System.out.println(requestBody);



    }
}
