public class Assignment10 {
    public static void main(String[] args) {
        int[] numbers = {17,12,45,99,1,234,88,3};

        for(int number : numbers){
            String result = (number % 2 == 0) ? "Even" : "uneven";
            System.out.println(number + " is an " + result + " number.");
        }

        /*
         * 5) Ik heb een foreach gebruikt om dat die het makkelijkst is en je de index waarde niet nodig hebt
         * 6) Ik heb een ternary gebruikt om zo alles in 1 lijn te kunnen neerzetten
         * 7) Ik heb de modules operator gebruikt om te kijken of er een waarde overblijft als het gedeeld wordt door 2
         *  en als er niks over blijft (dus gelijkt blijft aan 0) dan is het even. Als er wel een resterende waarde
         *   overblijft dan is het oneven.
         */
    }
}
