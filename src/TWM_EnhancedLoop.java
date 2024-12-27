class Students{
    int rollNo;
    String name;
    int marks;
}

public class TWM_EnhancedLoop {
    public static void main(String[] args) {
//        int nums[] = new int[4];
//        nums[0] = 4;
//        nums[1] = 8;
//        nums[2] = 3;
//        nums[3] = 9;
//        for(int n:nums){
//            System.out.println(n);
//        }

        Students s1 = new Students();
        s1.rollNo = 1;
        s1.name = "Maseera";
        s1.marks = 88;

        Students s2 = new Students();
        s2.rollNo = 2;
        s2.name = "Lara";
        s2.marks = 89;

        Students s3 = new Students();
        s3.rollNo = 3;
        s3.name = "Jenny";
        s3.marks = 90;

        Students students[] = new Students[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(Students stud: students){
            System.out.println(stud.name+":"+stud.rollNo+":"+stud.marks);
        }


    }
}
