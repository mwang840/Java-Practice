package src;
import java.util.HashMap;

//There are different ways to solve this
//I can loop through the strings and check each character but it will be too long
//However I can use a search algo or a hashmap (faster runtime)
//Iterate over 
public class Scrambiles{
    public static boolean scramble(String one, String two){
        //Initial case if 2nd string is undefined
        HashMap<String, String>words = new HashMap<String, String>();
        char[] arr1 = new char[one.length()];
        char[] arr2 = new char[two.length()];
        for(int i = 0; i < one.length(); ++i){
            arr1[i] = one.charAt(i);
        }
        for(int i = 0; i < two.length(); ++i){
            arr2[i] = two.charAt(i);
        }
        return false;
    }

    public static void main(String []args){
        System.out.print("Hello");
    }
}