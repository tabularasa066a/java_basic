class JSampla1_3 {
    public static void main(String[] args) {
        int[][] num = new int[2][3];
        
        num[0][0] = 10;
        num[0][1] = 11;
        num[0][2] = 12;

        num[1][0] = 20;
        num[1][1] = 21;
        num[1][2] = 22;

        for (int i=0; i < num.length; i++) {
            for (int j=0; j < num[i].length; j++){
                System.out.println("i = " + i + "; j= " + j + "; num = "+ num[i][j]);
            }
        }

    }
}