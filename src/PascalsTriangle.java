package src;

public class PascalsTriangle{

    //function that returns a long array of pascals levels
    //Formula is (n choose k) equals n factorial divided by k factorial * (n-k) factorial 
    public static long[] generate(int level){
        //at case zero we will have 1 on the list (when level is 1 it defaults to 1)
        //set a temporary variable to hold the level
        int temp = level;
        System.out.println("level is " + temp);
        long[] pascal = new long[level];
        long[] subPascal = new long[0];
        for(int i = 0; i < pascal.length; ++i){
            subPascal = new long[level];
            for(int j = 0; j <=i; j++){
                switch(j){
                    case 0: subPascal[i] = 1;
                    break;
                }
            }
        }
        return pascal;
    }

    public static int factorial(int n){
        if(n == 1){
            return 1;
        }
        else{
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.print(generate(1));
    }
}