package slideshow;

import org.junit.Assert;
import org.junit.Test;


public class ReadInputTest {
	
	@Test
	public void testWhenGetInputReturnsString() {
		ReadInput readInput = new ReadInput();
		Assert.assertEquals(String.class, readInput.getStringFromFile().getClass());
	}
	
}
