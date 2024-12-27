import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TWM_ArrayList {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(2);
        nums.add(6);
//        System.out.println(nums.indexOf(5));
//        System.out.println(nums.get(2));

        for(int n : nums){
            int num = (Integer)n;
            System.out.println(num*2);
        }


    }
}
