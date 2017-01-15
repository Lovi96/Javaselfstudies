import java.util.ArrayList;

public class EvenNumbers {
    public static int[] divisibleBy(int[] numbers, int divider) {
        ArrayList<Integer> numbs = new ArrayList<>();
        for (int num:numbers) {
          if(num%divider == 0){
              numbs.add(num);
          }
        }
        int[] returnList = numbs.stream().mapToInt(Integer :: intValue).toArray();
        return returnList;
    }
    public static void main(String[] args){
        int[] anal = {1,2,3,4,5,6};
        System.out.print(divisibleBy(anal,2));
    }
}
