package Resources;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * @Authors: Jorge Jimenez, Pauline Makoma, Christian Makoma, Austin Duran
 * @Project Calculate performs the calculations/answers to the questions
 * @Course CSIS-2430
 */
public class Calculate extends Tools{

    //Question/Computer Project 1 - Subsets
    HashSet<Integer> answerComplementA = new HashSet(); //for - '`A'
    HashSet<Integer> answerUnionAB = new HashSet(); //for - 'A U B'
    ArrayList answerUnionABArray = new ArrayList(); //for - 'A U B'
    HashSet<Integer> answerAPlusB = new HashSet(); //for - 'A + B'
    ArrayList answerAPlusBArray = new ArrayList(); //for - 'A + B'
    HashSet<Integer> answerIntersectionAB = new HashSet(); //for - 'A ^ B'
    ArrayList answerIntersectionABArray = new ArrayList(); //for - 'A ^ B'
    HashSet<Integer> answerDifferenceAB = new HashSet(); //for - 'A - B'
    ArrayList answerDifferenceABArray = new ArrayList(); //for - 'A - B'
    HashSet<Integer> answerDifferenceABForSymmetric = new HashSet();; //for - 'A - B' for symmetric calculation
    HashSet<Integer> answerDifferenceBA = new HashSet(); //for - 'B - A'
    HashSet<Integer> answerSymmetricDifferenceAB = new HashSet(); //for  - 'A (+) B'
    HashSet<Integer> answerUnionABSymmetric = new HashSet(); //for  - 'A (+) B'

    //Temp Hashsets
    HashSet tempDifferenceAB = new HashSet();
    HashSet tempDifferenceBA = new HashSet();
    HashSet tempSymmetricAnswerSet = new HashSet();

    //Temp Arrays
    Object[] tempDifferenceABArray;
    Object[] tempDifferenceBAArray;
    Object[] tempSymmetricAnswerSetArray;

    String answer = "";
    SetTools setTools = new SetTools();

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
     * findUnionABArray finds the union for Arrays
     * @return
     */
    public ArrayList findUnionABArray(ArrayList setA, ArrayList setB, Object[] arrayA, Object[] arrayB) {
        for(int i = 0; i < arrayA.length; i++){
            this.answerUnionABArray.add((Integer) arrayA[i]); //add all of what's in setA
        }
        for(int i = 0; i < arrayB.length; i++){
            if(!setA.contains(arrayB[i])){
                this.answerUnionABArray.add((Integer) arrayB[i]); //then add all of what's in setB that's not in setA
            }
        }
        return this.answerUnionABArray;
    }

    /**
     * findUnionAB finds the union
     * @return
     */
    public HashSet findUnionABForSymmetric(HashSet setA, HashSet setB, Object[] arrayA, Object[] arrayB) {
        for(int i = 0; i < arrayA.length; i++){
            this.answerUnionABSymmetric.add((Integer) arrayA[i]); //add all of what's in setA
        }
        for(int i = 0; i < arrayB.length; i++){
            if(!setA.contains(arrayB[i])){
                this.answerUnionABSymmetric.add((Integer) arrayB[i]); //then add all of what's in setB that's not in setA
            }
        }
        return this.answerUnionABSymmetric;
    }

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
     * findIntersectionAB finds the intersection
     * @return
     */
    public ArrayList findIntersectionABArray(ArrayList setA, ArrayList setB, Object[] arrayA, Object[] arrayB) {
        largestArrayLength = findLargestSetLength(arrayA, arrayB); //put initialization of other setTools here until we find a better way
        if(setAIsLargest){
            for(int i = 0; i < largestArrayLength; i++){
                if(setB.contains(arrayA[i])){
                    this.answerIntersectionABArray.add((Integer) arrayA[i]); //then add all of what's in setB that's not in setA
                }
            }
        }
        if(setBIsLargest) {
            for (int i = 0; i < largestArrayLength; i++) {
                if (setA.contains(arrayB[i])) {
                    this.answerIntersectionABArray.add((Integer) arrayB[i]); //then add all of what's in setB that's not in setA
                }
            }
        }
        return this.answerIntersectionABArray;
    }

