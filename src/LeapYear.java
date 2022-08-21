public class LeapYear {
    static boolean isleapyear(int number){
        boolean leap_year_check = false;
        if(number % 4 == 0) {
            leap_year_check = true;
            if(number % 100 == 0){
                if(number % 400 == 0){
                    leap_year_check = true;
                }else{
                    leap_year_check = false;
                }
            }
        }
        return leap_year_check;
    }
}
