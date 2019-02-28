package slideshow;

public class Main {

	private static final AlgorithmSolution retrieveSlidesAsComeAlgorithm = new RetrieveSlidesAsComeAlgorithm();
	private static final AlgorithmSolution retrieveHorizontalSlidesFirstAlgorithm = new RetrieveHorizontalSlidesFirstAlgorithm();

	public static void main(String[] args) {
		calculateSolution(ReadInput.A_EXAMPLE);
		calculateSolution(ReadInput.LOVELY_LANDSCAPES);
		calculateSolution(ReadInput.MEMORABLE_MOMENTS);
		calculateSolution(ReadInput.PET_PICTURES);
		calculateSolution(ReadInput.SHINY_SELFIES);
	}

	private static void calculateSolution(String input) {
		ReadInput readInput = new ReadInput(input);
		SlideShow slideShow1 = retrieveSlidesAsComeAlgorithm.calculateSlideShow(readInput.getPhotosFromString());
		SlideShow slideShow2 = retrieveHorizontalSlidesFirstAlgorithm.calculateSlideShow(readInput.getPhotosFromString());
		Integer score1 = slideShow1.calculateTotalScore();
		Integer score2 = slideShow2.calculateTotalScore();
		System.out.println("Total score for " + input + " using algoritm 1: " + score1);
		System.out.println("Total score for " + input + " using algoritm 2: " + score2);
	}

}
