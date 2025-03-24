public class StringMethods {
    public static void main(String[] args){

        String name = "John Doe";

        // int length = name.length(); // 8
        // char letter = name.charAt(0);   // J
        // int index = name.indexOf(" ");  // 4
        // int lastIndex = name.lastIndexOf("o");  // 6

        // name = name.toUpperCase();  // JOHN DOE
        // name = name.toLowerCase();  // john doe
        // name = name.trim();         // remove the spaces from the beginning and after the string
        // name = name.replace("o", "i");  // Jihn Die
        // System.out.println(name.isEmpty());      // false


        System.out.println(name);
        /*
        if(name.isEmpty()){
            System.out.println("Your name is empty");
        }
        else{
            System.out.println("Hello " + name);
        }


        if(name.contains(" ")){
            System.out.println("Your name contains a space.");
        }
        else{
            System.out.println("Your name doesn't contain any spaces.");
        }
        */

        if(name.equals("password")){
            System.out.println("Your name cannot be password");
        }
        else{
            System.out.println("Hello " + name);
        }
    }
}
