import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }

    public static boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while (n != 1){
            int num = n;
            int sum = 0;
            while(num != 0){
                sum += (num % 10) * (num % 10);
                num = num / 10;
            }
            System.out.println(sum);
            if(set.contains(sum)){
                return false;
            }else {
                set.add(sum);
                n = sum;
            }
            System.out.println(sum);
        }


        return true;
    }
}
