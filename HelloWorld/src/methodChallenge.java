public class methodChallenge {

    public static void main(String[] args){
    String name = "Tim";
    int position = 3;
    displayHighScorePosition(name, position);

    int score = 1500;
    int positionValue = calculateHighScorePosition(score);
    System.out.println("Your position is " +positionValue);

    int number = 25;
    checkNumber(number);

    areEqualByThreeDecimalPlaces(3.1756, 3.175);
    }

    /*Question1: A method named displayHighScorePosition, having two parameters - player's name and position.
             Method should print a statement
    */
    public static void displayHighScorePosition(String name, int position){
        System.out.println(name+" got into position " +position +" in the high score list.");
    }

    /*Question2: A method named calculateHighScorePosition, having one parameter-player's score.
    Method should return 1 if score >=1000; 2 if score >= 500 but less than 1000; 3 if >= 100 but less tan 500; 4 for all other scores
    */

    public static int calculateHighScorePosition(int score){
        int position = 0;

        if(score >= 1000){
            position = 1;
        }else if(score >= 500){
            position = 2;
        }else if(score >= 100){
            position = 3;
        }else{
            position = 4;
        }
        return position;
    }

    /* Write a method called checkNumber with an int parameter named number. The method should not return any value, and it needs to print out:
    - "positive" if the parameter number is > 0; - "negative" if the parameter number is < 0; - "zero" if the parameter number is equal to 0
    */
    public static void checkNumber(int number){
        String output = "";
        if(number > 0){
            output = "positive";
        }else if(number < 0){
            output = "negative";
        }else{
            output = "zero";
        }
        System.out.println(output);
    }

    /* Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
    The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places. Otherwise, return false.
    */
    public static boolean areEqualByThreeDecimalPlaces(double a, double b){
        long subA = (long)(a*1000);
        long subB = (long)(b*1000);
        System.out.println(subA);
        System.out.println(subB);
        if(subA == subB){
            return true;
        }else{
            return false;
        }
    }
}
