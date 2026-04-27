public class StudentScores {

    public static void main(String[] args) {
       
        int[] scores1 = {85, 92, 78, 90, 88};
        manageScores(scores1);
        int[] scores2 = {70, 80, 90, 100, 60};
        manageScores(scores2);
        int[] scores3 = {55, 65, 75, 85, 95};
        manageScores(scores3);
        int[] scores4 = {100, 100, 100, 100, 100};
        manageScores(scores4);
        int[] scores5 = {45, 55, 65, 35, 25};
        manageScores(scores5);
    }

    public static void manageScores(int[] scores) {
        int total = 0;
        int highest=0;
        int lowest=0 ;
        for(int score : scores) {
            total += score;
            if(score > highest) {
                highest = score;
            }
            if(score < lowest) {
                lowest = score;
            }
        }

        double average = (double)total/scores.length;
        System.out.print("Scores: ");
        for (int score : scores) {
            System.out.print(score + " ");
        }
        System.out.println();
        System.out.println("Average Score: " + average);
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);
        System.out.println();
    }
}
