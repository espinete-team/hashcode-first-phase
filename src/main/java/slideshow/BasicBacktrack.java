package slideshow;

import java.util.ArrayList;
import java.util.List;

public class BasicBacktrack implements AlgorithmSolution {
    private static final AlgorithmSolution retrieveHorizontalSlidesFirstAlgorithm = new RetrieveHorizontalSlidesFirstAlgorithm();
    @Override
    public SlideShow calculateSlideShow(List<Photo> input) {
        SlideShow first = retrieveHorizontalSlidesFirstAlgorithm.calculateSlideShow(input);
        Integer maxScore = first.calculateTotalScore();
        SlideShow maxium = new SlideShow();
        maxium.setSlides(new ArrayList<Slide>(first.getSlides()));
        for(int i = 0; i<first.getSlides().size(); i++){
            for(int j = 0; j<first.getSlides().size(); j++){
                SlideShow modifiedShow = new SlideShow();
                modifiedShow.setSlides(new ArrayList<Slide>(first.getSlides()));
                modifiedShow.setTotalScore(first.getTotalScore());
                if(modifiedShow.swap(i, j)> maxScore){
                    maxium.setSlides(modifiedShow.getSlides());
                }
            }
        }
        return maxium;
    }
}
