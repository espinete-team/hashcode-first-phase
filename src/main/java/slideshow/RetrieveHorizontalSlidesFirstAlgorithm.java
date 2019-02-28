package slideshow;

import java.util.ArrayList;
import java.util.List;

public class RetrieveHorizontalSlidesFirstAlgorithm implements AlgorithmSolution {

    public SlideShow calculateSlideShow(List<Photo> photos) {
        List<Slide> slides = new ArrayList<>();
        List<Photo> verticalPhotos = new ArrayList<>();
        List<Slide> verticalSlides = new ArrayList<>();

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
                    verticalSlides.add(verticalSlide);
                }
            }
        }
        slides.addAll(verticalSlides);
        SlideShow slideShow = new SlideShow();
        slideShow.setSlides(slides);
        return slideShow;
    }

}
