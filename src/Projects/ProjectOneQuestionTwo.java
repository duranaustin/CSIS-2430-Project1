package Projects;
import Resources.Calculate;
import java.util.HashSet;

/**
 * @Authors: Jorge Jimenez, Pauline Makoma, Christian Makoma, Austin Duran
 * @Project 1 Question 2
 * @Course CSIS-2430
 */
public class ProjectOneQuestionTwo extends Calculate {
    //Sets -- mutable
    HashSet<Integer> setOfUniverseInteger = new HashSet(); //for Q2 'same universal set'
    HashSet<Integer> multiSetA = new HashSet(); //for Q2 'multiset A'
    HashSet<Integer> multiSetB = new HashSet(); //for Q2 'multiset B'

    //Arrays -- immutable once set
    Object[] setOfUniverseIntegerArray; //for Q2 'same universal set'
    Object[] multiSetaArray; //for Q2 'multiset A'
    Object[] multiSetbArray; //for Q2 'multiset B'

    //Question/Computer Project 2 - Multisets
    HashSet<Integer> Q2answerUnionAB; //for Q2 - 'A U B'
    HashSet<Integer> Q2answerIntersectionAB; //for Q2 - 'A ^ B'
    HashSet<Integer> Q2answerNeedsInfo; //for Q2 - 'A - B'
    HashSet<Integer> Q2answerNeedsInfoTwo; //for Q2 - 'A + B'


    public ProjectOneQuestionTwo(){
        setSetOfUniverseInteger(); //hardcoded set of universe Integers
        setMultiSets(); // hardcoded multisets taken from set of universe integer
        initAnswerSets(); //initialize answer sets
        findComplementOfA(); //find answer to question 1.
        findUnionAB(); //find answer to question 2.
        findIntersectionAB(); //find answer to question 3.
    }

    /**
     * Initialization of answer sets
     */
    private void initAnswerSets() {
        //Question/Computer Project 2 - Multisets
        Q2answerUnionAB = new HashSet();
        Q2answerIntersectionAB = new HashSet();
        Q2answerNeedsInfo = new HashSet();
        Q2answerNeedsInfoTwo = new HashSet();
    }

    /**
     * setSetOfUniverseInteger sets the universal set of type integers
     * setOfUniverseIntegerArray is also initialized
     */
    public void setSetOfUniverseInteger() {
        for (int i = 0; i < 1000000000; i++){
            setOfUniverseInteger.add(i);
        }
        setOfUniverseIntegerArray = setOfUniverseInteger.toArray();
    }

    /**
     * setSetOfUniverseInteger sets the universal set of type integers
     * setOfUniverseIntegerArray is also initialized
     */
    public void setMultiSets() {
        int randomMultiSetLength = random.nextInt(setOfUniverseIntegerArray.length);
        for(int i = 0; i < randomMultiSetLength; i++){
            multiSetA.add((Integer) setOfUniverseIntegerArray[i]); //set multiSet A with with duplicates of universe Integer
        }
        multiSetaArray = multiSetA.toArray(); //initialize subsetaArray with subSetA
        for(int i = randomMultiSetLength; i != multiSetaArray.length; i++){
            multiSetB.add((Integer) multiSetaArray[i]); //set subSet B with last random part of 'setArray'
        }
        multiSetbArray = multiSetB.toArray(); //initialize subsetbArray with subSetB
    }
}
