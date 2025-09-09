public class variable {
    public static void main(String[] args) {
        //Primitive data
        //Whole number store
        byte byValue=127; //size:1byte
        short shValue=32_767; //size:2bytes | underscore can to use separate.Then it's doesn't reflect
        int inValue=2_147_483_647; //size:4bytes
        long loValue=100_000_000_000_000L; //size:8bytes | long must end with l/L

        //Fractional number store
        float flValue=1.123654789F; //size:4bytes //size:8bytes | long must end with f/L
        double dbValue=2.145697; //size:8bytes

        //Boolean value store
        boolean blValue=true; //size:1bit

        //Character value store
        char chValue='R'; //size:2bytes

        System.out.println("Byte:"+byValue);
        System.out.println("Short:"+shValue);
        System.out.println("Int:"+inValue);
        System.out.println("Long:"+loValue);
        System.out.println("Float:"+flValue);
        System.out.println("Double:"+dbValue);
        System.out.println("Boolean:"+blValue);
        System.out.println("Character:"+chValue);

    }
}
