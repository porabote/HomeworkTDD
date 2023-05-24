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
        Assertions.assertEquals(countContactsIfExists, expected);
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
        Assertions.assertEquals(name, expected);
    }


    @AfterEach
    public void afterEachTest() {
        phoneBook = null;
        phoneBookList = null;
        phoneBookListNumbers = null;
    }


}
