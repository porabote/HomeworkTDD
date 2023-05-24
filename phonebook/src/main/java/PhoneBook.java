import java.util.HashMap;

public class PhoneBook {

    HashMap phoneBookList = new HashMap();
    HashMap phoneBookListNumbers = new HashMap();

    public int add(String name, String phone) {
        if (!phoneBookList.containsKey(name)) {
            phoneBookList.put(name, phone);
            phoneBookListNumbers.put(phone, name);
        }
        System.out.println(phoneBookList);
        return phoneBookList.size();
    }

    public String findByNumber(String phone) {
        if (phoneBookListNumbers.containsKey(phone)) {
            return (String) phoneBookListNumbers.get(phone);
        }
        return null;
    }

    public String findByName(String name) {
        return null;
    }
//
//    public int printAllNames(String name, String phone) {
//        return 0;
//    }

}
