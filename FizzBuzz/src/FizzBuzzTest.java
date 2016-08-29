import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

	private FizzBuzz fb;
	
	@Before
	public void setUp() throws Exception {
		fb = new FizzBuzz();
	}
	
	@Test
	public void canPlay() {
		fb.play(1);
	}
	
	@Test
	public void oneReturnsOne() {
		String result = fb.play(1);
		assertEquals("1", result);
	}
	
	@Test
	public void twoReturnsTwo() {
		String result = fb.play(2);
		assertEquals("2", result);
	}
	
	@Test
	public void threeReturnsFizz() {
		String result = fb.play(3);
		assertEquals("Fizz", result);
	}
	
	@Test
	public void fiveReturnsBuzz() {
		String result = fb.play(5);
		assertEquals("Buzz", result);
	}
	
	@Test
	public void fifteenReturnsFizzBuzz() {
		String result = fb.play(15);
		assertEquals("FizzBuzz", result);
	}
	
	@Test
	public void multiplesOfThreeReturnFizz() {
		assertEquals("Fizz", fb.play(3));
		assertEquals("Fizz", fb.play(6));
		assertEquals("Fizz", fb.play(9));
		assertEquals("Fizz", fb.play(12));
		assertEquals("Fizz", fb.play(18));
		assertEquals("Fizz", fb.play(21));
	}

	@Test
	public void multiplesOfFiveReturnBuzz() {
		assertEquals("Buzz", fb.play(5));
		assertEquals("Buzz", fb.play(10));
		assertEquals("Buzz", fb.play(20));
		assertEquals("Buzz", fb.play(25));
		assertEquals("Buzz", fb.play(35));
		assertEquals("Buzz", fb.play(40));
	}
	
	@Test
	public void multiplesOfFifteenReturnFizzBuzz() {
		assertEquals("FizzBuzz", fb.play(15));
		assertEquals("FizzBuzz", fb.play(30));
		assertEquals("FizzBuzz", fb.play(45));
		assertEquals("FizzBuzz", fb.play(60));
		assertEquals("FizzBuzz", fb.play(75));
		assertEquals("FizzBuzz", fb.play(90));
	}
	
	@Test
	public void nonMultpplesOfThreeAndFiveReturnNumber() {
		assertEquals("2", fb.play(2));
		assertEquals("8", fb.play(8));
		assertEquals("13", fb.play(13));
		assertEquals("26", fb.play(26));
		assertEquals("98", fb.play(98));
		assertEquals("94", fb.play(94));
	}
	
}
