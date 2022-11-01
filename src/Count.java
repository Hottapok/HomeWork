import java.util.HashMap;
import java.util.Map;

public class Count {
    Map<String, Integer> map = new HashMap<>();

    public void addMap(String string, Integer integer){


        for (String key : map.keySet()) {
            Integer value = map.get(key);
            if (map.containsKey(string) && integer.equals(value) ) {
                throw new RuntimeException("Значения совпадают");
            }
                map.put(string, integer);
        }

    }

    @Override
    public String toString() {
        return "Count{" +
                "map=" + map +
                '}';
    }
}
