import java.util.ArrayList;
import java.io.FileNotFoundException;
//Program to test the efficency of bubblesort, selectionsort, and insertion sort algorithms. 
public class AlgorithmTester {
    //comparison and exchanges variables to illustrate how often the algorithms compare and exchange the integers.
    static int comparisons = 0;
    static int exchanges = 0;
    
    //O(n^2)
    public static void bubbleSort(ArrayList<Integer> list) {
        int n = list.size();
        int i, j, temp;
        for(i = 0; i < n - 1; i++) {
            for(j = 0; j < n - i - 1; j++) {
                comparisons++;
                if(list.get(j) > list.get(j + 1)) {
                    temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j+1, temp);
                    exchanges++;
                }
            }
        }
    }
    //O(n^2)
    public static void selectionSort(ArrayList<Integer> list) {
        int n = list.size();
        int i, j, min, temp;
        for(i = 0; i < n - 1; i++) {
            min = i;
            for(j = i + 1; j < n; j++) {
                comparisons++;
                if(list.get(j) < list.get(min)) {
                    min = j;
                }
            }
            if(min != i) {
            temp = list.get(i);
            list.set(i, list.get(min));
            list.set(min, temp);
            exchanges++;
            }
        }
    }
    //O(n^2)
    public static void insertionSort(ArrayList<Integer> list) {
        int n = list.size();
        int i, j, temp;
        for (i = 1; i < n; i++) {
            temp = list.get(i);
            j = i - 1;
            while (j >= 0) {
                comparisons++;
                if (list.get(j) > temp) {
                    list.set(j + 1, list.get(j));
                    exchanges++;
                    j--;
                } else {
                    break;
            }
            if (j != i) {
            list.set(j + 1, temp);
            }
        }
    }
}


public static void main(String[] args) throws FileNotFoundException {
    //create instance of FileReader object
    FileReader reader = new FileReader();
    
    System.out.println("------------------------------");
    System.out.println("Before Sorting");
    System.out.println("------------------------------");

    //printing lists from text file before sorting
    System.out.println("Ordered List");
    reader.readFile(reader.orderedFile, reader.orderedList);
    System.out.println("Reverse List");
    reader.readFile(reader.reverseFile, reader.reverseList);
    System.out.println("Random List");
    reader.readFile(reader.randomFile, reader.randomList);

    // Bubble Sort
    System.out.println("------------------------------");
    System.out.println("After bubbleSort algorithm is run");
    System.out.println("------------------------------");
    
    //Reset comparisons and exchanges, add numbers from list from ReadFile into empty array, print comparisons, exchanges, and sorted arrayList after sorting
    //Repeat after each list is sorted to reinstate unsorted list
    comparisons = 0;
    exchanges = 0;
    ArrayList<Integer> orderedBubble = new ArrayList<>(reader.orderedList);
    System.out.println("Ordered List sorted:");
    bubbleSort(orderedBubble);     
    System.out.println("Comparisons: " + comparisons);
    System.out.println("Exchanges: " + exchanges);
    System.out.println("Sorted list: " + orderedBubble);
    System.out.println("------------------------------");

    comparisons = 0;
    exchanges = 0;
    ArrayList<Integer> reverseBubble = new ArrayList<>(reader.reverseList);
    System.out.println("Reverse list sorted:");
    bubbleSort(reverseBubble);
    System.out.println("Comparisons: " + comparisons);
    System.out.println("Exchanges: " + exchanges);
    System.out.println("Sorted list: " + reverseBubble);
    System.out.println("------------------------------");

    comparisons = 0;
    exchanges = 0;
    ArrayList<Integer> randomBubble = new ArrayList<>(reader.randomList);
    System.out.println("Random List sorted:");
    bubbleSort(randomBubble);
    System.out.println("Comparisons: " + comparisons);
    System.out.println("Exchanges: " + exchanges);
    System.out.println("Sorted list: " + randomBubble);
    System.out.println("------------------------------");

    // Selection Sort
    System.out.println("After selectionSort algorithm is run");
    System.out.println("------------------------------");

    comparisons = 0;
    exchanges = 0;
    ArrayList<Integer> orderedSelection = new ArrayList<>(reader.orderedList);
    System.out.println("Ordered List:");
    selectionSort(orderedSelection);     
    System.out.println("Comparisons: " + comparisons);
    System.out.println("Exchanges: " + exchanges);
    System.out.println("Sorted list: " + orderedSelection);
    System.out.println("------------------------------");

    comparisons = 0;
    exchanges = 0;
    ArrayList<Integer> reverseSelection = new ArrayList<>(reader.reverseList);
    System.out.println("Reverse list:");
    selectionSort(reverseSelection);
    System.out.println("Comparisons: " + comparisons);
    System.out.println("Exchanges: " + exchanges);
    System.out.println("Sorted list: " + reverseSelection);
    System.out.println("------------------------------");

    comparisons = 0;
    exchanges = 0;
    ArrayList<Integer> randomSelection = new ArrayList<>(reader.randomList);
    System.out.println("Random List:");
    selectionSort(randomSelection);
    System.out.println("Comparisons: " + comparisons);
    System.out.println("Exchanges: " + exchanges);
    System.out.println("Sorted list: " + randomSelection);
    System.out.println("------------------------------");

    // Insertion Sort
    System.out.println("After insertionSort algorithm is run");
    System.out.println("------------------------------");

    comparisons = 0;
    exchanges = 0;
    ArrayList<Integer> orderedInsertion = new ArrayList<>(reader.orderedList);
    System.out.println("Ordered List:");
    insertionSort(orderedInsertion);     
    System.out.println("Comparisons: " + comparisons);
    System.out.println("Exchanges: " + exchanges);
    System.out.println("Sorted list: " + orderedInsertion);
    System.out.println("------------------------------");

    comparisons = 0;
    exchanges = 0;
    ArrayList<Integer> reverseInsertion = new ArrayList<>(reader.reverseList);
    System.out.println("Reverse list:");
    insertionSort(reverseInsertion);
    System.out.println("Comparisons: " + comparisons);
    System.out.println("Exchanges: " + exchanges);
    System.out.println("Sorted list: " + reverseInsertion);
    System.out.println("------------------------------");

    comparisons = 0;
    exchanges = 0;
    ArrayList<Integer> randomInsertion = new ArrayList<>(reader.randomList);
    System.out.println("Random List:");
    insertionSort(randomInsertion);
    System.out.println("Comparisons: " + comparisons);
    System.out.println("Exchanges: " + exchanges);
    System.out.println("Sorted list: " + randomInsertion);
    System.out.println("------------------------------");

    }
}