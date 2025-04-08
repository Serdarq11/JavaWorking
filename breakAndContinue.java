public class breakAndContinue {
    public static void main(String[] args){
        // break: break out of a loop (stop)
        // continue: skip current iteration of a loop (skip)

        for(int i = 0; i <= 10; i++){
            // if(i == 5){     // 0 1 2 3 4
            //    break;
            //}

            if(i == 5){         // 0 1 2 3 4 6 7 8 9 10 (skips 5)
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
