import java.io.*;
import java.util.*;

/*
 * TableSeating reads a file '500names.txt' and assigns 32 persons to 8 tables seating 4 each. 
 */

public class TableSeating {
    
	public static void main(String[] args) throws FileNotFoundException{

    	
    	/**
    	 *  LOOK AT ME - input the location of your 500names.txt below; mine is in my downloads folder
    	 *          input = new Scanner(new File("C:/Users/u23s57/Downloads/500names.txt")).useDelimiter("\\n");
    	 */
		
        Scanner input;
        input = new Scanner(new File("500names.txt")).useDelimiter("\\n");

        for (int i = 1; i <= 8; i++) {
            Person p1 = new Person(input.next());
            Person p2 = new Person(input.next());
            Person p3 = new Person(input.next());
            Person p4 = new Person(input.next());
            int inTableNum = i;
            Table nextTable = new Table(inTableNum, p1, p2, p3, p4);
            System.out.println(nextTable.toString());
        }
    }
}




