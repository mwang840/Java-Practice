package src;

public class YsandZs {
    public int countYz(String str){
        int ysnzs = 0;
        String[] splitter = str.split("\\s+");
        for(int i = 0; i < splitter.length; ++i){
            if(splitter[i].endsWith("y") || splitter[i].endsWith("z")){
                ysnzs++;
            }
        }
        return ysnzs;
    }

    public static void main(String[] args) {
        YsandZs z = new YsandZs();
        System.out.print(z.countYz("fez day"));

    }

}
