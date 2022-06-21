package _03_VerzwUndSchleifen;

public class foobar {
    public static void main(String[] args) {
        for (int zahl = 1; zahl <= 100; zahl++) {
            if (zahl % 15 == 0) {
                System.out.println("foobar ");
            } else if (zahl%5 ==0) {
                System.out.print("bar ");
            } else if (zahl%3 == 0) {
                System.out.print("foo ");
            } else System.out.print(zahl + " ");
        }
    }
}
