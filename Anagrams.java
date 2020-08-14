import java.util.Scanner;

public class Solution {
    static boolean isAnagram(String a, String b) {

        // test for invalid input   
       /* if( a == null || b == null || a.equals("") || b.equals("") )
            throw new IllegalArgumentException(); */

        // initial quick test for non-anagrams
        if ( a.length() != b.length() )
            return false;

        a = a.toLowerCase();
        b = b.toLowerCase();

        // populate a map with letters and frequencies of String b
        java.util.Map<Character, Integer> map = new java.util.HashMap<>();

        for (int k = 0; k < b.length(); k++){
            char letter = b.charAt(k); //going through the string
            if(!map.containsKey(letter))
                map.put( letter, 1 );
            else{
                Integer frequency = map.get(letter); //count in map already
                map.put(letter, ++frequency); //increment and change it the map
            }
        }

        // test each letter in String a against data in the map
        // return if letter is absent in the map or its  frequency is 0
        // otherwise decrease the frequency by 1

        for (int k = 0; k < a.length(); k++){
            char letter = a.charAt(k);

            if( ! map.containsKey( letter ) )
                return false;

            Integer frequency = map.get( letter );

            if( frequency == 0 )
                return false;
            else    
                map.put( letter, --frequency);
        }
        // if the code got that far it is an anagram
        return true;
    }

  public static void main(String[] args) {