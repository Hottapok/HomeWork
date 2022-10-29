import java.util.HashMap;
import java.util.Map;

public class Count {
    Map<String, Integer> map = new HashMap<>();

    public void addMap(String string, Integer integer) throws RuntimeException{


        for (String key : map.keySet()) {
            Integer value = map.get(key);
            if (!map.containsKey(string)) {
                map.put(string, integer);
            } if (map.containsKey(string) && integer.equals(value) ) {
                throw new RuntimeException("Значения совпадают");
            } else if (map.containsKey(string) && !integer.equals(value)){
                map.put(string, integer);
            }


        }

    }

    @Override
    public String toString() {
        return "Count{" +
                "map=" + map +
                '}';
    }
}
