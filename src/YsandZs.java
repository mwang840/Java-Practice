package src;

public class YsandZs {
    public int countYz(String str){
        int ysnzs = 0;
        String lower = str.toLowerCase();
        for(int i = 0; i < lower.length(); ++i){
            if(lower.charAt(i) == 'y' || lower.charAt(i) == 'z'){
                    if(i < lower.length() - 1 && !Character.isLetter(str.charAt(i+1))){
                        ysnzs++;
                    }
                    else if(i == lower.length() - 1){
                        ysnzs++;
                    }
            }
        }
        return ysnzs;
    }

    public static void main(String[] args) {
        YsandZs z = new YsandZs();
        System.out.print(z.countYz("fez day"));

    }

}
