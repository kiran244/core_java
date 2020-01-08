import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Scanner;

public class ReadAndPrint {

	public static void main(String[] args) {
		String fileLocation = "C:\\Users\\Kiran\\Desktop\\test.txt";
		Stream<String> fileStream = null;
		//int vowels = 0;
		//int vcount = 0, ccount = 0;
		
		try {
			fileStream = Files.lines(Paths.get(fileLocation));

			} catch (IOException e) {
			e.printStackTrace();
			}
		Set<String> values = fileStream.sorted().collect(Collectors.toSet());
		
		System.out.println("string in the arrayList:" + values);
		
		//replaces all occurrences of 'p' to 'pp'
		String replaceString = values.replace("p","pp");  
		System.out.println(replaceString);
		
		/*
		//String str = values.toLowerCase();
        for(int i = 0; i < str.length(); i++) { 
        	char ch = str.charAt(i); if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') { 
        		vcount++; } 
        else if((ch >= 'a'&& ch <= 'z')) {
        }
                ccount++;
        }
        
        System.out.println("Number of Vowels: " + vcount);
        System.out.println("Number of Consonants: " + ccount);
        */
	}

	

	

}

