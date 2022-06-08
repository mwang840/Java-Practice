package src;

public class Outlier {
    static int find(int[] integers){
        int len = integers.length;
        int[] odds = new int[len];
        int[] evens = new int [len];
        int val = 0;
        for(int i = 0; i < integers.length; ++i){
            if(integers[i] % 2 == 0){
                evens[i] = integers[i];
            }
            else{
                odds[i] = integers[i];
            }
        }

        if(evens.length == 1){
            val = evens[0];
        }
        else if(odds.length == 1){
            val = odds[0];
        }

        return val;   
    }

    public static void main(String[]args){
        System.out.print("Ayo");
    }
}
