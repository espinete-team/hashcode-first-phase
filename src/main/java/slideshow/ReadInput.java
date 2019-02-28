package slideshow;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadInput {
	
	private final String A_EXAMPLE = "src/main/resources/a_example.txt";

	public String getStringFromFile() {
		String content = "";

		try {
			content = new String(Files.readAllBytes(Paths.get(A_EXAMPLE)));
		} catch (IOException e) {
			e.printStackTrace();
		}

		return content;
	}

}
