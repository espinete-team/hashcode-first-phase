package slideshow;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static slideshow.ReadInput.A_EXAMPLE;

public class ReadInputTest {
	
	ReadInput readInput;
	
	@Before
	public void setUp() {
		readInput = new ReadInput(A_EXAMPLE);
	}
	
	@Test
	public void testWhenStringisPassedReturnsPhotoCollection() {
		List<Photo> photos = readInput.getPhotosFromString();
		
		Assert.assertEquals(4, photos.size());
		
		Assert.assertEquals("H", photos.get(0).getOrientation());
		Assert.assertEquals("cat", photos.get(0).getTags().get(0));
		Assert.assertEquals("beach", photos.get(0).getTags().get(1));
		Assert.assertEquals("sun", photos.get(0).getTags().get(2));
		
		Assert.assertEquals("V", photos.get(1).getOrientation());
		Assert.assertEquals("selfie", photos.get(1).getTags().get(0));
		Assert.assertEquals("smile", photos.get(1).getTags().get(1));
		
		Assert.assertEquals("V", photos.get(2).getOrientation());
		Assert.assertEquals("garden", photos.get(2).getTags().get(0));
		Assert.assertEquals("selfie", photos.get(2).getTags().get(1));
		
		Assert.assertEquals("H", photos.get(3).getOrientation());
		Assert.assertEquals("garden", photos.get(3).getTags().get(0));
		Assert.assertEquals("cat", photos.get(3).getTags().get(1));
	}
	
}