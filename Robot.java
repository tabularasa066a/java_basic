class Robot{
  int currentPosition = 0;

  public static void main(String[] args) {
    Robot robot = new Robot();
    robot.greet("goodby");

    robot.report();
    robot.moveForward();
    robot.report();

  }

  void greet(String msg) {
    System.out.println(msg);
  }

  void report(){
    System.out.println("Current Position = " + this.currentPosition);
  }

  void moveForward() {
    this.currentPosition += 1;
  }

}
