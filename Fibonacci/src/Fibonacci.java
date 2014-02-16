import java.util.ArrayList;

public class Fibonacci {

  int number;
  ArrayList<Integer> fibStore = new ArrayList<Integer>();

  public Fibonacci(int number) {
    this.number = number;
    fibStore.add(0);
    fibStore.add(1);
  }

  private void outputFibonacci() {

    System.out.print(fibStore.get(0).toString() + "," + fibStore.get(1).toString());

    for (int index = 2; index < number; index++) {
      int nextNum = fibStore.get(index - 2).intValue() + fibStore.get(index - 1);
      fibStore.add(nextNum);
      System.out.print("," + nextNum);
    }
  }

  public static void main(String[] args) {
    new Fibonacci(11).outputFibonacci();
  }

}
