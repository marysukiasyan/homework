package enum_homework;

 public enum MonthsOfTheYear {
    JANUARY(1, 31, new int[]{1, 2, 3, 5, 6}),
    FEBRUARY(2, 29, new int[]{}),
    MARCH(3, 31, new int[]{}),
    APRIL(4, 30, new int[]{}),
    MAY(5, 31, new int[]{}),
    JUNE(6, 30, new int[]{}),
    JULY(7, 31, new int[]{}),
    AUGUST(8, 31, new int[]{}),
    SEPTEMBER(9, 30, new int[]{}),
    OCTOBER(10, 31, new int[]{}),
    NOVEMBER(11, 30, new int[]{}),
    DECEMBER(12, 31, new int[]{});

     MonthsOfTheYear(int month, int dayNumbers, int[] holidays) {
     }

     @Override
     public String toString() {
         return super.toString();
     }
 }
