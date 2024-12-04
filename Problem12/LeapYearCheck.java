package Problem12;

class LeapYearCheck {
    public int checkLeapYear(int year) {
        if(year<=0)
            return 1001;

        if((year%4==0 && year%100 !=0) || year%400==0)
            return 1;
        else
            return 0;
    }
}

