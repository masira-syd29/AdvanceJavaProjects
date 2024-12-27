import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Learner{
    private String name;
    private int age;
    public Learner(){
    }

    public Learner(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Learner{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class TWM_MethodReference {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Nora","John","Lara","Tia");
        List<Learner> learn = new ArrayList<>();
//        for(String name : names){
//            learn.add(new Learner(name));
//        }
//        System.out.println(learn);

        learn = names.stream()
                //.map(name -> new Learner(name))
                .map(Learner::new)
                .toList();
        System.out.println(learn);

//        List<String> uNames = names.stream()
//                .map(String::toUpperCase) //Method reference every time an option that comes up with quick fix
//                .toList();
//        uNames.forEach(System.out::println); // passing a method name inside a method announcing that so and so will do the work for you

        //Constructor Reference
    }

}
