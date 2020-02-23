package Projects;
import java.util.HashSet;
import java.util.Iterator;

import Resources.Calculate;

/**
 * @Authors: Jorge Jimenez, Pauline Makoma, Christian Makoma, Austin Duran
 * @Project 1 Question 3
 * @Course CSIS-2430
 */
public class ProjectOneQuestion_3 extends Calculate {
	
	// Number of elements.
	int n = 10;
	
    //Sets -- mutable
    HashSet<Double> fuzzySetA = new HashSet<>(); //for Q3 'fuzzy set A'
    HashSet<Double> fuzzySetB = new HashSet<>(); //for Q3 'fuzzy set B'

    //Arrays -- immutable once set
    Object[] fuzzySetaArray; //for Q3 'fuzzy set A'
    Object[] fuzzySetbArray; //for Q3 'fuzzy set B'

    //Question/Computer Project 3 - Fuzzy Sets
    HashSet<Double> Q3answerComplementA; //for Q3 - '`A'
    HashSet<Double> Q3answerUnionAB; //for Q3 - 'A U B'
    HashSet<Double> Q3answerIntersectionAB; //for Q3 - 'A ^ B'


    public ProjectOneQuestion_3(){
        setFuzzySets();
        initAnswerSets(); //initialize answer sets
//        findComplementOfA(fuzzySetA, fuzzySetB, fuzzySetaArray, fuzzySetbArray); //find answer to question 1.
//        findUnionAB(fuzzySetA, fuzzySetB, fuzzySetaArray, fuzzySetbArray); //find answer to question 2.
//        findIntersectionAB(fuzzySetA, fuzzySetB, fuzzySetaArray, fuzzySetbArray); //find answer to question 3.
        
        getComplementA();
        getUnionAndIntersectionAB();
    }

    /**
     * 	Set the values of the elements of fuzzySetA and fuzzySetB to a value between 0 and 1.
     */
    private void setFuzzySets(){
    	for (int i = 0; i < n; i++) {
    		fuzzySetA.add(random.nextDouble());
    		fuzzySetB.add(random.nextDouble());
    	}    		
    }
    
    /**
     * 	The complement of a fuzzy set S is the set S', with the 
     *   degree of membership equals to 1 minus the degree of membership 
     *   of this element in s.
     */
    private void getComplementA() { 
    	for (Double el: fuzzySetA) {
    		Q3answerComplementA.add(1.0 - el);
    	}
    }
    
    /**
     * Performs both the union and the intersection of A and B.
     * Union:
     * 	The union of two fuzzy sets S and T is the fuzzy 
     *  set, when the degree of membership of an element 
     *  in S u T is the maximum of the degrees of membership 
     *  of this element in S and T.
     *  
     * Intersection:
     *  The intersection of two fuzzy sets S and T is the fuzzy set S n T, 
     *  where the degree of membership of an element in S n T is the minimum 
     *  of the degrees in S and in T.
     */
    private void getUnionAndIntersectionAB() {
    	
    	Object[] setA = fuzzySetA.toArray();
    	Object[] setB = fuzzySetB.toArray();
    	
    	double a;
    	double b;
    	
    	for (int i = 0; i < n; i++) {
    		a = (double)setA[i];
    		b = (double)setB[i];
    		
    		Q3answerUnionAB.add(Math.max(a, b));
    		Q3answerIntersectionAB.add(Math.min(a, b));
    	}
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

    public void getAnswer() {
        System.out.println("Question 3 - 'Complement of A' used Set: ");
        System.out.println(printDoubleHashSet(fuzzySetA));
        System.out.println("Question 3 - 'Complement of A' answer is: ");
        System.out.println("A = \n" + printDoubleHashSet(Q3answerComplementA));
        System.out.println();
        System.out.println();
        System.out.println("Question 3 - 'A UNION B' used Set: ");
        System.out.println(printDoubleHashSet(fuzzySetA));
        System.out.println(printDoubleHashSet(fuzzySetB));
        System.out.println("Question 3 - 'A UNION B' answer is");
        System.out.println("A = \n" + printDoubleHashSet(Q3answerUnionAB));
        System.out.println();
        System.out.println();
        System.out.println("Question 3 - 'A INTERSECTION B' used Sets");
        System.out.println(printDoubleHashSet(fuzzySetA));
        System.out.println(printDoubleHashSet(fuzzySetB));
        System.out.println("Question 3 - 'A INTERSECTION B' answer is");
        System.out.println("A = \n" + printDoubleHashSet(Q3answerIntersectionAB));
        System.out.println();
        System.out.println();
    }
    /**
    * Prints a set of doubles with two decimal places.
    */
    private String printDoubleHashSet(HashSet<Double> doubles) {
    	StringBuilder sb = new StringBuilder();
    	sb.append("[");
    	
		boolean first = true;
		for (Double el : doubles)
		{

			if (first)
				sb.append(String.format("%.2f", el));
			else
				sb.append(String.format(", %.2f", el));
			first = false;
		}
		sb.append("]");
		
		return sb.toString();
    }
}
