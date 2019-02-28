package slideshow;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class RetrieveSlidesAsComeAlgorithmTest {

    @Test
    public void calculateSlideShow() {
        List<Photo> photos = createRandomPhotos();
        AlgorithmSolution algorithmSolution = new RetrieveSlidesAsComeAlgorithm();
        SlideShow slideShow = algorithmSolution.calculateSlideShow(photos);
        assertEquals(4, slideShow.getSlides().size());
        assertTrue(slideShow.getSlides().get(0) instanceof HorinzontalSlide);
        assertTrue(slideShow.getSlides().get(1) instanceof HorinzontalSlide);
        assertTrue(slideShow.getSlides().get(2) instanceof VerticalSlide);
        assertTrue(slideShow.getSlides().get(3) instanceof HorinzontalSlide);
    }

    private List<Photo> createRandomPhotos() {
        List<Photo> photos = new ArrayList<>();
        Photo photo = new Photo();
        photo.setId(0);
        photo.setOrientation("H");

        Photo photo3 = new Photo();
        photo3.setId(2);
        photo3.setOrientation("V");

        Photo photo2 = new Photo();
        photo2.setId(1);
        photo2.setOrientation("H");

        Photo photo5 = new Photo();
        photo5.setId(4);
        photo5.setOrientation("V");

        Photo photo4 = new Photo();
        photo4.setId(3);
        photo4.setOrientation("H");

        photos.add(photo);
        photos.add(photo3);
        photos.add(photo2);
        photos.add(photo5);
        photos.add(photo4);
        return photos;
    }

}