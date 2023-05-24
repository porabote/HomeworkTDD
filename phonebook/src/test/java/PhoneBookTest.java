import org.junit.jupiter.api.*;

import java.util.HashMap;

public class PhoneBookTest {

    PhoneBook phoneBook;
    HashMap phoneBookList;

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
        int expectedIfExists = phoneBookList.size();
        //act   when
        int countContacts = phoneBook.add(name, phone);
        //assert  then
        Assertions.assertEquals(countContacts, expected);

        int countContactsIfExists = phoneBook.add(name, phone);
        Assertions.assertEquals(countContactsIfExists, expectedIfExists);
    }

//    @Test
//    public void findByNumberTest() {//String name, String phone
//
//        String phone = "+7 556677";
//        String expected = "Valera";
//        //act   when
//        int countContacts = phoneBook.findByNumber(phone);
//        //assert  then
//        Assertions.assertEquals(countContacts, expected);
//    }


    @AfterEach
    public void afterEachTest() {
        phoneBook = null;
        phoneBookList = null;
    }


}
