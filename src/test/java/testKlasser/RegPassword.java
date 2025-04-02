package test.java.testKlasser;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RegPassword {

    @Test
    public void testValidPassword(){
        User user = new User("Rosita", "password1_");
        String expected = "OK";
        String actual = user.isValidPassword("password1_");

        assertEquals(expected, actual);
    }
    @Test
    public void testPasswordTooShort(){
        User user = new User("Rosita", "pass1_");
        String expected = "Lösenordet är för kort";
        String actual = user.isValidPassword("pass1_");

        assertEquals(expected, actual);
    }
    @Test
    public void testPasswordWithoutNumber(){
        User user = new User("Rosita", "password_");
        String expected = "lösenordet måste innehålla minst 1 siffra";
        String actual = user.isValidPassword("password_");

        assertEquals(expected, actual);
    }
    @Test
    public void testPasswordWithoutSpecialCharacter(){
        User user = new User("Rosita", "password1");
        String expected = "Lösenordet måste innehålla minst ett specialtecken";
        String actual = user.isValidPassword("password1");

        assertEquals(expected, actual);
    }
    @Test
    public void testPasswordWithoutLetters(){
        User user = new User("Rosita", "12345678_");
        String expected = "Lösenordet måste innehålla minst 1 bokstav";
        String actual = user.isValidPassword("12345678_");

        assertEquals(expected, actual);
    }
}
