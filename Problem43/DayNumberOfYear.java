package Problem43;

public class DayNumberOfYear {
    public static void main(String[] args) {
        DayNumberOfYearInString dayNumber = new DayNumberOfYearInString();

        String date = "2024-12-04";
        int dayNumberOfYear = dayNumber.findDayNumberOfYear(date);

        if(dayNumberOfYear == 1001)
            System.out.println("Entered year is empty");
        else 
            System.out.println("Day Number in year of given date " +date+ " is :" +dayNumberOfYear);

    
    }
}
