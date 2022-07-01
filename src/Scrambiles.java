package src;
import java.util.HashMap;
import java.util.map;

//There are different ways to solve this
//I can loop through the strings and check each character but it will be too long
//However I can use a search algo or a hashmap (faster runtime)
//Only lower case letters will be used (a-z). No punctuation or digits will be included.
//Performance needs to be considered.
public class Scrambiles{
    public static boolean scramble(String one, String two){
        //Initial case if 2nd string is undefined
        if(two == null || two.length() == 0){
            return false;
        }
        //Declare two hashmaps to store the keys
        HashMap<Character, Integer>words = new HashMap<Character, Integer>();
        HashMap<Character, Integer>words2 = new HashMap<Character, Integer>();

        //Goes over the letters, lowercases them then place it in a hashmap
        for(char c: words.toCharArray()){
            char temp = Character.toLowerCase(c);
        }

        return false;
    }

    public static void main(String []args){
        System.out.print("Hello");
    }
}