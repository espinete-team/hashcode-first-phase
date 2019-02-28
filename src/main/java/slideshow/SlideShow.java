package slideshow;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SlideShow {

	public SlideShow(){
		this.totalScore = 0;
	}

	private Integer totalScore;

	private List<Slide> slides;

	public List<Slide> getSlides() {
		if(slides == null) {
			slides = new ArrayList<Slide>();
		}
		
		return slides;
	}

	public void setSlides(List<Slide> slides) {
		this.slides = slides;
	}

	public Integer getTotalScore(){
		return this.totalScore;
	}

	public Integer calculateTotalScore(){
		return this.totalScore;
	}

	public Integer swap(Integer slide1, Integer slide2){
		return totalScore;
	}



}