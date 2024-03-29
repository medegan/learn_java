public class methodOverload {
    public static void main(String[] args) {
        double totalInches = convertToCentimeters(5,7);
        double totalCentimeter = convertToCentimeters((int)totalInches);
        System.out.println(totalCentimeter);
    }

    /*Convert height in inches to centimeters
     */
    public static double convertToCentimeters(int height){
        double centimeters = 2.54 * height;

        return  centimeters;
    }

    /*Convert height in inches and feet to inches
     */
    public static double convertToCentimeters(int heightFeet, int heightInches){
        double totalHeightInches  = (12 * heightFeet) + heightInches;
        return  totalHeightInches;
    }
}
