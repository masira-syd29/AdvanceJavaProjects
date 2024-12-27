import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Graduate {
    int age;
    String name;


    public Graduate(int age, String name) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Student{" + "age=" + age + ", name='" + name + '\'' + '}';
    }
    public int compareTo(Graduate that){
        if(this.age > that.age)
            return 1;
        else
            return -1;

    }


}

public class TWM_ComparableVsComparator {
    public static void main(String[] args) {
//        Comparator<Integer> com = new Comparator<Integer>(){
//            public int compare(Integer i, Integer j){
//                if(i%10 > j%10)
//                    return 1;
//                else
//                    return -1;
//            }
//        };
        Comparator<Graduate> com = (i, j) -> {
//            if(i.age > j.age) return 1;
//            else return -1;
            return i.age > j.age?1:-1;
        };

        List<Graduate> grads = new ArrayList<>();
        grads.add(new Graduate(23,"Maseera"));
        grads.add(new Graduate(22,"Sarah"));
        grads.add(new Graduate(21,"Jamila"));
        grads.add(new Graduate(19,"Tia"));
        grads.add(new Graduate(20,"Siya"));


        Collections.sort(grads,com);
        for(Graduate g : grads){
            System.out.println(g);
        }


    }
}
