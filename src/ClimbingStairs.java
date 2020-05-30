import java.util.HashMap;
import java.util.Map;

public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(4));
    }
    public static int climbStairs(int n) {
        Map<Integer, Integer> mapp = new HashMap<>();
        mapp.put(0, 0);
        mapp.put(1, 1);
        mapp.put(2, 2);
        for(int k=3; k <= n; k++){
            mapp.put(k, mapp.get(k-1)+mapp.get(k-2));
        }
        return mapp.get(n);
    }

}
