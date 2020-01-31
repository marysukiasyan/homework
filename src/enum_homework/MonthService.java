package enum_homework;

public class MonthService {

    public static void holidaysOfGivenMonth(MonthsOfTheYear month) {
        if (month.getHolidays() == null || month.getHolidays().length == 0) {
            System.out.println("There aren't holidays in " + month);
        } else {
            System.out.print(month.name() + " holidays: ");
            for (int holiday : month.getHolidays()) {
                System.out.print(holiday + " ");
            }
        }
    }

    public static void daysOfMonth(MonthsOfTheYear month) {
        System.out.println(month + " days: " + month.getDayNumbers());
    }

    public static void printMonths() {
        for (int i = MonthsOfTheYear.values().length-1; i >= 0; i--) {
            System.out.println(MonthsOfTheYear.values()[i].name());
        }
    }

    public static void checkHoliday(MonthsOfTheYear month, int[] days){
        int[] holidaysOfMonth = month.getHolidays();
        for (int i = 0; i < days.length; i++) {
            for (int day:
                    holidaysOfMonth) {
                if(days[i] == day){
                    System.out.println(days[i] + " is a holiday in " + month);
                }
                else{
                    System.out.println(days[i] + " isn't a holiday in " + month);
                }
            }
        }
    }
}
