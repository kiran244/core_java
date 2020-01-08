import java.util.*;
public class Asceding_disceding {
	
	public static void main(String args[]) 
    { 
        // create the ArrayList 
        ArrayList<String> list = new ArrayList<String>(); 
        Set phrases = null; 
        // add the ArrayList John Doe, Abe Lincoln, Jack Foster, Mark Abrahms
        list.add("John Doe"); 
        list.add("Abe Lincoln"); 
        list.add("Jack Foster"); 
        list.add("Mark Abrahms");  
  
        // Print the unsorted ArrayList 
        System.out.println("Unsorted ArrayList: " + list); 
  
        // Sorting ArrayList in ascending Order by First Name
        // using Collection.sort() method 
        Collections.sort(list); 
       
        
        // Print the sorted ArrayList 
        System.out.println("Sorted Name by First Name " + "in Ascending order : " + list); 
        
       
        Collections.reverse(list);
        System.out.println("Sorted Name by First Name " + "in Descending order : " + list); 
           
     } 
 }


