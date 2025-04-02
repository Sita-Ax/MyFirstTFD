package Exercise2;

public class Coverage {
    public static int main(String[] args) {
        int x = 5;
        int y = 4;
        int z = 0;
        if ((x > 0) && (y > 0))
            z = x;
        if(x < 10)
            z = y;
        return z;

    }
}
