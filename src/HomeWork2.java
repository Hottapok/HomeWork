import java.util.ArrayList;
import java.util.List;

public class HomeWork2 {
    private String key;
    public HomeWork2(String set) {
        key = set;
    }

    public int sum() {
        List<Integer> list = new ArrayList<>();
        list.add((int) (Math.random()*((1000-0)+1))+0);
        list.add((int) (Math.random()*((1000-0)+1))+0);
        list.add((int) (Math.random()*((1000-0)+1))+0);
        int count =0;
        try {

            for (Integer integer : list){
                count+=integer;
            }
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
         return count;
    }

    public String count() {
        return key;
    }


}
