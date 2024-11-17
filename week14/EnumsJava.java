package week14;

public class EnumsJava {
    public static void main(String[] args) {
        System.out.println("Enums in Java");

        Day day = new Day();
        day.setSeason("WIND");
        String season = day.getSeason();
        System.out.println(season);
        day.enumSwitchExample();
    }
}