public class StudentSubjectScores {

    public static void main(String[] args) {
        int[][] scores1 = {
            {80, 80, 80, 80},
            {80, 80, 80, 80},
            {80, 80, 80, 80}
        };
        manageScores(scores1);
        int[][] scores2 = {
            {85, 78, 90, 88},
            {76, 85, 83, 80},
            {91, 89, 92, 94}
        };
        manageScores(scores2);
        int[][] scores3 = {};
        manageScores(scores3);
        int[][] scores4 = {
            {70, 85, 90, 75}
        };
        manageScores(scores4);
        int[][] scores5 = {
            {75, 80, 85, 90},
            {82, 88, 76, 90},
            {90, 92, 87, 85},
            {78, 85, 80, 88},
            {85, 79, 91, 84}
        };
        manageScores(scores5);
    }

    public static void manageScores(int[][] scores) {
        if (scores.length == 0) {
            System.out.println("Average scores for each student:");
            System.out.println("Average scores for each subject:");
            return;
        }
        printAverageScoresForStudents(scores);
        printAverageScoresForSubjects(scores);
    }

    public static void printAverageScoresForStudents(int[][] scores) {
        System.out.println("Average scores for each student:");
        for (int i = 0; i < scores.length; i++) {
            double total = 0;
            for (int j = 0; j < scores[i].length; j++) {
                total += scores[i][j];
            }
            double average = total / scores[i].length;
            System.out.println("Student " + (i + 1) + ": " + average);
        }
    }

    public static void printAverageScoresForSubjects(int[][] scores) {
        int subjects = scores[0].length;
        double[] totals = new double[subjects];
        
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                totals[j] += scores[i][j];
            }
        }
        
        System.out.println("Average scores for each subject:");
        String[] subjectNames = {"Math", "Science", "English", "History"};
        
        for (int j = 0; j < subjects; j++) {
            double average = totals[j] / scores.length;
            System.out.println(subjectNames[j] + ": " + average);
        }
        System.out.println();
    }
}
