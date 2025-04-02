package test.java.testKlasser;

import org.junit.Test;
import  static org.junit.Assert.assertEquals;

public class UserTest {

    @Test
    public void testCreateUser(){
        User user = new User("Rosita", "Password123");
        String expected = "Rosita";
        String actual = user.getUserName();

        assertEquals(expected, actual);
    }
    @Test
    public void testCreateUserAgain(){
        User user = new User("Staffan", "Password123");
        String expected = "Staffan";
        String actual = user.getUserName();

        assertEquals(expected, actual);
    }
    @Test
    public void testCreatePassword(){
        User user = new User("Rosita", "Password123");
        String expected = "Password123";
        String actual = user.getPassword();

        assertEquals(expected, actual);
    }

    @Test
    public void changeUserName(){
        User user = new User("Rosita", "Password123");
        String expected = "Rosita2";
        user.getAnotherName("Rosita2");
        String actual = user.getUserName();

        assertEquals(expected, actual);
    }
    @Test
    public void shortUserName(){
        User user = new User("Rosita", "Password123");
        String expected = "Rosita";
        user.getAnotherName("Lol");
        String actual = user.getUserName();

        assertEquals(expected, actual);
    }

    @Test
    public void shortPassword(){
        User user = new User("Rosita", "Password123");
        String expected = "Password123";
        user.setPassword("Pas1");
        String actual = user.getPassword();

        assertEquals(expected, actual);
    }
    @Test
    public void longPassword(){
        User user = new User("Rosita", "Password123");
        String expected = "Password123";
        user.setPassword("PasswordPassword123456");
        String actual = user.getPassword();

        assertEquals(expected, actual);
    }
    @Test
    public void corrPassword(){
        User user = new User("Rosita", "Password123");
        String expected = "Password234";
        user.setPassword("Password234");
        String actual = user.getPassword();

        assertEquals(expected, actual);
    }

    //lösenord minst 7 högst 20 går det att ändra? 6, 7, 20, 21
}
