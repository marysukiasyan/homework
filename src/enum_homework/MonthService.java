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

    public static boolean checkHoliday(MonthsOfTheYear month, int checkingDay) {
        int[] holidaysOfMonth = month.getHolidays();
        boolean isHoliday = false;
        for (int day : holidaysOfMonth) {
                if (checkingDay == day) {
                    isHoliday = true;
                } else {
                    isHoliday = false;
                }
            }
        return isHoliday;
    }
}
