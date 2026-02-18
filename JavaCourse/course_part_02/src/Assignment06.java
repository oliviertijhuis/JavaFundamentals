public class Assignment06 {
    public static void main(String[] args){
        // StringBuffer
        StringBuffer helloJavaWorldBuffer = new StringBuffer( "Hello Java World");
        helloJavaWorldBuffer.append(", programming in Java is fun.");
        System.out.println("StringBuffer: " + helloJavaWorldBuffer);

        // StringBuilder
        StringBuilder HelloJavaWorldBuilder = new StringBuilder("Hello Java World");
        HelloJavaWorldBuilder.delete(6,11); // 'Java' verwijderd inclusief de spatie
        System.out.println("StringBuilder: " + HelloJavaWorldBuilder);

        // Integer
        Integer myInt = 10;
        System.out.println("Integer (" + myInt+ ") naar een double: " + myInt.doubleValue());

        // Double
        Double myDouble = 11.89;
        System.out.println("Double (" +myDouble + ") naar een interger: " + myDouble.intValue());
    }
}
