package slideshow;

import java.io.File;
import java.util.List;

public class Main {

	private static final AlgorithmSolution retrieveSlidesAsComeAlgorithm = new RetrieveSlidesAsComeAlgorithm();
	private static final AlgorithmSolution retrieveHorizontalSlidesFirstAlgorithm = new RetrieveHorizontalSlidesFirstAlgorithm();
	private static final AlgorithmSolution basicBacktrackAlgorithm = new BasicBacktrack();

	public static void main(String[] args) {
		calculateSolution(ReadInput.A_EXAMPLE);
		calculateSolution(ReadInput.LOVELY_LANDSCAPES);
		calculateSolution(ReadInput.MEMORABLE_MOMENTS);
		calculateSolution(ReadInput.PET_PICTURES);
		calculateSolution(ReadInput.SHINY_SELFIES);
	}

	private static void calculateSolution(String input) {
		ReadInput readInput = new ReadInput(input);
		List<Photo> photos = readInput.getPhotosFromString();
		SlideShow slideShow1 = retrieveSlidesAsComeAlgorithm.calculateSlideShow(photos);
		SlideShow slideShow2 = retrieveHorizontalSlidesFirstAlgorithm.calculateSlideShow(photos);
		SlideShow slideShow3 = basicBacktrackAlgorithm.calculateSlideShow(photos);
		Integer score1 = slideShow1.calculateTotalScore();
		Integer score2 = slideShow2.calculateTotalScore();
		Integer score3 = slideShow3.calculateTotalScore();
		ExportOutput exportOutput = new ExportOutput();
		if(score1 >= score2 && score1 >= score3){
			String output = exportOutput.outputSlideShow(slideShow1);
			exportOutput.createFile(ExportOutput.MAIN_RESOURCES + "/" + "alg1-result-" + new File(input).getName(),
					output);
		}
		System.out.println("Total score for " + input + " using algoritm 1: " + score1);

		if(score2 > score1 && score2 >= score3){
			String output = exportOutput.outputSlideShow(slideShow2);
			exportOutput.createFile(ExportOutput.MAIN_RESOURCES + "/" + "alg2-result-" + new File(input).getName(),
					output);
		}
		System.out.println("Total score for " + input + " using algoritm 2: " + score2);
		if(score3 > score1 && score3 > score2) {
			String output = exportOutput.outputSlideShow(slideShow3);
			exportOutput.createFile(ExportOutput.MAIN_RESOURCES + "/" + "alg3-result-" + new File(input).getName(),
					output);
		}


		System.out.println("Total score for " + input + " using algoritm 3: " + score3);
	}

}
