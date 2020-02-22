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
    SetTools setTools = new SetTools();

    /**
     * findIntersectionAB finds the intersection
     * @return
     */
    public HashSet findIntersectionAB(HashSet setA, HashSet setB, Object[] arrayA, Object[] arrayB) {
        largestArrayLength = findLargestSetLength(arrayA, arrayB); //put initialization of other setTools here until we find a better way
        if(setAIsLargest){
            for(int i = 0; i < largestArrayLength; i++){
                if(setB.contains(arrayA[i])){
                    this.answerIntersectionAB.add((Integer) arrayA[i]); //then add all of what's in setB that's not in setA
                }
            }
        }
        if(setBIsLargest) {
            for (int i = 0; i < largestArrayLength; i++) {
                if (setA.contains(arrayB[i])) {
                    this.answerIntersectionAB.add((Integer) arrayB[i]); //then add all of what's in setB that's not in setA
                }
            }
        }
        return this.answerIntersectionAB;
    }


    /**
     * findUnionAB finds the union
     * @return
     */
    public HashSet findUnionAB(HashSet setA, HashSet setB, Object[] arrayA, Object[] arrayB) {
        for(int i = 0; i < arrayA.length; i++){
            this.answerUnionAB.add((Integer) arrayA[i]); //add all of what's in setA
            }
        for(int i = 0; i < arrayB.length; i++){
            if(!setA.contains(arrayB[i])){
                this.answerUnionAB.add((Integer) arrayB[i]); //then add all of what's in setB that's not in setA
            }
        }
        return this.answerUnionAB;
    }

    /**
     * findComplementOfA finds the complement
     * this is exclusive to the integer universe
     * @return
     */
    public HashSet findComplementOfA(HashSet setA, HashSet setB, Object[] arrayA, Object[] arrayB) {
        for(int i = 0; i < 15; i++){
            if(!setA.contains(i)){
                this.answerComplementA.add(i);
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
        System.out.println(answerComplementA.toString());
        System.out.println(answerUnionAB.toString());
        return this.answer;
    }

    /**
     * getAnswer
     */
    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
