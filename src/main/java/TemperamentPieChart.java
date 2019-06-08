import java.util.HashMap;


public class TemperamentPieChart {

    public static void main(String args[]) {
        //test data start
        String AscendantSign = "SCO";
        String SunSign = "VIR";
        String MoonSign = "VIR";
        String MercurySign = "LEO";
        String VenusSign = "VIR";
        String MarsSign = "GEM";
        String JupiterSign = "VIR";
        String SaturnSign = "AQR";
        String UranusSign = "CAP";
        String NeptuneSign = "CAP";
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
        System.out.println("------------");
        HashMap<String, Integer> result2 = calculateExtraIntroVersy(hmap);
        result2.forEach((key, value) -> System.out.println(key + " " + value));
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

    public static HashMap<String, Integer> calculateExtraIntroVersy(HashMap hashMap) {
        HashMap<String, Integer> result = new HashMap<String, Integer>();
        result.put(Planets.polarityEI.get(0), 0);
        result.put(Planets.polarityEI.get(1), 0);

        hashMap.forEach((key, value) -> {
            int t = result.get(Planets.getExtraIntroversy().get(value));
            result.put(Planets.getExtraIntroversy().get(value),
                    t + Planets.getPers().get(key));
        });
        return result;
    }
}

