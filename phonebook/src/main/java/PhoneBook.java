import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class PhoneBook {

    Map phoneBookList = new HashMap();

    public int add(String name, String phone) {
        if (!phoneBookList.containsKey(name)) {
            phoneBookList.put(name, phone);
        }

        return phoneBookList.size();
    }

    public String findByNumber(String phone) {
        if (phoneBookList.containsValue(phone)) {
            Set<Map.Entry<String, String>> set = phoneBookList.entrySet();
            for (Map.Entry entry : set) {
                if (entry.getValue().equals(phone)) {
                    return (String) entry.getKey();
                }
            }
        }
        return null;
    }

    public String findByName(String name) {
        if (phoneBookList.containsKey(name)) {
            return (String) phoneBookList.get(name);
        }
        return null;
    }

    public TreeMap<String, String> printAllNames() {

        return null;
    }

}
