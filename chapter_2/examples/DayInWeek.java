public class DayInWeek {
    public static void main(String[] args) {
        // If today is tuesday, what day will it be in 100 days?
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday"};
        int numberDay = (2 + 100) % 7;
        System.out.println("If today is Tuesday, it will be " 
            + daysOfWeek[numberDay] + " in 100 days.");
    }
}