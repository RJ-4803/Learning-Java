public class String_data {
    public static void main(String[] args) {
        String name1=new String("RJ"); // It's create 2 objects | One in the String Constant Pool (SCP) for "RJ", Another in the Heap because of new.
        String name2="RJ"; // // It's create single objects | That's String Constant Pool (SCP) only,

        System.out.println("Value-1:"+name1);
        System.out.println("Value-2:"+name2);
        System.out.println("Is value-1 equal value-2 ? "+name1.equals(name2)); //Using to compare java default method

        String name3="Renujaan";
        String name4= name3.toUpperCase(); // change user inputs like uppercase using default method

        System.out.println("Value-3:"+name3);
        System.out.println("Changed to uppercase:"+name4);
        System.out.println("Recheck the original value-3:"+name3);
    }
}
