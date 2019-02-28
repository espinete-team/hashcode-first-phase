package slideshow;

import java.util.*;

public class VerticalSlide extends Slide {

	private Photo photo1;
	private Photo photo2;

	public Photo getPhoto1() {
		return photo1;
	}

	public void setPhoto1(Photo photo1) {
		this.photo1 = photo1;
	}

	public Photo getPhoto2() {
		return photo2;
	}

	public void setPhoto2(Photo photo2) {
		this.photo2 = photo2;
	}

	@Override
	List<String> getTags() {
		Set<String> commonTags =   new HashSet<String>(this.photo1.getTags());
		commonTags.addAll(new HashSet<String>(this.photo2.getTags()));
		return new ArrayList(commonTags);
	}
}
