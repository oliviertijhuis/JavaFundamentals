public class Assignment01 {

    public static void main(String[] args) {
        /*
         * byte
         * Min: -128
         * Max: 127
         * Default: 0
         */
        byte byteVariable = 25;
        System.out.println("Byte value is: " + byteVariable);

        /*
         * short
         * Min: -32,768
         * Max: 32,767
         * Default: 0
         */
        short shortVariable = 10000;
        System.out.println("Short value is: " + shortVariable);

        /*
         * int
         * Min: -2,147,483,648
         * Max: 2,147,483,647
         * Default: 0
         */
        int intVariable = 1500200300;
        System.out.println("Int value is: " + intVariable);

        /*
         * long
         * Min: -2^63
         * Max: 2^63-1
         * Default: 0L
         */
        long longVariable = 2^43;
        System.out.println("Long value is: " + longVariable);

        /*
         * float
         * Min: -3.40282347E+38F
         * Max: 3.40282347E+38F
         * Default: 0.0f
         */
        float floatVariable = 3.4567f;
        System.out.println("Float value is: " + floatVariable);

        /*
         * double
         * Min: -1.79769313486231570E+308
         * Max: 1.79769313486231570E+308
         * Default: 0.0
         */
        double doubleVariable = 1.79769313486231570;
        System.out.println("Double value is: " + doubleVariable);

        /*
         * boolean
         * Min: false
         * Max: true
         * Default: false
         */
        boolean booleanVariable = true;
        System.out.println("Boolean value is: " + booleanVariable);

        /*
         * byte
         * Min:
         * Max:
         * Default: '\u0000'
         */
        char charVariable = 'A';
        System.out.println("Char value is: " + charVariable);
    }
}
