package slideshow;

import java.util.ArrayList;
import java.util.List;

public class RetrieveSlidesAsComeAlgorithm implements AlgorithmSolution {

    public SlideShow calculateSlideShow(List<Photo> photos) {
        List<Slide> slides = new ArrayList<Slide>();
        List<Photo> verticalPhotos = new ArrayList<Photo>();

        for (Photo photo : photos) {
            if ("H".equals(photo.getOrientation())) {
                HorinzontalSlide horinzontalSlide = new HorinzontalSlide();
                horinzontalSlide.setPhoto(photo);
                slides.add(horinzontalSlide);
            } else {
                verticalPhotos.add(photo);
                if (verticalPhotos.size() == 2) {
                    VerticalSlide verticalSlide = new VerticalSlide();
                    verticalSlide.setPhoto1(verticalPhotos.remove(0));
                    verticalSlide.setPhoto2(verticalPhotos.remove(0));
                    slides.add(verticalSlide);
                }
            }
        }
        SlideShow slideShow = new SlideShow();
        slideShow.setSlides(slides);
        return slideShow;
    }

}
