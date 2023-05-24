import org.junit.jupiter.api.*;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class PhoneBookTest {

    PhoneBook phoneBook;
    Map<String, String> phoneBookList;

    @BeforeEach
    public void beforeEachTests() {
        phoneBook = new PhoneBook();
        phoneBookList = new HashMap();
    }

    @Test
    public void addTest() {//String name, String phone
        //arrange   given
        String name = "Valera";
        String phone = "+7 556677";
        int expected = phoneBookList.size() + 1;
        //act   when
        int countContacts = phoneBook.add(name, phone);
        //assert  then
        Assertions.assertEquals(countContacts, expected);

        int countContactsIfExists = phoneBook.add(name, phone);
        Assertions.assertEquals(expected, countContactsIfExists);
    }

    @Test
    public void findByNumberTest() {//String name, String phone

        String phone = "+7 556677";
        String expected = "Valera";
        //act   when
        phoneBook.add(expected, phone);
        String name = phoneBook.findByNumber(phone);

        //assert  then
        Assertions.assertEquals(expected, name);
    }

    @Test
    public void findByNameTest() {//String name, String phone

        String name = "Valera";
        String expected = "+7 556677";

        //act   when
        phoneBook.add(name, expected);
        String phone = phoneBook.findByName(name);

        //assert  then
        Assertions.assertEquals(expected, phone);
    }

    @Test
    public void printAllNamesTest() {//String name, String phone
        //act   when
        phoneBook.add("Valera", "+7 556677");
        phoneBook.add("Alena", "+7 556678");

        String expected = "Alena";

        TreeMap<String, String> sortedList = phoneBook.printAllNames();

        Assertions.assertEquals(expected, sortedList.firstKey());
    }


    @AfterEach
    public void afterEachTest() {
        phoneBook = null;
        phoneBookList = null;
    }


}
