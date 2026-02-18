public class Assignment09 {
    int counter = 0;
    int sum = 0;

    public void main(){
        int[] numbers = {5,8,4,6,9,7};

        // while loop
        while (counter < 6){
            sum += numbers[counter];
            counter++;
        }
        System.out.println("sum: " + sum);
        resetVariabelen();

        // do while loop
        do {
            sum += numbers[counter];
            counter++;
        }while(counter < 6);
        System.out.println("sum: " + sum);
        resetVariabelen();

        // for loop
        for (int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        System.out.println("sum: " + sum);
        resetVariabelen();

        // for each loop
        for (int number: numbers){
            sum +=number;
        }
        System.out.println("sum: " + sum);
    }

    public void resetVariabelen(){
        counter = 0;
        sum = 0;
    }
}
