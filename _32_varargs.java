public class _32_varargs {
    public static void main(String[] args){

        // varargs = variable arguments -> allow a method to accept a varying # of arguments
        //           make methods more flexible, no need for overloaded methods
        //           java will pack the arguments into an array
        //           ... (ellipsis)


        System.out.println(add(1, 2, 3, 4));    // 10
        System.out.println(average(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));    // 2.5


    }
    static int add(int... numbers1){

        int sum = 0;

        for(int number : numbers1){
            sum += number;
        }

        return sum;
    }
    static double average(double... numbers2){
        double sum = 0;

        if(numbers2.length == 0){
            return 0;
        }

        for(double number : numbers2){
            sum += number;
        }

        return sum / numbers2.length;
    }
}
