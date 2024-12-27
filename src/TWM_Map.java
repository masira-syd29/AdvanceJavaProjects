import java.util.HashMap;
import java.util.Map;

public class TWM_Map {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();
        students.put("Maseera", 29);
        students.put("Lara", 22);
        students.put("Rosa", 30);
        students.put("Rawad", 13);
        students.put("Lara", 24);

        System.out.println(students.keySet());
        for(String key : students.keySet()){
            System.out.println(key + ":"+students.get(key));
        }


    }
}
