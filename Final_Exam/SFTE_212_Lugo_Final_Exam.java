package Final_Exam;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;


public class SFTE_212_Lugo_Final_Exam {
    public static void main(String[] args) {



        // >>>>>>>>> 1: Write a stream object using the StringWriter class
        System.out.println("StringWriter class in Java:");

        StringWriter stringWriter = new StringWriter();
        stringWriter.write("Thank you Dr. Bonat for the great instruction on my path to becoming a better coder.");

        String result = stringWriter.toString();  // Convert StringWriter to String and print it
        System.out.println(result);



        // >>>>>>>>> 2: Remove items from a List object within a loop
        System.out.println("List item removal in Java:");

        List<String> list = new ArrayList<>();
        list.add("Top Bun");
        list.add("Lettuce");
        list.add("Bacon");
        list.add("Cheese");
        list.add("Patty");
        list.add("Secret Sauce");
        list.add("Bottom Bun");

        System.out.println("List before removal: " + list);  // Displaying the list before removal

        for (int i = 0; i < list.size(); i++) {  // Remove items containing letter 'n' from the list
            if (list.get(i).contains("n")) {
                list.remove(i);
                i--;  // Decrement index to handle shifting elements after removal
            }
        }
  
        System.out.println("List after removal: " + list);  // Displaying the list after removal




        // >>>>>>>> 3: Implement an Enumeration class in a Java program
        System.out.println("Enums in Java:");

        Day day = new Day();
        day.setWeather("Thunder");
        String season = day.getWeather();
        System.out.println(season);
        day.enumSwitchExample();
    }

    public static class Day {
        private Weather weather;

        public String getWeather() {
            return weather.name();
        }
        public void setWeather(String weather) {
            this.weather = Weather.valueOf(weather);
        }
        private enum Weather {
            Rainy,
            Sunny,
            Snowy,
            Windy,
            Thunder
        }

        public void enumSwitchExample() {
            switch(weather) {
            case Rainy:
                System.out.println("It's pretty wet");
                break;
            case Sunny:
                System.out.println("It's pretty hot");
                break;
            case Snowy:
                System.out.println("It's pretty icy");
                break;
            case Windy:
                System.out.println("It's getting chilly");
                break;
            case Thunder:
                System.out.println("LIGHTNING STRIKE!!!");
            break;
            }
        }
    }
}

