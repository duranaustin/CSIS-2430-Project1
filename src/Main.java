import Projects.ProjectOneQuestion_1;
import Projects.ProjectOneQuestion_3;
import Projects.ProjectOneQuestion_2;

public class Main {

    public static void main(String[] args) {

        //Object Creation of Each Question
        ProjectOneQuestion_1 questionOne = new ProjectOneQuestion_1();
        ProjectOneQuestion_2 questionTwo = new ProjectOneQuestion_2();
//        ProjectOneQuestion_3 questionThree = new ProjectOneQuestion_3();

        //Get the answer for each question
        questionOne.getAnswer();
        questionTwo.getAnswer();
//        questionThree.getAnswer();
    }
}
