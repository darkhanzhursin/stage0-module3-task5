package lang.print.gaps.task5;

public class TimeConvertor {
    float seconds = 0;
    public void convert(float minutes) {
        seconds = minutes * 60;
        System.out.println(seconds);
    }
}
