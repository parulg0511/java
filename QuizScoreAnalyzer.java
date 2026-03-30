package Java_Core;

public class QuizScoreAnalyzer {

	public static void main(String[] args) {
		int[] scores = {85, 92, 78, 90, 88, 76, 95, 89};
        int highest = scores[0];
        int lowest = scores[0];
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > highest) {
                highest = scores[i];
            }
            if (scores[i] < lowest) {
                lowest = scores[i];
            }
            sum += scores[i];
        }

        // Step 4: Calculate average
        double average = (double) sum / scores.length;

        // Print results
        System.out.println("Highest score: " + highest);
        System.out.println("Lowest score: " + lowest);
        System.out.println("Average score: " + average);
    }


}


