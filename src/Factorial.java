package src;

public class Factorial {
    public int factor(int n){
        if(n == 0){
            return 1;
        }
        else{
            return n * factor(n-1);
        }
    }

    public static void main(String [] args){
        int a = 5;
        Factorial f = new Factorial();
        int result = f.factor(a);
        System.out.print("Factorial of " + a + " is " + result + "\n");
    }
}
