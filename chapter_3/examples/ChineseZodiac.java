import java.util.Scanner;
import java.util.GregorianCalendar;
import java.util.Calendar;

public class ChineseZodiac {

    public static final int MONKEY = 0;
    public static final int ROOSTER = 1;
    public static final int DOG = 2;
    public static final int PIG = 3;
    public static final int RAT = 4;
    public static final int OX = 5;
    public static final int TIGER = 6;
    public static final int RABBIT = 7;
    public static final int DRAGON = 8;
    public static final int SNAKE = 9;
    public static final int HORSE = 10;
    public static final int SHEEP = 11;

    public static String getSign(int zodiacYear) {
        String zodiacSign = "";
        switch (zodiacYear) {
            case ChineseZodiac.MONKEY :
                zodiacSign = "Monkey";
                break;
            case ChineseZodiac.ROOSTER :
                zodiacSign = "Rooster";
                break;
            case ChineseZodiac.DOG :
                zodiacSign = "Dog";
                break;
            case ChineseZodiac.PIG :
                zodiacSign = "Pig";
                break;
            case ChineseZodiac.RAT :
                zodiacSign = "Rat";
                break;
            case ChineseZodiac.OX :
                zodiacSign = "Ox";
                break;
            case ChineseZodiac.TIGER :
                zodiacSign = "Tiger";
                break;
            case ChineseZodiac.RABBIT :
                zodiacSign = "Rabbit";
                break;
            case ChineseZodiac.DRAGON :
                zodiacSign = "Dragon";
                break;
            case ChineseZodiac.SNAKE :
                zodiacSign = "Snake";
                break;
            case ChineseZodiac.HORSE :
                zodiacSign = "Horse";
                break;
            case ChineseZodiac.SHEEP :
                zodiacSign = "Sheep";
                break;
            default :
                zodiacSign = "ERROR";
        }//end switch
        return zodiacSign;
    }

    public static int getZodiacYear() {
        GregorianCalendar cal = new GregorianCalendar();
        int currentYear = cal.get(Calendar.YEAR);
        return currentYear % 12;
    }

    public static int getZodiacYear(int calendarYear) {
        return calendarYear % 12;
    }

    public static void main(String[] args) {

        int zodiacYear = ChineseZodiac.getZodiacYear(1877);
        String zodiacSign = ChineseZodiac.getSign(zodiacYear);

        System.out.println("The Chinese Zodiac sign for " + zodiacYear + " is " 
            + zodiacSign);
    }
}