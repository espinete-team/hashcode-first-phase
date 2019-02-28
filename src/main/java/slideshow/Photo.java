package slideshow;

import java.util.ArrayList;
import java.util.List;

public class Photo {

	private int id;
	private String orientation;
	private List<String> tags;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrientation() {
		return orientation;
	}

	public void setOrientation(String orientation) {
		this.orientation = orientation;
	}

	public List<String> getTags() {
		if (tags == null) {
			tags = new ArrayList<String>();
		}

		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

}
