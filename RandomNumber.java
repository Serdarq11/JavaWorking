import java.util.Random;

public class RandomNumber {
    public static void main(String[] args){

        // nextInt will be between 2 billions and -2 billions
        // nextDouble will be between 0 and 1
        // nextBoolean will be either true or false     -> heads (0) and tails (1) can be played with if statement.

        Random random = new Random();

        int serdar;
        int gozde;
        int emre;
        int sahin;
        int nur;


        serdar = random.nextInt(1, 7); // 1 is inclusive and 7 is exclusive
        gozde = random.nextInt(1, 7); // 1 is inclusive and 7 is exclusive
        emre = random.nextInt(1, 7); // 1 is inclusive and 7 is exclusive
        sahin = random.nextInt(1, 7); // 1 is inclusive and 7 is exclusive
        nur = random.nextInt(1, 7); // 1 is inclusive and 7 is exclusive


        System.out.println("serdar: " + serdar);
        System.out.println("gozde: " + gozde);
        System.out.println("emre: " + emre);
        System.out.println("sahin: " + sahin);
        System.out.println("nur: " + nur);


        if((gozde > serdar) && (gozde > emre) && (gozde > sahin) && (gozde > nur)){
            System.out.println("Gozde win the round");
        }
        else if((serdar > gozde) && (serdar > emre) && (serdar > sahin) && (serdar > nur)){
            System.out.println("Serdar win the round");
        }
        else if((emre > gozde) && (emre > serdar) && (emre > sahin) && (emre > nur)){
            System.out.println("Emre win the round");
        }
        else if((sahin > gozde) && (sahin > emre) && (sahin > serdar) && (sahin > nur)){
            System.out.println("Sahin win the round");
        }
        else if((nur > gozde) && (nur > emre) && (nur > serdar) && (nur > sahin)){
            System.out.println("Nur win the round");
        }
        else{
            System.out.println("Nobody wins the round!");
        }
    }
}
