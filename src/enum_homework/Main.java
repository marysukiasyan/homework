package enum_homework;

public class Main {
    public static void main(String[] args) {

        MonthService.holidaysOfGivenMonth(MonthsOfTheYear.APRIL);

        MonthService.daysOfMonth(MonthsOfTheYear.MARCH);

        MonthService.printMonths();

        System.out.println(MonthService.checkHoliday(MonthsOfTheYear.MARCH, 8));
    }
}
