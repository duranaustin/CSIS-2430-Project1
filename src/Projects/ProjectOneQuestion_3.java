package Projects;
import Resources.Calculate;
import java.util.HashSet;

/**
 * @Authors: Jorge Jimenez, Pauline Makoma, Christian Makoma, Austin Duran
 * @Project 1 Question 1
 * @Course CSIS-2430
 */
public class ProjectOneQuestion_3 extends Calculate {
    //Sets -- mutable
    HashSet<Double> fuzzySetA = new HashSet(); //for Q1 'subset A'
    HashSet<Double> fuzzySetB = new HashSet(); //for Q1 'subset B'

    //Arrays -- immutable once set
    Object[] fuzzySetArray; //for Q1 'set of n elements'
    Object[] fuzzySetaArray; //for Q1 'subset A'
    Object[] fuzzySetbArray; //for Q1 'subset B'

    //Question/Computer Project 1 - Subsets
    HashSet Q3answerComplementA; //for Q1 - '`A'
    HashSet Q3answerUnionAB; //for Q1 - 'A U B'
    HashSet Q3answerIntersectionAB; //for Q1 - 'A ^ B'



    public ProjectOneQuestion_3(){
        setFuzzySets(10);
        initAnswerSets(); //initialize answer sets
        Q3answerComplementA = findComplementOfAFuzzySet(fuzzySetA, fuzzySetB, fuzzySetaArray, fuzzySetbArray); //find answer to  Q3 - '`A'
        Q3answerUnionAB = findUnionABFuzzySet(fuzzySetA, fuzzySetB, fuzzySetaArray, fuzzySetbArray); //find answer to Q3 - 'A U B'
        Q3answerIntersectionAB = findIntersectionABFuzzySet(fuzzySetA, fuzzySetB, fuzzySetaArray, fuzzySetbArray); //find answer to Q3 - 'A ^ B'
    }

    /**
     * Initialization of answer sets
     */
    private void initAnswerSets() {
        Q3answerComplementA = new HashSet();
        Q3answerUnionAB = new HashSet();
        Q3answerIntersectionAB = new HashSet();
    }


    /**
     * 	Set the values of the elements of fuzzySetA and fuzzySetB to a value between 0 and 1.
     */
    private void setFuzzySets(int n){
        for (int i = 0; i < n; i++) {
            fuzzySetA.add(random.nextDouble());
            fuzzySetB.add(random.nextDouble());
        }
        fuzzySetaArray = fuzzySetA.toArray();
        fuzzySetbArray = fuzzySetB.toArray();
    }

    /**
     * getAnswer
     * @return
     */
    public void getAnswer() {
        System.out.println("Question 3 - 'Complement of A' used Set: ");
        System.out.println("A = " + fuzzySetA.toString());
        System.out.println("Question 3 - 'Complement of A' answer is: ");
        System.out.println(Q3answerComplementA.toString());
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
