/**
 * Created by parkercopeland on 5/4/16.
 */
public class MathTutorClient {
    public static void main(String args[]) {
        MathTutor tutor = new MathTutor();
        int choice1 = tutor.getDifficultyType();
        int choice = tutor.getQuestionType();
        tutor.askQuestions();
        tutor.printReport();
    }
}