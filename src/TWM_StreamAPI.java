import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TWM_StreamAPI {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,5,7,3,2,6);
//            Method one
//        for(int i=0; i<nums.size(); i++){
//            System.out.println(nums.get(i));
//        }

//        Method 2
//        int sum =0;
//        for(int n : nums){
//            if(n%2==0){
//                n = n* 2;
//                sum = sum + n;
//
//            }
//        }
//        System.out.println(sum);

        //nums.forEach(n -> System.out.println(n));


//        Stream<Integer> s1 = nums.stream();
//        Stream<Integer> s2 = s1.filter(n -> n%2==0);
//        Stream<Integer> s3 = s2.map(n -> n*2);
//        int result = s3.reduce(0, (c,e) -> c+e);
        int result = nums.stream()
                        .filter(n->n%2==0)
                        .map(n -> n*2)
                        .reduce(0,(c,e)->c+e);

        System.out.println(result);
        //s3.forEach(n -> System.out.println(n)); //once you have worked with a stream you cannot reuse it

    }
}
