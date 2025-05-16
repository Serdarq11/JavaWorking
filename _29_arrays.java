import java.util.Arrays;

public class _29_arrays {
    public static void main(String[] args) {
        // array: a collection of values of the same data types

        String[] fruits = {"apple", "banana", "orange", "coconut"};
        fruits[0] = "pineapple";
        int numOfFruits = fruits.length;

        System.out.println(numOfFruits);
        System.out.println(fruits[0]);

        Arrays.sort(fruits);    // sorting alphabetically
        Arrays.fill(fruits, "pineapple");   // every element will be "pineapple"

        for(int i = 0; i < fruits.length; i++){
            System.out.println(fruits[i]);
        }


        // enhanced for loop
        for(String fruit : fruits){
            System.out.println(fruit);
        }


    }
}
