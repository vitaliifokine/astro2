import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Planets {

    static List<String> zodiac = Arrays.asList("SGR", "LIB", "LEO", "SCO");
    static List<String> characters = Arrays.asList("Chpleric", "Sangvinic", "K", "B");

    public static HashMap<String, Integer> getPers(){
        HashMap<String, Integer> persantages = new HashMap<String, Integer>();
        persantages.put("Ascendant", 2);
        persantages.put("Sun", 6);
        persantages.put("Moon", 9);
        persantages.put("Mercury", 17);
        persantages.put("Venus", 8);
        persantages.put("Mars", 6);
        persantages.put("Jupiter", 12);
        persantages.put("Saturn", 22);
        persantages.put("Uranus", 5);
        persantages.put("Neptune", 3);
        persantages.put("Pluto", 5);
        return persantages;
    }

    public static HashMap<String, String> getTemperaments(){
        HashMap<String, String> tempepaments = new HashMap<String, String>();
        /*Adding elements to HashMap*/
        tempepaments.put(zodiac.get(0), characters.get(1));
        tempepaments.put(zodiac.get(1), characters.get(1));
        tempepaments.put(zodiac.get(2), characters.get(1));
        tempepaments.put(zodiac.get(3), characters.get(1));
        tempepaments.put(zodiac.get(0), characters.get(1));
        tempepaments.put(zodiac.get(0), characters.get(1));
        tempepaments.put(zodiac.get(0), characters.get(1));
        tempepaments.put(zodiac.get(0), characters.get(1));
        return tempepaments;
    }
}

