public class methodOverload {
    public static void main(String[] args) {
        double totalInches = convertToCentimeters(5,7);
        double totalCentimeter = convertToCentimeters((int)totalInches);
        System.out.println(totalCentimeter);

        //convert seconds to hours
        String convertedTime = getDurationString(7200);
        System.out.println(convertedTime);

        //convert minute and seconds to hours
        String convertedMinuteTime = getDurationString(3200, 59);
        System.out.println(convertedMinuteTime);


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

    /*Convert seconds to hour*/
    public static String getDurationString(int seconds){
        if (seconds < 0){
            return "Invalid seconds "+seconds+" given";
        }else{
            int hour = seconds / 3600;
            int minuteRemainder = seconds % 3600;
            int min = 0;
            int sec = 0;
            if (minuteRemainder != 0){
                min = minuteRemainder / 60;
                sec = minuteRemainder % 60;
            }else{
                min = 0;
                sec = 0;
            }

            return hour+"h "+min+"m "+sec+"s";
        }
    }

    public static String getDurationString(int seconds, int minute){
        if(seconds < 0 ||seconds > 59 || minute < 0){
            return "Invalid input given";
        }else{
            //convert minute and seconds to seconds
            int totalSeconds = (minute * 60)+ seconds;
            return getDurationString(totalSeconds);
        }
    }
}
