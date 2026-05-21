package map_interface.hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class CountFrequency {
	  public static void main(String[] args) {
		  
    HashMap<Character, Integer> freq= new HashMap<>();
    Scanner sc= new Scanner(System.in);
     String str= sc.next();
     for(char ch: str.toCharArray()) {
        freq.put(ch, freq.getOrDefault(ch, 0)+1) ;
        //getOrDefault(ch, 0) → if the character is not in the map yet, return 0.  Then we add 1 to that value and store it back using put. This step counts how many times each character appears in the string. and add +1 to increase the freq count of the character.
     }
   }
}
