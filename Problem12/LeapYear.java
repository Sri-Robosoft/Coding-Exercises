package Problem12;

public class LeapYear {
    public static void main(String[] args) {
        LeapYearCheck leap = new LeapYearCheck();

        int year = 2400;
        int isLeapYear = leap.checkLeapYear(year);
        if(isLeapYear == 1001)
            System.out.println("Please enter a valid year");
        else if (isLeapYear == 1)
            System.out.println(year +" is a Leap year..");
        else if(isLeapYear == 0)
            System.out.println(year +" is a not a Leap year..");

    }
}

