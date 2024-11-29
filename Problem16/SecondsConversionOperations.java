package Problem16;

class SecondsConversionOperations {
    private int hours;
    private int minutes;
    private int seconds;

    public void conversionOfSeconds(long totalSeconds) {
        if(totalSeconds <= 0) {
            System.out.println("Please eneter a number greater than 0");
        } else {
            hours = (int) totalSeconds/(60*60);
            minutes = (int) (totalSeconds%(60*60))/60;
            seconds = (int) (totalSeconds%60);

            System.out.println(hours + " Hour" +(hours>1 ? "s ": " ") + minutes + " Minute" +(minutes>9 ? "s ": " ") + seconds + " Second" +(seconds>9 ? "s ": " "));
        }
    }
}


