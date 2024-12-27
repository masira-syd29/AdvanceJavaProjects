import java.util.*;

public class TWM_Set {
    public static void main(String[] args) {
        //Set<Integer> nums = new HashSet<>();
        Set<Integer> nums = new TreeSet<>();
        //Collection<Integer> nums = new HashSet<>();
        nums.add(62);
        nums.add(54);
        nums.add(82);
        nums.add(21);
        //nums.add(6);
        Iterator<Integer> values = nums.iterator();
        while (values.hasNext())
            System.out.println(values.next());

//        for(int n : nums){
//            System.out.println(n);
//        }
    }
}
