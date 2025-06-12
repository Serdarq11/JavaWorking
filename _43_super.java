public class _43_super {
    public static void main(String[] args){

        // super : refers to the parent class ( subclass(child) <- superclass(parent) )
        //         used in constructors and method overriding
        //         calls the parent constructor to initialize attributes

        Person person = new Person("Tom", "Riddle");
        Students student = new Students("Harry", "Potter", 3.25);
        Employee employee = new Employee("Rubeus","Hagrid", 50000);

        person.showName();  // Tom Riddle
        student.showName(); // Harry Potter
        student.showGPA();    // Harry's gpa is: 3.25
        employee.showSalary();  // Rubeus's salary is : $50000

    }
}
