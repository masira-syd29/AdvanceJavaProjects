//StreamAPI, Functions, Map, filter and reduce

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class TWM_StreamMap {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,5,7,3,2,6);

        //Function<Integer, Integer> fun = n -> n*2; //for map
        //Predicate<Integer> p = n -> n%2==0; for filter exchange with p in .filter

//        int result = nums.stream()
//                .filter(n -> n%2==0)
//                .map(n -> n*2)
//                .reduce(0,(c,e)->c+e);
                //.filter(p)
                //.map(fun)
//        System.out.println(result);


        Stream<Integer> sortedValues = nums.stream()
                .filter(n -> n%2==0)
                .sorted();
        sortedValues.forEach(n -> System.out.println(n));




        //s3.forEach(n -> System.out.println(n)); //once you have worked with a stream you cannot reuse it
    }
}
