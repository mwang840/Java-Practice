package src;
public class PascalsTriangle{

    //function that returns a long array of pascals levels
    //Formula is (n choose k) equals n factorial divided by k factorial * (n-k) factorial 
    public static long[] generate(int level){
        //at case zero we will have 1 on the list (when level is 1 it defaults to 1)
        //set a temporary variable to hold the level
        long[] pascal = new long[consectuiveSum(level)];
        long tempLevel = 0;
        long placeholder = 0;
        //loop over the new array given with the length
        //level is zero assign it
        for(long i = 0; i < pascal.length; i++){
            if(tempLevel == 21) {
                System.out.print("Level " + tempLevel);
                System.out.println("place :" + placeholder);
            }
            pascal[(int)i] = factorial(tempLevel) / (factorial(placeholder) * factorial(tempLevel - placeholder));
            if(tempLevel == placeholder){
                placeholder = 0;
                tempLevel++;
            }
            else{
                placeholder++;
            }
            if(placeholder > tempLevel){
                System.out.println("error");
            }
        }
        return pascal;
    }

    public static long factorial(long n){
        if(n == 0){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }

    public static int consectuiveSum(int n){
        if(n == 1){
            return 1;
        }
        else{
            return n + consectuiveSum(n-1);
        }
        
    }

    public static void main(String[] args) {
       // long[] test = generate(22);
        //for(int i = 0; i < test.length; ++i){
        //    System.out.print(test[i] + " ");
        //}
        System.out.println(factorial(21));
        
    }
}