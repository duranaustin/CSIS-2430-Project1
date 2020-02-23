package Projects;
import Resources.Calculate;

import java.util.ArrayList;

/**
 * @Authors: Jorge Jimenez, Pauline Makoma, Christian Makoma, Austin Duran
 * @Project 1 Question 2
 * @Course CSIS-2430
 */
public class ProjectOneQuestion_2 extends Calculate {
    //Sets -- mutable
    ArrayList setOfUniverseInteger = new ArrayList(); //for Q2 'same universal set'
    ArrayList multiSetA = new ArrayList(); //for Q2 'multiset A'
    ArrayList multiSetB = new ArrayList(); //for Q2 'multiset B'

    //Arrays -- immutable once set
    Object[] setOfUniverseIntegerArray; //for Q2 'same universal set'
    Object[] multiSetaArray; //for Q2 'multiset A'
    Object[] multiSetbArray; //for Q2 'multiset B'

    //Question/Computer Project 2 - Multisets
    ArrayList Q2answerUnionAB; //for Q2 - 'A U B'
    ArrayList Q2answerIntersectionAB; //for Q2 - 'A ^ B'
    ArrayList Q2answerDifferenceAB; //for Q2 - 'A - B'
    ArrayList Q2answerAPlusB; //for Q2 - 'A + B'


    public ProjectOneQuestion_2(){
        setSetOfUniverseInteger(); //hardcoded set of universe Integers
        setMultiSets(); // hardcoded multisets taken from set of universe integer
        initAnswerSets(); //initialize answer sets
        Q2answerUnionAB = findUnionABArray(multiSetA, multiSetB, multiSetaArray, multiSetbArray); //find answer to Q2 - 'A U B'
        Q2answerIntersectionAB = findIntersectionABArray(multiSetA, multiSetB, multiSetaArray, multiSetbArray); //find answer to Q2 - 'A ^ B'
        Q2answerDifferenceAB = findDifferenceABArray(multiSetA, multiSetB, multiSetaArray, multiSetbArray); //find answer to Q2 - 'A - B'
        Q2answerAPlusB = findAPlusBArray(multiSetA, multiSetB, multiSetaArray, multiSetbArray); //find answer to Q2 - 'A + B'
    }

    /**
     * Initialization of answer sets
     */
    private void initAnswerSets() {
        //Question/Computer Project 2 - Multisets
        Q2answerUnionAB = new ArrayList();
        Q2answerIntersectionAB = new ArrayList();
        Q2answerDifferenceAB= new ArrayList();
        Q2answerAPlusB = new ArrayList();
    }

    /**
     * setSetOfUniverseInteger sets the universal set of type integers
     * setOfUniverseIntegerArray is also initialized
     */
    public void setSetOfUniverseInteger() {
        for (int i = 0; i < 10; i++){
            setOfUniverseInteger.add(i);
        }
        setOfUniverseIntegerArray = setOfUniverseInteger.toArray();
    }

    /**
     * setMultiSets sets multiSet a and multiSet b with random integers out of the main set
     * multiSetArrayA is also initialized
     * multiSetArrayB is also initialized
     */
    public void setMultiSets() {
        int randomSubSetLength = random.nextInt(setOfUniverseIntegerArray.length);
        for(int i = 0; i < randomSubSetLength; i++){
            multiSetA.add((Integer) setOfUniverseIntegerArray[i]); //set subSet A with first random part of 'setArray'
        }
        multiSetA.add(0);
        multiSetA.add(1);
        multiSetA.add(2);
        multiSetA.add(3);
        multiSetaArray = multiSetA.toArray(); //initialize subsetaArray with subSetA
        for(int i = randomSubSetLength; i != setOfUniverseIntegerArray.length; i++){
            multiSetB.add((Integer) setOfUniverseIntegerArray[i]); //set subSet B with last random part of 'setArray'
        }
        multiSetB.add(4);
        multiSetB.add(5);
        multiSetB.add(6);
        multiSetB.add(7);
        multiSetbArray= multiSetB.toArray(); //initialize subsetbArray with subSetB
    }

    /**
     * getAnswer
     * @return
     */
    public void getAnswer() {
        System.out.println("Question 2 - 'A UNION B' used Sets: ");
        System.out.println("A = " +multiSetA.toString());
        System.out.println("B = " +multiSetB.toString());
        System.out.println("Question 2 - 'A UNION B' answer is: ");
        System.out.println(Q2answerUnionAB.toString());
        System.out.println();
        System.out.println();
        System.out.println("Question 2 - 'A INTERSECTION B' used Sets: ");
        System.out.println("A = " +multiSetA.toString());
        System.out.println("B = " +multiSetB.toString());
        System.out.println("Question 2 - 'A INTERSECTION B' answer is: ");
        System.out.println(Q2answerIntersectionAB.toString());
        System.out.println();
        System.out.println();
        System.out.println("Question 2 - 'A DIFFERENCE B' used Sets: ");
        System.out.println("A = " +multiSetA.toString());
        System.out.println("B = " +multiSetB.toString());
        System.out.println("Question 2 - 'A DIFFERENCE B' answer is: ");
        System.out.println(Q2answerDifferenceAB.toString());
        System.out.println();
        System.out.println();
        System.out.println("Question 2 - 'A + B' used Sets: ");
        System.out.println("A = " +multiSetA.toString());
        System.out.println("B = " +multiSetB.toString());
        System.out.println("Question 2 - 'A + B' answer is: ");
        System.out.println(Q2answerAPlusB.toString());
        System.out.println();
        System.out.println();
    }
}
