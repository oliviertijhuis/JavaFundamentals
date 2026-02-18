public class Assignment05 {
    public static void main(String[] args){
        String firstName = "James";
        String lastName = "Dean";
        int age = 24;
        String voorbeeld = "The American actor %s %s was %02d years when he died.";
        System.out.println(String.format(voorbeeld, firstName, lastName, age));

        double dblTemperature = 28.53;
        String strTemperature = String.valueOf(dblTemperature);
        System.out.println("dblTemperature: " + dblTemperature);
        System.out.println("strTemperature: " + strTemperature);

        String strHumidity = "54.65";
        float fltHumidity = Float.parseFloat(strHumidity);
        System.out.println("strHumidity: " + strHumidity);
        System.out.println("fltHumidity: " + fltHumidity);
    }
}
