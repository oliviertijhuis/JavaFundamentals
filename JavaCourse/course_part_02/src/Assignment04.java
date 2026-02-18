public class Assignment04 {
    public static void main(String[] args){
        String myString = "Dit is opdracht 4 en dit is mijn voorbeeld.";

        System.out.println("Dit is de lengte van mijn string: " + myString.length());
        System.out.println("Op value 5 zit de waarde: " + myString.charAt(5));
        System.out.println(myString.concat("En dit heb ik er aan toegevoegd met concat."));
        System.out.println("Begint mijn string met 'dit'? " + myString.startsWith("Dit") );
        System.out.println("En eindigt mijn string met dit? "+ myString.endsWith("."));

        String secondString = "Een vogel is paars.";
        System.out.println("Ik heb ook een tweede string en dat is: " + secondString);
        System.out.println("Het statement dat string 1 en string 2 gelijk zijn is: " + myString.equals(secondString));
        System.out.println("De index van opdracht in string 1 is: " + myString.indexOf("opdracht"));
        System.out.println("De string is nog niet leeg, kijk maar: " + myString.isEmpty());

        System.out.println("De string doet een beetje gek: "+ myString.replace('i','1'));
        System.out.println("Als ik alleen het laatste woord wil: " + myString.substring(33));

        System.out.println("Nu doe ik alles naar hoofdletters: " + myString.toUpperCase());
        System.out.println("Nu doe ik alles weer naar kleine letters: "+myString.toLowerCase());

        System.out.print("Ik voeg nu wat spaties to aan mijn string: " + myString.concat("        "));
        System.out.println("en ik verwijder nu weer alle spaties: " + myString.trim());


    }
}
