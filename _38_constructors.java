public class _38_constructors {
    public static void main(String[] args){

        // constructor = A special method to initialize objects
        //               You can pass arguments to a constructor
        //               and set up initial values


        Student student1 = new Student("Spongebob", 30, 3.2);
        Student student2 = new Student("Patrick", 34, 1.5);
        Student student3 = new Student("Sandy", 27, 4.0);

        System.out.println(student1.name);  // Spongebob
        System.out.println(student1.age);   // 30
        System.out.println(student1.gpa);   // 3.2
        System.out.println(student1.isEnrolled);   // true
        student1.study();   // Spongebob is studying.


        System.out.println(student2.name);  // Patrick
        System.out.println(student2.age);   // 34
        System.out.println(student2.gpa);   // 1.5
        System.out.println(student2.isEnrolled);   // true
        student2.study();   // Patrick is studying.


        System.out.println(student3.name);  // Sandy
        System.out.println(student3.age);   // 27
        System.out.println(student3.gpa);   // 4.0
        System.out.println(student3.isEnrolled);   // true
        student3.study();   // Sandy is studying.



        // We can declare different name, age and gpa values with the help of a constructor




    }
}