    /**
     * findDifferenceAB finds the difference of B from A
     * @return
     */
    public HashSet findDifferenceAB(HashSet setA, HashSet setB, Object[] arrayA, Object[] arrayB) {
        for(int i = 0; i < arrayA.length; i++){
            if(!setB.contains(arrayA[i])){
                this.answerDifferenceAB.add((Integer) arrayA[i]); //add what is unique to setA that is not in setB
            }
        }
        return this.answerDifferenceAB;
    }

    /**
     * findDifferenceABArray finds the difference of B from A for arrays
     * @return
     */
    public ArrayList findDifferenceABArray(ArrayList setA, ArrayList setB, Object[] arrayA, Object[] arrayB) {
        for(int i = 0; i < arrayA.length; i++){
            if(!setB.contains(arrayA[i])){
                this.answerDifferenceABArray.add((Integer) arrayA[i]); //add what is unique to setA that is not in setB
            }
        }
        return this.answerDifferenceABArray;
    }

    /**
     * findDifferenceAB finds the difference of B from A for symmetric problem
     * @return
     */
    public HashSet findDifferenceABforSymmetric(HashSet setA, HashSet setB, Object[] arrayA, Object[] arrayB) {
        for(int i = 0; i < arrayA.length; i++){
            if(!setB.contains(arrayA[i])){
                this.answerDifferenceABForSymmetric.add((Integer) arrayA[i]); //add what is unique to setA that is not in setB
            }
        }
        return this.answerDifferenceABForSymmetric;
    }

    /**
     * findDifferenceAB finds the difference of B from A
     * @return
     */
    public HashSet findDifferenceBA(HashSet setA, HashSet setB, Object[] arrayA, Object[] arrayB) {
        for(int i = 0; i < arrayB.length; i++){
            if(!setA.contains(arrayB[i])){
                this.answerDifferenceBA.add((Integer) arrayB[i]); //add what is unique to setA that is not in setB
            }
        }
        return this.answerDifferenceBA;
    }

    /**
     * findSymmetricDifferenceAB finds the symmetric difference of A and B
     * @return
     */
    public HashSet findSymmetricDifferenceAB(HashSet setA, HashSet setB, Object[] arrayA, Object[] arrayB) {

        //(B - A) U (A - B) = the symmetric difference of A and B
        tempDifferenceBA = findDifferenceBA(setA,setB,arrayA,arrayB);
        tempDifferenceBAArray = tempDifferenceBA.toArray();
        tempDifferenceAB = findDifferenceABforSymmetric(setA,setB, arrayA, arrayB);
        tempDifferenceABArray = tempDifferenceAB.toArray();
        return answerSymmetricDifferenceAB = findUnionABForSymmetric(tempDifferenceAB,tempDifferenceBA, tempDifferenceABArray, tempDifferenceBAArray);
    }

    /**
     * findAPlusB adds all of a and all of B to one set
     * @return
     */
    public HashSet findAPlusB(HashSet setA, HashSet setB, Object[] arrayA, Object[] arrayB) {
        for(int i = 0; i < arrayA.length; i++){
            this.answerAPlusB.add((Integer) arrayA[i]); //add all of what's in setA
        }
        for(int i = 0; i < arrayB.length; i++){
                this.answerAPlusB.add((Integer) arrayB[i]); //then add all of what's in setB
        }
        return this.answerAPlusB;
    }

    /**
     * findAPlusBArray adds all of a and all of B to one set for arrays
     * @return
     */
    public ArrayList findAPlusBArray(ArrayList setA, ArrayList setB, Object[] arrayA, Object[] arrayB) {
        for(int i = 0; i < arrayA.length; i++){
            this.answerAPlusBArray.add((Integer) arrayA[i]); //add all of what's in setA
        }
        for(int i = 0; i < arrayB.length; i++){
            this.answerAPlusBArray.add((Integer) arrayB[i]); //then add all of what's in setB
        }
        return this.answerAPlusBArray;
    }
}
