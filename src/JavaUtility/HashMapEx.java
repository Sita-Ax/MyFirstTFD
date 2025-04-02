package JavaUtility;

import java.util.HashMap;

public class HashMapEx {
    public static void main(String[] args) {
        HashMap<String, String> hero = new HashMap<String, String>();

        hero.put("Batman", "Gotham City");
        hero.put("Superman", "Metropolis");
        hero.put("Flash", "Central City");

        hero.get("Flash");
    }
}
