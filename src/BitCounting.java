package src;
public class BitCounting {
    public static int countBits(int n){
        String toBinary = Integer.toBinaryString(n);
        int one = 0;
        for(int i = 0; i < toBinary.length(); ++i){
            if(toBinary.charAt(i) == '1'){
                one++;
            }
        }
        return one;
    }

    public static void main(String[] args) {
        System.out.println(countBits(1234));
    }
}
