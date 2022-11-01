import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    Map<String,Integer> phoneBook = new HashMap<>();

    public void addNumber(People people){
        phoneBook.put(people.name, people.number)
;    }

    @Override
    public String toString() {
        return "Телефонная книга" +
                " = " + phoneBook;
    }
}
