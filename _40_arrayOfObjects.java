public class _40_arrayOfObjects {
    public static void main(String[] args){

        _40_Car car1 = new _40_Car("Mustang", "red");
        _40_Car car2 = new _40_Car("Corvette", "blue");
        _40_Car car3 = new _40_Car("Charger", "yellow");

        _40_Car[] cars = {car1, car2, car3};    // Also we can directly type {new _40_Car("Mustang", "red"), "2nd", "3rd"}

        for(_40_Car car : cars){
            car.drive();
        }


    }
}

// _40_Car class is included in this class
