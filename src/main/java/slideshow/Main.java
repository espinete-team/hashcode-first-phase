package slideshow;

public class Main {

	public static void main(String[] args) {
		AlgorithmSolution algorithmSolution1 = new RetrieveSlidesAsComeAlgorithm();
		AlgorithmSolution algorithmSolution2 = new RetrieveHorizontalSlidesFirstAlgorithm();
		ReadInput readInput = new ReadInput(ReadInput.A_EXAMPLE);
		SlideShow slideShow1 = algorithmSolution1.calculateSlideShow(readInput.getPhotosFromString());
		Integer score1 = slideShow1.calculateTotalScore();
		System.out.println("Total score for " + ReadInput.A_EXAMPLE + " using algoritm 1 :" + score1);
		SlideShow slideShow2 = algorithmSolution2.calculateSlideShow(readInput.getPhotosFromString());
		Integer score2 = slideShow2.calculateTotalScore();
		System.out.println("Total score for " + ReadInput.A_EXAMPLE + " using algoritm 2 :" + score2);
	}

}
