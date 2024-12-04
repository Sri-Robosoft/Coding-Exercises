package Problem43;

public class DayNumberOfYearInString {
    private int year, month, day, dayNumber, leapValue;

    DayNumberOfYearInString() {
        this.year = 0;
        this.month = 0;
        this.day = 0;
        this.dayNumber = 0;
        this.leapValue = 0;
    }

    public int findDayNumberOfYear(String str) {
        if(str.isEmpty())
            return 1001;

        year = Integer.parseInt(str.substring(0,4));
        month = Integer.parseInt(str.substring(5,7));
        day = Integer.parseInt(str.substring(8));

        dayNumber = day;
        leapValue = (year%4==0 && year%100!=0) || year%100==0 ? 28 : 29;
        int[] daysInMonth = {31, leapValue, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for(int i=0; i<month-1; i++)
            dayNumber += daysInMonth[i];

        return dayNumber;
    }
}
