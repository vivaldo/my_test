import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class FibonacciTest {

  @Test
  public void testFibonacci() {
    ArrayList<Integer> fibStore = new ArrayList<Integer>();
    fibStore.add(0);
    fibStore.add(1);
    fibStore.add(1);
    int currentIndex = 3;
    int index = currentIndex;
    int nextNum = fibStore.get(index - 2).intValue() + fibStore.get(index - 1);
    fibStore.add(nextNum);
    assertEquals(fibStore.get(currentIndex).intValue(), 2);
  }
}
