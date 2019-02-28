package slideshow;

import java.util.List;

public class HorinzontalSlide extends Slide {

	private Photo photo;



	public Photo getPhoto() {
		return photo;
	}

	public void setPhoto(Photo photo) {
		this.photo = photo;
	}

	@Override
	List<String> getTags() {
		return photo.getTags();
	}
}
