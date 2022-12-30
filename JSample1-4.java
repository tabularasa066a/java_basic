import java.util.Arrays;

class JSampla1_4 {
    public static void main(String[] args) {
        int[] a = new int[3];
        Arrays.fill(a, 10);

        for (int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }

        for (int val: a) {
            System.out.println(val);
        }

    }
}