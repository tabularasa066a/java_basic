package OOP;

class JSample5_3{
    public static void main(String args[]){
      Television tv1 = new Television("居間");
      tv1.dispChannel();
  
      Television tv2 = new Television();
      tv2.dispChannel();
    }
  }
  
  class Television{
    private int channelNo;
    private String place;
  
    Television(){
      this("未定");
    }
  
    Television(String newPlace){
      channelNo = 1;
      place = newPlace;
    }
  
    public void setChannel(int newChannelNo){
      channelNo = newChannelNo;
    }
  
    public void dispChannel(){
      System.out.println("現在のチャンネルは" + channelNo+ "です");
      System.out.println("設置してある場所は" + place + "です");
    }
  }