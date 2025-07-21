import java.util.ArrayList;

public class MyFirstApp{
    public static final int my_value = 400;
    
    public static void main(String[] args){
        MyFirstApp myApp = new MyFirstApp();

        int x = 4;
        System.out.println("-loop start");
        while(x>1){
            System.out.println("looping...");
            x--;
        }
        
        System.out.println("outside loop");
        if(x == 1)System.out.println(my_value);

        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        int[] numbers = new int[10];
        numbers[0] = 25;
        numbers[1] = 2;
        numbers[2] = 6;
        numbers[3] = 35;
        numbers[4] = 67;
        numbers[5] = 100;
        numbers[6] = 4;
        numbers[7] = 121;
        numbers[8] = 209;
        numbers[9] = 9;

        int incr = 0;


        while((numbers.length) >= ((incr)+1)){

            int num = numbers[incr];

            if(num %2 == 0){
                //even
                evenNumbers.add(numbers[incr]);
            }else{
                //odd
                oddNumbers.add(numbers[incr]);
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

        myApp.compareNumbers(evenNumbers,oddNumbers);
    }

    public void compareNumbers(ArrayList<Integer> numberArray1, ArrayList<Integer>numberArray2){
        System.out.println("--Comparing Numbers--");

        ArrayList<Integer> largerArray;
        ArrayList<Integer> smallerArray;

        if(numberArray1.size() > numberArray2.size()){
            largerArray = numberArray1;
            smallerArray = numberArray2;
        }else{
            largerArray = numberArray2;
            smallerArray = numberArray1;
        }

        for (int i = 0; i <= ((largerArray.size())-1); i++) {
            if(i <= ((smallerArray.size())-1)){
                int num1 = largerArray.get(i);
                int num2 = smallerArray.get(i);
                boolean larger = (num1>num2);

                if(larger){
                    System.out.println(num1 +" > "+ num2);
                }else{
                    System.out.println(num1 + " < "+ num2);
                }
            }else{
                int num1 = largerArray.get(i);
                System.out.println(num1);
            }
            
        }
    }
}