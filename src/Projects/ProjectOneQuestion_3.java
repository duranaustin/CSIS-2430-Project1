package Projects;
import Resources.Calculate;
import java.util.HashSet;

/**
 * @Authors: Jorge Jimenez, Pauline Makoma, Christian Makoma, Austin Duran
 * @Project 1 Question 3
 * @Course CSIS-2430
 */
public class ProjectOneQuestion_3 extends Calculate {
    //Sets -- mutable
    HashSet<Integer> fuzzySetA = new HashSet(); //for Q3 'fuzzy set A'
    HashSet<Integer> fuzzySetB = new HashSet(); //for Q3 'fuzzy set B'

    //Arrays -- immutable once set
    Object[] fuzzySetaArray; //for Q3 'fuzzy set A'
    Object[] fuzzySetbArray; //for Q3 'fuzzy set B'

    //Question/Computer Project 3 - Fuzzy Sets
    HashSet<Integer> Q3answerComplementA; //for Q3 - '`A'
    HashSet<Integer> Q3answerUnionAB; //for Q3 - 'A U B'
    HashSet<Integer> Q3answerIntersectionAB; //for Q3 - 'A ^ B'


    public ProjectOneQuestion_3(){
        setFuzzySets();
        initAnswerSets(); //initialize answer sets
        findComplementOfA(fuzzySetA, fuzzySetB, fuzzySetaArray, fuzzySetbArray); //find answer to question 1.
        findUnionAB(fuzzySetA, fuzzySetB, fuzzySetaArray, fuzzySetbArray); //find answer to question 2.
        findIntersectionAB(fuzzySetA, fuzzySetB, fuzzySetaArray, fuzzySetbArray); //find answer to question 3.
    }

    private void setFuzzySets(){
        //..whatever a fuzzy set is...
    }

    /**
     * Initialization of answer sets
     */
    private void initAnswerSets() {
        //Question/Computer Project 3 - Fuzzy Sets
        Q3answerComplementA = new HashSet();
        Q3answerUnionAB = new HashSet();
        Q3answerIntersectionAB = new HashSet();
    }

    public String getAnswer() {
        return null;
    }
}
