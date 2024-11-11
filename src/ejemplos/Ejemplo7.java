package ejemplos;

public class Ejemplo7 {
    public static void main(String[] args) {
        System.out.println(mcd(25,75));

    }
    public static int mcd(int a, int b) {
        if (b == 0) return a;
        else return mcd(b, a % b);
    }
}
