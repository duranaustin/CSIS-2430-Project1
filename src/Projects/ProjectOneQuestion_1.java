package Projects;
import Resources.Calculate;
import java.util.HashSet;

/**
 * @Authors: Jorge Jimenez, Pauline Makoma, Christian Makoma, Austin Duran
 * @Project 1 Question 1
 * @Course CSIS-2430
 */
public class ProjectOneQuestion_1 extends Calculate {
    //Sets -- mutable
    HashSet<Integer> set = new HashSet(); //for Q1 'set of n elements'
    HashSet<Integer> subSetA = new HashSet<>(); //for Q1 'subset A'
    HashSet<Integer> subSetB = new HashSet<>(); //for Q1 'subset B'

    //Arrays -- immutable once set
    Object[] setArray; //for Q1 'set of n elements'
    Object[] subsetaArray; //for Q1 'subset A'
    Object[] subsetbArray; //for Q1 'subset B'

    //Question/Computer Project 1 - Subsets
    HashSet<Integer> Q1answerComplementA; //for Q1 - '`A'
    HashSet<Integer> Q1answerUnionAB; //for Q1 - 'A U B'
    HashSet<Integer> Q1answerIntersectionAB; //for Q1 - 'A ^ B'
    HashSet<Integer> Q1answerDifferenceAB; //for Q1 - 'A - B'
    HashSet<Integer> Q1answerSymmetricDifferenceAB; //for Q1 - 'A (+) B'


    public ProjectOneQuestion_1(){
        setSet(); //hardcoded integer set from 0-9
        setSubsets(); //subset A and subset B are set randomly
        initAnswerSets(); //initialize answer sets
        Q1answerComplementA = findComplementOfA(subSetA, subSetB, subsetaArray, subsetbArray); //find answer to  Q1 - '`A'
        Q1answerUnionAB = findUnionAB(subSetA, subSetB, subsetaArray, subsetbArray); //find answer to Q1 - 'A U B'
        Q1answerIntersectionAB = findIntersectionAB(subSetA, subSetB, subsetaArray, subsetbArray); //find answer to Q1 - 'A ^ B'
        Q1answerDifferenceAB = findDifferenceAB(subSetA, subSetB, subsetaArray, subsetbArray); //find answer to Q1 - 'A - B'
        Q1answerSymmetricDifferenceAB = findSymmetricDifferenceAB(subSetA, subSetB, subsetaArray, subsetbArray); //find answer to Q1 - 'A (+) B'
    }

    /**
     * Initialization of answer sets
     */
    private void initAnswerSets() {
        //Question/Computer Project 1 - Subsets
        Q1answerComplementA = new HashSet();
        Q1answerUnionAB = new HashSet();
        Q1answerIntersectionAB = new HashSet();
        Q1answerDifferenceAB = new HashSet();
        Q1answerSymmetricDifferenceAB = new HashSet();
    }

    /**
     * setSet sets the Set from 0-9
     * setArray is also initialized
     */
    public void setSet() {
        for (int i = 0; i < 10; i++){
            set.add(i);
        }
        setArray = set.toArray();
    }

    /**
     * setSubsets sets subset a and subset b with random integers out of the main set
     * setArrayA is also initialized
     * setArrayB is also initialized
     */
    public void setSubsets() {
        int randomSubSetLength = random.nextInt(setArray.length);
        for(int i = 0; i < randomSubSetLength; i++){
            subSetA.add((Integer) setArray[i]); //set subSet A with first random part of 'setArray'
        }
        subsetaArray = subSetA.toArray(); //initialize subsetaArray with subSetA
        for(int i = randomSubSetLength; i != setArray.length; i++){
            subSetB.add((Integer) setArray[i]); //set subSet B with last random part of 'setArray'
        }
        subSetB.add(1);
        subSetB.add(2);
        subSetB.add(3);
        subsetbArray = subSetB.toArray(); //initialize subsetbArray with subSetB
    }

    /**
     * getAnswer
     * @return
     */
    public void getAnswer() {
        System.out.println("Question 1 - 'Complement of A' used Set: ");
        System.out.println(subSetA.toString());
        System.out.println("Question 1 - 'Complement of A' answer is: ");
        System.out.println("A = " + Q1answerComplementA.toString());
        System.out.println();
        System.out.println();
        System.out.println("Question 1 - 'A UNION B' used Sets: ");
        System.out.println("A = " +subSetA.toString());
        System.out.println("B = " +subSetB.toString());
        System.out.println("Question 1 - 'A UNION B' answer is: ");
        System.out.println(Q1answerUnionAB.toString());
        System.out.println();
        System.out.println();
        System.out.println("Question 1 - 'A INTERSECTION B' used Sets: ");
        System.out.println("A = " +subSetA.toString());
        System.out.println("B = " +subSetB.toString());
        System.out.println("Question 1 - 'A INTERSECTION B' answer is: ");
        System.out.println(Q1answerIntersectionAB.toString());
        System.out.println();
        System.out.println();
        System.out.println("Question 1 - 'A DIFFERENCE B' used Sets: ");
        System.out.println("A = " +subSetA.toString());
        System.out.println("B = " +subSetB.toString());
        System.out.println("Question 1 - 'A DIFFERENCE B' answer is: ");
        System.out.println(Q1answerDifferenceAB.toString());
        System.out.println();
        System.out.println();
        System.out.println("Question 1 - 'A SYMMETRIC DIFFERENCE B' used Sets: ");
        System.out.println("A = " +subSetA.toString());
        System.out.println("B = " +subSetB.toString());
        System.out.println("Question 1 - 'A SYMMETRIC DIFFERENCE B' answer is: ");
        System.out.println(Q1answerSymmetricDifferenceAB.toString());
        System.out.println();
        System.out.println();
    }
}
