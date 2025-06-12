public class _42_inheritance {
    public static void main(String[] args){

        // inheritance : One class inherits the attributes and methods
        //               from another class
        //               child <- parent <- Grandparent

        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();

        System.out.println(dog.isAlive);    // true
        System.out.println(cat.isAlive);    // true

        dog.eat();  // This animal is eating.
        cat.eat();  // This animal is eating.

        System.out.println(dog.lives);  // 1
        System.out.println(cat.lives);  // 9

        dog.speak();    // The dog goes *woof*
        cat.speak();    // The cat goes *meow*

        System.out.println(plant.isAlive);  // true
        plant.photosynthesize();    // The plant absorbs sunlight.


    }
}

//          -----  Organism   -------
//          |                       |
//      Plant               ---   Animal ---
//                          |              |
//                          Dog          Cat
