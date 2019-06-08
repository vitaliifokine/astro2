import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Planets {

    static List<String> zodiac = Arrays.asList("ARI", "TAU", "GEM", "CAN", "LEO", "VIR", "LIB", "SCO", "SGR", "CAP", "AQR", "PSC");
    static List<String> characters = Arrays.asList("Choleric", "Sanguine", "Melancholic", "Phlegmatic");

    public static HashMap<String, Integer> getPers(){
        HashMap<String, Integer> persantages = new HashMap<String, Integer>();
        persantages.put("Ascendant", 16);
        persantages.put("Sun", 23);
        persantages.put("Moon", 16);
        persantages.put("Mercury", 10);
        persantages.put("Venus", 8);
        persantages.put("Mars", 10);
        persantages.put("Jupiter", 6);
        persantages.put("Saturn", 4);
        persantages.put("Uranus", 3);
        persantages.put("Neptune", 2);
        persantages.put("Pluto", 2);
        return persantages;
    }

    public static HashMap<String, String> getTemperaments(){
        HashMap<String, String> tempepaments = new HashMap<String, String>();
        /*Adding elements to HashMap*/
        tempepaments.put(zodiac.get(0), characters.get(0));
        tempepaments.put(zodiac.get(1), characters.get(2));
        tempepaments.put(zodiac.get(2), characters.get(1));
        tempepaments.put(zodiac.get(3), characters.get(3));
        tempepaments.put(zodiac.get(4), characters.get(0));
        tempepaments.put(zodiac.get(5), characters.get(2));
        tempepaments.put(zodiac.get(6), characters.get(1));
        tempepaments.put(zodiac.get(7), characters.get(3));
        tempepaments.put(zodiac.get(8), characters.get(0));
        tempepaments.put(zodiac.get(9), characters.get(2));
        tempepaments.put(zodiac.get(10), characters.get(1));
        tempepaments.put(zodiac.get(11), characters.get(3));
        return tempepaments;
    }
}

