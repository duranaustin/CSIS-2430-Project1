package Resources;

import java.util.HashSet;

/**
 * @Authors: Jorge Jimenez, Pauline Makoma, Christian Makoma, Austin Duran
 * @Project Calculate performs the calculations/answers to the questions
 * @Course CSIS-2430
 */
public class Calculate extends Tools{

    //Question/Computer Project 1 - Subsets
    HashSet<Integer> answerComplementA = new HashSet(); //for - '`A'
    HashSet<Integer> answerUnionAB = new HashSet();; //for - 'A U B'
    HashSet<Integer> answerIntersectionAB = new HashSet();; //for - 'A ^ B'
    HashSet<Integer> answerNeedsInfo = new HashSet();; //for - 'A - B'
    HashSet<Integer> answerNeedsInfoTwo = new HashSet();; //for  - 'A (+) B'

    String answer = "";

    /**
     * findIntersectionAB finds the intersection
     * @return
     */
    public HashSet findIntersectionAB(HashSet setA, HashSet setB, Object[] arrayA, Object[] arrayB) {

        return setA;
    }

    /**
     * findUnionAB finds the union
     * @return
     */
    public HashSet findUnionAB(HashSet setA, HashSet setB, Object[] arrayA, Object[] arrayB) {
        return setA;
    }

    /**
     * findComplementOfA finds the complement
     * @return
     */
    public HashSet findComplementOfA(HashSet setA, HashSet setB, Object[] arrayA, Object[] arrayB) {
        for(int i = 0; i < arrayB.length; i++){
            if(!setA.contains(arrayB[i])){
                this.answerComplementA.add((Integer) arrayB[i]);
            }
        }
        return this.answerComplementA;
        //use bitstrings or boolean arrays for comparison.
    }

    /**
     * getAnswer
     * @return
     */
    public String getAnswer() {
        return this.answer;
    }

    /**
     * getAnswer
     */
    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
