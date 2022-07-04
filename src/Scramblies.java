package src;
import java.util.HashMap;
import java.util.Map;
//There are different ways to solve this
//I can loop through the strings and check each character but it will be too long
//However I can use a search algo or a hashmap (faster runtime)
//Only lower case letters will be used (a-z). No punctuation or digits will be included.
//Performance needs to be considered.
public class Scramblies{
    public static boolean scramble(String one, String two){
        //Initial case if 2nd string is undefined
        if(two == null || two.length() == 0){
            return true;
        }
        //Declare two hashmaps to store the keys
        HashMap<Character, Integer>words = new HashMap<>();
        HashMap<Character, Integer>words2 = new HashMap<>();

        //Goes over the letters, lowercases them then place it in a hashmap
        //Get or default is prefered since we need to store the char in a key then compare the two objects
        //Adds one for every iteration
        for(char c: one.toCharArray()){
            char temp = Character.toLowerCase(c);
            words.put(temp, words.getOrDefault(temp, 0) + 1);
        }
        //Same for the second one
        for(char c: two.toCharArray()){
            char temp2 = Character.toLowerCase(c);
            words2.put(temp2, words2.getOrDefault(temp2, 0) + 1);
        }
        //Compares the two maps and see if the words can be re arranged
        for(Map.Entry<Character, Integer> theEntry: words2.entrySet()){ 
                try {
                    if(theEntry.getValue() > words.get(theEntry.getKey())){
                        return false;
                    }
                } catch (NullPointerException e) {
                    return false;
                }
        }
        return true;
    }

    public static void main(String []args){
        System.out.print(scramble("rkqodlw","world"));
        System.out.println();
        System.out.print(scramble("cedewaraaossoqqyt",  "codewars"));
        System.out.println();
        System.out.print(scramble("katas","steak"));
        System.out.println();
        System.out.print(scramble("cedewaraaossoqqyt",  "codewars"));
    }
}