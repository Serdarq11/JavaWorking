public class _44_methodOverriding {
    public static void main( String[] args){

        // method overriding : when a subclass provides its own
        //                   : implementation of a method that is already defined
        //                   : allows for code reusability and give specific implementations

        Dogs dog = new Dogs();
        Cats cat = new Cats();
        Fish fish = new Fish();

        dog.move(); // This animal is running.
        cat.move(); // This animal is running.
        fish.move();    // This animal is swimming.


    }
}

//                  Animals
//          Dogs     Cats       Fish
