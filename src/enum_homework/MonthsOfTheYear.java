package enum_homework;

 public enum MonthsOfTheYear {
    JANUARY(31, new int[]{1, 2, 3, 5, 6}),
    FEBRUARY(29, new int[]{}),
    MARCH(31, new int[]{8}),
    APRIL(30, new int[]{}),
    MAY(31, new int[]{}),
    JUNE(30, new int[]{}),
    JULY(31, new int[]{}),
    AUGUST(31, new int[]{}),
    SEPTEMBER(30, new int[]{}),
    OCTOBER(31, new int[]{}),
    NOVEMBER(30, new int[]{}),
    DECEMBER(31, new int[]{});

    private int dayNumbers;
    private int[] holidays;

     public int getDayNumbers() {
         return dayNumbers;
     }

     public int[] getHolidays() {
         return holidays;
     }

     MonthsOfTheYear(int dayNumbers, int[] holidays) {
         this.dayNumbers = dayNumbers;
         this.holidays = holidays;
     }
 }
