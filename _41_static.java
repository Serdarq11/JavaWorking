public class _41_static {
    public static void main(String[] args){

        // static = Makes a variable or method belong to the class
        //          rather than to any specific object
        //          commonly used for utility methods or shared resources


        Friend friend1 = new Friend("Spongebob");
        Friend friend2 = new Friend("Gozde");
        Friend friend3 = new Friend("Serdar");
        Friend friend4 = new Friend("Sahin");
        Friend friend5 = new Friend("Emre");

        System.out.println(Friend.numOfFriends);

        Friend.showFriends();

        System.out.println(Math.ceil(3.49));    // already defined static class
    }
}

// Friend class is included in this class
