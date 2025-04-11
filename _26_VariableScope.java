public class _26_VariableScope {

    static int x = 3;  // CLASS


    public static void main(String[] args){

        // variable scope: where a variable can be accessed.
        //                  (LOCAL OR CLASS)
        int x = 1;  // -> LOCAL

        doSomething();      // 2
        System.out.println(x);  // 1

    }

    static void doSomething(){
        int x = 2;       // -> LOCAL

        System.out.println(x);
    }
}
