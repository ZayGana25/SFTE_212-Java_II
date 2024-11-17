package week14;

public class Day {
    private Season season;

    public String getSeason() {
        return season.name();
    }
    public void setSeason(String season) {
        this.season = Season.valueOf(season);
    }
    private enum Season {
        WINTER,
        SPRING,
        SUMMER,
        FALL,
        WIND
    }

    public void enumSwitchExample() {
        switch(season) {
        case WINTER:
            System.out.println("It's pretty cold");
            break;
        case SPRING:
            System.out.println("It's warming up");
            break;
        case SUMMER:
            System.out.println("It's pretty hot");
            break;
        case FALL:
            System.out.println("It's cooling down");
            break;
        case WIND:
            System.out.println("It's a lot of wind");
        break;
        }
    }
}
