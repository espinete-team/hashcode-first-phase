package slideshow;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReadInput {

	public static final String A_EXAMPLE = "src/main/resources/a_example.txt";
	public static final String LOVELY_LANDSCAPES = "src/main/resources/b_lovely_landscapes.txt";
	public static final String MEMORABLE_MOMENTS = "src/main/resources/c_memorable_moments.txt";
	public static final String PET_PICTURES = "src/main/resources/d_pet_pictures.txt";
	public static final String SHINY_SELFIES = "src/main/resources/e_shiny_selfies.txt";
	
	private String input;
	
	public ReadInput(String path) {
		this.input = getStringFromFile(path);
	}

	public String getStringFromFile(String input) {
		String content = "";

		try {
			content = new String(Files.readAllBytes(Paths.get(input)));
		} catch (IOException e) {
			e.printStackTrace();
		}

		return content;
	}

	public int getNumberOfPhotos(String content) {
		String number = content.split("\n")[0];

		return Integer.valueOf(number);
	}

	public List<Photo> getPhotosFromString() {
		String[] content = input.split("\n");
		List<Photo> photos = new ArrayList<>();

		for (int i = 1; i < content.length; i++) {
			String word[] = content[i].split(" ");

			Photo photo = new Photo();
			photo.setId(i - 1);
			photo.setOrientation(word[0]);

			for (int j = 2; j < Integer.valueOf(word[1])+2; j++) {
				photo.getTags().add(word[j]);
			}

			photos.add(photo);
		}

		return photos;
	}

}
