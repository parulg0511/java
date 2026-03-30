package Java_Core;

public class StudentReportCard {
	public static void main(String[] args) {

        // Hardcoded marks for 5 subjects
        int maths = 88;
        int science = 76;
        int english = 92;
        int history = 68;
        int javaProg = 95;

        // Print subject-wise marks
        System.out.println("Maths: " + maths + "  Science: " + science + "  English: " + english +
                           "  History: " + history + "  Java: " + javaProg);

        // Calculate total and percentage
        int total = maths + science + english + history + javaProg;
        double percentage = total / 5.0;

        System.out.println("Total: " + total + "  Percentage: " + percentage + "%");

        // Assign grade using if-else
        String grade;
        if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B";
        } else if (percentage >= 60) {
            grade = "C";
        } else if (percentage >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Check pass/fail (all subjects >= 40)
        boolean passedAll = (maths >= 40 && science >= 40 && english >= 40 && history >= 40 && javaProg >= 40);
        String status = passedAll ? "PASS" : "FAIL";

        System.out.println("Grade: " + grade + "  Status: " + status);

        // Determine highest scoring subject
        int maxScore = maths;
        String highestSubj = "Maths";

        if (science > maxScore) { maxScore = science; highestSubj = "Science"; }
        if (english > maxScore) { maxScore = english; highestSubj = "English"; }
        if (history > maxScore) { maxScore = history; highestSubj = "History"; }
        if (javaProg > maxScore) { maxScore = javaProg; highestSubj = "Java"; }

        // Determine lowest scoring subject
        int minScore = maths;
        String lowestSubj = "Maths";

        if (science < minScore) { minScore = science; lowestSubj = "Science"; }
        if (english < minScore) { minScore = english; lowestSubj = "English"; }
        if (history < minScore) { minScore = history; lowestSubj = "History"; }
        if (javaProg < minScore) { minScore = javaProg; lowestSubj = "Java"; }

        System.out.println("Highest Scoring Subject: " + highestSubj + " (" + maxScore + ")");
        System.out.println("Lowest Scoring Subject: " + lowestSubj + " (" + minScore + ")");

        // Scholarship eligibility: percentage >= 85 AND passed all subjects
        String scholarship = (percentage >= 85 && passedAll) ? "Eligible for Merit Scholarship" :
                             "Not Eligible (below 85% or failed a subject)";
        System.out.println("Scholarship: " + scholarship);
    }

}
