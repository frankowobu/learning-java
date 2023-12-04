package learn_java;

public class StudentGrades {
    public static void main(String[] args) {
        String[] names = {"Abel", "Ebuka", "Opeoluwa", "Frank", "Kenneth"};
        String[] subjects = {"English", "Mathematics", "Physics", "Biology", "Chemistry"};
        double[][] scores = {
                {50.0, 55.0, 45.0, 60.0, 45.0},
                {60.0, 50.0, 85.0, 81.0, 66.0},
                {44.0, 66.0, 60.0, 65.0, 88.0},
                {63.0, 65.0, 55.0, 54.0, 67.0},
                {70.0, 66.0, 49.0, 46.0, 77.0}
        };

        GradeScore gradeScore = new GradeScore(names,subjects,scores);

        gradeScore.outputGrades();
    }
}