package slideshow;

import java.util.List;
import java.util.stream.Collectors;

public class SlideShow {

	public SlideShow(){
		this.totalScore = 0;
	}

	private Integer totalScore;

	private List<Slide> slides;

	public List<Slide> getSlides() {
		return slides;
	}

	public void setSlides(List<Slide> slides) {
		this.slides = slides;
	}

	public Integer getTotalScore(){
		return this.totalScore;
	}

	public Integer calculateTotalScore(){
		// this.totalScore = this.slides.stream().map( (Slide a, Slide b)->  a.getInterest(b)).;
		return 0;

	}

	public Integer swap(Integer slide1, Integer slide2){
		return totalScore;
	}



}