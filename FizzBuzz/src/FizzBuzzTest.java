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
	
}
