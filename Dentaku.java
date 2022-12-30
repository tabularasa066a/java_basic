import java.util.Arrays;
class Dentaku{
  public static void main(String[] args) {
    int val1 = 0;
    int val2 = 0;
    String ope;
    int kekka = 0;

    if (args.length != 3) {
      errDisp("引数は3個入力して下さい");
    }

    String[] registerdOpes = {"kake", "waru", "tasu", "hiku"};
    boolean errFlag = true;
    if (Arrays.asList(registerdOpes).contains(args[1])) {
      errFlag = false;
    }
    if (errFlag == true){
      errDisp("演算子は kake waru tasu hiku の4つです");
    }
    ope = args[1];

    try {
      val1 = Integer.parseInt(args[0]);
      val2 = Integer.parseInt(args[2]);
    } catch(NumberFormatException e){
      errDisp("数値でない値が入力されています");
    }

    if (ope.equals("tasu")) {
      kekka = val1 + val2;
    } else if (ope.equals("hiku")) {
      kekka = val1 - val2;
    } else if (ope.equals("kake")) {
      kekka = val1 * val2;
    } else if (ope.equals("waru")) {
      if (val2 == 0) {
        errDisp("0で割ろうとしました");
      }
      kekka = val1 / val2;
    } else {
      errDisp("?");
    }


    System.out.println("入力された式は " + val1 + " " + ope + " " + val2 + " です");
    System.out.println("計算結果は " + kekka + " です");
  }

  private static void errDisp(String errStr){
    System.out.println("Usage : java dentaku 数値 演算子 数値");
    System.out.println(errStr);
    System.exit(0);  /* プログラムを終了する */
  }
}
