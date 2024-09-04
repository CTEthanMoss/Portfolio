public class AlgorithmTesterRecursion {
//Binary search, array must be sorted
//define low at index 0, high and length-1, middle at low + high-low / 2
//O(logn)
public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;
        int iterations = 0;
        while(low <= high){
            iterations++;
            int middle = low + (high-low) / 2;
            int value = array[middle];
            System.out.println(iterations + " Iterations" + ", Middle " + value);
            
            if(value < target) 
                low = middle + 1;
            else if(value > target) 
                high = middle - 1;
            else {
                System.out.println("Ran " + iterations + " times");
                return middle;
            }
        }
        return -1;
    }

    
    //F0 = 0, F1 = 1, Nth number should be greater than 0 and/or 1 to demonstrate.
    //Fn = Fn-1 + Fn-2
    //O(2^n)
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int result = fibonacci(n-1) + fibonacci(n-2);
        return result;
    }

    public static void main(String[] args) {
    
    int[] sortedArray = new int[10000]; //create empty array of 10,000 elements
    for(int i = 0; i < sortedArray.length; i++) {   //fill array with numbers 1 - 10,000
        sortedArray[i] = i + 1;
    }
    int target = 4768;
    binarySearch(sortedArray, target);

    System.out.print("Fibonacci number is: ");
    System.out.println(fibonacci(10));
    //n = 50 took about 1 minute, -298,632,863
    }

}
