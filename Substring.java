import java.util.Scanner;

public class Substring {
    public static void main(String[] args){

        // .substring() = A method used to extract a portion of a string
        //                .substring(start, end)

        Scanner scanner = new Scanner(System.in);

        String email;
        String username;
        String domain;

        System.out.print("Enter your email: ");
        email = scanner.nextLine();

        if(email.contains("@")){
            username = email.substring(0, email.indexOf("@"));    // serdarkaya.q
            domain = email.substring(email.indexOf("@") + 1);     // gmail.com

            System.out.println(domain);
            System.out.println(username);

        }
        else{
            System.out.println("Email addresses must contain '@' inside of it");
        }
        
        scanner.close();
    }
}
