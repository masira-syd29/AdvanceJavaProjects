class Human{
    private int age;
    private String name = "Maseera";

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class TWM_Encapsulation {
    public static void main(String[] args) {
        Human obj = new Human();
//        obj.age = 11;
//        obj.name = "Maseera";
        obj.setAge(29);
        obj.setName("Maseera");
        System.out.println(obj.getAge());
        System.out.println(obj.getName());
    }
}
