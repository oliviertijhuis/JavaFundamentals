public class Assignment08c {
    static void main(String[] args) {
        int a = 10;
        int b = -21;

        int result = (a < b ) ? a : b;
        System.out.println("Het kleinste getal: " + result);

        result = (a > b) ? a : b;
        System.out.println("Het kleinste getal: " + result);

        System.out.println("Absolute waarde van b is: " + ((b <= 0) ? (-b) : b));
    }

    /*
     * 3. Wat doet het onderstaand stukje code:
     *  Het kijkt of er 1 of meerdere bloemen zijn.
     * Bij meer bloemen print het: "There are [flowers] on the table"
     * Bij een of negatief aantal bloemen print het: "There is 1 flower on the table"
     */
}
