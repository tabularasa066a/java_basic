import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("リンゴ", 80);
        map.put("オレンジ", 120);
        map.put("ブドウ", 90);

        System.out.println(map.get("ブドウ"));
        System.out.println(map.get("リンゴ"));
    }
}
