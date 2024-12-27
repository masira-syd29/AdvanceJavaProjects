class Student{
    int rollNo;
    String name;
    int marks;
}

public class TWM_ArrayOfObjects {
    public static void main(String[] args) {
//        int nums[] = new int[4];
//        nums[0] = 4;
//        nums[1] = 8;
//        nums[2] = 3;
//        nums[3] = 9;
//
//        for(int i=0; i< nums.length; i++){
//            System.out.println(nums[i]);
//        }
        Student s1 = new Student();
        s1.rollNo = 1;
        s1.name = "Maseera";
        s1.marks = 88;

        Student s2 = new Student();
        s2.rollNo = 2;
        s2.name = "Lara";
        s2.marks = 89;

        Student s3 = new Student();
        s3.rollNo = 3;
        s3.name = "Jenny";
        s3.marks = 90;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        //System.out.println(s1);

        for(int i=0;i<students.length; i++){
            System.out.println(students[i].name +" : " + students[i].marks + " : " +students[i].rollNo);
        }
    }
}
