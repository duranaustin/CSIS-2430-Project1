package Projects;
import Resources.Calculate;
import java.util.HashMap;

/**
 * @Authors: Jorge Jimenez, Pauline Makoma, Christian Makoma, Austin Duran
 * @Project 1 Question 1
 * @Course CSIS-2430
 */
public class ProjectOneQuestion_3 extends Calculate {
    //Sets -- mutable
    HashMap fuzzySet = new HashMap(); //for Q1 'set of n elements'
    HashMap fuzzySetA = new HashMap<>(); //for Q1 'subset A'
    HashMap fuzzySetB = new HashMap<>(); //for Q1 'subset B'

    //Arrays -- immutable once set
    Object[] fuzzySetArray; //for Q1 'set of n elements'
    Object[] fuzzySetaArray; //for Q1 'subset A'
    Object[] fuzzySetbArray; //for Q1 'subset B'

    //Question/Computer Project 1 - Subsets
    HashMap Q3answerComplementA; //for Q1 - '`A'
    HashMap Q3answerUnionAB; //for Q1 - 'A U B'
    HashMap Q3answerIntersectionAB; //for Q1 - 'A ^ B'



    public ProjectOneQuestion_3(){
        setFuzzySetA(); //hardcoded integer set from 0-9
        setFuzzySetB(); //hardcoded integer set from 0-9
        initAnswerSets(); //initialize answer sets
//        Q3answerComplementA = findComplementOfAFuzzySet(fuzzySetA, fuzzySetB, fuzzySetaArray, fuzzySetbArray); //find answer to  Q3 - '`A'TODO
//        Q3answerUnionAB = findUnionABFuzzySet(fuzzySetA, fuzzySetB, fuzzySetaArray, fuzzySetbArray); //find answer to Q3 - 'A U B'TODO
//        Q3answerIntersectionAB = findIntersectionABFuzzySet(fuzzySetA, fuzzySetB, fuzzySetaArray, fuzzySetbArray); //find answer to Q3 - 'A ^ B'TODO
    }

    /**
     * Initialization of answer sets
     */
    private void initAnswerSets() {
        //Question/Computer Project 1 - Subsets
        Q3answerComplementA = new HashMap();
        Q3answerUnionAB = new HashMap();
        Q3answerIntersectionAB = new HashMap();
    }

    /**
     * setSet sets the Set from 0-9
     * setArray is also initialized
     */
    public void setFuzzySetA() {
        for (int i = 0; i < 10; i++){
            fuzzySetA.put(random.nextDouble(),i);
        }
    }

    /**
     * setSet sets the Set from 0-9
     * setArray is also initialized
     */
    public void setFuzzySetB() {
        for (int i = 0; i < 10; i++){
            fuzzySet.put(random.nextDouble(),i);
        }
    }

    /**
     * getAnswer
     * @return
     */
    public void getAnswer() {
        System.out.println("Question 3 - 'Complement of A' used Set: ");
        System.out.println(fuzzySetA.toString());
        System.out.println("Question 3 - 'Complement of A' answer is: ");
        System.out.println("A = " + Q3answerComplementA.toString());
        System.out.println();
        System.out.println();
        System.out.println("Question 3 - 'A UNION B' used Sets: ");
        System.out.println("A = " +fuzzySetA.toString());
        System.out.println("B = " +fuzzySetB.toString());
        System.out.println("Question 3 - 'A UNION B' answer is: ");
        System.out.println(Q3answerUnionAB.toString());
        System.out.println();
        System.out.println();
        System.out.println("Question 3 - 'A INTERSECTION B' used Sets: ");
        System.out.println("A = " +fuzzySetA.toString());
        System.out.println("B = " +fuzzySetB.toString());
        System.out.println("Question 3 - 'A INTERSECTION B' answer is: ");
        System.out.println(Q3answerIntersectionAB.toString());
        System.out.println();
        System.out.println();
    }
}
