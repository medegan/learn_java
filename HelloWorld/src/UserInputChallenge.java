import java.util.Scanner;


public class UserInputChallenge {
    public  static void main(String[] args){
        //sumFiveIntegers();
        minAndMax();
    }

    //challenge: Read 5 valid numbers from the console entered by the user, and print the sum of the 5 digits.
    //If number isn't valid, print invalid number and the user should reenter a valid number

    public static void sumFiveIntegers(){
        Scanner scanner = new Scanner(System.in);
        int numCount = 1;
        int sum = 0;

        do{
            System.out.println("Enter number "+numCount);
            String number = scanner.nextLine();
            try {
                int num = Integer.parseInt(number);
                sum += num;
                numCount++;
            }catch (NumberFormatException e){
                System.out.println("Invalid number");
            }
        }while(numCount <= 5);
        System.out.println("Sum = "+sum);
    }

    //challenge: display min and max number at everytime a user enters a number(integer). user enters any non-numeric character to quit.
    public  static void minAndMax(){
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 0;
        boolean isValid = true;
        boolean firstTime = true;
        do{
            System.out.println("Enter an integer");
            String number = scanner.nextLine();

            try{
                int num = Integer.parseInt(number);
                if(firstTime){
                    min = num;
                    max = num;
                    firstTime = false;
                }else{
                    min = num < min ? num : min;
                    max = num > max ? num : max;
                }
                System.out.println("Current Min is "+min);
                System.out.println("Current Max is "+max);
            }catch(NumberFormatException e){
                System.out.println("App closing"());
                isValid = false;
            }
        }while(isValid);
    }
}
