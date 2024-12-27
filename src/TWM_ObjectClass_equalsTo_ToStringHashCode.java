import java.util.Objects;

class Laptop {
    String model;
    int price;

//    public String toString(){
//        return model +":"+price;
//    }
//    public boolean equals(Laptop that){
//        if(this.model.equals(that.model) && this.price == that.price){
//            return true;
//        }
//        else{
//            return false;
//        }
//    }


    @Override
    public String toString() {
        return "Laptop{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Laptop laptop)) return false;
        return price == laptop.price && Objects.equals(model, laptop.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, price);
    }
}

public class TWM_ObjectClass_equalsTo_ToStringHashCode {
    public static void main(String[] args) {
        Laptop obj = new Laptop();
        obj.model = "Lenovo";
        obj.price = 100;

        Laptop obj1 = new Laptop();
        obj1.model = "Lenovo";
        obj1.price = 100;

        Laptop obj2 = new Laptop();
        obj2.model = "Lenovo";
        obj2.price = 100;

        boolean result = obj1.equals(obj2);
        System.out.println(result);



        System.out.println(obj2);
    }
}
