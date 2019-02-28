package slideshow;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExportOutput {
	
	public static final String MAIN_RESOURCES = "src/main/resources";
	public static final String TEST_RESOURCES = "src/test/resources";

	public void createFile(String path, String output) {
		try {
			Files.write(Paths.get(path), output.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String outputSlideShow(SlideShow slideShow) {
		final StringBuilder output = new StringBuilder();
		output.append(slideShow.getSlides().size()).append("\n");

		slideShow.getSlides().stream().forEach(slide -> {
			if (slide instanceof VerticalSlide) {
				VerticalSlide verticalSlide = (VerticalSlide) slide;
				output.append(verticalSlide.getPhoto1().getId()).append(" ").append(verticalSlide.getPhoto2().getId()).append("\n");
			} else if (slide instanceof HorinzontalSlide) {
				HorinzontalSlide horizontalSlide = (HorinzontalSlide) slide;
				output.append(horizontalSlide.getPhoto().getId()).append("\n");
			}
		});
		
		return output.toString();
	}

}
