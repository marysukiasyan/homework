package enum_homework;

public class Main {
    public static void main(String[] args) {

        MonthService.holidaysOfGivenMonth(MonthsOfTheYear.APRIL);

        MonthService.daysOfMonth(MonthsOfTheYear.MARCH);

        MonthService.printMonths();

        MonthService.checkHoliday(MonthsOfTheYear.MARCH, new int[]{8, 21});
    }
}
