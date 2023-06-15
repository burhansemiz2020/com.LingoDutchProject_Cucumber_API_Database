import org.json.JSONObject;
import org.junit.Test;

public class test04 {
    @Test
    public void test4(){
        JSONObject obj1=new JSONObject();
        obj1.put("title","David");
        obj1.put("body","Hello");
        obj1.put("userID",1);
        System.out.println(obj1);
    }
}
