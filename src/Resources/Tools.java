package Resources;
import java.util.Random;

/**
 * @Authors: Jorge Jimenez, Pauline Makoma, Christian Makoma, Austin Duran
 * @Project Tools
 * @Course CSIS-2430
 */
class Tools extends SetTools {
    //Tools
    protected Random random = new Random(); //to be a random number generator
    protected int largestArrayLength;

    /**
     * Finds the largest array length
     * @param arrayA
     * @param arrayB
     * @return
     */
    public int findLargestSetLength(Object[] arrayA, Object[] arrayB){
        if (arrayA.length > arrayB.length) {
            this.largestArrayLength = arrayA.length;
            this.setALength = arrayA.length;
            this.setAIsLargest = true;
        }
        else{
            this.largestArrayLength = arrayB.length;
            this.setBLength = arrayB.length;
            this.setBIsLargest = true;
        }
        this.largestSetLength = this.largestArrayLength;
        return this.largestArrayLength;
    }
}
