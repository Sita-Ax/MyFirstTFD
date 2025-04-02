package JavaUtility;

public class StringArrayEx {
    public static void main(String[] args) {

        String Split;

        String[] nameExs = new String[5];

        nameExs[0] = "Jolene";
        nameExs[1] = "Melissa";
        nameExs[2] = "Izak";
        nameExs[3] = "Izabell";
        nameExs[4] = "Samantha";

        String myString = "Hej på dig!";

        String[] stringArray = myString.split(" ");

        for(int i = 0; i < 3; i++){
            System.out.println(stringArray[i]);
        }
        for(int i = 0; i < stringArray.length; i++){
            System.out.println(stringArray.length);
        }

        for(int i = 0; i < 5; i++){
            System.out.println(nameExs[i] = "Adding names");
        }
    }
}
