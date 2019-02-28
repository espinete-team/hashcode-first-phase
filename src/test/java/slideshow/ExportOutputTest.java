package slideshow;

import org.junit.Assert;
import org.junit.Test;

public class ExportOutputTest {

	@Test
	public void test() {
		ExportOutput exportOutput = new ExportOutput();

		Photo photo0 = new Photo();
		photo0.setOrientation("H");
		photo0.setId(0);

		HorinzontalSlide horizontal = new HorinzontalSlide();
		horizontal.setPhoto(photo0);

		Photo photo1 = new Photo();
		photo1.setOrientation("V");
		photo1.setId(1);

		Photo photo2 = new Photo();
		photo2.setOrientation("V");
		photo2.setId(2);

		VerticalSlide vertical = new VerticalSlide();
		vertical.setPhoto1(photo1);
		vertical.setPhoto2(photo2);

		SlideShow slideShow = new SlideShow();
		slideShow.getSlides().add(horizontal);
		slideShow.getSlides().add(vertical);

		Assert.assertNotNull(slideShow.getSlides().get(0));
		Assert.assertNotNull(slideShow.getSlides().get(1));
	}

}