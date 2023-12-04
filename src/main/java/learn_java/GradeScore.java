package learn_java;

public class GradeScore {
    private String[] studentNames;
    private String[] subjects;
    private double[][] grades;

    public GradeScore(String[] studentNames, String[] subjects, double[][] grades) {
        this.studentNames = studentNames;
        this.subjects = subjects;
        this.grades = grades;
    }

    public void outputGrades() {
        System.out.println("The score breakdown of the students");

        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("-----------------");
            System.out.println("Student: " + studentNames[i]);

            System.out.print("Subjects: ");
            for (String subject : subjects) {
                System.out.printf("%s",subject);
            }
            System.out.println();

            int totalScore = calculateTotalScore(grades[i]);
            double averageScore = calculateAverageScore(grades[i]);
            String grade = calculateGrade(averageScore);

            System.out.println("Total Score: " + totalScore);
            System.out.println("Average Score: " + averageScore);
            System.out.println("Grade: " + grade);
        }
        System.out.println("-----------------");
    }

    private int calculateTotalScore(double[] studentGrades) {
        int total = 0;
        for (double grade : studentGrades) {
            total += grade;
        }
        return total;
    }

    private double calculateAverageScore(double[] studentGrades) {
        int total = calculateTotalScore(studentGrades);
        return (double) total / studentGrades.length;
    }

    private String calculateGrade(double averageScore) {
        if (averageScore >= 80) {
            return "A";
        } else if (averageScore >= 70) {
            return "B";
        } else if (averageScore >= 60) {
            return "C";
        } else if (averageScore >= 50) {
            return "D";
        } else if (averageScore >= 40) {
            return "E";
        }
        else
            return "F";
    }
}