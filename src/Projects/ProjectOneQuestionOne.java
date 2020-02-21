package Projects;
import Resources.Calculate;
import java.util.HashSet;

/**
 * @Authors: Jorge Jimenez, Pauline Makoma, Christian Makoma, Austin Duran
 * @Project 1 Question 1
 * @Course CSIS-2430
 */
public class ProjectOneQuestionOne extends Calculate {
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
    HashSet<Integer> Q1answerNeedsInfo; //for Q1 - 'A - B'
    HashSet<Integer> Q1answerNeedsInfoTwo; //for Q1 - 'A (+) B'


    public ProjectOneQuestionOne(){
        setSet(); //hardcoded integer set from 0-9
        setSubsets(); //subset A and subset B are set randomly
        initAnswerSets(); //initialize answer sets
        findComplementOfA(); //find answer to question 1.
        findUnionAB(); //find answer to question 2.
        findIntersectionAB(); //find answer to question 3.
    }

    /**
     * Initialization of answer sets
     */
    private void initAnswerSets() {
        //Question/Computer Project 1 - Subsets
        Q1answerComplementA = new HashSet();
        Q1answerUnionAB = new HashSet();
        Q1answerIntersectionAB = new HashSet();
        Q1answerNeedsInfo = new HashSet();
        Q1answerNeedsInfoTwo = new HashSet();
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
        subsetbArray = subSetB.toArray(); //initialize subsetbArray with subSetB
    }
}
