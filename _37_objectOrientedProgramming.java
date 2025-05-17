public class _37_objectOrientedProgramming {
    public static void main(String[] args){

        // object = an entity that holds data (attributes)
        //          and can perform actions (methods)
        //          it is a reference data type

        car car = new car();


        System.out.println(car.make);   // Ford
        System.out.println(car.model);  // Mustang
        System.out.println(car.year);   // 2025
        System.out.println(car.price);  // 58000.99

        System.out.println(car.isRunning);  // false
        car.start();    // You start the engine
        System.out.println(car.isRunning);  // true
        car.stop();     // You stop the engine
        System.out.println(car.isRunning);  // false

        car.drive();    // You drive the Mustang
        car.brake();    // You brake the Mustang
    }
}
