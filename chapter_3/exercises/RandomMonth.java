public class RandomMonth {
    public static void main(String[] args) {

        //Generate random number 0 - 11 for a corresponding month
        int monthNumber = (int)(Math.random() * 12) + 1;
        String monthName = "";
        //Determine which month name the random number represents
        switch(monthNumber) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
        }

        //Print the name of the month in the console
        System.out.println(monthName);

    }
}