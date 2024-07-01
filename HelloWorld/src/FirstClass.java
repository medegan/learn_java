public class FirstClass {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int number = 5;
        int evenCount = 0;
        int oddCount = 0;
        while (number <= 20){
            if(isEven(number)){
                System.out.println(number);
                evenCount++;
            }else{
                oddCount++;
            }
            number ++;
        }
       }

    public static boolean isEven(int number){
        boolean isEvenNumber = false;
        isEvenNumber = number % 2 == 0;

        return isEvenNumber;
    }
}
