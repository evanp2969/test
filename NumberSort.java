import java.util.ArrayList;

public class NumberSort extends CommandApp{
    private int evenCount = 0;
    private int oddCount = 0;

    public void run(int[] nA){


        int[] evenNumbers = new int[10];
        int[] oddNumbers = new int[10];

        int[] numbers = nA;

        int incr = 0;
        
        while((numbers.length) >= ((incr)+1)){

            int num = numbers[incr];

            if(num %2 == 0){
                //even
                evenNumbers[evenCount] = numbers[incr];
                evenCount++;
            }else{
                //odd
                oddNumbers[oddCount] = numbers[incr];
                oddCount++;
            }

            incr++;
        }

        System.out.println("Even Numbers:");
        for (int n : evenNumbers) {
            System.out.println(n);
        }

        System.out.println("Odd Numbers:");
        for (int n : oddNumbers) {
            System.out.println(n);
        }

        compareNumbers(evenNumbers,oddNumbers);
    }

    public void compareNumbers(int[] numberArray1, int[] numberArray2){
        System.out.println("--Comparing Numbers--");

        int[] largerArray;
        int[] smallerArray;

        if(evenCount > oddCount){
            largerArray = numberArray1;
            smallerArray = numberArray2;
        }else{
            largerArray = numberArray2;
            smallerArray = numberArray1;
        }

        for (int i = 0; i <= 9; i++) {
            int num1 = largerArray[i];
            int num2 = smallerArray[i];
            
            if(num1 == num2){
                System.out.println(num1+" == "+num2);
            }else{
                boolean larger = (num1>num2);

                if(larger){
                    System.out.println(num1 +" > "+ num2);
                }else{
                    System.out.println(num1 + " < "+ num2);
                }
            }
            
            
        }
    }
}