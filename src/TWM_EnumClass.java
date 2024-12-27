enum MyEnumClass{
    Macbook(2000), XPS(2200), Surface, ThinkPad(1800);

    private int price;

    MyEnumClass() {
        price = 500;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    MyEnumClass(int price) {
        this.price = price;
        System.out.println("In My Enum Class " + this.name());
    }
}

public class TWM_EnumClass {
    public static void main(String[] args) {
//        MyEnumClass e = MyEnumClass.Macbook;
//        System.out.println(e+":"+e.getPrice());
//
        for(MyEnumClass e : MyEnumClass.values()){
            System.out.println(e+":"+e.getPrice());
        }
    }
}
