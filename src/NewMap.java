import java.util.HashMap;
import java.util.Map;

public class NewMap {
    private Map<String,Integer> newMap = new HashMap<>();
        public void printNewMap( HomeWork2 h1,HomeWork2 h2,HomeWork2 h3){
            newMap.put(h1.count(),h1.sum());
            newMap.put(h2.count(),h2.sum());
            newMap.put(h3.count(),h3.sum());
            System.out.println(newMap);

        }
}
