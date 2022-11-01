import java.util.*;

public class Main {
    public static void main(String[] args) {

        People people1 = new People("Алексей Иванов", 785415);
        People people2 = new People("Вася  Иванов", 145456);
        People people3 = new People("Алексей Пупкин", 1254987);
        People people4 = new People("Андрей Иванов", 854926);
        People people5 = new People("Сергей Сергеев", 1452555);
        People people6 = new People("Максим Иванов", 1745823);
        People people7 = new People("Максим Максимов", 969636);
        People people8 = new People("Олег Иванов", 159753);
        People people9 = new People("Олег Дерипаска", 852456);
        People people10 = new People("Алексей Жданов", 123588);
        People people11 = new People("Роман Кислый", 885444);
        People people12 = new People("Андрей Сиплый", 141414);
        People people13 = new People("Александр Иванов", 5658585);
        People people14 = new People("Владимир Иванов", 789456);
        People people15 = new People("Владимир Пупкин", 365458);
        People people16 = new People("Серж Горелов", 4525228);
        People people17 = new People("Павел Иванов", 7484847);
        People people18 = new People("Павел Безносов", 1252524);
        People people19 = new People("Владимир Жириновский", 3695858);
        People people20 = new People("Юрий Иванов", 7885559);

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addNumber(people1);
        phoneBook.addNumber(people2);
        phoneBook.addNumber(people3);
        phoneBook.addNumber(people4);
        phoneBook.addNumber(people5);
        phoneBook.addNumber(people6);
        phoneBook.addNumber(people7);
        phoneBook.addNumber(people8);
        phoneBook.addNumber(people9);
        phoneBook.addNumber(people10);
        phoneBook.addNumber(people11);
        phoneBook.addNumber(people12);
        phoneBook.addNumber(people13);
        phoneBook.addNumber(people14);
        phoneBook.addNumber(people15);
        phoneBook.addNumber(people16);
        phoneBook.addNumber(people17);
        phoneBook.addNumber(people18);
        phoneBook.addNumber(people19);
        phoneBook.addNumber(people20);
//        System.out.println(phoneBook);


        Map<String, List<Integer>> map = new HashMap<>();
        Map<String,Integer> newMap = new HashMap<>();
        List<Integer> list1 = new ArrayList<>();
        for (int i =0 ; i<3;i++){
            list1.add(((int) (Math.random()*((1000-0)+1))+0));
        }
        List<Integer> list2 = new ArrayList<>();
        for (int i =0 ; i<3;i++){
            list2.add(((int) (Math.random()*((1000-0)+1))+0));
        }
        List<Integer> list3 = new ArrayList<>();
        for (int i =0 ; i<3;i++){
            list3.add(((int) (Math.random()*((1000-0)+1))+0));
        }
        List<Integer> list4 = new ArrayList<>();
        for (int i =0 ; i<3;i++){
            list4.add(((int) (Math.random()*((1000-0)+1))+0));
        }
        List<Integer> list5 = new ArrayList<>();
        for (int i =0 ; i<3;i++){
            list5.add(((int) (Math.random()*((1000-0)+1))+0));
        }
        map.put("String1",list1);
        map.put("String2",list2);
        map.put("String3",list3);
        map.put("String4",list4);
        map.put("String5",list5);
        System.out.println(map);
        for (String key: map.keySet()) {
            Integer sum =0;
            List <Integer> listSum = map.get(key);
            for (Integer integer : listSum){
                sum+=integer;
            }
            newMap.put(key,sum);
        }
        System.out.println(newMap);


        Map<Integer,String> random = new LinkedHashMap<>();
        random.put(110,"120");
        random.put(114,"114");
        random.put(115,"115");
        random.put(116,"116");
        random.put(111,"111");
        random.put(112,"112");
        random.put(113,"113");
        random.put(117,"117");
        random.put(118,"118");
        random.put(119,"119");
//        System.out.println(random);
    }
}