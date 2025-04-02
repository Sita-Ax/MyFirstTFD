package test.java.testKlasser;

public class User {

    private String userName;
    private String password;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void getAnotherName(String newUserName) {
        if(newUserName.length() >= 4 ){
            userName = newUserName;
        }
    }

    public void setPassword(String shortP) {
        if(shortP.length() >= 7 && shortP.length() <= 20){
            password = shortP;
        }
    }


    //Testar att jämföra strängar
    public String isValidPassword(String password) {
        //Kollar om det är 8 tecken långt.
        if(password.length() < 8){
            return "Lösenordet är för kort";
        }

        //variabler enligt uppgiften för att hålla reda på om lösen har rätt tecken.
        //minst 1 siffra.
        boolean hasDigit = false;
        //minst 1 specialtecken.
        boolean hasSpecialChar = false;
        //minst 1 bokstav.
        boolean hasLetter = false;

        //loopa igenom lösenordet
        for(int i = 0; i < password.length(); i++){
            //enligt uppgiften tecknet som är på position i.
            char c = password.charAt(i);

            //kollar om det finns en siffra
            if (Character.isDigit(c)) {
                hasDigit = true;
                //kollar om det finns ett specialtecken
            } else if (!Character.isLetterOrDigit(c)) {
                hasSpecialChar = true;
                //kollar om det finns en bokstav
            } else if (Character.isLetter(c)){
                hasLetter = true;
            }
        }
        //allt det här måste lösenordet innehålla
        if(!hasDigit){
            return "lösenordet måste innehålla minst 1 siffra";
        }
        if(!hasSpecialChar){
            return "Lösenordet måste innehålla minst ett specialtecken";
        }
        if(!hasLetter){
            return "Lösenordet måste innehålla minst 1 bokstav";
        }
        return "OK";
    }
}
