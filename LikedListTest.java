import java.util.LinkedList;
import java.util.List;

public class LikedListTest {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();

        list.add("東京都");
        list.add("大阪府");

        for (String s: list) {
            System.out.println(s);
        }

        System.out.println("-- --");
        list.add(1, "神奈川県");

        for (int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("-- --");
        list.remove(0);

        for (String s:list) {
            System.out.println(s);
        }
    }
}
