package src;

public class Outlier {
    static int find(int[] integers){
        int odd = 0;
        int even = 0;
        int val = 0;
        for(Integer i : integers){
            if(i % 2 == 0){
                val++;
                even = i;
            }
            else{
                odd = i;
            }
        }

        return (val > 1) ? odd:even;   
    }

    public static void main(String[]args){
        System.out.print("Ayo");
    }
}
