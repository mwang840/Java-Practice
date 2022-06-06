package src;
public class createPhoneNumber {
  public static String phoneNum(int[] numbers) {
    // Shorter version
    return String.format("(%d%d%d) %d%d%d-%d%d%d%d", numbers[0], numbers[1], numbers[2], numbers[3], numbers[4],
        numbers[5], numbers[6], numbers[7], numbers[8], numbers[9]);
  }
  public static void main(String[]args){
    int[] phones = new int[]{7,1,3,5,9,5,3,3,5,1};
    System.out.print(createPhoneNumber.phoneNum(phones));
  }
  
}

