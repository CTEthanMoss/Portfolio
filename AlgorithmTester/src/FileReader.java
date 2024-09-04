import java.io.File;    //Importing File class to view .txt file contents
import java.io.FileNotFoundException;   //Importing FileNotFoundException to prevent crashing if file cannot be found
import java.util.Scanner;   //Importing Scanner to read text from file
import java.util.ArrayList; //Importing Arraylist with the intention of putting numbers from textfile into an ArrayList

public class FileReader {
    //Class level variables so can be easily implemented into other algorithm classes
    //Creating empty arrayLists and files to store integers from text file
    public ArrayList<Integer> orderedList = new ArrayList<>();  
    public ArrayList<Integer> reverseList = new ArrayList<>();
    public ArrayList<Integer> randomList = new ArrayList<>();
    
    public File orderedFile = new File("DataOrdered.txt");
    public File reverseFile = new File("DataReverse.txt");
    public File randomFile = new File("DataRandom.txt");

    public ArrayList<Integer> orderedListLarge = new ArrayList<>();  
    public ArrayList<Integer> reverseListLarge = new ArrayList<>();
    public ArrayList<Integer> randomListLarge = new ArrayList<>();

    public File orderedFileLarge = new File("DataOrderedLarge.txt");
    public File reverseFileLarge = new File("DataReverseLarge.txt");
    public File randomFileLarge = new File("DataRandomLarge.txt");

    //Method to read the contents of the file, and add the integers to an arraylist
    public void readFile(File fileName, ArrayList<Integer> list) throws FileNotFoundException { 
        Scanner scan = new Scanner(fileName); 

        while(scan.hasNextInt()){   //while loop that says when the file has numbers, add the numbers to list
            list.add(scan.nextInt());

        }
        System.out.println(list);
        scan.close();
    }

    //Methods to be used in other classes to retrieve the desired lists,
    public ArrayList<Integer> getOrderedList() {
        return orderedList;
    }

    public ArrayList<Integer> getReverseList() {
        return reverseList;
    }

    public ArrayList<Integer> getRandomList() {
        return randomList;
    }

    //return for large lists
    public ArrayList<Integer> getOrderedListLarge() {
        return orderedListLarge;
    }

    public ArrayList<Integer> getReverseListLarge() {
        return reverseListLarge;
    }

    public ArrayList<Integer> getRandomListLarge() {
        return randomListLarge;
    }

    
    //Using main method to test to ensure code is printing specified lists, not necessary for the class to serve its purpose however.
    public static void main(String[] args) throws FileNotFoundException {

        FileReader reader = new FileReader();
        
        //Method to allow the user to choose which list they want to view, mostly for testing purposes
        Scanner listChoice = new Scanner(System.in);

        System.out.println("Choose which file to print:");
        System.out.println("1. Ordered list");
        System.out.println("2. Reverse list");
        System.out.println("3. Random list");
        System.out.println("4. Exit program");

        int choice = listChoice.nextInt(); //sets the number the user inputs to int variable choice

        //switch statement to print desired list from user
        switch (choice) {
            case 1:
            System.out.println("Ordered list selected ");
            reader.readFile(reader.orderedFile, reader.orderedList);
            break;

            case 2:
            System.out.println("Reverse list selected");
            reader.readFile(reader.reverseFile, reader.reverseList);
            break;

            case 3:
            System.out.println("Random list selected");
            reader.readFile(reader.randomFile, reader.randomList);
            break;

            case 4:
            System.out.println("Exiting program...");
            break;

            default:
            System.out.println("Error: invalid number used");

        }

        //closing the scanner
        listChoice.close();
    }
    
}

