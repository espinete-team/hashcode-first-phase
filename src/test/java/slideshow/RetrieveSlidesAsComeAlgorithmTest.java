package slideshow;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class RetrieveSlidesAsComeAlgorithmTest {

    @Test
    public void calculateSlideShow() {
        List<Photo> photos = new ArrayList<Photo>();
        Photo photo = new Photo();
        photo.setId(0);
        photo.setOrientation("H");

        Photo photo2 = new Photo();
        photo2.setId(1);
        photo2.setOrientation("H");

        Photo photo3 = new Photo();
        photo3.setId(2);
        photo3.setOrientation("V");

        photos.add(photo);
        photos.add(photo2);
        photos.add(photo3);

        AlgorithmSolution algorithmSolution = new RetrieveSlidesAsComeAlgorithm();
        SlideShow slideShow = algorithmSolution.calculateSlideShow(photos);
        assertEquals(2, slideShow.getSlides().size());
    }
}