public class LogicOperator {
    public static void main(String[] args) {
        double num1 = 20.0;
        double num2 = 80.0;
        double sumProduct = (num1 + num2)*100.0;
        double reminder = sumProduct % 40.0;
        boolean isRemainder = (reminder == 0.00) ? true : false;

        System.out.println("Reminder Boolean="+isRemainder);

        if(!isRemainder){
            System.out.println("You have a reminder");
        }

    }
}
