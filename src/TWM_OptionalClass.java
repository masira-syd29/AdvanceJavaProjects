import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//import java.util.Optional;

public class TWM_OptionalClass {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Nora","John","Lara","Tia");
//        Optional<String> name = names.stream()
//                        .filter(str -> str.contains("n"))
//                        .findFirst();
//        System.out.println(name.orElse("Not found"));

        String name = names.stream()
                    .filter(str -> str.contains("n"))
                    .findFirst()
                    .orElse("Not found");
        System.out.println(name);
    }
}
