public class _25_OverloadedMethods {
    public static void main(String[] args){
        // overloaded methods: methods that share the same name,
        //                     but different parameters
        //                     signature = name + parameters

        String pizza = bakePizza("flat bread", "mozarella", "pepperoni");

        System.out.println(pizza);



    }
    static String bakePizza(String bread){
        return bread + " pizza";
    }
    static String bakePizza(String bread, String cheese){
        return cheese + " " + bread + " pizza";
    }
    static String bakePizza(String bread, String cheese, String topping){
        return topping + " " + cheese + " " + bread + " pizza";
    }

}


// !!! Methods can share the same name, but they need to have a different list of parameters!!!