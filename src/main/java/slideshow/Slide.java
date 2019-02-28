package slideshow;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class Slide {
	
	protected List<String> tags;

	abstract List<String> getTags();

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public Integer getInterest(Slide slide){
		return this.getMinium(this.getIntersectionScore(slide), this.getOwnScore(slide), this.getTheirsScore(slide));
	}

	private Integer getIntersectionScore(Slide slide){
		Set<String> own = new HashSet<>(this.getTags());
		Set<String> theirs = new HashSet<>(slide.getTags());
		own.retainAll(theirs);
		return own.size();
	}

	private Integer getOwnScore(Slide slide){
		Set<String> own = new HashSet<>(this.getTags());
		Set<String> own2 = new HashSet<>(this.getTags());
		Set<String> theirs = new HashSet<>(slide.getTags());
		own.retainAll(theirs);
		own2.removeAll(own);
		return own2.size();
	}

	private Integer getTheirsScore(Slide slide){
		Set<String> own = new HashSet<>(this.getTags());
		Set<String> theirs = new HashSet<>(slide.getTags());
		own.retainAll(theirs);
		theirs.removeAll(own);
		return theirs.size();
	}

	private Integer getMinium(Integer interesect, Integer own, Integer theirs){
		return Math.min(interesect, Math.min(own, theirs));
	}

	public static Integer interestBetween(Slide slide1,  Slide slide2){
		return slide1.getInterest(slide2);
	}

}
