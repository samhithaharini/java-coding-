public class StudentGrades {

    public static void main(String[] args) {
        int[][] grades1 = {
            {85, 92},
            {78, 85},
            {90, 88},
            {95, 94},
            {80, 87}
        };
        manageGrades(grades1);
        int[][] grades2 = {
            {100, 100},
            {100, 100},
            {100, 100},
            {100, 100},
            {100, 100}
        };
        manageGrades(grades2);
        int[][] grades3 = {
            {50, 55},
            {45, 58},
            {55, 52},
            {48, 49},
            {54, 51}
        };
        manageGrades(grades3);
        int[][] grades4 = {
            {70, 95},
            {85, 40},
            {60, 78},
            {92, 88},
            {73, 55}
        };
        manageGrades(grades4);
        int[][] grades5 = {
            {0, 0},
            {0, 0},
            {0, 0},
            {0, 0},
            {0, 0}
        };
        manageGrades(grades5);
    }

    public static void manageGrades(int[][] grades) {
        printGrades(grades);
        printAverageGrades(grades);
    }

    public static void printGrades(int[][] grades) {
        System.out.println("Grades of all students:");
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Student " + (i + 1) + ": Math: " + grades[i][0] + ", Science: " + grades[i][1]);
        }
    }

    public static void printAverageGrades(int[][] grades) {
        int totalMath = 0;
        int totalScience = 0;

        for (int i = 0; i < grades.length; i++) {
            totalMath += grades[i][0];
            totalScience += grades[i][1];
        }

        double averageMath = (double) totalMath / grades.length;
        double averageScience = (double) totalScience / grades.length;

        System.out.println("Average Math grade: " + averageMath);
        System.out.println("Average Science grade: " + averageScience);
        System.out.println();
    }
}
