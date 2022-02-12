package introduction;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("komal",45, 56.67F);
        st1.changeName("kunal");
        st1.greeting();


        System.out.println(st1);

    }
}
class Student {
    int rollno;
    float marks;
    String name;


    void greeting(){
        System.out.println("hello " + name);
    }

    void changeName( String newName){
        name = newName;

    }

   /* Student(){
        this.marks = 56;
        this.name = "kajal";
        this.rollno = 67;
    }*/

    Student(String name, int rollno, float marks){
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;

    }
}
