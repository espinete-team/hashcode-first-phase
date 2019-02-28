package slideshow;

import java.util.Collections;
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
		Integer count = 0;
		for(int i = 0; i<slides.size()-1; i++ ){
			count += this.slides.get(i).getInterest(this.slides.get(i+1));
		}
		this.totalScore = count;
		return this.totalScore;
	}

	public Integer swap(Integer slide1, Integer slide2){
		this.substractBoundaries(slide1);
		this.substractBoundaries(slide2);
		Collections.swap(this.slides, slide1, slide2);
		this.addBoundaries(slide1);
		this.addBoundaries(slide2);
		return this.totalScore;

	}

	private void substractBoundaries(Integer position){
		if(position>0){
			this.totalScore = this.totalScore - this.slides.get(position).getInterest(this.slides.get(position-1));
		}
		if(position<this.slides.size()-1){
			this.totalScore = this.totalScore - this.slides.get(position).getInterest(this.slides.get(position+1));
		}
	}

	private void addBoundaries(Integer position){
		if(position>0){
			this.totalScore = this.totalScore + this.slides.get(position).getInterest(this.slides.get(position-1));
		}
		if(position<this.slides.size()-1){
			this.totalScore = this.totalScore + this.slides.get(position).getInterest(this.slides.get(position+1));
		}
	}



}