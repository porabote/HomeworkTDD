import java.util.HashMap;

public class PhoneBook {

    HashMap phoneBookList = new HashMap();

    public int add(String name, String phone) {
        if (!phoneBookList.containsKey(name)) {
            phoneBookList.put(name, phone);
        }
        System.out.println(phoneBookList);
        return phoneBookList.size();
    }

    public int findByNumber(String phone) {
        return 0;
    }

    public int findByName(String name) {
        return 0;
    }

    public int printAllNames(String name, String phone) {
        return 0;
    }

}
