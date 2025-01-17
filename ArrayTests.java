import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test
  public void testReverseInPlace2(){
    int[] input1 = { 5, 3, 4 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[] { 4,3,5 }, input1);
  }

  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed2(){
    int[] input1 = {2, 3, 4};
    System.out.println(input1);
    assertArrayEquals(new int[]{4, 3, 2}, ArrayExamples.reversed(input1));
  }

  @Test 
  public void testAverageWithoutLowest(){
    double[] input1 = {1.0,1.0,1.0,1.0,5.0,6.0,7.0,8.0,9.0,10.0};
    assertEquals(7.5, ArrayExamples.averageWithoutLowest(input1), 0.0);
  }
}
