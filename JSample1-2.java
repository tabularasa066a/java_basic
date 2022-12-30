class JSampla1_2{
    public static void main(String[] args) {
        int num = 5;
        
        do {
            System.out.println("num = " + num);

            num -= 2;

            if (num < 0) {
                break;
            }
        } while(true);
    }
}