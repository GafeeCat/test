import java.util.HashMap;
import java.util.Map;

/**
 * Created by leeqi on 2019/9/11.
 */
public class Test {
    String str = new String("good");
    char[] chs = {'a','b','c'};

    public static void main(String[] args) {
        Test tt = new Test();
        tt.change(tt.str, tt.chs);
        System.out.println(tt.str + " and " + String.valueOf(tt.chs));
    }

    public void change(String str, char[] chs){
        //不加this，只是局部变量
        str = "test";
        chs[0] = 'g';
    }
    Map<String, String> m1 = new HashMap<String, String>();
    StringBuilder sb = new StringBuilder();
}
