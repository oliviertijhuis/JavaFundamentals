public class Assignment03 {
    public static void main(String[] args){
        int myInt1 = 100;
        long myLong1 = myInt1; // Er wordt widening casting toegepast want het gaat van klein naar groot
        float myFloat1 = myLong1; // Er wordt widening casting toegepast want het gaat van klein naar groot

        System.out.println("int 1: " + myInt1);
        System.out.println("long 2: " + myLong1);
        System.out.println(("float: " + myFloat1));

        double myDouble = 66.78;
        long myLong2 = (long)myDouble; // Er wordt narrow casting gebruikt want het gaat van groot naar klein
        int myInt2 = (int)myLong2; // Er wordt narrow casting gebruikt want het gaat van groot naar klein

        System.out.println("double: " + myDouble);
        System.out.println("long 2: " + myLong2);
        System.out.println(("int 2: " + myInt2));

        /* Het valt me op dat bij de widening casting de waarde niet verandert behalve
         * dat er bij de float een '.o' achter het getal 100 komt.
         * Bij de narrow casting valt het me op dat de '.78' weggaat bij de casting van
         * double naar long
         */
    }
}
