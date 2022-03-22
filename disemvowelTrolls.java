import java.util.stream.Collectors;
public class Troll {
    public static String disemvowel(String str) {
        return str.replaceAll("(?i)[aeiou]" , "");
    }
}
