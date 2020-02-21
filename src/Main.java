import Projects.ProjectOneQuestionOne;
import Projects.ProjectOneQuestionThree;
import Projects.ProjectOneQuestionTwo;

public class Main {

    public static void main(String[] args) {

        //Object Creation of Each Question
        ProjectOneQuestionOne questionOne = new ProjectOneQuestionOne();
        ProjectOneQuestionTwo questionTwo = new ProjectOneQuestionTwo();
        ProjectOneQuestionThree questionThree = new ProjectOneQuestionThree();
//
//        //Set Sets A and B for each question
//        questionOne.setSetA();
//        questionOne.setSetB();
//        questionTwo.setSetA();
//        questionTwo.setSetB();
//        questionThree.setSetA();
//        questionThree.setSetB();
//
        //Get the answer for each question
        questionOne.getAnswer();
        questionTwo.getAnswer();
        questionThree.getAnswer();
    }
}
