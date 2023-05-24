import org.junit.jupiter.api.*;

import java.util.HashMap;

public class PhoneBookTest {

    PhoneBook phoneBook;
    HashMap phoneBookList;
    HashMap phoneBookListNumbers;

    @BeforeEach
    public void beforeEachTests() {
        phoneBook = new PhoneBook();
        phoneBookList = new HashMap();
        phoneBookListNumbers  = new HashMap();
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
        System.out.println(name);
        //assert  then
        Assertions.assertEquals(expected, name);
    }

    @Test
    public void findByNameTest() {//String name, String phone

        String name = "Valera";
        String expected = "+7 556677";

        //act   when
        phoneBook.add(name, expected);
        String phone = phoneBook.findByNumber(name);

        //assert  then
        Assertions.assertEquals(expected, phone);
    }

    @AfterEach
    public void afterEachTest() {
        phoneBook = null;
        phoneBookList = null;
        phoneBookListNumbers = null;
    }


}
