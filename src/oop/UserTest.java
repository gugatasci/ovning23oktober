package oop;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class UserTest {

    @Test
     void testOfUserName() {

        User user = new User("username", "pwd123");
        assertEquals("username", user.getUserName());

    }

   // @Test
    // public void changeUserName() {

    //   User user = new User("username", "pwd123");
    //    user.setUserName("new_user");
    //  assertEquals();


    //}

}
