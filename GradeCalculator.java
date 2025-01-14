public class GradeCalculator {
    // Method to calculate average grade
    public static double calculateAverage(int[] grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    public static void main(String[] args) {
        int[] grades = {85, 90, 78, 92};
        double average = calculateAverage(grades);
        System.out.println("The average grade is: " + average);
    }
}

