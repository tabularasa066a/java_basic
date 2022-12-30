import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Orange");

        for (String s: list) {
            System.out.println(s);
        }

        System.out.println("-- --");
        list.add(1, "Grapes");

        for (int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("-- --");
        list.remove(0);

        for (String s: list) {
            System.out.println(s);
        }

    }
}
