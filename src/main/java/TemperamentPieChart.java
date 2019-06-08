import java.util.HashMap;


public class TemperamentPieChart {

    public static void main(String args[]) {

        //test data start
        String AscendantSign = "SGR";
        String SunSign = "VIR";
        String MoonSign = "LEO";
        String MercurySign = "LIB";
        String VenusSign = "LIB";
        String MarsSign = "SCO";
        String JupiterSign = "VIR";
        String SaturnSign = "SCO";
        String UranusSign = "SCO";
        String NeptuneSign = "SCO";
        String PlutoSign = "SCO";

        HashMap<String, String> hmap = new HashMap<String, String>();
        /*Adding elements to HashMap*/
        hmap.put("Ascendant", AscendantSign);
        hmap.put("Sun", SunSign);
        hmap.put("Moon", MoonSign);
        hmap.put("Mercury", MercurySign);
        hmap.put("Venus", VenusSign);
        hmap.put("Mars", MarsSign);
        hmap.put("Jupiter", JupiterSign);
        hmap.put("Saturn", SaturnSign);
        hmap.put("Uranus", UranusSign);
        hmap.put("Neptune", NeptuneSign);
        hmap.put("Pluto", PlutoSign);
        //end test data

        HashMap<String, Integer> result = calculateCharactes(hmap);
        result.forEach((key, value) -> System.out.println(key + " " + value));
    }

    public static HashMap<String, Integer> calculateCharactes(HashMap hashMap) {
        HashMap<String, Integer> result = new HashMap<String, Integer>();
        result.put(Planets.characters.get(0), 0);
        result.put(Planets.characters.get(1), 0);
        result.put(Planets.characters.get(2), 0);
        result.put(Planets.characters.get(3), 0);

        hashMap.forEach((key, value) -> {
            int t = result.get(Planets.getTemperaments().get(value));
            result.put(Planets.getTemperaments().get(value),
                    t + Planets.getPers().get(key));
        });
        return result;
    }
}

