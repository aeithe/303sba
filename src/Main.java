import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        System.out.println(getDigitsSum(478723));
    }

 public static int getDigitsSum(int largeNumber){
    String str = String.valueOf(largeNumber);
    String [] stringArray = str.split("");
        int sum = 0;
        for (String s : stringArray){
            sum+= Integer.parseInt(s);
        }
        return sum;
    }
}